package IO;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;

public class Arryposwod {
	public static void main(String[] args) {
		 
		char a[]="还记得横空出世斯蒂芬".toCharArray();
		int b=0;
		try {
			File file = new File("seletr.txt");
			for(int i=0;i<a.length;i++){
				a[i]=(char)(a[i]);
		}
			
			FileWriter fw = new FileWriter(file);
			fw.write(a, 0, a.length);
			fw.close();
			
			FileReader fr = new FileReader(file);
			char tom[] = new char[10];
			System.out.println("密文:");
			while((b=fr.read(tom,0,10))!=-1){
				String str =new String(tom,0,b);
				System.out.println(str);
				}
			fr.close();
			
			fr =new FileReader(file);
			System.out.println(" ");
			System.out.println("明文：");
			while((b=fr.read(tom,0,10))!=-1){
				for(int j=0;j<b;j++){
					tom[j]=(char)(tom[j]<<5);
				}
				String s = new String(tom,0,b);
				System.out.println(s);
			}
			fr.close();
		} catch (Exception e) {
			// TODO: handle exception
		}
		
	}

}
