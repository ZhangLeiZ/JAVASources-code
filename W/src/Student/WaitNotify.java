package Student;
public class WaitNotify extends Thread {
    public WaitNotify() {}
    public void run() {
        System.out.println("敲击enter取消线程等待");
        try {
            System.in.read();//等待读取键盘输入
        } catch (java.io.IOException ioe) {
            ioe.printStackTrace();
        }
        //通知主线程该线程已经执行完
        synchronized (this) {
            this.notifyAll();
            System.out.println("调用了notifyAll（）方法通知其解除等待！");
        }
    }
    public static void main(String[] args) throws Exception {
        Thread t1 = new WaitNotify();
        t1.start();//启动线程
        synchronized (t1) {
            System.out.println("开始等待次线程的通知");
            t1.wait();
            //在run中的线程通知后才执行
            System.out.println("接收了通知后，继续执行！");
        }
        System.out.println("wait 方法已经返回");
    }
}
