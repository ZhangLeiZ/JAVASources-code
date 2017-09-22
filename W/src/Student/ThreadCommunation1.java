package Student;
class Q1 {
    String name = "陈琼";
    String sex = "女";

}


class Producer1 implements Runnable {
    Q1 q = null;
    public Producer1(Q1 q) {
        this.q = q;
    }

    public void run() {
        int i = 0;
        while (true) {
            synchronized (q) {
                if (i == 0) {
                    q.name = "张孝祥";
                    q.sex = "男";
                } else {
                    q.name = "陈琼";
                    q.sex = "女";
                }
            }
            i = (i + 1) % 2;
        }
    }

}


class Consumer1 implements Runnable {
    Q1 q = null;
    public Consumer1(Q1 q) {
        this.q = q;
    }

    public void run() {
        while (true) {
            synchronized (q) {
                System.out.println(q.name + "---->" + q.sex);
            }
        }
    }
}


public class ThreadCommunation1 {
    public static void main(String[] args) {
        Q1 q = new Q1();
        new Thread(new Producer1(q)).start();
        new Thread(new Consumer1(q)).start();
    }
}
