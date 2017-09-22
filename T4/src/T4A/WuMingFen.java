package T4A;
/**
 * 为“无名的粉”写一个类：class WuMingFen 要求： 
1.有三个属性：面码:String theMa  粉的分量(两)：int quantity是否带汤：boolean likeSoup 
2.写一个构造方法，以便于简化初始化过程，如：  WuMingFen f1 = new WuMingFen
("牛肉",3,true); 3.重载构造方法，使得初始化过程可以多样化： 
 WuMingFen f2 = new WuMingFen("牛肉",2); 
 * */
public class WuMingFen {

	String theMa;
	int quantity;
	boolean likeSoup;
	public WuMingFen(){
		theMa="牛肉";
		quantity=3;
		likeSoup=true;
	}
	public WuMingFen(String theMa,int quantity){
		this.theMa=theMa;
		this.quantity=quantity;
		
	}
	public WuMingFen(String theMa,int quantity,boolean likeSoup){
		this.theMa=theMa;
		this.quantity=quantity;
		this.likeSoup=likeSoup;
	}
	public void dispaly(){
		System.out.println("theMa="+theMa+"\n"+"quantity="+quantity+"\n"+"likeSoup="+likeSoup);
	}
	
	public static void main(String[] args){
		WuMingFen fen=new WuMingFen();
		fen.dispaly();
		
		WuMingFen fen1=new WuMingFen("羊肉",5);
		fen1.dispaly();
		WuMingFen fen2=new WuMingFen("酸辣粉",2,true);
		fen2.dispaly();
	}
}
