package T5;

public class Heapsort2 {

	int data[];
      public Heapsort2() {
		data = new int[]{2,4,1,7,11,17,0,3,15,21};
   }
      public Heapsort2(int data[]){
    	  this.data=data;
      }
      public void heapsort(){
    	  int length = data.length;
    	  Initheap(data, length);
    	  for (int s: data) {
			System.out.print(s+"\t");
		}
    	  System.out.print("");
    	  
      } 
  public void Initheap(int data[],int length){
		  int higth = length-1;
		  boolean ischeng=false;
	  for(int k=(higth-1)/2;k>=0;k--){
		  int left = k*2+1;
		  int right=left+1;
		 if(left<=higth){
			 int max=left;
			 if(right<=higth){
				 if(data[left]<data[right]){
					 max=right;
				 }
			 }
			 if(data[max]>data[k]){
				 ischeng=true;
				 Switchdata(data, max, k);
			 }
		 }
	  }
	  if(ischeng){
		  Initheap(data, length);
	  }
  }
  public void Switchdata(int data[],int index1,int index2){
	  data[index1] ^= data[index2];
	  data[index2] ^= data[index1];
	  data[index1] ^= data[index2];
  }
  public static void main(String[] args) {
	 Heapsort2 heap = new Heapsort2();
	 heap.heapsort();
}
}
