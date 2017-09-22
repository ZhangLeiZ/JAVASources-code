package Action;

import com.opensymphony.xwork2.ActionSupport;

public class MethodAction extends ActionSupport{

	@Override
	public String execute() throws Exception {
		// TODO Auto-generated method stub
		return super.execute();
	}
	public String del() throws Exception{
		System.out.println("你正在执行del函数");
		return INPUT;
	}
	public String update() throws Exception{
		System.out.println("你正在执行update函数");
		return INPUT;
	}
	public String select() throws Exception{
		System.out.println("你正在执行select函数");
		return INPUT;
	}
	public String add() throws Exception{
		System.out.println("你正在执行add函数");
		return INPUT;
	}
}
