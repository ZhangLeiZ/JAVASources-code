package Student;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
public class RandomAccessFileDemo {

	public static void main(String[] args) {
		File file = new File("D:\\File");
		if(!file.exists()){
			file.mkdir();
		}
		try {
			RandomAccessFile raf = new RandomAccessFile("d:\\File\\test.db","rw");
			//写内容 
			int a=111;
			float f = 1.11f;
			double d = 1.222;
			raf.writeInt(a);
			raf.writeDouble(d);
			raf.writeFloat(f);
			raf.close();//关闭文件
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		//读文件内容
		try {
			RandomAccessFile raf = new RandomAccessFile("d:\\File\\test.db","r");
			//seek函数：设置文件指针的当前位置
			raf.seek(12);
//			System.out.println("双精度类型的值是："+raf.readDouble());
//			System.out.println("整形的值是："+raf.readInt());
			System.out.println("浮点型的值是："+raf.readFloat());
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
