package IO;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class ObjectoutputstreamDomo {

	
	public static void main(String[] args) {
		new  ObjectoutputstreamDomo().saVoid();
		new  ObjectoutputstreamDomo().grevoid();
	}
	public void saVoid() {
		
		File file = new File("F:\\File\\student.db");
		
			try {
				if(!file.exists()){
				file.createNewFile();
				}
				ObjectOutputStream oos=new ObjectOutputStream(new FileOutputStream(file));
				Studnt s1 = new Studnt(1001,"张三","男",16);
				Studnt s2 = new Studnt(1002,"李四","男",18);
				oos.writeObject(s1);
				oos.writeObject(s2);
				oos.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	public void grevoid(){
		File file2 = new File("F:\\File\\student.db");
		try {
			if(!file2.exists()){
				System.out.println("没有这个文件打开这个文件失败。");
				return;
			}
			ObjectInputStream ois = new ObjectInputStream(new FileInputStream(file2));
			Studnt s1 = (Studnt)ois.readObject();
			Studnt s2 = (Studnt)ois.readObject();
			System.out.println(s1);
			System.out.println(s2);
			ois.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
		
	}

