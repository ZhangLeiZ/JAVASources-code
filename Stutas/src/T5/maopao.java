package T5;

public class maopao {

	public void upset(int input[]){
		int max=0;
		int s=0;
//		for(int i=0;i<input.length;i++){
//			System.out.println("原先的数："+input[i]);
//		}
		for(int i=0;i<input.length;i++){
			System.out.println("第"+i+"轮运算");
			for(int j=i+1;j<=(input.length)-1;j++){
				if(input[i]>input[j]){
					s=input[i];
					input[i]=input[j];
					input[j]=s;
				}
				for(int k=0;k<input.length;k++){
					System.out.println("过程"+input[k]);
				}
			}
		}
		System.out.println("排序后");
		for(int i=0;i<input.length;i++){
			System.out.println(input[i]);
			if(max<input[i]){
				max=input[i];
				if(i==(input.length)-1){
				System.out.println("最大数="+input[i]);
				}
			}
		}
	}
	public static void main(String[] args) {
		int input[]={2,4,5,8,6,10,14,3,7};
		maopao mao = new maopao();
		mao.upset(input);
	}
}
