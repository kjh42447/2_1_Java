//복붙
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
		
		information = new JLabel("아래의 버튼 중에서 하나를 클릭하세요");
		output = new JLabel("Good Luck!");
		sisser = new JButton("가위");
		rock = new JButton("바위");
		paper = new JButton("보");
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
		if(b.getText().equals("가위")) {
			user = SISSER;
		}
		
		else if(b.getText().equals("바위")) {
			user = ROCK;
		}
		
		else if(b.getText().equals("보")) {
			user = PAPER;
		}
		
		Random random = new Random();
		int computer = random.nextInt(3);
		
		if(user == computer) {
			output.setText("비겼습니다");
		}
		
		else if(user == (computer+1)%3) {
			output.setText("이겼습니다");
		}
		
		else {
			output.setText("졌습니다");
		}
		
	}
	
	public static void main(String[] args) {
		Example9_2_1 gui = new Example9_2_1();
	}

}
