package Workpace;

import java.awt.*;
import java.awt.event.*;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import javax.swing.*;

public class Aniaml extends JFrame implements ActionListener {
	private JLabel showMonth;
	private JButton addmon;
	private JButton redmon;
	private JLabel showDay[];
	private JLabel head[];
	private JPanel changeMonth;
	private String weeks[] = { "动物种类", "年龄", "毛色", "体重"};
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
		Aniaml cd = new Aniaml(year_now, month_now, day_now);
		cd.setVisible(true);
	}

	public Aniaml(int year, int month, int day) {
		pane = new JPanel();
		changeMonth = new JPanel();
		JPanel pane1 = new JPanel();
		JPanel leftNorth = new JPanel();
		pane1.setLayout(new GridLayout(7, 7));
		
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
		head = new JLabel[4];
		for (int j = 0; j < 4; j++) {
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
		setBounds(100, 50, 844, 450);
		validate();

	}

	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}

	
	
}

