package BAM;
/**
 *  属性: 
 *  id:账户号码    长整数 
	password:账户密码   字符串类型
	name:真实姓名   字符串类型
	personId:身份证号码   字符串类型
	email:客户的电子邮箱   字符串类型
	balance:账户余额    双精度浮点型
  */
public class Account {

	public long id;
	public String password;
	public String name;
	public String personId;
	public String email;
	public  double balance;
	
	public Account(){
		id=0;
		name="";
	}
	public void deposit(){//存款方法,参数是double型的金额
		
	}
	public void withdraw(){//取款方法,参数是double型的金额
		
	}
	
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPersonId() {
		return personId;
	}
	public void setPersonId(String personId) {
		this.personId = personId;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	
	
	
}
