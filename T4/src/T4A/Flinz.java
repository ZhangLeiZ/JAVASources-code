package T4A;
/**
 * .get方法和set方法 
定义一个类，该类有一个私有成员变量，通过构造方法将其进行赋初值，
并提供该成员的getXXX()和setXXX()方法 
 * */
public class Flinz {

	private String name;
	public Flinz(){
		name="李方军";
	}
	public Flinz(String name){
		this.name=name;
		
	}
	public void setName(String name){
		this.name=name;
	}
	public String getName(){
		return this.name;
	}
	public void dispaly(){
		System.out.println("姓名:"+name);
	}
	public static void main(String[] args){
		Flinz flinz=new Flinz();
		flinz.name="离低级";
		flinz.dispaly();
	}
}
