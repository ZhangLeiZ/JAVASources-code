package Student;
import javax.swing.*;
import java.util.*;

public class ClockRunnableApp extends JFrame implements Runnable {
    JLabel label = new JLabel("2007-08-21 10:02:32"); //实例化一个Label对象
    public ClockRunnableApp() {
        super("电子时钟");
        this.add(label);
        
        this.setSize(150, 50);
        new Thread(this).start(); //实例化该线程，并启动
    }
   //取得当前时间并不停的刷新时间
    public void run() {
        while (true) {
            label.setText(new Date().toLocaleString());
        }
    }
    public static void main(String[] args) {
        new ClockRunnableApp().setVisible(true);
    }
}

/**
 class TimeFrame extends JFrame {
    JLabel label = new JLabel("2007-08-21 10:02:32"); //实例化一个Label对象
    public TimeFrame() {
        super("电子时钟");
        this.add(label);
        this.setSize(150, 50);
        TimeThread time = new TimeThread(label);
        new Thread(time).start();
    }
 }


 class TimeThread implements Runnable {
    Label a;
    public TimeThread(Label lab) {
        a = lab;
    }

    public void run() {
        while (true) {
            a.setText(new Date().toLocaleString());
        }
    }
 }
 */
