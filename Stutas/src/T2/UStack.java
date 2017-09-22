package T2;

public class UStack {

	SNode head;
	int size;
	public UStack() {
		head = new SNode();
		head.next = null;
	}
	public void push(String name){
		if(name.equals("{")){
			pop(name);
		SNode p = head;
		SNode f = new SNode(name);
		f.next=p.next;
		p.next=f;
		size++;
		}
	}
	public void dispaly(){
		SNode p = head;
		while(p.next!=null){
			System.out.println("--->>"+p.next.name);
			p=p.next;
		}
	}
	public String pop(String cha){
		SNode p = head;
		SNode temp=null;
		if(isEmpty()){
			System.out.println("堆栈为空");
			return null;
		}
		while(p.next!=null){
			if(cha.equals("{")){
				if(p.next.name.equals("}")){
					temp = p.next;
					p.next=p.next.next;
					size--;
				}
			}
		}
		return temp.name;
	}
	public boolean isEmpty(){
		boolean isok = false;
		if(head.next==null){
			isok=true;
		}
		return isok;
	}
	public void find (String name){
		SNode p = head;
		while(p.next!=null){
			if(p.next.name.equals(name)){
				System.out.println("--->>"+p.next.name);
				break;
			}else{
				p=p.next;
			}
		}
	}
	
	public String peek(){
		SNode p = head;
		if(isEmpty()){
			System.out.println("堆栈为空");
			return null;
		}
		return p.next.name;
	}
	public int size(){
		return size;
	}
	public boolean ispocity(String cha){
		boolean isok = false;
		if(cha.equals("(")||cha.equals(")")){
			
		}
		return isok;
	}
	public static void main(String[] args) {
		UStack stack = new UStack();
		stack.push("组长");
		stack.push("组长");
		stack.push("部长");
		stack.push("总经理");
		stack.push("董事长");
		System.out.println("大小"+stack.size());
		stack.dispaly();
		System.out.println("-------------------");
		stack.find("总经理");
		System.out.println("栈顶元素"+stack.peek());
	}
}
