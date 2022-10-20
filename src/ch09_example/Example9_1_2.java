//����, ���� ��ư�� ���� �� ���� ���ڿ��� �����Ǵ� �������� �ۼ��϶�. ���ڿ��� �ִ� ������ 10���̴�.
package ch09_example;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Example9_1_2 extends JFrame {
	private JPanel p1, p2;
	private JButton addButton, subButton;
	private JLabel[] label = new JLabel[10];
	int counter = 0;
	
	//����
	class AddButton implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {
			if(counter < 10) {
				label[counter].setText("���ڿ�" + (counter+1));
				counter++;
			}
		}
		
	}
	
	//����
	class SubButton implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {
			if(counter > 1) {
				label[counter-1].setText("");
				counter--;
			}
			
		}
		
	}	
	
	//������
	public Example9_1_2() {
		setTitle("Example9_1_2");
		setSize(300, 200);
		setLayout(new GridLayout(0, 2));
		
		//�ؽ�Ʈ
		p1 = new JPanel();
		p1.setLayout(new GridLayout(0, 1));
		label[0] = new JLabel("���ڿ�" + (counter+1));
		p1.add(label[0]);
		for(int i = 1; i < 10; i++) {
			label[i] = new JLabel("");
			p1.add(label[i]);
		}
		add(p1);
		
		//��ư
		p2 = new JPanel();
		addButton = new JButton("����");
		subButton = new JButton("����");
		addButton.addActionListener(new AddButton());
		subButton.addActionListener(new SubButton());
		p2.add(addButton);
		p2.add(subButton);
		add(p2);
		
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	public static void main(String[] args) {
		Example9_1_2 f = new Example9_1_2();
	}

}
