package T3;

public class CatQueue {

	int size;
	int front;
	int rear;
	Object []data;
	public CatQueue() {
		this.size=10;
		this.front=0;
		this.rear=0;
		data = new Object[size];
	}
	public CatQueue(int size) {
		this.size=size;
		this.front=0;
		this.rear=0;
		data = new Object[size];
	}
	public void pushcat(Object cat){
		if(this.isfull()){
			System.out.println("队列已满");
		}else{
			this.rear++;
			rear=rear%size;
			data[rear]=cat;
		}
	}
	public Object popcat(){
		Object cat =null;
		if(this.isEmaty()){
			System.out.println("队列以空");
		}else{
			front++;
			front=front%size;
			cat=data[front];
		}
		return cat;
	}
	public boolean isfull(){
		boolean isok=true;
		if((this.rear+1)%size==this.front){//队满
			isok=true;
		}else{
			isok=false;
		}
		return isok;
	}
	public boolean isEmaty(){
		boolean isok = true;
		if(this.front==this.rear){//队空
			isok=true;
		}else{
			isok=false;
		}
		return isok;
	}
}
