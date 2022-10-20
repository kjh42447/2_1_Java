//복붙
package ch08_practice;

import java.awt.*;
import javax.swing.*;

public class BasicComponent1 extends JFrame {

	public BasicComponent1() {
		JPanel panel = new JPanel();
		add(panel);
		
		JLabel lable1 = new JLabel("화씨 온도");
		JLabel lable2 = new JLabel("섭씨 온도");
		JTextField field1 = new JTextField(15);
		JTextField field2 = new JTextField(15);
		JButton button = new JButton("변환");
		
		panel.add(lable1);
		panel.add(field1);
		panel.add(lable2);
		panel.add(field2);
		panel.add(button);
		
		setSize(250, 150);
		setTitle("온도변환기");
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	public static void main(String[] args) {
		BasicComponent1 f = new BasicComponent1();
	}

}
