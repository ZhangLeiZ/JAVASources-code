package Action;

import com.opensymphony.xwork2.ActionSupport;

public class Loginaction extends ActionSupport {
	private String name;
	private String password;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	@Override
	public String execute() throws Exception {
		System.out.println(name);
		System.out.println(password);
		return LOGIN;
	}
}
