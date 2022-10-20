//pptº¸°í
package ch08_practice;

import java.awt.*;
import javax.swing.*;

public class BorderLayout02 extends JFrame {

	public BorderLayout02() {
		setTitle("BorderLayoutTest");
		setSize(300, 200);
		setLayout(new BorderLayout(10, 10));
		
		JButton b1  = new JButton("NORTH");
		JButton b2  = new JButton("SOUTH");
		JButton b3  = new JButton("EAST");
		JButton b4  = new JButton("WEST");
		JButton b5  = new JButton("CENTER");
		
		add(b1, BorderLayout.NORTH);
		add(b2, BorderLayout.SOUTH);
		add(b3, BorderLayout.EAST);
		add(b4, BorderLayout.WEST);
		add(b5, BorderLayout.CENTER);
		
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	public static void main(String[] args) {
		BorderLayout02 f = new BorderLayout02();
		
	}

}
