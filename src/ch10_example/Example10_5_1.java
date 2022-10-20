//üũ�� ������ ������ ���� �ݾ��� ǥ���϶�.
package ch10_example;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Example10_5_1 extends JFrame {
	private int cost = 0;
	private JCheckBox[] checkbox = new JCheckBox[5];
	private JLabel label = new JLabel();
	
	public Example10_5_1() {
		setTitle("CheckBox Test");
		setSize(500,  150);
		
		JPanel panel = new JPanel();
		
		checkbox[0] = new JCheckBox("��");
		checkbox[1] = new JCheckBox("���");
		checkbox[2] = new JCheckBox("�ٳ���");
		checkbox[3] = new JCheckBox("����");
		checkbox[4] = new JCheckBox("������");
		
		panel.setBorder(BorderFactory.createTitledBorder("����"));
		
		for(int i = 0; i < 5; i++) {
			checkbox[i].addItemListener(e -> {
				JCheckBox cb = (JCheckBox) e.getSource();
				if(cb.isSelected()) {
					cost += 1000;
				}
				else {
					cost -= 1000;
				}
				label.setText("���� ������ " + cost + "�� �Դϴ�.");
			});
			panel.add(checkbox[i]);
		}
		panel.add(label);
		add(panel);
		
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	public static void main(String[] args) {
		new Example10_5_1();
	}

}
