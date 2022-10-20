//행맨 게임을 텍스트필드를 이용하여 작성하라.
package ch10_example;

import java.awt.*;
import java.awt.event.*;
import java.util.*;
import javax.swing.*;

class HangMan extends JFrame {
	private JPanel panel = new JPanel();
	private JTextField text, result;
	private JButton enterButton, answerButton, replayButton;
	private JLabel printLabel = new JLabel();
	private String[] words = { "java", "count", "school", "book", "student", "programmer" };
	private String c, solution;
	private StringBuffer answer;
	CheckWord checkword = new CheckWord();
	
	//생성자
	public HangMan() {
		setTitle("HangMan");
		setSize(250, 200);
		setResizable(false);
		
		//컴포넌트
		panel.add(new JLabel("입력 : "));
		text = new JTextField(15);
		text.addActionListener(checkword);
		panel.add(text);
		panel.add(new JLabel("결과 : "));
		result = new JTextField(15);
		result.setEditable(false);
		panel.add(result);
		
		enterButton = new JButton("확인");
		enterButton.addActionListener(checkword);
		panel.add(enterButton);
		answerButton = new JButton("정답");
		answerButton.addActionListener(checkword);
		panel.add(answerButton);
		replayButton = new JButton("리플레이");
		replayButton.addActionListener(e -> {
			makeWord();
		});
		panel.add(replayButton);
		panel.add(printLabel);
		add(panel);
		
		makeWord();
		
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	//단어 생성
	void makeWord() {
		int index = (new Random()).nextInt(words.length);
		solution = words[index];
		answer = new StringBuffer(solution.length());
		
		for(int i = 0; i < solution.length(); i++) {
			answer.append("_");
		}
		result.setText(answer.toString());
		printLabel.setText("");
	}
	
	//이벤트 클래스
	private class CheckWord implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			Object gc = e.getSource();
			String c = "-";
			
			if(gc == enterButton || gc == answerButton || gc == text) {
				c = text.getText();
				
				//공백 예외
				if(c.equals("")) {
					
				}
				
				//정답 확인
				else if(c.equals(solution)) {
					result.setText(solution);
					printLabel.setText("정답입니다!");
				}
				
				//글자 수 제한
				else if(c.length() != 1) {
					printLabel.setText("문자 하나만 입력하세요");
				}
				
				else {
					//문자 찾기
					for(int i = 0; i < solution.length(); i++) {
						if(solution.indexOf(c, i) != -1) {
							i = solution.indexOf(c, i);
							answer.replace(i, i+1, c);
						}
					}
					if(answer.toString().equals(solution)) {
						printLabel.setText("정답입니다!");
					}
					result.setText(answer.toString());
				}
			}
			
		}
		
	}
	
}


public class Example10_3_2 {

	public static void main(String[] args) {
		HangMan f = new HangMan();
	}

}
