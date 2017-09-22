package QI;

public class Wanshudome {

	static int i=0,j=0,sum;
	public static void main(String[] args) {
		for(i=2;i<1000;i++){
			sum=0;
			for(j=1;j<i;j++){
				if(i%j==0){ 
					sum+=j;
				}
			}
			if(sum==i){
				System.out.println(i);
				for(j=1;j<i;j++){
					if(i%j==0){
						System.out.println("\t"+j);
					}
				}
			}
		}
	}
}
