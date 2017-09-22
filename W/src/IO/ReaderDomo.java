package IO;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

public class ReaderDomo {
public static void main(String[] args) {
	File file1 = new File("F:\\FILE");
	if(!file1.isFile()){
		file1.mkdir();
	}
	File file2 = new File(file1,"reader.txt");
	try {
		if(!file2.isFile()){
		file2.createNewFile();
		}
		FileReader rea =new FileReader(file2); 
		String s =file2.getName();
		System.out.println(s);
		
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
}
}
