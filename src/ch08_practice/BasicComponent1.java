//����
package ch08_practice;

import java.awt.*;
import javax.swing.*;

public class BasicComponent1 extends JFrame {

	public BasicComponent1() {
		JPanel panel = new JPanel();
		add(panel);
		
		JLabel lable1 = new JLabel("ȭ�� �µ�");
		JLabel lable2 = new JLabel("���� �µ�");
		JTextField field1 = new JTextField(15);
		JTextField field2 = new JTextField(15);
		JButton button = new JButton("��ȯ");
		
		panel.add(lable1);
		panel.add(field1);
		panel.add(lable2);
		panel.add(field2);
		panel.add(button);
		
		setSize(250, 150);
		setTitle("�µ���ȯ��");
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	public static void main(String[] args) {
		BasicComponent1 f = new BasicComponent1();
	}

}
