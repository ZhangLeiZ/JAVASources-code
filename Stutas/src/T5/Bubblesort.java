package T5;

public class Bubblesort {
	int []data;
	public Bubblesort(int data[]) {
		this.data=data;
	}
	public void bubblesort2(){
		int leng = data.length;
		int temp=0;
		for(int i=0;i<leng-1;i++){
			for(int j=0;j<leng-i-1;j++){
				if(data[j]>data[j+1]){
					temp=data[j];
					data[j]=data[j+1];
					data[j+1]=temp;
				}
			}
		}
		for (int e : data) {
			System.out.print("\t"+e);
		}
		System.out.println("");
	}
	public void bubblesort3(){
		int len = data.length;
		int s=0;
		for(int i=0;i<len-1;i++){
			for(int j=0;j<len-i-1;j++){
				if(data[j]<data[j+1]){
					s=data[j];
					data[j]=data[j+1];
					data[j+1]=s;
				}
			}
		}
		for (int e : data) {
			System.out.print(e+"\t");
		}
		System.out.println("");
	}
	public void bubblesort(){
		int leng=data.length;
		System.out.println("=="+leng);
		int s=0;
		for(int i=0;i<leng-1;i++){
			for(int j=0;j<leng-i-1;j++){
				if(data[j]>data[j+1]){
					s=data[j];
					data[j]=data[j+1];
					data[j+1]=s;
				}
			}
		}
		for (int e : data) {
			System.out.print(e+"\t");
		}
		System.out.println("");
	}
	public static void main(String[] args) {
		 int data[]={4,5,8,11,23,36,16,21,0};
		Bubblesort sort = new Bubblesort(data);
		sort.bubblesort();
		sort.bubblesort3();
		
	}
}
