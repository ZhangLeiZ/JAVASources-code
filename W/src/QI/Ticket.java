package QI;


public class Ticket extends Thread{ 
	static int money = 10000;
	static String s = "";
	public void run() {
	  while(true){
		synchronized(s){
		if(money>0){
			money-=100;
			System.out.println(Thread.currentThread().getName()+"取了100元，还剩"+money);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}else{
			break;
		}
	  }
	}
}
	public static void main(String[] args) {
		Ticket t1 = new Ticket();
		t1.setName("卡");
	    t1.start();
	    
	    Ticket t2 = new Ticket();
	    t2.setName("存折");
	    t2.start();
	}
  }
