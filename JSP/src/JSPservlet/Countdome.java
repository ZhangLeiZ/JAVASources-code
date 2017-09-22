package JSPservlet;

public class Countdome {

	public Countdome() {
		// TODO Auto-generated constructor stub
	}
	private int count=0;
	public int getCount() {
		return count++;
	}
	public void setCount(int count) {
		this.count = count;
	}
}
