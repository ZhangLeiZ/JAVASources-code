package T2;

public class Factorial {

	public int Factorial(int n){
		int temp;
		if(n==0){
			return 1;
		}else{
			temp=Factorial(n-1);
			temp=n*temp;
			return temp;
		}
	}
	public static void main(String[] args) {
		Factorial factorial = new Factorial();
		int s = factorial.Factorial(5);
		System.out.println("s="+s);
	}
}
