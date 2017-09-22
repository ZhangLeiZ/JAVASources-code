package T2;

public class StackArray {

	Object []data;
	int top=-1;
	int size;
	public StackArray() {
		data = new Object[100];
	}
	public StackArray(int size) {
		data = new Object[size];
	}
	public boolean isEmpty(){
		boolean isok = false;
		if(top==-1){
			System.out.println("堆栈为空");
			isok=true;
		}
		return isok;
	}
	public boolean isfull(){
		boolean isok = false;
		if(top+1==data.length){
			System.out.println("堆栈已满");
			isok=true;
		}
		return isok;
	}
	public void push(String name){
		if(isfull()){
			System.out.println("堆栈已满");
			return;
		}
		top++;
		data[top]=name;
	}
	public Object pop(){
		if(isEmpty()){
			System.out.println("堆栈为空");
			return null;
		}
		return data[top--];
	}
	public Object peek(){
		if(isEmpty()){
			System.out.println("堆栈为空");
			return null;
		}
		return data[top];
	}
	public void find(String dat){
		if(!isEmpty()){
			for(int i=0;i<=top;i++){
				if(data[i].toString().equals(dat)){
					System.out.println("在第"+i+"个元素,值为"+data[i]);
					break;
				}
			}
		}
	}
	public int size(){
		size=top+1;
		return size;
	}
	public int capacity(){
		return data.length;
	}
	
	public static void main(String[] args) {
		StackArray stack=new StackArray(4);
		stack.push("组长");
		stack.push("部门经理");
		stack.push("主管副总");
		stack.push("总经理");
		stack.push("董事长");
		stack.find("董事长");
		System.out.println("栈顶元素："+stack.peek());
		
		System.out.println("--------------------size="+stack.size());
		while(!stack.isEmpty()){
			System.out.println(stack.pop());
		}
		System.out.println("--------------------size="+stack.size());
		
	}
}
