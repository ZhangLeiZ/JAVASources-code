package QI;

public class Jiujiu {
	static int sum;
	static int i;
	static int j;
public static void main(String[] args) {
	for(i=1;i<=9;i++){
		for(j=1;j<=i;j++){
			sum=i*j;
			System.out.print(j+"*"+i+"="+sum+"\t");
			if(i==j){
			break;
			}
		}
		System.out.println("");
	}

  }
}
