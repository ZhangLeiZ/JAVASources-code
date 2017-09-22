package QI;

public class Text {
	String name;
	String sex;
	int age;
	static int count=0;


   public Text(){
	   count++;
   }
   public Text(String name,String sex,int age){
	   this.name=name;
	   this.sex=sex;
	   this.age=age;
   }
   public String toString(){
	   return "姓名"+this.name+"性别"+this.sex+"年龄"+this.age+"位数"+this.count;
   }
}  
   
