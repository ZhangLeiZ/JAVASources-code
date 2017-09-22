package Student;
public class JoinThread extends Thread {
    public void run() {
        System.out.println("begin run");
        try {
            Thread.sleep(5000);
        } catch (InterruptedException ie) {
            System.out.println(" InterruptedException ");
        }
    }

    public static void main(String[] args) throws
            java.lang.InterruptedException {
        Thread t = new JoinThread();
        t.start();
        System.out.println("等待5秒后，线程t死亡");
        t.join();
        System.out.println("主线程死亡");
    }
}
