//ppt이것저것
package ch08_practice;

import java.awt.*;
import javax.swing.*;

public class Panel02 extends JFrame {

	public Panel02() {
		JPanel panel1 = new JPanel();
		JPanel panel2 = new JPanel();
		setLayout(null);
		
		panel1.setBounds(0, 0, 300, 100);
		panel1.setBackground(Color.orange);
		
		JButton b1 = new JButton("Button 1");
		b1.setToolTipText("button 1");
		b1.setBackground(Color.yellow);
		
		JButton b2 = new JButton("Button 2");
		b2.setToolTipText("button 2");
		b2.setBackground(Color.green);
		
		panel2.setBounds(0, 100, 300, 100);
		panel2.setBackground(Color.MAGENTA);
		
		panel2.setToolTipText("ToolTipTextTest");
		
		panel1.add(b1);
		panel1.add(b2);
		add(panel1);
		add(panel2);
		
		setSize(300, 240);;
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	public static void main(String[] args) {
		Panel02 f = new Panel02();
	}

}
