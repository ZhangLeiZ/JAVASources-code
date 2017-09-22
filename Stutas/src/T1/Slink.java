package T1;

public class Slink {

	Snode head;
	public Slink() {
		head = new Snode();
	}
	public void addpush(ObjectNode stu){
		Snode s = new Snode(stu);
		Snode p = head;
		while(p.getNext() !=null){
			p=p.getNext();
		}
		p.setNext(s);
	}
	public void addpush2(ObjectNode stu){
		Snode s = new Snode(stu);
		Snode p = head;
		while(p.getNext()!=null){
			if(p.getNext().getStu().getAge()<=stu.getAge()){
				p=p.getNext();
			}else{
				s.setNext(p.getNext());
				p.setNext(s);
				break;
			}
		}
		p.setNext(s);
	}
	public void dispaly(){
		Snode p = head;
		while(p.getNext() !=null){
			System.out.println(p.getNext().getStu());
			p=p.getNext();
		}
	}
	public void swep(int ida,int idb){
		Snode a = null;
		Snode b = null;
		Snode p = head;
		while(p.getNext()!=null){
			if(p.getNext().getStu().getId()==ida){
				a=p.getNext();
			}
			if(p.getNext().getStu().getId()==idb){
				b=p.getNext();
			}
			if(a!=null && b!=null){
				break;
			}
			p=p.getNext();
			
		}
		ObjectNode s = b.getStu();
		b.setStu(a.getStu());
		a.setStu(s);
	}
	public void onedis(int ida){
		Snode p = head;
		while(p.getNext()!=null){		
			if(p.getNext().getStu().getId()==ida){
				System.out.println(p.getNext().getStu());
				p=p.getNext();
			}
		}
	}
	public ObjectNode minage(){
		ObjectNode s=null;
		Snode p = head;
		if(p.getNext()==null){
			return null;
		}
		int age  = head.getNext().getStu().getAge();
		s = head.getNext().getStu();
		while(p.getNext()!=null){
			if(p.getNext().getStu().getAge()<s.getAge()){
				age=p.getNext().getStu().getAge();
				s=p.getNext().getStu();
			}
			p=p.getNext();
		}
		return s;
	}
	public static void main(String[] args) {
		Slink link = new Slink();
		ObjectNode s1 = new ObjectNode(1001,"王宇明",18,"1班");
		ObjectNode s2 = new ObjectNode(1002,"王玉梅",19,"2班");
		ObjectNode s3 = new ObjectNode(1003,"王雨萌",20,"3班");
		ObjectNode s4 = new ObjectNode(1004,"王玉明",21,"4班");
		ObjectNode s5 = new ObjectNode(1005,"王玉敏",17,"5班");
		link.addpush(s1);
		link.addpush(s2);
		link.addpush(s3);
		link.addpush(s4);
		link.addpush(s5);
		link.dispaly();
		System.out.println("----------------------");
		link.swep(1001, 1002);
		link.dispaly();
		System.out.println("--"+link.minage());
	}
}
