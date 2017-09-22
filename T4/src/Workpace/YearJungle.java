package Workpace;


import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class YearJungle extends JFrame {

	private JPanel contentPane;
	private JTextField year;

	public static void main(String[] args) {
		new YearJungle();
	}

	public YearJungle() {
		setTitle("闰年判定");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 350);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		JLabel label = new JLabel("请输入有效的年:");
		label.setFont(new Font("宋体", Font.PLAIN, 20));
		label.setBounds(50, 98, 156, 31);
		contentPane.add(label);

		year = new JTextField();
		year.setFont(new Font("宋体", Font.PLAIN, 20));
		year.setBounds(220, 98, 156, 31);
		contentPane.add(year);
		year.setColumns(10);

		JButton jungle = new JButton("判定");
		jungle.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				doJungle();
			}
		});
		jungle.setFont(new Font("宋体", Font.PLAIN, 20));
		jungle.setBounds(138, 224, 113, 31);
		contentPane.add(jungle);

		setVisible(true);
	}

	public void doJungle() {
		String yearStr = year.getText();
		if (yearStr.equals("")) {
			JOptionPane.showMessageDialog(null, "年不能为空!");
		} else {
			try {
				int yearNum = Integer.parseInt(year.getText());
				if (yearNum < 0) {
					JOptionPane.showMessageDialog(null, "年必须大于0!");

				} else {
					if ((yearNum % 4 == 0 && yearNum % 100 != 0) || (yearNum % 400 == 0)) {
						JOptionPane.showMessageDialog(null, yearNum + "是闰年!");

					} else {
						JOptionPane.showMessageDialog(null, yearNum + "不是闰年!");

					}
				}
			} catch (Exception e) {
				JOptionPane.showMessageDialog(null, "请输入有效年!");

			}
		}
	}
}
