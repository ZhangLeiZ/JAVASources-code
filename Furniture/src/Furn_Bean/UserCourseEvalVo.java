package Furn_Bean;

import java.util.Date;

public class UserCourseEvalVo {

	private int usercourseevalid;  
	private int userid;   
	private int homeid;   
	private int evallevel;   
	private String evalcontent;   
	private Date evaldate;
	public int getUsercourseevalid() {
		return usercourseevalid;
	}
	public void setUsercourseevalid(int usercourseevalid) {
		this.usercourseevalid = usercourseevalid;
	}
	public int getUserid() {
		return userid;
	}
	public void setUserid(int userid) {
		this.userid = userid;
	}
	public int getHomeid() {
		return homeid;
	}
	public void setHomeid(int homeid) {
		this.homeid = homeid;
	}
	public int getEvallevel() {
		return evallevel;
	}
	public void setEvallevel(int evallevel) {
		this.evallevel = evallevel;
	}
	public String getEvalcontent() {
		return evalcontent;
	}
	public void setEvalcontent(String evalcontent) {
		this.evalcontent = evalcontent;
	}
	public Date getEvaldate() {
		return evaldate;
	}
	public void setEvaldate(Date evaldate) {
		this.evaldate = evaldate;
	}   
	
}
