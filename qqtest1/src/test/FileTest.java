package test;

import java.io.File;
import java.io.IOException;

public class FileTest {
	public void iterator(File file){
		if(file.isFile()){
			System.out.println("文件夹："+file.getParent()+":"+file.getPath());
		}else{
			File []list=file.listFiles();
			for(int i=0;i<list.length;i++){
				File f=list[i];
				iterator(f);
			}
		}
	}
	public static void main(String[] args) {
		FileTest test=new FileTest();
		test.iterator(new File("e:/"));
	}
	
}