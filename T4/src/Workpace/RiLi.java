package Workpace;


import java.awt.*;
import java.awt.event.*;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import javax.swing.*;

public class RiLi extends JFrame implements ActionListener {
	private JLabel showMonth;
	private JButton addmon;
	private JButton redmon;
	private int year, nowYear;
	private int month, nowMonth;
	private int day;
	private JLabel showDay[];
	private JLabel head[];
	private Calendar cal;
	private int week;
	private JPanel changeMonth;
	private String weeks[] = { "Sun", "Mon", "Tues", "Wed", "Thur", "Fri", "Sat" };
	private JPanel pane;
	private JLabel showYear;
	private JButton addyear;
	private JButton redyear;
	private JLabel nowDate;

	public static void main(String args[]) {
		Calendar calendar = Calendar.getInstance();
		int year_now = calendar.get(Calendar.YEAR);
		int month_now = calendar.get(Calendar.MONTH) + 1;
		int day_now = calendar.get(Calendar.DAY_OF_MONTH);
		RiLi cd = new RiLi(year_now, month_now, day_now);
		cd.setVisible(true);
	}

	public RiLi(int year, int month, int day) {
		pane = new JPanel();
		changeMonth = new JPanel();
		this.day = day;
		JPanel pane1 = new JPanel();
		JPanel leftNorth = new JPanel();
		pane1.setLayout(new GridLayout(7, 7));
		this.year = year;
		this.month = month;
		this.nowYear = year;
		this.nowMonth = month;
		{
			showMonth = new JLabel();
			showMonth.setForeground(Color.RED);
			showMonth.setFont(new Font("TimesRomn", Font.BOLD, 16));
			addmon = new JButton(">");
			addmon.setBackground(Color.white);
			redmon = new JButton("<");
			redmon.setBackground(Color.white);
			changeMonth.add(redmon);
			showYear = new JLabel("" + year + " 年 ");
			showYear.setForeground(Color.RED);
			changeMonth.add(showYear);
			showYear.setFont(new Font("TimesRomn", Font.BOLD, 16));
			changeMonth.add(showMonth);
			changeMonth.add(addmon);
			redmon.addActionListener(this);
			addmon.addActionListener(this);
			showMonth.setText("" + month + " 月 ");
			redyear = new JButton("<<");
			redyear.setBackground(Color.white);
			leftNorth.add(redyear);
			redyear.addActionListener(this);
			leftNorth.add(changeMonth);
		}
		JPanel panel1 = new JPanel();
		head = new JLabel[7];
		for (int j = 0; j < 7; j++) {
			head[j] = new JLabel();
			head[j].setText(weeks[j]);
			head[j].setBorder(BorderFactory.createLineBorder(Color.black));
			head[j].setFont(new Font("dialog", 1, 20));
			head[j].setForeground(Color.blue);
			pane1.add(head[j]);
		}
		showDay = new JLabel[42];
		for (int i = 0; i < 42; i++) {
			showDay[i] = new JLabel();
			showDay[i].setBackground(Color.white);
			showDay[i].setFont(new Font("dialog", 1, 20));
			showDay[i].setBorder(BorderFactory.createLineBorder(Color.black));
			pane1.add(showDay[i]);
		}
		cal = Calendar.getInstance();
		pane.setLayout(new BorderLayout());
		pane.add(leftNorth, BorderLayout.NORTH);
		addyear = new JButton(">>");
		leftNorth.add(addyear);
		addyear.setBackground(Color.white);
		addyear.addActionListener(this);
		pane.add(pane1, BorderLayout.CENTER);
		pane.add(panel1, BorderLayout.SOUTH);
		Date date = new Date();
		DateFormat format = new SimpleDateFormat("yyyy年MM月dd日");
		String time = format.format(date);
		nowDate = new JLabel("今天的日期: " + time);
		panel1.add(nowDate);
		pane.validate();
		Container con = getContentPane();
		con.add(pane, BorderLayout.CENTER);
		con.validate();
		designHead(year, month);
		setBounds(100, 50, 844, 450);
		validate();

	}

	public void actionPerformed(ActionEvent e) {
		Object obj = e.getSource();
		if (obj == redmon) {
			if (month >= 2) {
				month = month - 1;
				designHead(year, month);
			} else if (month == 1) {
				month = 12;
				designHead(year, month);
			}
			showMonth.setText("" + month + " 月 ");
		} else if (obj == addmon) {
			if (month < 12) {
				month = month + 1;
				designHead(year, month);
			} else if (month == 12) {
				month = 1;
				designHead(year, month);
			}
			showMonth.setText("" + month + " 月 ");
		} else if (obj == addyear) {
			year = year + 1;
			designHead(year, month);
			showYear.setText("" + year + " 年 ");
		} else if (obj == redyear) {
			year = year - 1;
			designHead(year, month);
			showYear.setText("" + year + " 年 ");
		} else {
			String day = "";
			if (month < 10)
				day = year + "-0" + month + "-" + ((JButton) obj).getText();
			else
				day = year + "-" + month + "-" + ((JButton) obj).getText();
		}
	}

	public void designHead(int year, int month) {
		cal.set(year, month - 1, 1);
		week = cal.get(Calendar.DAY_OF_WEEK) - 1;
		if (month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10 || month == 12) {
			showDays(week, 31, year, month);
		} else if (month == 4 || month == 6 || month == 9 || month == 11) {
			showDays(week, 30, year, month);
		} else if (month == 2) {
			if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
				showDays(week, 29, year, month);
			} else {
				showDays(week, 28, year, month);
			}
		}
	}

	public void showDays(int witchDay, int dayNum, int year, int month) {
		for (int i = witchDay, n = 1; i < witchDay + dayNum; i++) {
			if (n == day && year == this.nowYear && month == this.nowMonth) {
				showDay[i].setForeground(Color.red);
			} else {
				showDay[i].setForeground(Color.black);
			}
			showDay[i].setText("" + n);
			n++;
		}
		for (int i = 0; i < witchDay; i++) {
			showDay[i].setText("");
		}
		for (int i = witchDay + dayNum; i < 42; i++) {
			showDay[i].setText("");
		}
	}
}
