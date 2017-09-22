package Regex;

import javax.swing.JApplet;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JTextField;
import javax.swing.JButton;

public class AgeJungle extends JApplet implements ActionListener {
	//声明一些控件按钮和文本框
	private JTextField textField;
	private JButton check;
	private JLabel result;
	public AgeJungle() {
		getContentPane().setLayout(null);//设置布局为空
		JLabel lblNewLabel = new JLabel("请输入年龄:");
		lblNewLabel.setFont(new Font("宋体", Font.PLAIN, 20));//设置字体风格
		lblNewLabel.setBounds(14, 126, 116, 24);//设置显示位置
		getContentPane().add(lblNewLabel);//放入面板容器中

		textField = new JTextField();
		textField.setFont(new Font("宋体", Font.PLAIN, 25));//设置字体风格
		textField.setBounds(144, 123, 91, 34);//设置显示位置
		getContentPane().add(textField);//放入面板容器中
		textField.setColumns(10);//设置最大输入字符数


		check = new JButton("确定");
		check.setBounds(249, 123, 63, 34);//设置显示位置
		check.addActionListener(this);
		getContentPane().add(check);//放入面板容器中


		result = new JLabel("此处显示答案");
		result.setFont(new Font("宋体", Font.PLAIN, 18));//设置字体风格
		result.setBounds(326, 126, 116, 24);//设置显示位置
		getContentPane().add(result);//放入面板容器中


	}

	public void actionPerformed(ActionEvent e) {//监听控件获取文本框内容
		try{
			int age=Integer.parseInt(textField.getText());
			if(age<0)//对输入的内容进行判断必须大于0
			{
				JOptionPane.showMessageDialog(null, "年龄必须为正整数");
			}else if(age<20)//判断输入内容是否小于20，为真时往下执行显示出界面
			{
				result.setText("少年和儿童");
			}else if(age<40)//判断输入内容是否小于40，为真时往下执行显示出界面
			{
				result.setText("青年人");

			}else if(age<60)//判断输入内容是否小于60，为真时往下执行显示出界面
			{
				result.setText("中年人");

			}else
			{
				result.setText("老年人");//否则就是老年人

			}

		}catch(Exception e2)
		{
			JOptionPane.showMessageDialog(null, "输入不合法");//输入不合法时弹出对话框
			textField.setText("");//设为空值

		}
	}

}
