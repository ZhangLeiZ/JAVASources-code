package T4A;

public class Bike implements Vehicle1{
	

	public void start(String brand, String color) {
		System.out.println("商标："+brand+"\t"+"颜色："+color);
		
	}

	public float stop(float width, float length, float heigh) {
		
		return width*length*heigh;
	}

}
