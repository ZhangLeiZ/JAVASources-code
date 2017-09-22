package INternet;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class Textdome {
	
	public static void main(String[] args) {
		Class calzz = null;
		try {
			calzz = Class.forName("INternet.Recaive");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		Constructor[] constructors = calzz.getDeclaredConstructors();
		//Constructor[] constructors2 = calzz.getConstructors();
		for(int i=0;i<constructors.length;i++){
			System.out.print(constructors[i].getName()+"(");
			Class cls[]=constructors[i].getParameterTypes();
			for(int j=0;j<cls.length;j++){
				if(j==(cls.length-1)){
					System.out.print(cls[j].getName());
			}else{
				System.out.print(cls[j].getName()+",");
			}
		}
			System.out.println(")");
				
	}
		System.out.println("-----------------------");
		Method[] method = calzz.getDeclaredMethods();
		for(int i=0;i<method.length;i++){
			System.out.print(method[i].getName());
			Class cls2[]=method[i].getParameterTypes();
			for(int j=0;j<cls2.length;j++){
				if(j==(cls2.length-1)){
					System.out.print(cls2[j].getName());
			}else{
				System.out.print(cls2[j].getName()+",");
			}
		}
	System.out.println(")");
	}
		System.out.println("----------------------");
   Field[] field = calzz.getDeclaredFields();
   for(int i=0;i<field.length;i++){
	 System.out.println(field[i].getType());
	   }
   System.out.println("-----------------");
   for(int j=0;j<field.length;j++){
	   System.out.println(field[j].getName());
   }

 }
	
}
