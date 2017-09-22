package URL;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;

public class Urltest {
	public static void main(String[] args) {
		try {
			URL url=new URL("https://www.taobao.com/");
			URLConnection con=url.openConnection();
			File file=new File("test.html");
			InputStream is=con.getInputStream();
			BufferedInputStream fis=new BufferedInputStream(is);
			FileOutputStream fo=new FileOutputStream(file);
			byte []b=new byte[2048];
			int a=0;
			while((a=fis.read(b))>0){
				fo.write(b, 0, a);
				
			}
			fis.close();
			fo.close();
			System.out.println("网络爬虫复制完毕！");
		} catch (MalformedURLException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
