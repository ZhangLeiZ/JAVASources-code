



import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateDemo {
			int hour;
			int minute;
			int second;
			public DateDemo() {
				
			}
		public DateDemo(int hour,int minute,int second) {
			this.hour=hour;
			this.minute=minute;
			this.second=second;
		}
		public void Show(){
			DateFormat simple = new SimpleDateFormat("yyyy//MM//dd HH//mm//ss");			
			Date time = new Date();
			System.out.println("你运行的当前时间"+simple.format(time));
		}
	public static void main(String[] args) {
		DateDemo date = new DateDemo();
		date.Show();
		
	}
}
