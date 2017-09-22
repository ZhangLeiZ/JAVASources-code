package QI;

import java.awt.Cursor;
import java.awt.Desktop;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;

import javax.swing.JFrame;
import javax.swing.JLabel;
		public class SuperLink extends JFrame {
		/** 定义本机桌面对象 */
		private Desktop desktop = Desktop.getDesktop();
		/** 定义统一资源标识符对象 */
		private URI uri;
		/**定义网址*/
		private String webSite = "http://www.baidu.com";
		/**定义用于超链接的JLabel*/
		JLabel jl = new JLabel("我是超链接！");
		/**
		* 无参构造方法，构造一个160*90的窗体，中间放置一个超链接的JLabel
		*/
		public SuperLink() {
			
		//设置大小位置
		this.setBounds(800, 200, 160, 90);
		//设置默认关闭操作
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		//将JLabel添加到窗体
		this.add(jl);
		//设置鼠标外观
		jl.setCursor(new Cursor(Cursor.HAND_CURSOR));
		//设置鼠标事件监听
		jl.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent e) {
		        runBroswer();
	}
});
//设置窗体可见
			this.setVisible(true);
		}
/**
* 检查系统是否支持浏览器
*
* @return
*/
//		public boolean checkBroswer() {
//	//返回值为当前系统是否支持浏览器
//	return (Desktop.isDesktopSupported() && desktop.isSupported(Desktop.Action.BROWSE));
//	}
//	/**
//	* 运行默认浏览器打开uri对应网页
//	*/
		public void runBroswer() {
				try {
				// 定义网址为webSite的内容
				uri = new URI(webSite);
				} catch (URISyntaxException e) {
				e.printStackTrace();
				}
				try {
				// 浏览uri网址的网页
				desktop.browse(uri);
				} catch (IOException e) {
					e.printStackTrace();
				}
				}
			public static void main(String[] args) {
			 new SuperLink();
			}
}

