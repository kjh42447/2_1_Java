//����
package ch09_practice;

import java.awt.*;
import java.awt.event.*;
import java.util.*;
import javax.swing.*;

public class Example9_2_1 extends JFrame implements ActionListener {
	final int SISSER = 0;
	final int ROCK = 1;
	final int PAPER = 2;
	
	private JPanel panel;
	private JLabel output, information;
	private JButton rock, paper, sisser;
	
	public Example9_2_1() {
		setTitle("Example9_2_1");
		setSize(400, 150);
		
		panel = new JPanel();
		panel.setLayout(new GridLayout(0, 3));
		
		information = new JLabel("�Ʒ��� ��ư �߿��� �ϳ��� Ŭ���ϼ���");
		output = new JLabel("Good Luck!");
		sisser = new JButton("����");
		rock = new JButton("����");
		paper = new JButton("��");
		sisser.addActionListener(this);
		rock.addActionListener(this);
		paper.addActionListener(this);
		
		panel.add(sisser);
		panel.add(rock);
		panel.add(paper);
		
		add(information, BorderLayout.NORTH);
		add(panel, BorderLayout.CENTER);
		add(output, BorderLayout.SOUTH);
		
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		JButton b = (JButton) e.getSource();
		int user = -1;
		if(b.getText().equals("����")) {
			user = SISSER;
		}
		
		else if(b.getText().equals("����")) {
			user = ROCK;
		}
		
		else if(b.getText().equals("��")) {
			user = PAPER;
		}
		
		Random random = new Random();
		int computer = random.nextInt(3);
		
		if(user == computer) {
			output.setText("�����ϴ�");
		}
		
		else if(user == (computer+1)%3) {
			output.setText("�̰���ϴ�");
		}
		
		else {
			output.setText("�����ϴ�");
		}
		
	}
	
	public static void main(String[] args) {
		Example9_2_1 gui = new Example9_2_1();
	}

}
