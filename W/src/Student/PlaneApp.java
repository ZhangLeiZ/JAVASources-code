package Student;
import java.awt.*;
import javax.swing.*;
public class PlaneApp {
    public static void main(String cdf[]) {
        GameFrame f = new GameFrame();
        f.show();
    }
}


class GameFrame extends JFrame implements Runnable {
    int y;
    GameFrame() { //构造函数
        this.setSize(300, 500);
        this.setBackground(Color.BLACK); //设置颜色
        this.setTitle("雷电"); //设置标题
        new Thread(this).start(); //启动线程
    }
    //加载图片的方法
    public void paint(Graphics d) {
        Toolkit tool = Toolkit.getDefaultToolkit();
        Image img = tool.getImage("dj.gif");
        d.drawImage(img, 50, y, this); //把得到的图片画到窗体上并设置位置
    }
    public void run() {
        while (true) {
            y = 10;
            for (int i = 1; i < 50; i++) {
                y = y + 10; //移动坐标Y
                this.repaint();
                this.repaint(); //重画方法，就是从新调了一边paint方法，从调是因
    //为坐标y已经发生了变化，每调一次y都会从读一次y值，循环下去就会产生飞机向下移动的效果
                try {
                    Thread.sleep(100);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
