//복붙
package ch08_practice;

import java.awt.*;
import javax.swing.*;

public class AbsolutePosition1 extends JFrame {
	private JButton b1, b2;
	
	public AbsolutePosition1() {
		setTitle("AbsolutePosition1");
		setSize(300, 200);
		
		//절대 위치 사용
		setLayout(null);
		
		b1 = new JButton("Button 1");
		add(b1);
		b1.setLocation(10, 30);
		b1.setSize(90, 20);
		
		b2 = new JButton("Button 2");
		add(b2);
		b2.setBounds(190, 30, 90, 20);		//setLocation + setSize
		
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	public static void main(String[] args) {
		AbsolutePosition1 f = new AbsolutePosition1();
	}

}
