package Student;
class Q3 {
    private String name = "陈琼";
    private String sex = "女";

    boolean isPut = false;

    public synchronized void put(String name, String sex) throws Exception {
        if (isPut) {
            wait();
        }

        this.name = name;

        Thread.sleep(10);

        this.sex = sex;

        isPut = true;
        notify();
    }

    public synchronized void get() throws Exception {
        if (!isPut) {
            wait();
        }

        System.out.println(name + "---->" + sex);

        isPut = false;
        notify();
    }
}


class Producer3 implements Runnable {
    Q3 q = null;

    public Producer3(Q3 q) {
        this.q = q;
    }

    public void run() {
        int i = 0;
        while (true) {

            try {
                if (i == 0) {
                    q.put("张孝祥", "男");
                } else {
                    q.put("陈琼", "女");
                }
            } catch (Exception e) {
                e.printStackTrace();
            }

            i = (i + 1) % 2;
        }
    }

}


class Consumer3 implements Runnable {
    Q3 q = null;
    public Consumer3(Q3 q) {
        this.q = q;
    }

    public void run() {
        while (true) {
            try {
                q.get();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}


public class ThreadCommunation3 {
    public static void main(String[] args) {
        Q3 q = new Q3();
        new Thread(new Producer3(q)).start();
        new Thread(new Consumer3(q)).start();
    }
}
