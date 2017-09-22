package IO;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

public class RreadDomo {
	public static void main(String[] args) {
		try {
			BufferedReader br =new BufferedReader(new FileReader(new File("F:File4\\read.txt")));
			String conter = "";
			while((conter=br.readLine())!=null){
				System.out.println(conter);
			}
			br.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
