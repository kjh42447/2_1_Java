//�ϴ��� ����
package ch10_practice;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Example10_5_1 extends JFrame {
	
	public Example10_5_1() {
		setTitle("CheckBox Test");
		setSize(500,  150);
		
		JPanel panel = new JPanel();
		add(panel);
		
		JCheckBox checkbox1 = new JCheckBox("���");
		JCheckBox checkbox2 = new JCheckBox("�ٳ���");
		JCheckBox checkbox3 = new JCheckBox("����");
		JCheckBox checkbox4 = new JCheckBox("������");
		JCheckBox checkbox5 = new JCheckBox("��");
		
		panel.setBorder(BorderFactory.createTitledBorder("����"));
		
		panel.add(checkbox1);
		panel.add(checkbox2);
		panel.add(checkbox3);
		panel.add(checkbox4);
		panel.add(checkbox5);
		
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	public static void main(String[] args) {
		new Example10_5_1();
	}

}
