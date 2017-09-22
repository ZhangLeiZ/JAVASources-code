package IO;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class writeDomo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		File file = new File("F:File4\\read.txt");
		
			try {
				if(file.exists()){
				file.createNewFile();
				}
				BufferedWriter bw= new BufferedWriter(new FileWriter(file)); 
				Scanner input = new Scanner(System.in);
				String conter = input.next();
				bw.write(conter);
				bw.flush();
				bw.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
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


