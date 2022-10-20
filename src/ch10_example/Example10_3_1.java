//����10-3�� ����ó���� ����϶�
package ch10_example;

import java.awt.*;
import java.awt.event.*;
import java.util.InputMismatchException;

import javax.swing.*;

public class Example10_3_1 extends JFrame {
	private JButton button;
	private JTextField text, result;
	
	public Example10_3_1() {
		setSize(250, 150);
		setTitle("���� ����");
		ButtonListener listener = new ButtonListener();
		
		JPanel panel = new JPanel();
		panel.add(new JLabel("���� �Է�  : "));
		text = new JTextField(15);
		text.addActionListener(listener);
		panel.add(text);
		
		panel.add(new JLabel("������ ��  : "));
		result = new JTextField(15);
		result.setEditable(false);
		panel.add(result);
		
		button = new JButton("OK");
		button.addActionListener(listener);
		panel.add(button);
		add(panel);
		
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE );
	}
	
	private class ButtonListener implements ActionListener{
		public void actionPerformed(ActionEvent e) {
			if(e.getSource() == button || e.getSource() == text) {
				try {
					String name = text.getText();
					int value = Integer.parseInt(name);
					result.setText("" + value*value);
				}
				catch(NumberFormatException nfe) {
					result.setText("���ڸ� �Է��ϼ���");
				}
				finally {
					text.requestFocus();
				}
			}
		}
	}
	public static void main(String[] args) {
		Example10_3_1 f = new Example10_3_1();
	}

}
