package Student;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutputStreamDemo {

	public static void main(String[] args) {
		try {
			File file =new File("D:\\File\\file.txt");
			//如果文件不存在先创建文件
			if(!file.exists()){
				file.createNewFile();
			}
			/**
			 * 第一个参数：文件名称
			 * 第二个参数：为真则追加到文件的最后，为假就覆盖原理的文件，默认值为假
			 * */
			FileOutputStream fos = new FileOutputStream(file,true);
			String str = "这是保存到文件中的内容^^^^^!!!~~~~~~~~";
			//转换为字节数组
			byte b[] = str.getBytes();
			fos.write(b, 0, b.length);
			fos.close();
			
			
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
