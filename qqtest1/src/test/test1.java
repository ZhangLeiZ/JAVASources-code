package test;

public class test1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		String a="蠢";
		char []b=a.toCharArray();
		for(int i=0;i<b.length;i++){
			System.out.print(Integer.toBinaryString(b[i]));
		}
	}

}
