//º¹ºÙ
package ch08_practice;

import java.awt.*;
import javax.swing.*;

public class GridLayout01 extends JFrame {

	public GridLayout01() {
		setTitle("GridLayoutTest");
		setSize(300, 200);
		setLayout(new GridLayout(0, 3));
		
		add(new JButton("Button1"));
		add(new JButton("Button2"));
		add(new JButton("Button3"));
		add(new JButton("B4"));
		add(new JButton("LongButton5"));
		
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	public static void main(String[] args) {
		GridLayout01 f = new GridLayout01();
	}

}
