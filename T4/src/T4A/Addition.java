package T4A;
/**
 * 构造方法与重载、包 编写Addition类，该类中应包含一组实现两数相加运算的重载方法。 
 * 实现加法运算的方法，应接受两个参数（即加数和被加数），方法将两个参数进行加法运算后
 * ，返回相加结果。考虑可能针对不同的数据类型进行计算，重载一组方法，包括整型、长整型、浮点型
 * 、双精度浮点型、还有字符串。 在main方法中创建Addition类的实例，
 * 分别调用重载方法测试其效果。 应将Addition类打入到包中，以自己名字的拼音为包命名。  
 * */
public class Addition {

	
	
		       public int Add(int a,int b)
		       {
		    	   System.out.println(a+"+"+b+"="+(a+b));
		           return a+b;
		           
		       }
		       
		       public Long Add(long a,long b)
		       {
		    	   System.out.println(a+"+"+b+"="+(a+b));
		           return a+b;
		           
		       }
		       public float Add(float a,float b
		    		   ){
		    	   System.out.println(a+"+"+b+"="+(a+b));
		           return a+b;	           
		       }
		       public double Add(double a,double b)
		       {
		    	   System.out.println(a+"+"+b+"="+(a+b));
		           return a+b;
		           
		       }
		       
		       public static void main(String args[]){
		    	   Addition a=new Addition();
		    	  a.Add(14.2,22.1);
	                  a.Add(11,22);
	                  a.Add(3.2f,2.1f);
	                  a.Add(11254,2154);
	                  
		       }
	}
	
	

