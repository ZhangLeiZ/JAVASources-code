package T4A;

public class InterfaceDemo {

	public static void main(String[] args){
		Bike bike = new Bike();
		Bus bus = new Bus();
		bike.start("兰博基尼","蓝色");
		float s1=bike.stop(100,12,5);
		System.out.println("体积为："+s1);
		
	}
}
