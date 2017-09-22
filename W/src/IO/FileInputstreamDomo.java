package IO;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import javax.imageio.stream.FileCacheImageInputStream;

public class FileInputstreamDomo {
	public static void main(String[] args) {

		try {
			FileInputStream fis = new FileInputStream(new File("E:\\Java\\java20161 - (4)\\src\\tuixiangzi\\Tuixiangzi.java"));
			FileOutputStream fis2 = new FileOutputStream(new File("E:\\Java\\text.txt"));

			byte buy[] = new byte[1024];
			int len = 0;
			while((len=fis.read(buy))>0){
				fis2.write(buy);
				System.out.println("写入成功");
				System.out.println(new String(buy,0,len));
			}
			fis2.flush();
			fis.close();
			fis2.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		

	}

}
