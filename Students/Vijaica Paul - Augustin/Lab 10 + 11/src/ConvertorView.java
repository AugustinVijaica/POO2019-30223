import java.awt.FlowLayout;
import java.awt.Font;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class ConvertorView {
	public static JFrame Convert = new JFrame();
	public static JLabel Convertire = new JLabel(">>>>");
	String[] Bani = { "RON", "EURO", "USD" };
	public static JComboBox<String> DeLa;
	public static JComboBox<String> La;
	public static JTextField Input;
	public static JTextField Output;
	public static JLabel between;
	public static JButton Convertpls = new JButton("Convert");

	public ConvertorView(String title) {
		Convert.setTitle(title);
		Convert.setSize(500,300);
		 JPanel panel = new JPanel();
		 JPanel panel2= new JPanel();
		 between=new JLabel(">>>");
		 between.setFont(new Font("Times New Roman", Font.CENTER_BASELINE, 30));
		 Convertire.setFont(new Font("Times New Roman", Font.CENTER_BASELINE, 30));
		 Convertpls.setSize(20, 20);
		 JLabel Poza = new JLabel(new ImageIcon("Convertire.png"));
			panel.setSize(500, 300);
			panel.setLayout(new FlowLayout());
			DeLa= new JComboBox<String>(Bani);
			DeLa.setSelectedIndex(2);
			panel.add(DeLa);
			La= new JComboBox<String>(Bani);
			La.setSelectedIndex(2);
			Input=new JTextField(10);
			Input.setFont(new Font("Times New Roman", Font.CENTER_BASELINE, 20));
			Output=new JTextField(10);
			Output.setFont(new Font("Times New Roman", Font.CENTER_BASELINE, 20));
			Output.setEditable(false);
			panel.add(Convertire);
			panel.add(La);
			panel2.setLayout(new FlowLayout());
			panel2.add(Input);	
			panel2.add(between);
			panel2.add(Output);
			panel.add(panel2);
			panel.add(Convertpls);
			panel.add(Poza);
			Convert.add(panel);
			Convert.setVisible(true);
			Convertpls.addActionListener(new MyAction());
			Input.addActionListener(new MyAction());

	}
}
