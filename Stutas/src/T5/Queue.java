package T5;

public class Queue {
		Object[] data;
		int front;
		int rear;
		int size;
		public Queue() {
			size=10;
			front = -1;
			rear = -1;
			data = new Object[size];
		}
		public Queue(int size) {
			this.size=size;
			front = -1;
			rear = -1;
			data = new Object[size];
		}
		//入队
		public void inQueue(Object dat){
			if(rear+1<size){
				System.out.println("---"+(rear+1));
				rear++;
				data[rear]=dat;
				System.out.println("入队："+dat);
			}else{
				System.out.println("队列已满");
			}
		}
		//出队
		public void outQueue(){
			if(front==rear){
				System.out.println("队列已空");
				return;
			}
			front++;
			System.out.println("出队："+data[front]);
		}
		//遍历
		public void display(){
			for(int i=front+1;i<rear+1;i++){
				System.out.println("遍历:"+data[i]);
			}
			
		}
		public static void main(String[] args) {
			Queue queue = new Queue();
			queue.inQueue("1");
			queue.inQueue("2");
			queue.inQueue("3");
			queue.inQueue("4");
			queue.inQueue("5");
			queue.inQueue("6");
			queue.inQueue("7");
			queue.inQueue("8");
			queue.inQueue("9");
			queue.inQueue("10");
			queue.inQueue("11");

			queue.display();
			queue.outQueue();
			queue.outQueue();
			queue.outQueue();
			queue.outQueue();
			queue.display();
			
		}
	}
		


