package T4A;

public class Parent {
	 void printMe()
	   {  
		 System.out.println("parent");   
		 }  
}
	class Child extends Parent
	{ 
		void printMe()
	   { 
			System.out.println("child");  
			}
	   void printAll()
	   { 
		   super.printMe();
	      this.printMe();
	      printMe(); 
	      }  
	}
	
	
