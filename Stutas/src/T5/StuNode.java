package T5;

public class StuNode {

	private Student data;
	private StuNode next;
	public StuNode() {
		this.data=data;
		next=null;
	}
	public StuNode(Student data) {
		this.data=data;
		next=null;
	}
	public Student getData() {
		return data;
	}
	public void setData(Student data) {
		this.data = data;
	}
	public StuNode getNext() {
		return next;
	}
	public void setNext(StuNode next) {
		this.next = next;
	}
	
}
