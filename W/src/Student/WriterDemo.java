package Student;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.util.Scanner;

public class WriterDemo {

	public static void main(String[] args) {
		/**
		 * 字符流只能操作文本文件
		 * Writer->FileWriter->BufferedWriter
		 * Reader->FileReader->BufferedReader
		 * */
		try{
			File file = new File("d:\\File\\writer.txt");
			if(!file.exists()){
				file.createNewFile();
			}
			BufferedWriter bw = new BufferedWriter(new FileWriter(file));
			Scanner input = new Scanner(System.in);
			String content=input.next();
			bw.write(content);
			//刷新缓存
			bw.flush();
			bw.close();
		}catch(Exception e){
			e.printStackTrace();
		}
	}
}
