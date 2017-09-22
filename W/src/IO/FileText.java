package IO;

import java.io.File;
import java.io.IOException;

public class FileText {  
	
	public void dir(File file) {
		if(file.exists()){
			System.out.println(file.getAbsolutePath()+" "+file.getName());
		}else{
			File filedir[]=file.listFiles();
			for(int i=0;i<filedir.length;i++){
				File f=filedir[i];
				dir(f);
			}
		}
	}
	
	public void diri(File fileq) {
		if(fileq.exists()){
		System.out.println(fileq.getAbsolutePath()+" "+fileq.getName());
		}else{
		File filetext[]=fileq.listFiles();
		for(int i=0;i<filetext.length;i++){
			File e=filetext[i];
			diri(e);
		}
	}
}
		
	
	
    public static void main(String[] args) {
    	FileText text = new FileText();
    	text.diri(new File("D:/"));
    	
    	String path = "E:/snake";
	  File file = new File(path);
	  
	  if(file.exists()){
		  System.out.println(file.getName());
		  System.out.println(file.length());
		  System.out.println(file.isHidden());
		  System.out.println(file.canRead());
		  System.out.println(file.toString());
	  }else{
		  System.out.println(file.isFile());
	  }
	  File file1 = new File("F:\\File");
	 // File file2 = new File(file1,"word.txt");
	  try {
		  if(file1.exists()){
			  file1.delete();
		  }
		      file1.createNewFile();
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	File filetext[]=file.listFiles();
	for(int i=0;i<filetext.length;i++){
		if(filetext[i].isDirectory()){
		System.out.println("文件名："+filetext[i].getPath());
		}
		if(filetext[i].isFile()){
			System.out.println("文件："+filetext[i].getPath());
		}
	}
  }
}
