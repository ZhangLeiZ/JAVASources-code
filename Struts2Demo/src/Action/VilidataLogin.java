package Action;

import StrVo.EmpUser;

import com.opensymphony.xwork2.ActionSupport;

public class VilidataLogin extends ActionSupport {

	private EmpUser emp;
	public String add() throws Exception {
		return INPUT;
	}
	public EmpUser getEmp() {
		return emp;
	}
	public void setEmp(EmpUser emp) {
		this.emp = emp;
	}
}
