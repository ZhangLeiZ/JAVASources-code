package T4A;
/**
 * 创建一个名称为Vehicle的接口，在接口中添加两个带有一个参数的方法start()和stop()。
 * 在两个名称分别为Bike和Bus的类中实现Vehicle接口。创建一个名称为interfaceDemo的类，
 * 在interfaceDemo的main()方法中创建Bike和Bus对象，并访问start()和stop()方法。
 * 
 * */
public interface Vehicle1 {

	public static final int seat=4;
	void start(String brand,String color);
	float stop(float width,float length,float heigh);
	
	
}
