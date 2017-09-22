package FILE;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Filereader {
	public static void main(String[] args) {
		File file=new File("E:/java not/test.txt");
		try {
			BufferedReader br=new BufferedReader(new FileReader(file));
			String cont="";
			while((cont=br.readLine())!=null){
				System.out.println(cont);
			}
			br.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
