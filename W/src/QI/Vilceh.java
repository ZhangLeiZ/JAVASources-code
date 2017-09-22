package QI;

public class Vilceh {
	String name;
	String color;
	int age;
	public Vilceh() {
		name="计算法";
		color="白色";
		age =122;
		
	}
	public Vilceh(String name,String color,int age){
		this.name=name;
		
		this.color=color;
		
		this.age=age;
				
	}
	public void dispaly(){
		System.out.println("姓名: "+name+"\t"+"颜色: "+color+"\t"+"年龄："+age);
	}
	public static void main(String[] args) {
		Vilceh vil = new Vilceh();
		vil.dispaly();
		Vilceh vil2 = new Vilceh("急哦还算","蓝色",45);
		vil2.dispaly();
		
	}

}
