package IO;

import java.io.File;
import java.io.FilenameFilter;

public class Filter {

	public static void main(String[] args) {
		File file = new File("E:\\Java\\java20161 - (28)\\src\\T11");
		FileName filelter = new FileName("java");
		String []filelist =file.list(filelter);
		for(int i=0;i<filelist.length;i++){
			System.out.println(filelist[i]);
		}
	}
}
class FileName implements FilenameFilter {
	String event;
	public  FileName(String event) {
		this.event=event;
	}

	public boolean accept(File dir, String name) {
		// TODO Auto-generated method stub
		return name.endsWith("."+event);
	}
	
}
