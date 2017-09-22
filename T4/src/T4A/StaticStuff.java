package T4A;

public class StaticStuff {

	static int x;
    static { 
    	System.out.println("x1=" + x);
        x+=5; 
    }
    public static void main(String args[ ]){  
    	System.out.println("x2=" + x);  
    	}
    static {
    	System.out.println("x3=" + x);x%=3; 
    	}
}
