package Thread;

public class Thread2 extends Thread{
	@Override
	public void run() {
		for(int i=65;i<=90;i++){
			System.out.println((char)i);
		}
	}
	public static void main(String[] args) {
		Thread2 thread1 = new Thread2();
		Thread3 thread2 = new Thread3();
		thread1.start();
		thread2.start();
		
	}

}
class Thread3 extends Thread{
	@Override
	public void run() {
		for(int j=97;j<=122;j++){
			System.out.println((char)j);
			
		}
	}
}
