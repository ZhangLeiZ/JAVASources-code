package T5;


public class Stulink {

	StuNode head;
	public Stulink() {
		head=new StuNode();
	}
	
	public void push(Student data){
		StuNode p = head;
		StuNode s = new StuNode(data);
		while(p.getNext()!=null){
			p=p.getNext();
		}
		p.setNext(s);
	}
	public void poop(String name) {
		StuNode p=head;
		StuNode S=new StuNode();
		while(p.getNext()!=null){
			if(p.getNext().getData().getName()==name){
				System.out.println("--"+p.getNext().getData().getName());
				S=p.getNext().getNext();
				break;
			}else{
				p=p.getNext();
			}
		}
		p.setNext(S);
	}
	public void dispaly(){
		StuNode p = head;
		while(p.getNext()!=null){
			System.out.println(p.getNext().getData());
			p=p.getNext();
		}
	}
	public static void main(String[] args) {
		Stulink link = new Stulink();
		Student s1 = new Student(1001,"王宇明",18,"1班");
		Student s2 = new Student(1002,"王玉梅",19,"2班");
		Student s3 = new Student(1003,"王雨萌",20,"3班");
		Student s4 = new Student(1004,"王玉明",21,"4班");
		Student s5 = new Student(1005,"王玉敏",17,"5班");
		link.push(s1);
		link.push(s2);
		link.push(s3);
		link.push(s4);
		link.push(s5);
		link.dispaly();
		link.poop("王玉明");
		link.dispaly();
	}
}
