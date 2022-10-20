//ppt 이것저것
package ch08_practice;

import java.awt.*;
import javax.swing.*;

public class TextFieldTest2 extends JFrame {
	String[] s = {"test1", "test2", "test3"};
	
	public TextFieldTest2() {
		setSize(300, 200);
		JPanel panel = new JPanel();
		
		//JFormattedTextField
		JFormattedTextField t1 = new JFormattedTextField("typing here");
		panel.add(t1);
		
		//JPasswordField
		JPasswordField t2 = new JPasswordField(15);
		panel.add(t2);
		
		//JComboBox
		JComboBox<String> t3 = new JComboBox<String>(s);
		panel.add(t3);
		
		//JSpinner
		JSpinner t4 = new JSpinner(new SpinnerListModel(s));
		panel.add(t4);
		
		add(panel);
		
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	public static void main(String[] args) {
		TextFieldTest2 f = new TextFieldTest2();
	}

}
