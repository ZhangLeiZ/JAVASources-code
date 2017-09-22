﻿package Student;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

public class ReaderDemo {

	public static void main(String[] args) {
		try{
			File file = new File("d:\\File\\writer.txt");
			BufferedReader br = new BufferedReader(new FileReader(file));
			String content="";
			//一行一行读取文本内容，直到文件结束返回null
			while((content=br.readLine())!=null){
				System.out.println(content);
			}
			br.close();
		}catch(Exception e){
			e.printStackTrace();
		}
	}
}
