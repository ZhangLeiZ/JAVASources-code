package T5;

public class Shellsort {

	int data[];
	public Shellsort() {
		data = new int[]{4,2,1,7,11,8,16,0,3,20};
	}
	public Shellsort(int data[]){
		this.data=data;
	}
//	public void shellsort2(){
//		int d = data.length;
//		for(int q=d/2;q>0;q/=2){
//			for(int w=0;w<q;w++){
//				for(int e=q+w;e<d;e+=q){
//					int insert = data[e];
//					int r=e-q;
//					while(r>=0 && data[r]>insert){
//						data[r-q]=data[r];
//						r=r-q;
//					}
//					data[r-q]=insert;
//				}
//			}
//		}
//	}
	public void shellsort3(int data[]){
		int d=data.length;
		for(int i=d/2;i>0;i/=2){
			for(int j=0;j<i;j++){
				for(int k=i+j;k<d;k+=i){
					int insertemp = data[k];
					int s=k-i;
					while(s>=0 && insertemp<data[s]){
						data[s+i]=data[s];
						s=s-i;
					}
					data[s+i]=insertemp;
				}
			}
		}
	}
	public void shellsort4(){
		int d=data.length;
		for(int i=d/2;i>0;i/=2){
			for(int j=0;j<i;j++){
				for(int k=j+i;k<d;k+=i){
					int insertemp=data[k];
					int s=k-i;
					while(s>=0 && insertemp<data[s]){
						data[s+i]=data[s];
						s=s-i;
					}
					data[s+i]=insertemp;
				}
			}
		}
	}
	public void shellsort(){
		int d = data.length;
		for(int i=d/2;i>0;i/=2){
			for(int j=0;j<i;j++){	
				for(int k=j+i;k<d;k+=i){
					int insertsort = data[k];
					int s=k-i;
					while(s>=j && data[s]>insertsort){
						data[s+i]=data[s];
						s=s-i;
					}
					data[s+i]=insertsort;
				}
			}
			for (int e : data) {
				System.out.print(e+"\t");
			}
			System.out.println("");
		}
		
	}
	public void shellsort7(){
		int d = data.length;
		for(int i=d/2;i>0;i/=2){
			for(int j=0;j<i;j++){
				for(int k=i+j;k<d;k+=i){
					int insertemp=data[k];
					int s=k-i;
					while(s>=j && data[s]>insertemp){
						data[s+i]=data[s];
						s=s-i;
					}
					data[s+i]=insertemp;
				}
			}
		}
		for (int n : data) {
			System.out.print(n+"\t");
		}
	}
	public static void main(String[] args) {
		Shellsort sort = new  Shellsort();
		sort.shellsort7();
	}
}
