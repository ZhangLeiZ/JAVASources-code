package FILE;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Writefile {
	public static void main(String[] args) {
		File file=new File("E:/java not/test.txt");
		if(!file.isFile()){
			try {
				file.createNewFile();
				BufferedWriter bf=new BufferedWriter(new FileWriter(file));
				Scanner put=new Scanner(System.in);
				String cont=put.next();
				bf.write(cont);
				bf.flush();
				bf.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
}
