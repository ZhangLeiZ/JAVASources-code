package Student;

import java.io.File;
import java.io.IOException;
import java.util.Date;
import java.util.List;

public class FileDemo {

	/**
	 * File类
	 * 	作用：
	 * 		1.创建，修改，删除，读取目录（文件夹）；
	 * 		2.创建，删除，打开，关闭文件，读取或者设置文件的各种属性
	 * 		3.特别强调：不能操作文件的内容
	 * 
	 * 	
	 * */
	
	public static void main(String[] args) {
		
		//打开文件夹
		String path = "D:\\work\\javaProj\\java20161\\src";
		path = "D:/work/javaProj/java20161/src/T3/A.java";
		File file = new File(path);
		//查看是否为路径
		//isDirectory返回真表示是一个路径
		System.out.println("该文件是否为路径:"+file.isDirectory());
		//isFile返回真代表是文件
		System.out.println("该文件是否为文件:"+file.isFile());
		//读取文件大小
		System.out.println("文件内容的大小："+file.length() +"个字节");
		//文件的修改时间，创建时间
		System.out.println("最后修改时间："+new Date(file.lastModified()).toLocaleString());
		System.out.println("是否为可读文件："+file.canRead());
		System.out.println("是否为可写文件："+file.canWrite());
		System.out.println("文件是否存在："+file.exists());
		System.out.println("获取文件名称："+file.getName());
		System.out.println("获取父路径："+file.getParent());
		System.out.println("获取文件路径："+file.getPath());
		System.out.println("是否为隐藏文件："+file.isHidden());
		File file1 = new File("D:\\File");
		//创建文件夹
		if(!file1.exists()){
			file1.mkdir();
		}
		File file2 = new File(file1,"test.txt");
		//创建文件
		try {
			//判断文件是否存在
			if(!file2.exists()){
				file2.createNewFile();
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
		//获取文件夹中的所有子文件夹及文件
		File file3 = new File("d:\\work");
		File filelist[] = file3.listFiles();
//		String list[] = file3.list();
		for(int i=0;i<filelist.length;i++){
			if(filelist[i].isDirectory()){
				System.out.println("文件夹："+filelist[i].getPath());
			}
			if(filelist[i].isFile()){
				System.out.println("文件："+filelist[i].getPath());
			}
		}
		//删除文件
		File file4 = new File("D:\\File\\test.txt");
		file4.delete();
		File file5 = new File("D:\\File");
		file5.delete();
	}
}
