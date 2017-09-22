package Action;

import com.opensymphony.xwork2.ActionSupport;

public class TextAction extends ActionSupport {
	private String firstss;
	public String getFirst() {
		return firstss;
	}
	public void setFirst(String firstss) {
		this.firstss = firstss;
	}
	@Override
	public String execute() throws Exception {
		System.out.println("firstss="+firstss);
		return INPUT;
	}
}
