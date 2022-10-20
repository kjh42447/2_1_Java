//����
package ch10_practice;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Example10_8_1 extends JFrame implements ActionListener{
	JLabel label;
	
	public Example10_8_1() {
		setTitle("�޺� �ڽ�");
		setSize(400, 200);
		
		String[] pizzas = { "ġ������", "�޺���̼�����", "������������", "�Ұ������", "���� ����"};
		JComboBox<String> pizzaList = new JComboBox<String>(pizzas);
		pizzaList.setSelectedIndex(0);
		pizzaList.addActionListener(this);
		
		label = new JLabel();
		label.setHorizontalAlignment(JLabel.CENTER);
		changePicture(pizzas[pizzaList.getSelectedIndex()]);
		add(pizzaList, BorderLayout.NORTH);
		add(label, BorderLayout.CENTER);
		
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		JComboBox<String> cb = (JComboBox<String>) e.getSource();
		String name = (String) cb.getSelectedItem();
		changePicture(name);
	}
	
	protected void changePicture(String name) {
		ImageIcon icon = new ImageIcon(".\\src\\image\\" + name + ".png");
		label.setIcon(icon);
		if(icon != null) {
			label.setText(null);
		}
		else {
			label.setText("�̹����� �߰ߵ��� �ʾҽ��ϴ�.");
		}
	}
	
	public static void main(String[] args) {
		new Example10_8_1();
	}

}
