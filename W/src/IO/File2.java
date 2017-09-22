package IO;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class File2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		File file1 = new File("F:\\File3");
		if(!file1.exists()){
			file1.mkdirs();
		}
		File file2 = new File(file1,"text.txt");
		try {
			if(!file2.exists()){
				file2.createNewFile();
				}
			FileOutputStream out = new FileOutputStream(file2);
			byte buy[]="上方空间访客借口".getBytes();
			out.write(buy);
			out.close();
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			FileInputStream in = new FileInputStream(file2);
			byte byt[]=new byte[1024];
			int len = in.read(byt);
			System.out.println("文件信息："+new String(byt,0,len));
			in.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
			
	}

}
