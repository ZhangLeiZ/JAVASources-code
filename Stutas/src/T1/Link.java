package T1;

public class Link {
	//表头
	Node head;
	public Link() {
		head = new Node();
		head.next=null;
	}
	
	public void addnode(String date){
		/*1.获取表头
		 *2.通过表头找到最后一个元素；
		 *3.把新增的节点放到最后一个元素的后面
		 * */
		Node p = head;
		while(p.next!=null){
			p=p.next;
		}
		//需要新增的节点
		Node temp = new Node(date);
		p.next = temp;
	}
	public void delnode(String date){
		Node p = head;
		while(p.next!=null){
			if(p.next.name.equals(date)){
				p.next=p.next.next;
				break;
			}else{
				p=p.next;
			}
		}
	}
	//遍历
	public void display(){
		Node p = head;
		while(p.next!=null){
			System.out.println(p.next.name+"->>");
			p=p.next;
		}
	}
	public void findnode(String date){
		Node p = head;
		while(p.next!=null){
			if(p.next.name.equals(date)){
				System.out.println("date="+p.next.name);
				break;
			}else{
				p=p.next;
			}
		}
	}
	public void insertnode(String prame,String date){
		Node p = head;
		while(p.next!=null){
			if(p.next.name.equals(prame)){
				Node t = p.next;
				Node insert = new Node(date);
				insert.next=t.next;
				t.next=insert;
			}else{
				p=p.next;
			}
		}
	}
	public void addfrist(Node newnode){
		Node p = head;
		Node temp = p.next;
		p.next=newnode;
		newnode.next=temp;
		
	}
	public void addList(Node data){
		Node p = head;
		while(p.next!=null){
			p=p.next;
		}
		p.next=data;
	}
	public void add(int index,Node data) {
		Node p = head;
		Node f =null;
		for(int i=0;i<index+1;i++){
			f=p;
			p=p.next;
		}
		f.next=data;
		data.next=p;
	}
	public void remove (int index){
		Node p = head;
		Node f = null;
		for(int i=0;i<index+1;i++){
			f=p;
			p=p.next;
		}
		f.next=p.next;
	}
	public static void main(String[] args) {
		Link link = new Link();
		link.addnode("一号");
		link.addnode("二号");
		link.addnode("三号");
		link.display();
		link.delnode("二号");
		link.display();
		link.findnode("一号");
		link.insertnode("一号", "二号");
		link.display();
	}
}
