package Paly;

import java.util.Calendar;
import java.util.Date;

public class DatteDome {

	public static void main(String[] args) {
		Date date = new Date();
		System.out.println("date,toString:"+date.toLocaleString());//获取当前时间年年月日时分
		System.out.println("date: " + date.getDate());//当前号  
		System.out.println("day: " + date.getDay());  //星期
		System.out.println("hour: " + date.getHours());  //时
		System.out.println("minutes: " + date.getMinutes()); //分 
		System.out.println("month: " + (date.getMonth() + 1));  //
		System.out.println("seconds: " + date.getSeconds()); //月 
		System.out.println("time: " + date.getTime());  //时间以毫秒计算
	    System.out.println("timezone: " + date.getTimezoneOffset());//时区  
	    System.out.println("year: " + (date.getYear() + 1900));  //年份
       //用date获得时间的值，如时、分、秒、月、日、年得方法已经过时，
	   // 需要改用Calendar的方法来获取时间的值
	    //Calendar类也可以获取时间
	    Calendar calendar = Calendar.getInstance(); 
	    
	
	    int year = calendar.get(Calendar.YEAR);  
	    int month = calendar.get(Calendar.MONTH)+1;  
	    int day = calendar.get(Calendar.DATE);  
	    int hour = calendar.get(Calendar.HOUR);  
	    int minute = calendar.get(Calendar.MINUTE);  
	    int second = calendar.get(Calendar.SECOND); 
	    
	    System.out.println("----------Calendar-------"); 
	    
	    System.out.println("year: " + year);  
	    System.out.println("month: " + month);  
	    System.out.println("day: " + day);  
	    System.out.println("hour: " + hour);  
	    System.out.println("minute: " + minute);  
	    System.out.println("second: " + second); 

	}
	
	
}
