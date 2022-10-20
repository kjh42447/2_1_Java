//º¹ºÙ
package ch10_practice;

import java.awt.*;
import javax.swing.*;

public class Example10_1 extends JFrame {
	private JPanel panel;
	private JLabel label1, label2;
	
	public Example10_1() {
		setTitle("Example10_1");
		setSize(400, 150);
		
		panel = new JPanel();
		label1 = new JLabel("Color lable");
		label1.setForeground(Color.BLUE);
		label2 = new JLabel("Font Label");
		label2.setFont(new Font("Arial", Font.ITALIC, 30));
		label2.setForeground(Color.ORANGE);
		panel.add(label1);
		panel.add(label2);
		add(panel);
		
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE );
	}
	
	public static void main(String[] args) {
		Example10_1 f = new Example10_1();
	}
}
