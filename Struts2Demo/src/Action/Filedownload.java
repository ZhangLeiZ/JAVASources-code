package Action;

import java.io.File;
import java.io.InputStream;

import javax.servlet.http.HttpServletRequest;

import org.apache.struts2.ServletActionContext;

import com.opensymphony.xwork2.ActionSupport;

public class Filedownload extends ActionSupport{

	private String filelist[];
	private String inputpath;
	private String contentType;
	private String filename;
	public String getInputpath() {
		return inputpath;
	}
	public void setInputpath(String inputpath) {
		this.inputpath = inputpath;
	}
	public String getContentType() {
		return contentType;
	}
	public void setContentType(String contentType) {
		this.contentType = contentType;
	}
	public String getFilename() {
		return filename;
	}
	public void setFilename(String filename) {
		this.filename = filename;
	}
	public String list()throws Exception{
		HttpServletRequest request = ServletActionContext.getRequest();
		String path=request.getRealPath("/image/");
		File file = new File(path);
		filelist=file.list();
		return INPUT;
	}
	public InputStream getInputStream(){
		InputStream in=ServletActionContext.getServletContext().getResourceAsStream(inputpath);
		System.out.println(in);
		return ServletActionContext.getServletContext().getResourceAsStream(inputpath);
	}
	@Override
	public String execute() throws Exception {
		//调用相关业务逻辑方法 动态设置下载信息
		inputpath = "/image/"+filename;
		System.out.println(inputpath);
		System.out.println(filename);
		contentType = "image/bmp,image/png,image/gif,image/jpeg";
		System.out.println(contentType);
		
		return SUCCESS;
	}
	public String[] getFilelist() {
		return filelist;
	}
	public void setFilelist(String[] filelist) {
		this.filelist = filelist;
	}
}
