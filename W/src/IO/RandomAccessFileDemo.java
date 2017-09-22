package IO;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

public class RandomAccessFileDemo {
	public static void main(String[] args) {
		File file1 = new File("F:\\File3");
		if(file1.isFile()){
			file1.mkdir();
		}
		try {
			RandomAccessFile ran = new RandomAccessFile("F:\\File3\\text.txt","rw");
			int a =122;
			float b =1.322f;
			double c =2.223;
			String d ="分的";
			ran.writeInt(a);
			ran.writeFloat(b);
			
			ran.writeDouble(c);
			ran.writeChars(d);
			ran.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			RandomAccessFile ran2 = new RandomAccessFile("F:\\File3\\text.txt","r");
			ran2.seek(16);
			
	//		System.out.println("整型值："+ran2.readInt());
//			System.out.println("浮点度型："+ran2.readFloat());
		    System.out.println("双精度型："+ran2.readDouble());
			System.out.println("字符串："+ran2.readChar());
			System.out.println("长度："+ran2.length());
			System.out.println(""+ran2.hashCode());
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
