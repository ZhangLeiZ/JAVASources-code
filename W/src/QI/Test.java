package QI;

import java.awt.Desktop;
import java.io.File;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;

   public class Test {
	   
	   public Test(String URL) {
			
				String url ="file:///" + new File(URL).getAbsolutePath().replace("\\","/");		
				try {  
					URI uri = new URI(url);  
					Desktop desktop = null;  
					if (Desktop.isDesktopSupported()) {  
						desktop = Desktop.getDesktop();  
					}  
					if (desktop != null)  
						desktop.browse(uri);  
				} catch (IOException ioe) {  
					ioe.printStackTrace();  
				} catch (URISyntaxException e) {  
					e.printStackTrace();  
				}  
			}
	
       public static void main(String args[]) {
    	  new Test("QQ音乐.lnk");
       }
   }
