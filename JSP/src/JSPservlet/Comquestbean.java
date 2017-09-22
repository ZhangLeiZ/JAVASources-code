package JSPservlet;

public class Comquestbean {

	public Comquestbean() {
		// TODO Auto-generated constructor stub
	}
	private float num1=0f;
	private int hold;
	private float num2=0f;
	public float sum=0f;
	public float getNum1() {
		return num1;
	}
	public void setNum1(float num1) {
		this.num1 = num1;
	}
	public int getHold() {
		return hold;
	}
	public void setHold(int hold) {
		this.hold = hold;
	}
	public float getNum2() {
		return num2;
	}
	public void setNum2(float num2) {
		this.num2 = num2;
	}
	
	
	public float getSum() {
		switch (hold) {
		case 1:
			sum=num1+num2;
			break;
		case 2:
			sum=num1-num2;
			break;
		case 3:
			sum=num1*num2;
			break;
		case 4:
			sum=num1/num2;
			break;
		}
		return sum;
		
	}
	public void setSum(float sum) {
		this.sum = sum;
	}
	
}
