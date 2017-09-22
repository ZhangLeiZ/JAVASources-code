package Student;
/**
 *
 * <p>Title:TicketThreadDemo </p>
 *
 * <p>Description:模拟一个卖票系统，让多个窗口同时售票，看看会有什么情况发生 </p>
 *
 * <p>Copyright: Copyright (c) 2007</p>
 *
 * <p>Company: </p>
 *
 * @author yanni xiao
 * @version 1.0
 */
public class TicketThreadDemo {
    public static void main(String[] args) {
        TicketThread ticket = new TicketThread();
        new Thread(ticket).start();
        new Thread(ticket).start();
        new Thread(ticket).start();
        new Thread(ticket).start();
    }
}

class TicketThread implements Runnable {
    private int tickets = 100;
    public void run() {
        while (true) {
            if (tickets > 0) {
                try{
                    Thread.sleep(1000);//先让线程暂停1秒种
                    System.out.println(Thread.currentThread().getName() +
                                       " is saling ticket " + tickets--);
                }catch(Exception e){
                   e.printStackTrace();
                }
            }
        }
    }
}
