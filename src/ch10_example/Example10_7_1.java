//예제에 스크롤페인을 추가하라
package ch10_example;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Example10_7_1 extends JFrame implements ActionListener {
	protected JTextField textField;
	protected JTextArea textArea;
	protected JScrollPane scrollPane;
	
	public Example10_7_1() {
		setTitle("Text Area Test");
		
		textField = new JTextField(30);
		textField.addActionListener(this);
		
		textArea = new JTextArea(10, 30);
		textArea.setEditable(false);
		
		scrollPane = new JScrollPane(textArea);
		
		add(textField, BorderLayout.NORTH);
		add(scrollPane, BorderLayout.CENTER);
		
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
