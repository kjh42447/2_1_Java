//����
package ch09_practice;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Example9_1 extends JFrame {
	private JButton button;
	private JLabel label;
	int counter = 0;
	
	class MyListener9_1_1 implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			counter++;
			label.setText("������ ī���Ͱ� : " + counter);
		}
	}
	
	public Example9_1() {
		setSize(400, 150);
		setTitle("�̺�Ʈ ����");
		setLayout(new FlowLayout());
		button = new JButton("����");
		label = new JLabel("������ ī���Ͱ� : " + counter);
		button.addActionListener(new MyListener9_1_1());
		add(label);
		add(button);
		
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	public static void main(String[] args) {
		Example9_1 f = new Example9_1();
	}

}
