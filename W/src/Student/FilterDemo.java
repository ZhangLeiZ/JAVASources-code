package Student;

import java.io.File;
import java.io.FilenameFilter;

public class FilterDemo {

	public static void main(String[] args) {
		File file = new File("E:\\Java\\java20161 - (28)\\src\\T12");
		
		/**
		 * 只打开当前文件夹中后缀名（扩展名）为java的文件
		 * */
		FilterName filter = new FilterName("java");
		String[] filelist = file.list(filter);
		for(int i=0;i<filelist.length;i++){
			System.out.println(filelist[i]);
		}
	}
}
class FilterName implements FilenameFilter {
    String extent;
    public FilterName(String extent) {
        this.extent = extent;
    }

    //实现过滤文件类型的方法
    public boolean accept(File dir, String name) {
        return name.endsWith("." + extent); //返回文件的后缀名
    }
}
