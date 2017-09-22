package QI;

public class PrintDemo {
	static int fig;
	public PrintDemo() {
		for(int i=2;i<100;i++){
			fig=0;
			for(int j=2;j<i;j++){
				if(i%j==0){
					fig=1;
					break;
				}
			}
			if(fig==0){
				System.out.println(i);
			}
		}
	}
	public static void main(String args[]) {
		new PrintDemo();
	}
}


