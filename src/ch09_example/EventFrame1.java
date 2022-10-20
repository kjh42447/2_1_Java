//���� 9_1�� ���� Ŭ������ �ƴ� ���� Ŭ������ �̺�Ʈ�� ó���ϵ��� �ۼ��϶�.
package ch09_example;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class EventFrame1 extends JFrame implements ActionListener {
	private JButton button;
	private JLabel label;
	int counter = 0;
	
	@Override
	public void actionPerformed(ActionEvent e) {
		counter++;
		label.setText("������ ī���Ͱ� : " + counter);
	}
	
	public EventFrame1() {
		setSize(400, 150);
		setTitle("EventFrame1");
		setLayout(new FlowLayout());
		button = new JButton("����");
		label = new JLabel("������ ī���Ͱ� : " + counter);
		button.addActionListener(this);
		add(label);
		add(button);
		
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	public static void main(String[] args) {
		EventFrame1 f = new EventFrame1();
	}

}
