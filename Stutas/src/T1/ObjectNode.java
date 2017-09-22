package T1;

public class ObjectNode {

	private int id;
	private String name;
	private int age;
	private String classes;
	
	public ObjectNode() {
	}
	public ObjectNode(int id,String name,int age,String classes) {
		this.id=id;
		this.name=name;
		this.age=age; 
		this.classes=classes;
	}                        
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getClasses() {
		return classes;
	}
	public void setClasses(String classes) {
		this.classes = classes;
	}
	@Override
	public String toString() {
		return "学号："+this.id+" 姓名："+this.name+" 年龄："+this.age+" 班级："+this.classes;
	}
}
