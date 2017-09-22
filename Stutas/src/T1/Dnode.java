package T1;


public class Dnode {
	ObjectNode name;
	Dnode next;
	Dnode prior;
	public Dnode() {
	}
	public Dnode(ObjectNode name){

		this.name=name;
		next=null;
		prior=null;
	}
}
