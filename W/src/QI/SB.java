package QI;

public class SB {

	public static void main(String[] args) {
		int x,y;
		for(x=1,y=1;y<20;y++){
			System.out.println("愚夫愚妇="+y);
			if(x>10){
				break;
			}
			if(x%2==0){
				System.out.println(x);
				x+=5;
				continue;
			}
			x-=3;
			
		}
		System.out.println(y);
	}
}
