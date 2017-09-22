package T3;

public class SQueue {

	Node head;
	public SQueue() {
		head = new Node();
	}
	//入队
	public void addqueue(String data){
		Node p = head;
		Node s = new Node(data);
		while(p.getNext()!=null){
			p=p.getNext();
		}
		p.setNext(s);
	}
	//遍历
	public void dispaly(){
		Node p = head;
		while(p.getNext()!=null){
			System.out.println(p.getNext().getData());
			p=p.getNext();
		}
	}
	//出队
	public String popqueue(){
		Node p = head;
		String date = "";
		while(p.getNext()!=null){
			date=p.getNext().getData();
		}
		p.setNext(p.getNext().getNext());
		return date;
	}
	public static void main(String[] args) {
		
	}
}
