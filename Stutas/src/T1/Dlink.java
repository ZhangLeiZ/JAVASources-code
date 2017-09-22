package T1;

public class Dlink {
	ObjectNode stu = new ObjectNode();

	//定义头节点
	Dnode head;
	//初始化
	public Dlink() {
		//建表
		head = new Dnode();
		head.prior = null;
		head.next = null;
	}
	//新增节点
	public void addNode(int id,String name,int age,String classes){
		/*1.获取表头
		 *2.通过表头找到最后一个元素；
		 *3.把新增的节点放到最后一个元素的后面
		 * */
		Dnode p = head;
		while(p.next!=null){
			p=p.next;
		}
		stu.setId(id);
		stu.setName(name);
		stu.setAge(age);
		stu.setClasses(classes);
		//需要新增的节点
		Dnode temp = new Dnode(stu);
		p.next = temp;
		temp.prior = p;
	}
	public void dispaly(){
		Dnode p = head;
		while(p.next!=null){
			ObjectNode stuadd = new ObjectNode();
			System.out.println("---->>"+p.next.name);
			p=p.next;
		}
		while(p.prior!=null){
			System.out.println("---->>"+p.prior.name);
			p=p.prior;
		}
		System.out.println("---->>"+p.name);
	}
	public void delnode(ObjectNode data){
		Dnode p = head;
		while(p.next!=null){
			if(p.next.name.equals(data)){
				p.next.next.prior=p.next.prior;
				p.next=p.next.next;
			}
		}
	}
	public void insert(ObjectNode prame,ObjectNode data){
		Dnode p = head;
		while(p.next!=null){
			if(p.next.name.equals(prame)){
				Dnode t=p.next;
				Dnode temp = new Dnode(data);
				temp.next=t.next;
				t.next.prior=temp;
				t.next=temp;
				temp.next.prior=t;
				break;
			}else{
				p=p.next;
			}
		}
	}
	public static void main(String[] args) {
		Dlink link = new Dlink();
		link.addNode(002, "王明", 18, "2班");
		link.dispaly();
	}
	
}
