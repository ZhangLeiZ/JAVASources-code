package Student;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileInputStreamDemo {

	public static void main(String[] args) {
		//读文件内容
		String sfilename= "D:\\work\\javaProj\\java20161\\src\\T10\\TableEventDemo.java";
		File file = new File(sfilename);
		try {
//			FileInputStream fis = new FileInputStream(sfilename);
			FileInputStream fis = new FileInputStream(file);
//			FileInputStream fis = new FileInputStream(new File("D:\\work\\javaProj\\java20161\\src\\T10\\JTreeApp1.java"));
			//定义保存文件内容的字节数组
			byte b[] = new byte[1024];
			String content =null;
			int n=0;
			//从文件中读取1024个字节的数据，保存到b数组中，从数组的第一个元素开始，返回实际读取到内容长度
			//返回值是-1表示文件结束
			while((n=fis.read(b,0, b.length)) !=-1){
				//把字节数组转换成字符串
				content += new String(b,0,n);
			}
			System.out.println(content);
			//关闭文件
			fis.close();
			
			
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
