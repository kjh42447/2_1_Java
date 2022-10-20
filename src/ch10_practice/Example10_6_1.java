//����
package ch10_practice;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Example10_6_1 extends JFrame implements ActionListener {
	private JRadioButton small, medium, large;
	private JLabel text;
	private JPanel topPanel, sizePanel, resultPanel;
	
	public Example10_6_1() {
		setTitle("���� ��ư �׽�Ʈ");
		setSize(300, 150);
		
		topPanel = new JPanel();
		topPanel.add(new JLabel("� ũ���� Ŀ�Ǹ� �ֹ��Ͻðڽ��ϱ�?"));
		add(topPanel, BorderLayout.NORTH);
		
		sizePanel = new JPanel();
		small = new JRadioButton("Small Size");
		medium = new JRadioButton("Medium Size");
		large = new JRadioButton("Large Size");
		
		ButtonGroup size = new ButtonGroup();
		size.add(small);
		size.add(medium);
		size.add(large);
		small.addActionListener(this);
		medium.addActionListener(this);
		large.addActionListener(this);
		sizePanel.add(small);
		sizePanel.add(medium);
		sizePanel.add(large);
		add(sizePanel, BorderLayout.CENTER);
		
		resultPanel = new JPanel();
		text = new JLabel("ũ�Ⱑ ���õ��� �ʾҽ��ϴ�.");
		text.setForeground(Color.RED);
		resultPanel.add(text);
		add(resultPanel, BorderLayout.SOUTH);
		
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		text.setForeground(Color.BLACK);
		
		if(e.getSource() == small) {
			text.setText("Small ũ�Ⱑ ���õǾ����ϴ�.");
		}
		if(e.getSource() == medium) {
			text.setText("Medium ũ�Ⱑ ���õǾ����ϴ�.");
		}
		if(e.getSource() == large) {
			text.setText("Large ũ�Ⱑ ���õǾ����ϴ�.");
		}
		
	}
	
	public static void main(String[] args) {
		new Example10_6_1();
	}

}
