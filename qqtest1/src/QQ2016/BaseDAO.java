package QQ2016;

import java.net.InetAddress;
import java.net.UnknownHostException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Random;
import java.util.Vector;

import javax.swing.ImageIcon;
import javax.swing.text.StyledDocument;
//随机获取QQ号码
public class BaseDAO {
	public int getQQcode(){
		boolean bexit=false;
		int qqcode=0;
		Connection con=new PDBC().openDB();
		String sql="select qqcode from account where qqcode=?";
		try {
			PreparedStatement ps=con.prepareStatement(sql);
			while(!bexit){
				Random rand=new Random();
				qqcode=rand.nextInt(88888)+10000;
				ps.setInt(1, qqcode);
				ResultSet rs=ps.executeQuery();
				if(!rs.next()){
					bexit=true;
					break;
				}
			}
			
			ps.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return qqcode;
	}
	//获取端口
	public int getport(){
		boolean bexit=false;
		int port=0;
		Connection con=new PDBC().openDB();
		String sql="select port from account where onlinestatus<>? and port=?";
		try {
			PreparedStatement ps=con.prepareStatement(sql);
			while(!bexit){
				Random rand=new Random();
				port=rand.nextInt(64000)+1024;
				ps.setString(1, Cmd.STATUS[1]);
				ps.setInt(2,port);
				ResultSet rs=ps.executeQuery();
				if(!rs.next()){
					bexit=true;
					break;
				}
			}
			ps.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return port;
	}
	//保存登陆信息
	public AccountVO saveAccount(AccountVO acc){
		int qqcode=getQQcode();
		acc.setQqCode(qqcode);
		acc.setPort(0);
		acc.setOnlinestatus(Cmd.STATUS[1]);
		String sql="insert into account values (?,?,?,?,?,?,?,?,?,?,?,?)";
		Connection con=new PDBC().openDB();
		try {
			int i=1;
			PreparedStatement ps=con.prepareStatement(sql);
			ps.setInt(i++,acc.getQqCode());
			ps.setString(i++, acc.getNickName());
			ps.setString(i++, acc.getHeadImg());
			ps.setString(i++, acc.getPassword());
			ps.setString(i++, acc.getBrith());
			ps.setString(i++, acc.getSex());
			ps.setString(i++, acc.getNation());
			ps.setString(i++, acc.getHobit());
			ps.setString(i++, acc.getIpAddr());
			ps.setInt(i++, acc.getPort());
			ps.setString(i++, acc.getOlinestatus());
			ps.setString(i++, acc.getRemark());
			i=ps.executeUpdate();
			ps.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return acc;
	}
	//修改信息
	public AccountVO updateAccount(AccountVO acc){
		
		
		String sql="update account set nickName=?,headImg=?,birth=?,sex=?,nation=?,hobit=?,remark=? where qqCode=?";
		Connection con=new PDBC().openDB();
		try {
			int i=1;
			PreparedStatement ps=con.prepareStatement(sql);
			ps.setString(i++, acc.getNickName());
			ps.setString(i++, acc.getHeadImg());
			ps.setString(i++, acc.getBrith());
			ps.setString(i++, acc.getSex());
			ps.setString(i++, acc.getNation());
			ps.setString(i++, acc.getHobit());
			ps.setString(i++, acc.getRemark());
			ps.setInt(i++,acc.getQqCode());
			i=ps.executeUpdate();
			ps.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return acc;
	}
	//返回信息
	public AccountVO sback(AccountVO acc){
		Connection con=new PDBC().openDB();
		String sql="select*from account where qqCode=? and password=?";
		int qqcode=0;
		try{
			int port=getport();
			PreparedStatement ps=con.prepareStatement(sql);
			ps.setInt(1, acc.getQqCode());
			ps.setString(2,acc.getPassword());
			ResultSet rs=ps.executeQuery();
			if(rs.next()){
				acc.setNickName(rs.getString("nickName").trim());
				acc.setHeadImg(rs.getString("headImg").trim());
				acc.setPassword(rs.getString("password").trim());
				acc.setBrith(rs.getString("birth").trim());
				acc.setSex(rs.getString("sex").trim());
				acc.setNation(rs.getString("nation").trim());
				acc.setHobit(rs.getString("hobit").trim());
				InetAddress addr=null;
				try {
					addr = InetAddress.getLocalHost();
				} catch (UnknownHostException e) {
					e.printStackTrace();
				}
				acc.setIpAddr(addr.getHostAddress());
				acc.setPort(port);
				acc.setOnlinestatus(Cmd.STATUS[0]);
				acc.setRemark(rs.getString("remark"));
				sql="update account set ipAddr='"+addr.getHostAddress()+"', port=" +port+", onlinestatus= '"+
				Cmd.STATUS[0]+"' where qqCode="+acc.getQqCode();
				Statement sta=con.createStatement();
				sta.execute(sql);
				ps.close();
				sta.close();
			}else{
				acc=null;
			}
		}catch(Exception e){
			e.printStackTrace();
		}
		
		return acc;
	}
//	获取朋友信息
	public Vector<AccountVO> getFriend(int qqcode){
		Vector<AccountVO>myfriend=new Vector<AccountVO>();
		Connection con=new PDBC().openDB();
		String sql="select a.*,f.groupname from account a inner join friends f on a.qqcode=f.friendQQcode where myQQcode=?";
		
		try{
			PreparedStatement ps=con.prepareStatement(sql);
			ps.setInt(1, qqcode);
			ResultSet rs=ps.executeQuery();
			while(rs.next()){
				AccountVO acc=new AccountVO();
				acc.setQqCode(rs.getInt("qqCode"));
				acc.setNickName(rs.getString("nickName").trim());
				acc.setHeadImg(rs.getString("headImg").trim());
				acc.setBrith(rs.getString("birth").trim());
				acc.setSex(rs.getString("sex").trim());
				acc.setNation(rs.getString("nation").trim());
				acc.setHobit(rs.getString("hobit").trim());
				acc.setIpAddr(rs.getString("ipAddr").trim());
				acc.setPort(rs.getInt("port"));
				acc.setOnlinestatus(rs.getString("onlinestatus"));
				acc.setRemark(rs.getString("remark"));
				acc.setGroupname(rs.getString("groupname"));
				myfriend.add(acc);
			}
			ps.close();
		}catch(Exception e){
			e.printStackTrace();
		}
		
		return myfriend;
	}
//	移动分组
	public void movegroup(int myqqcode,int friendqqcode,String groupname){
		String sql="update friends set groupName=? where myQQcode=? and friendQQcode=?";
		Connection con=new PDBC().openDB();
		try {
			PreparedStatement ps=con.prepareStatement(sql);
			ps.setString(1, groupname);
			ps.setInt(2, myqqcode);
			ps.setInt(3, friendqqcode);
			ps.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
//	查找好友
	public Vector<Vector> findfriend(final String sql){
		Vector<Vector>vdata=new Vector<Vector>();
		Connection con=new PDBC().openDB();
		try{
			Statement sta=con.createStatement();
			ResultSet rs=sta.executeQuery(sql);
			while(rs.next()){
				Vector rowdata=new Vector();
				rowdata.addElement(new ImageIcon(rs.getString("headImg").trim()));
				rowdata.addElement(rs.getInt("qqCode"));
				rowdata.addElement(rs.getString("nickName"));
				rowdata.addElement(rs.getString("birth"));
				rowdata.addElement(rs.getString("sex"));
				rowdata.addElement(rs.getString("nation"));
				rowdata.addElement(rs.getString("hobit"));
				rowdata.addElement(rs.getString("onlinestatus"));
				rowdata.addElement(rs.getString("remark"));
				vdata.addElement(rowdata);
			}
			sta.close();
			
		}catch (Exception e) {
			e.printStackTrace();
		}
		return vdata;
	}
	//搜索好友
	public AccountVO sousuofriend(final String sql){
		AccountVO acc=new AccountVO();
		Connection con=new PDBC().openDB();
		try{
			Statement sta=con.createStatement();
			ResultSet rs=sta.executeQuery(sql);
			if(rs.next()){
				acc.setHeadImg(rs.getString("headImg").trim());
				acc.setQqCode(rs.getInt("qqCode"));
				acc.setNickName(rs.getString("nickName").trim());
				acc.setBrith(rs.getString("birth").trim());
				acc.setSex(rs.getString("sex").trim());
				acc.setNation(rs.getString("nation").trim());
				acc.setHobit(rs.getString("hobit").trim());
				acc.setIpAddr(rs.getString("ipAddr"));
				acc.setPort(rs.getInt("port"));
				acc.setRemark(rs.getString("remark"));
				
			}
			sta.close();
			
		}catch (Exception e) {
			e.printStackTrace();
		}
		return acc;
	}
//	获取选中的好友信息、、
	public AccountVO getselectfriends(int qqcode){
		AccountVO acc=new AccountVO();
		Connection con=new PDBC().openDB();
		String sql="select*from account where qqCode=? ";
		
		try{
		
			PreparedStatement ps=con.prepareStatement(sql);
			ps.setInt(1, qqcode);
			ResultSet rs=ps.executeQuery();
			if(rs.next()){
				acc.setQqCode(rs.getInt("qqCode"));
				acc.setNickName(rs.getString("nickName").trim());
				acc.setHeadImg(rs.getString("headImg").trim());
				acc.setBrith(rs.getString("birth").trim());
				acc.setSex(rs.getString("sex").trim());
				acc.setNation(rs.getString("nation").trim());
				acc.setHobit(rs.getString("hobit").trim());
				acc.setIpAddr(rs.getString("ipAddr"));
				acc.setPort(rs.getInt("port"));
				acc.setOnlinestatus(rs.getString("onlinestatus"));
				acc.setRemark(rs.getString("remark"));
				
			}
			ps.close();
		}catch(Exception e){
			e.printStackTrace();
		}
		
		return acc;
	}
//	添加好友
	public void addfriend(int myqqcode,int friendcode){
		String sql="insert into friends values(?,?,?)";
		Connection con=new PDBC().openDB();
		try {
			PreparedStatement ps=con.prepareStatement(sql);
			ps.setInt(1, myqqcode);
			ps.setInt(2, friendcode);
			ps.setString(3, Cmd.GROUPNAME[1]);
			ps.executeUpdate();
			ps.setInt(1,friendcode );
			ps.setInt(2,myqqcode );
			ps.setString(3, Cmd.GROUPNAME[1]);
			ps.executeUpdate();
			ps.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
//	删除好友
	public void delfriends(int myqqcode,int friendqqcode){
		String sql="delete  friends where myqqcode=? and friendqqcode=?";
		Connection con=new PDBC().openDB();
		try {
			PreparedStatement ps=con.prepareStatement(sql);
			ps.setInt(1, myqqcode);
			ps.setInt(2, friendqqcode);
			ps.executeUpdate();
			ps.setInt(1,friendqqcode );
			ps.setInt(2,myqqcode );
			ps.executeUpdate();
			ps.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	//保存离线消息
	public void saveoff(int myqqcode,int friendqqcode,int cmd,String offmsg){
		String sql="insert into offlinemsg values(?,?,?,?)";
		Connection con=new PDBC().openDB();
		try {
			PreparedStatement ps=con.prepareStatement(sql);
			ps.setInt(1, myqqcode);
			ps.setInt(2, friendqqcode);
			ps.setInt(3, cmd);
			ps.setString(4,offmsg);
			ps.executeUpdate();
			ps.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	//读取一个好友信息
	public AccountVO getOneFriend(int qqcode){
		AccountVO acc=new AccountVO();
		Connection con=new PDBC().openDB();
		String sql="select a.*,f.groupname from account a inner join friends f on a.qqcode=f.friendQQcode where QQcode=?";
		
		try{
			PreparedStatement ps=con.prepareStatement(sql);
			ps.setInt(1, qqcode);
			ResultSet rs=ps.executeQuery();
			while(rs.next()){
				acc.setQqCode(rs.getInt("qqCode"));
				acc.setNickName(rs.getString("nickName").trim());
				acc.setHeadImg(rs.getString("headImg").trim());
				acc.setBrith(rs.getString("birth").trim());
				acc.setSex(rs.getString("sex").trim());
				acc.setNation(rs.getString("nation").trim());
				acc.setHobit(rs.getString("hobit").trim());
				acc.setIpAddr(rs.getString("ipAddr").trim());
				acc.setPort(rs.getInt("port"));
				acc.setOnlinestatus(rs.getString("onlinestatus"));
				acc.setRemark(rs.getString("remark"));
				acc.setGroupname(rs.getString("groupname"));
			}
			ps.close();
		}catch(Exception e){
			e.printStackTrace();
		}
		
		return acc;
	}
//	读取离线消息
	public Vector readoff(int friendqqcode){
		Vector offdata=new Vector();
		String sql="select*from offlinemsg where friendqqcode=?";
		Connection con=new PDBC().openDB();
		try {
			PreparedStatement ps=con.prepareStatement(sql);
			ps.setInt(1, friendqqcode);
			ResultSet rs=ps.executeQuery();
			while(rs.next()){
				offdata.add(rs.getInt("myqqcode"));
				offdata.add(rs.getInt("friendqqcode"));
				offdata.add(rs.getInt("cmd"));
				offdata.add(rs.getString("msg"));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return offdata;
	}
	public void deloffmsg(int qqcode){
		String sql="delete from offlinemsg where friendqqcode="+qqcode;
		Connection con=new PDBC().openDB();
		try {
			Statement sta=con.createStatement();
			sta.executeUpdate(sql);
			sta.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	//判断是否为好友
	public boolean isfriends(int myqqcode,int friendqqcode){
		boolean is=false;
		String sql="select* from friends where myqqcode=? and friendqqcode=?";
		AccountVO acc=new AccountVO();
		Connection con=new PDBC().openDB();
		try {
			PreparedStatement ps=con.prepareStatement(sql);
			ps.setInt(1, myqqcode);
			ps.setInt(2, friendqqcode);
			ResultSet rs=ps.executeQuery();
			if(rs.next()){
				is=true;
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return is;
	}
	public void changestatus(int qqcode,String status){

		String sql="update account set onlinestatus=? where qqCode=?";
		Connection con=new PDBC().openDB();
		try {
			PreparedStatement ps=con.prepareStatement(sql);
			ps.setString(1, status);
			ps.setInt(2,qqcode);
			ps.executeUpdate();
			ps.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
}
