package T4A;
/**
 * 编写Truck（卡车）
 *类继承于Vehicles类，增加float型成员属性load（载重），还应增加成员方法showTruck
 *（在控制台显示卡车的信息），并编写构造方法。 在main方法中测试以上各类。  
 * */
import T4A.Vehicles;
public class Truck extends Vehicles{
	float load;
public Truck(){
	
		super();
		load=254;
	}
	public Truck(String brand,String color,float load){
		super(brand,color);
		
		this.load=load;
	}
	public void showTruck(){
		System.out.println("商标 "+brand+"\n"+"颜色 "+color+"\n"+"重量 "+load);
	}

}
