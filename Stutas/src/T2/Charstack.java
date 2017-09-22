package T2;

import java.util.Stack;

public class Charstack {
		public void charstack(String str){
			boolean flg=false;
			Stack<Character> stack = new Stack<Character>();
			for(int i=0;i<str.length();i++){
				char c = str.charAt(i);
				System.out.println("=="+c);
				if(c=='{'){
					stack.push('{');
				}else if(c=='('){
					stack.push('(');
				}else if(c=='}'){
					try {
						stack.pop();
					} catch (Exception e) {
						System.out.println("缺少左大括号");
						flg=true;
					}
				}else if(c==')'){
					try {
						stack.pop();
					} catch (Exception e) {
						System.out.println("缺少左小括号");
						flg=true;
					}
				}
			}
			if(!flg && stack.size()==0){
				System.out.println("正常");
			}
			if(stack.size()>0){
				System.out.println("缺少右括号");
			}
		}
	public static void main(String[] args) {
		Charstack cha = new Charstack();
		cha.charstack("{");
	}
}
