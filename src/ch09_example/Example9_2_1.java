//��ư�� ���� �� ���� ��ư�� ���� �������� �ٲ�� �������� �ۼ��϶�.
package ch09_example;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

class RandomColorButton1 extends JFrame implements ActionListener {
	JPanel p = new JPanel();
	JButton b1, b2, b3, b4;
	
	//�� ����
	
	
	//��ư �̺�Ʈ
	@Override
	public void actionPerformed(ActionEvent e) {
		JButton button = (JButton)e.getSource();
		int R = (int)(Math.random()*255);
		int G = (int)(Math.random()*255);
		int B = (int)(Math.random()*255);
		button.setBackground(new Color(R, G, B));
	}
	
	//������
	public RandomColorButton1() {
		setTitle("ColorButton1");
		setSize(400, 400);
		
		p.setLayout(new GridLayout(2, 2));
		
		b1 = new JButton("��ư 1");
		b2 = new JButton("��ư 2");
		b3 = new JButton("��ư 3");
		b4 = new JButton("��ư 4");
		
		b1.addActionListener(this);
		b2.addActionListener(this);
		b3.addActionListener(this);
		b4.addActionListener(this);
		
		p.add(b1);
		p.add(b2);
		p.add(b3);
		p.add(b4);
		
		add(p);
		
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
}

public class Example9_2_1 {
	
	public static void main(String[] args) {
		RandomColorButton1 f = new RandomColorButton1();
	}

}
