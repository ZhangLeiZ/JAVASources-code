package T2;

import java.util.ArrayList;
import java.util.StringTokenizer;

public class expression {

	private ArrayList expression = new ArrayList();
	private ArrayList right = new ArrayList();
	private String result;
	
	private void Expressions(String input){
		StringTokenizer st = new StringTokenizer(input,"+-*/()",true);
		while(st.hasMoreElements()){
			expression.add(st.nextToken());
		}
	}
	private void isRight(){
		Stacks stack = new Stacks();
		String operator;
		int position=0;
		while(true){
			if(Calculate.isoperator((String)expression.get(position))){
				if(stack.top==-1||((String)expression.get(position)).equals("(")){
					stack.push(expression.get(position));
				}else{
					if(((String)expression.get(position)).equals(")")){
						if(!((String)stack.top()).equals("(")){
							operator=(String)stack.pop();
							right.add(operator);
						}
					}else{
						if(Calculate.priority((String)expression.get(position))<=Calculate.priority((String)stack.top())&&stack.top!=-1){
							operator=(String)stack.pop();
							if(!operator.equals("(")){
								right.add(operator);
							}
							stack.push(expression.get(position));
						}
					}
				}
			}else{
					right.add(expression.get(position));
					position++;
					if(position>=expression.size()){
						break;
					}
				}
			while(stack.top!=-1){
				operator=(String)stack.pop();
				right.add(operator);
			}
			System.out.println("-------------");
			for(int i=0;i<=right.size();i++){
				System.out.println(right.get(i));
			}
			System.out.println();
			}
		
		}
	public static void main(String[] args) {
		
	}
}

