package QI;

public class Baiyuanbaiji {

	static int i,j,k;
	public static void main(String[] args) {
		for(i=1;i<100;i++){
			for(j=1;j<100;j++){
				for(k=1;k<100;k++){
					if((i*5+j*3+k/3)==100 && k%3==0 && i+j+k==100){
						System.out.println("公鸡有"+i+"母鸡有"+j+"小鸡有"+k);
					}
				}
			}
		}
	}
}
