package Paly;

public class Cartest {

	public static void main(String[] args){
		Car s1 = new Carclass("兰博基尼","蓝色");
		Carclass s2 = new Carclass("布加迪","白色");
		s1.getAer();
		s2.getAer();
	    Carclass s3 = new Carclass(8,4);
	   float p1=s3.dispaly();
	    System.out.println("三角形的面积是："+p1);
	    Carclass s4 = new Carclass(8);
	    float p2=s4.dispaly2();
	    System.out.println("圆的面积是："+p2);
	    Carclass s5 = new Carclass(8,4,5);
	    float p3=s5.dispaly3();
	    System.out.println("梯形的面积是："+p3);
	}
}
