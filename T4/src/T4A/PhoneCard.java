package T4A;
/**
 * 帐号:cardNumber ；初始金额：initMoney 使用时间：time 
记费方式：minMoney
创建两个电话卡的子类——IP卡和201卡
他们记费方式不同（每分钟费用分别为0.3和0.45）；
给定一个时间time=5,和初始金额30，分别计算出剩余金额。
 * 
 * */
public class PhoneCard {

	long cardNumber;
	float  initMoney;
	int  time;
	double sum;
	public PhoneCard(){
		cardNumber=234556;
		initMoney=30;
		time=10;
	}
	
	public void minMoneyIP(){
		this.time*=0.3;
		this.initMoney-=this.time;
	}
	public void minMoney(){
		this.time*=0.45;
		this.initMoney-=this.time;
	}
	
	public void dispaly(){
		System.out.println("账户："+cardNumber+"\t"+"花费金额："+time+"\t"+"剩余金额："+initMoney+"元");
	}
	class IP{
		
		
	}
	public static void main(String[] args){
		PhoneCard card = new PhoneCard();
		card.minMoney();
		card.minMoneyIP();
		card.dispaly();
		
	}
}
