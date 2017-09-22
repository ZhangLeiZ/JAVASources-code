package FILE;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class File1 {
	public static void main(String[] args) {
		try {
			FileInputStream file=new FileInputStream(new File("E:/java not/k1/src/bao1/clc.java"));
			byte[]x=new byte[1024];
			int n=0;
			String cont="";
			while((n=file.read(x,0,x.length))!=-1){
				cont+=new String(x,0,n);
			}
			file.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		File filetest=new File("E:/java not/k1/src/bao1/clc.java");
		if(!filetest.isFile()){
			try {
				filetest.createNewFile();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		try {
			FileOutputStream fo=new FileOutputStream(filetest,true);
			String str="这是保存的内容！！！！！！！！！";
			byte []cc=str.getBytes();
			fo.write(cc, 0, cc.length);
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
