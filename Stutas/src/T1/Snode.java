package T1;

public class Snode {

	private ObjectNode stu;
	private Snode next;
	public Snode() {
		stu=null;
		next=null;
	}
	public Snode(ObjectNode stu) {
		this.stu=stu;
		next=null;
	}
	public ObjectNode getStu() {
		return stu;
	}
	public void setStu(ObjectNode stu) {
		this.stu = stu;
	}
	public Snode getNext() {
		return next;
	}
	public void setNext(Snode next) {
		this.next = next;
	}
}
