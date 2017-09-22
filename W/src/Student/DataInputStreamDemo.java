package Student;

import java.io.DataInputStream;
import java.io.File;
import java.io.FileInputStream;

public class DataInputStreamDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		try{
			File file = new File("F:\\File\\test.dbf");
			if(!file.exists()){
				System.out.println("文件名不存在");
				
				return;
			}
			FileInputStream fis = new FileInputStream(file);
			DataInputStream dis = new DataInputStream(fis);
//			DataInputStream dis = new DataInputStream(new FileInputStream(new File("d:\\File\\test.db")));
			System.out.println(dis.readInt());
			System.out.println(dis.readShort());
			System.out.println(dis.readFloat());
			System.out.println(dis.readDouble());
			System.out.println(dis.readUTF());
			dis.close();
			
		}catch(Exception e){
			e.printStackTrace();
		}
	}

}
