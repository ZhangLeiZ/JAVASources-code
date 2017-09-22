package QI;

import java.util.*;
public class Rectangle {
	float longth;
	float width;
	public Rectangle(float longth,float width){
		this.longth=longth;
		this.width=width;
		}
	public float getGirth(){
		return(longth+width)*2;
		}
	public float getAer(){
		return(longth*width);
	}
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		System.out.println("请输入长度");
		float c=in.nextFloat();
		System.out.println("请输入宽度");
		float k=in.nextFloat();
		System.out.println("矩形周长"+new Rectangle(c,k).getGirth());
		System.out.println("矩形面积"+new Rectangle(c,k).getAer());
	}
	
    
}
