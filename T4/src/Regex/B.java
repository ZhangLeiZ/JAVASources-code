


public class B extends A{

	public void f(){
		String str[];
		B b = new B();
		str=b.g();
		for (String s : str) {
			System.out.print("��д��ĸ"+s.toUpperCase());
			System.out.print("\t");
		}
	}
}
