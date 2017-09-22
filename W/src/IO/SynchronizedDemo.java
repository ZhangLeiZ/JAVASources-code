package IO;

public class SynchronizedDemo {
	
	public static void main(String[] args) {
		SynchronizedDemo ayn =new SynchronizedDemo();
		new Thread(new Thread1(ayn)).start();
		new Thread(new Thread2(ayn)).start();
	}
	public void possword(){
	
		for(int i=0;i<=100;i++){
			System.out.println("0~100的数"+i);
		}
	}
	public void possword2(){
		for(int i=101;i<=200;i++){
			System.out.println("101到200的数"+i);
		}
	}

}
class Thread1 implements Runnable{
	SynchronizedDemo ayn;
	public Thread1(SynchronizedDemo ayn2 ) {
		this.ayn=ayn2;
	}
	public void run() {
		synchronized(ayn){
			ayn.possword();
		}
		
	}
	
}
class Thread2 implements Runnable{
	SynchronizedDemo ayn;
	public Thread2(SynchronizedDemo ayn2 ) {
		this.ayn=ayn2;
	}
	public void run() {
		synchronized(ayn){
			ayn.possword2();
		}
		
	}
	
}
