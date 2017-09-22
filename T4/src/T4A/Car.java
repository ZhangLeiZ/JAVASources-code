package T4A;
/**
 * 编写Car（小汽车）类继承于Vehicles类，增加int型成员属性seats（座位），
 *还应增加成员方法showCar（在控制台显示小汽车的信息），并编写构造方法。
 * */
import T4A.Vehicles;
public class Car extends Vehicles{

	int seats;
	public Car(){
		
		brand="宝马";
		color="白色";
		seats=4;
	}
	public Car(String brand,String color,int seats){
		
		this.seats=seats;
	}
	public void showCar(){
		System.out.println("商标 "+brand+"\n"+"颜色 "+color+"\n"+"座位 "+seats);
	}
}
