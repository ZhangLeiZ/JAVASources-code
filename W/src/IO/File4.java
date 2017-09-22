package IO;

import java.io.File;
import java.io.IOException;


public class File4 {

	public void dir(File file){
		if(file.isFile()){
			System.out.println(file.getAbsolutePath());
		}else{
			File[] ilst = file.listFiles();
			for(int i=0;i<ilst.length;i++){
				dir(ilst[i]);
			}
		}
	}
	public static void main(String[] args) {
		File4 text = new File4();
		text.dir(new File("E:/"));
		
		Runtime ce =Runtime.getRuntime();
		try {
			ce.exec("javac File4");
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		try {
			ce.exec("java File4");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
