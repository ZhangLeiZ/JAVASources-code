package Action;

import java.io.File;

import com.opensymphony.xwork2.ActionSupport;

public class FileuploadAction extends ActionSupport{

	private File upload;
	private String uploadFileName;
	private String uploadContentType;
	public File getUpload() {
		return upload;
	}
	public void setUpload(File upload) {
		this.upload = upload;
	}
	public String getUploadFileName() {
		return uploadFileName;
	}
	public void setUploadFileName(String uploadFileName) {
		this.uploadFileName = uploadFileName;
	}
	public String getUploadContentType() {
		return uploadContentType;
	}
	public void setUploadContentType(String uploadContentType) {
		this.uploadContentType = uploadContentType;
	}
	@Override
	public String execute() throws Exception {
		if(upload!=null){
			String datefile="d:\\Demo\\";
			int pos = uploadFileName.lastIndexOf(".");
			String exe = uploadFileName.substring(pos);
			String filename = System.nanoTime()+exe;
			uploadFileName=filename;
			File savefile= new File(datefile,uploadFileName);
			upload.renameTo(savefile);
		}else{
			return INPUT;
		}
		System.out.println("文件吗"+uploadFileName);
		System.out.println("完成="+uploadContentType);	
		System.out.println("文件"+upload.getName());
		
			return SUCCESS;
	}
	
}
