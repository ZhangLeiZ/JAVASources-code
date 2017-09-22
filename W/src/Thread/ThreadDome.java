package Thread;

public class ThreadDome extends Thread {
	public ThreadDome() {
		// TODO Auto-generated constructor stub
	}
	
    public  ThreadDome(String name) {
		setName(name);
	}
	@Override
	public void run() {
	
		for(int i=0;i<100;i++){
			System.out.println(Thread.currentThread().getName()+":i="+i);
		}
		try {
			Thread.sleep(10000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		ThreadDome thread1 = new ThreadDome();
		ThreadDome thread2 = new ThreadDome("斯蒂芬");
		ThreadDome thread3 = new ThreadDome();
		ThreadDome thread4 = new ThreadDome();
		thread1.setName("绝对是");
	    thread1.start();
	    thread2.start();
	    thread1.isAlive();
	    thread3.start();
	    thread4.start();

	}

}
