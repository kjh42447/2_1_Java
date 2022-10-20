//복붙
package ch09_practice;

import java.awt.event.*;
import javax.swing.*;

public class LambdaTest1 extends JFrame {
	private JButton button;
	private JLabel label;
	int counter = 0;
	
	public LambdaTest1() {
		setSize(400, 150);
		setTitle("LambdaTest1");
		
		JPanel panel = new JPanel();
		button = new JButton("증가");
		label = new JLabel("현재의 카운터값 : " + counter);
		button.addActionListener(e -> {
			counter++;
			label.setText("현재의 카운터값 : " + counter);
		});
		
		panel.add(label);
		panel.add(button);
		add(panel);
		
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	public static void main(String[] args) {
		LambdaTest1 f = new LambdaTest1();
	}

}
