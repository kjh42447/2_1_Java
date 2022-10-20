//º¹ºÙ
package ch10_practice;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Example10_7_1 extends JFrame implements ActionListener {
	protected JTextField textField;
	protected JTextArea textArea;
	
	public Example10_7_1() {
		setTitle("Text Area Test");
		
		textField = new JTextField(30);
		textField.addActionListener(this);
		
		textArea = new JTextArea(10, 30);
		textArea.setEditable(false);
		
		add(textField, BorderLayout.NORTH);
		add(textArea, BorderLayout.CENTER);
		
		pack();
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		String text = textField.getText();
		textArea.append(text + "\n");
		textField.selectAll();
		textArea.setCaretPosition(textArea.getDocument().getLength());
	}
	
	public static void main(String[] args) {
		new Example10_7_1();
	}

}
