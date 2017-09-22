package Student;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileOutputStream;
public class DataOutputStreamDemo {

	/**
	 * 包装类：
	 * 	DataInputStream,DataOutputStream
	 * DataOutputStream->FileOutputStream->File
	 * 
	 * */
	public static void main(String[] args) {
		
		try{
			File file = new File("F:\\File\\test.dbf");
			if(!file.exists()){
				file.createNewFile();
			}
			DataOutputStream dos = new DataOutputStream(new FileOutputStream(file));
			int a=10;
			short sh=20;
			float f= 111.115f;
			double d= 8.888;
			String str = "文件内容";
			dos.writeInt(a);
			dos.writeShort(sh);
			dos.writeFloat(f);
			dos.writeDouble(d);
			dos.writeUTF(str);
			dos.close();
		}catch(Exception e){
			e.printStackTrace();
		}
	}
}
