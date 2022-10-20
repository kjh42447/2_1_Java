//숫자야구 게임을 작성하라.
package ch09_example;

import java.awt.*;
import java.awt.event.*;
import java.util.*;
import javax.swing.*;


interface Ball{
	public void makeBall();
	public void checkBall();
}

class BaseBall extends JFrame implements Ball, ActionListener {
	Random random = new Random(System.currentTimeMillis());
	private JPanel printPanel, buttonPanel;
	private JButton[] b = new JButton[12];
	private String[] s = { "7", "8", "9", "4", "5", "6", "1", "2", "3", " ", "0", " " };
	private JLabel questionLabel, inputNumLabel, strikeLabel, ballLabel, outLabel;
	JLabel victoryLabel;
	
	int counter = 0;
	private int[] myBall = new int[3], inputBall = new int[3];
	private boolean[] check = new boolean[10];
	
	//생성자
	public BaseBall() {
		this.makeBall();
		setSize(500, 500);
		setTitle("숫자야구");
		setLayout(new GridLayout(2, 0));
		
		//출력 패널
		printPanel = new JPanel();
		printPanel.setLayout(new GridLayout(0, 1));
		questionLabel = new JLabel("정답으로 생각하는 숫자를 입력하세요 : ");
		inputNumLabel = new JLabel();
		strikeLabel = new JLabel();
		ballLabel = new JLabel();
		outLabel  = new JLabel();
		victoryLabel = new JLabel();
		
		printPanel.add(questionLabel);
		printPanel.add(inputNumLabel);
		printPanel.add(strikeLabel);
		printPanel.add(ballLabel);
		printPanel.add(outLabel);
		printPanel.add(victoryLabel);
		add(printPanel);
		
		//버튼 패널
		buttonPanel = new JPanel();
		buttonPanel.setLayout(new GridLayout(4, 3));
		for(int i = 0; i < 12; i++) {
			b[i] = new JButton(s[i]);
			b[i].addActionListener(this);
			buttonPanel.add(b[i]);
		}
		add(buttonPanel);
		
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	//버튼 이벤트
	@Override
	public void actionPerformed (ActionEvent e) {
		JButton button = (JButton)e.getSource();
		try {
			int num = Integer.parseInt(""+button.getText().charAt(0));
			inputBall[counter] = num;
			questionLabel.setText("정답으로 생각하는 숫자를 입력하세요 : " + num);
			counter++;
		}
		catch(NumberFormatException nfe) {
			
		}
		finally{
			if(counter == 3) {
				checkBall();
				counter = 0;
			}
		}
	}
	
	//번호 생성
	@Override
	public void makeBall() {
		for(int i = 0; i < 10; i++) {
			check[i] = false;
		}
		
		int count = 0;
		while(count < 3) {
			int t = random.nextInt(10);
			if(!check[t]) {
				myBall[count] = t;
				check[t] = true;
				count++;
			}
		}
		
	}

	//번호 체크
	@Override
	public void checkBall() {
		int strike = 0, out = 0, ball = 0;
		
		for(int i = 0; i < 3; i++) {
			//out
			if(!check[inputBall[i]]) out++;
			
			else {
				//strike
				if(inputBall[i] == myBall[i])	strike++;
				
				//ball
				else	ball++;
			}
		}
		
		inputNumLabel.setText("입력한 숫자 : " + inputBall[0] + " " + inputBall[1] + " " + inputBall[2]);
		strikeLabel.setText("Strike : " + strike);
		ballLabel.setText("BALL : " + ball);
		outLabel.setText("OUT : " + out);
		
		if(strike == 3) {
			victoryLabel.setText("정답입니다!");
		}
		
	}
	
}

public class Example9_2_2 {

	public static void main(String[] args) {
		BaseBall f = new BaseBall();
	}

}
