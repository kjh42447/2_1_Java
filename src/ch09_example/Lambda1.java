//Example9_1_1�� ��ư �̺�Ʈ�� ���ٽ����� �ۼ��϶�.
package ch09_example;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Lambda1 extends JFrame {
	
	private JPanel p1, p2;
	private JButton addButton, subButton;
	private JLabel label;
	int counter = 0;
	
	//������
	public Lambda1() {
		setTitle("Lambda1");
		setSize(300, 150);
		setLayout(new GridLayout(2, 0));
		
		//�ؽ�Ʈ
		p1 = new JPanel();
		label = new JLabel("������ ī���Ͱ� : " + counter);
		p1.add(label);
		add(p1);
		
		//��ư
		p2 = new JPanel();
		addButton = new JButton("����");
		subButton = new JButton("����");
		addButton.addActionListener(e -> {
			counter++;
			label.setText("������ ī���Ͱ� : " + counter);
		});
		subButton.addActionListener(e -> {
			if(counter > 0)
				counter--;
			label.setText("������ ī���Ͱ� : " + counter);
		});
		p2.add(addButton);
		p2.add(subButton);
		add(p2);
		
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	public static void main(String[] args) {
		Lambda1 f = new Lambda1();
	}

}
