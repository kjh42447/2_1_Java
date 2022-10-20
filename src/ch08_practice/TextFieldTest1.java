//ppt
package ch08_practice;

import java.awt.*;
import javax.swing.*;

public class TextFieldTest1 extends JFrame {

	public TextFieldTest1() {
		setSize(500, 100);
		setTitle("TextFieldTest1");
		
		JPanel panel = new JPanel();
		JTextField t1 = new JTextField(10);
		JTextField t2 = new JTextField(10);
		t2.setEditable(false);
		
		panel.add(t1);
		panel.add(t2);
		
		add(panel);
		
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	public static void main(String[] args) {
		TextFieldTest1 f = new TextFieldTest1();
	}

}
