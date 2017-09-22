package Student;
/**
 *
 * <p>Title: </p>
 *
 * <p>Description:普通的生产者与消费者之间的关系 </p>
 *
 * <p>Copyright: Copyright (c) 2007</p>
 *
 * <p>Company: </p>
 *
 * @author not attributable
 * @version 1.0
 */
class Q {
    String name = "陈琼";
    String sex = "女";
}
class Producer implements Runnable {
    Q q = null;

    public Producer(Q q) {
        this.q = q;
    }
    public void run() {
        int i = 0;
        while (true) {
            if (i == 0) {
                q.name = "张孝祥";
                q.sex = "男";
            } else {
                q.name = "陈琼";
                q.sex = "女";
            }
            i = (i + 1) % 2;
        }
    }
}
class Consumer implements Runnable {
    Q q = null;
    public Consumer(Q q) {
        this.q = q;
    }
    public void run() {
        while (true) {
            System.out.println(q.name + "---->" + q.sex);
        }
    }
}


public class ThreadCommunation {
    public static void main(String[] args) {
        Q q = new Q();
        new Thread(new Producer(q)).start();
        new Thread(new Consumer(q)).start();
    }
}
