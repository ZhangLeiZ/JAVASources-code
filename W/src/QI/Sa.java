package QI;

public class Sa {
	
	
		public static void main(String[] args) 
		{
			int i,j,k;
			for(i=1;i<100;i++){
				for(j=1;j<100;j++)
				{
					for(k=1;k<100;k++)
					{
						
						if((i*5+j*3+k/3)==100 &&  k%3==0 && (i+j+k==100)){
							System.out.println("公鸡有"+i+"只,母鸡有"+j+"只，小鸡有"+k+"只");
						}
					}
				}
			}
		}
	}


