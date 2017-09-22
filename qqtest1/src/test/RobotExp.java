package test;
import java.awt.AWTException;
import java.awt.Rectangle;
import java.awt.Robot;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

public class RobotExp {

public static void main(String[] args) {

try {

		Robot robot = new Robot();
		// 根据指定的区域(100,100)抓取屏幕的指定区域 
		BufferedImage bi=robot.createScreenCapture(new Rectangle(1366,768));
		//把抓取到的内容写入到一个jpg文件中
		ImageIO.write(bi, "jpg", new File("C:/imageTest.jpg"));

	} catch (AWTException e) {
	e.printStackTrace();
	} catch (IOException e) {
	e.printStackTrace();
	}
	}
	}