package IO;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class File3 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
         File fi = new File("F:\\File");
         if(!fi.exists()){
        	 fi.mkdir();
         }
         File fi2 = new File(fi,"stare.txt");
         try {
        	 if(!fi2.exists()){
			fi2.createNewFile();
        	 }
			//创建一个FileOutputStream对象
			FileOutputStream filem = new FileOutputStream(fi2);
			String dsd ="黄教授哈萨克打卡了单靠";
			byte buy[]=dsd.getBytes();
			filem.write(buy);
			filem.close();
        	 
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			FileInputStream in = new FileInputStream(fi2);
			byte byt[]=new byte[1024];
			int re = in.read(byt);
			System.out.println("文件信息是:"+new String(byt,0,re));
			in.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		File fie = new File("F:\\File\\stare.txt");
		fie.delete();
		File fie1 =new File("F:\\File");
		fie1.delete();

	}

}
