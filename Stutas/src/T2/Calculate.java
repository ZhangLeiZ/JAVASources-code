package T2;

public class Calculate {

	public static boolean isoperator(String operator){
		if(operator.equals("+")||operator.equals("-")||operator.equals("*")||operator.equals("/")||operator.equals("(")||operator.equals(")")){
			return true;
		}else{
			return false;
		}
	}
	public static int priority(String priority){
		if(priority.equals("+")||priority.equals("-")||priority.equals("(")){
			return 1;
		}else if(priority.equals("*")||priority.equals("/")){
			return 2;
		}else{
			return 0;
		}
	}
	public static String twoResult(String operator,String a,String b){
		try {
		String op = operator;
		String rs = new String();
		double x = Double.parseDouble(a);
		double y = Double.parseDouble(b);
		double z=0;
		if(op.equals("+")){
			z=x+y;
		}else if(op.equals("-")){
			z=x-y;
		}else if(op.equals("*")){
			z=x*y;
		}else if(op.equals("/")){
			z=x/y;
		}
		return rs+z;
		
		} catch (NumberFormatException e) {
			System.out.println("格式错误");
			return "error";
		}
	}
}
