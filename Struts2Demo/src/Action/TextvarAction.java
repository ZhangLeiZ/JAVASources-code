package Action;

import com.opensymphony.xwork2.ActionSupport;

public class TextvarAction extends ActionSupport {

	private String first;

	public String getFirst() {
		return first;
	}

	public void setFirst(String first) {
		this.first = first;
	}
	@Override
	public String execute() throws Exception {
		System.out.println("first="+first);
		return INPUT;
	}
}
