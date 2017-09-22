package FILE;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;


public class Filescreat{
	public static void main(String[] args) {
		File file=new File("test.txt");
		if(!file.isFile()){
			try {
				file.createNewFile();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		try {
			Scanner in=new Scanner(System.in);
			String input=in.next();
			char []c=input.toCharArray();
			for(int i=0;i<c.length;i++){
				c[i]=(char)(c[i]^'a');
			}
			FileWriter fw=new FileWriter(file);
			fw.write(c,0,c.length);
			fw.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
		System.out.println("加密后密文是：");
		try {
			FileReader mm=new FileReader(file);
			char[]x=new char[10];
			int t=0;
			String s1="";
			while((t=mm.read(x,0,10))!=-1)
			{
				 s1+=new String(x,0,t);
				
			}
			System.out.println(s1);
		} catch (FileNotFoundException e1) {
			e1.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			
			FileReader fr=new FileReader(file);
			int n=0;
			String ste="";
			char temp[]=new char[10];
			while((n=fr.read(temp,0,temp.length))!=-1){
				for(int j=0;j<n;j++){
					temp[j]=(char)(temp[j]^'a');
				}
				ste+=new String(temp,0,n);
				
			}
			System.out.println("解密后明文是：");
			System.out.println(ste);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}