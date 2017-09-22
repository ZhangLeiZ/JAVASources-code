package T4A;


public class Text extends JFrame {

	public Text() {
		Object titel[]={"第一列","第二列","第三列",};
		Object date[][]={{1,2,3}};
		JTable table = new JTable(date,titel);
		JPanel panel=new JPanel();
		panel.add(table);
		this.add(panel);
		this.setBounds(100,100,400,200);
		this.setVisible(true);
	}
	public static void main(String[] args) {
		new Text();
	}
	
}
