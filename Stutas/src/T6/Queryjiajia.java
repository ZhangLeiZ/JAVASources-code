package T6;

import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Vector;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.text.TabExpander;

public class Queryjiajia extends JFrame implements ActionListener{

	JLabel tab;
	JButton query;
	JTextField phone;
	JPanel panel;
	JTable table;
	Vector tebV = new Vector();
	public Queryjiajia() {
		super("家家乐通信录");
		Toolkit toolkit = Toolkit.getDefaultToolkit();
		Image image = toolkit.getImage("qq.jpg");
		setIconImage(image);
		
		table = new JTable(10,2);
		table.setRowHeight(40);
		table.setEnabled(false);
		table.add(new JScrollPane());
		add(table);
		panel = new JPanel();
		tab = new JLabel("姓名");
		phone = new JTextField(13);
		query = new JButton("查询");
		query.addActionListener(this);
		panel.add(tab);
		panel.add(phone);
		panel.add(query);
		add("South",panel);
//		int phoneda[]= new int[]{
//				80001110,
//				80001100,
//				80001000,
//				80001101,
//				80001102
//		};
//		for (int i = 0; i < phoneda.length; i++) {
//			table.setValueAt(phoneda[i], i, 0);
//		}
		
		setSize(400, 500);
		setVisible(true);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	public static void main(String[] args) {
		new Queryjiajia();
		
	}
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==query){
			Vector web = getAddid(query.getText());
			if(web!=null){
				for(int i=0;i<web.size();i++){
				table.setValueAt(query.getText(), i, 0);
				table.setValueAt(web.get(i), i, 1);
				}
			}
		}
		
	}
	public Vector getAddid(String name){
		String str[]=null;
		String msg=null;
		Vector v1 = new Vector();
		Vector v2 = new Vector();
		try {
			File file = new File("adder.txt");
			BufferedReader br= new BufferedReader(new FileReader(file));
			while((msg=br.readLine())!=null){
				str=msg.split("@_@");
				v1.add(str[0]);
				v2.add(str[1]);
			}
			this.preation(v1, v2, name);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return tebV;
	}
	public void preation(Vector v1,Vector v2,String name){
		tebV.removeAllElements();
		for(int i=0;i<v1.size();i++){
			if(v1.get(i).equals(name)){
				tebV.add(v2.get(i));
			}
		}
	}
}
