//º¹ºÙ
package ch08_practice;

import java.awt.*;
import javax.swing.*;

public class FlowLayout01 extends JFrame {

	public FlowLayout01() {
		setTitle("FlowLayoutTest");
		setSize(300, 200);
		setLayout(new FlowLayout());
		
		add(new JButton("Button1"));
		add(new JButton("Button2"));
		add(new JButton("Button3"));
		add(new JButton("Button4"));
		add(new JButton("Button5"));
		
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	public static void main(String[] args) {
		FlowLayout01 f = new FlowLayout01();
	}

}
