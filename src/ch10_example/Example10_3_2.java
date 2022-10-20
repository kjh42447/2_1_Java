//��� ������ �ؽ�Ʈ�ʵ带 �̿��Ͽ� �ۼ��϶�.
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
	
	//������
	public HangMan() {
		setTitle("HangMan");
		setSize(250, 200);
		setResizable(false);
		
		//������Ʈ
		panel.add(new JLabel("�Է� : "));
		text = new JTextField(15);
		text.addActionListener(checkword);
		panel.add(text);
		panel.add(new JLabel("��� : "));
		result = new JTextField(15);
		result.setEditable(false);
		panel.add(result);
		
		enterButton = new JButton("Ȯ��");
		enterButton.addActionListener(checkword);
		panel.add(enterButton);
		answerButton = new JButton("����");
		answerButton.addActionListener(checkword);
		panel.add(answerButton);
		replayButton = new JButton("���÷���");
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
	
	//�ܾ� ����
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
	
	//�̺�Ʈ Ŭ����
	private class CheckWord implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			Object gc = e.getSource();
			String c = "-";
			
			if(gc == enterButton || gc == answerButton || gc == text) {
				c = text.getText();
				
				//���� ����
				if(c.equals("")) {
					
				}
				
				//���� Ȯ��
				else if(c.equals(solution)) {
					result.setText(solution);
					printLabel.setText("�����Դϴ�!");
				}
				
				//���� �� ����
				else if(c.length() != 1) {
					printLabel.setText("���� �ϳ��� �Է��ϼ���");
				}
				
				else {
					//���� ã��
					for(int i = 0; i < solution.length(); i++) {
						if(solution.indexOf(c, i) != -1) {
							i = solution.indexOf(c, i);
							answer.replace(i, i+1, c);
						}
					}
					if(answer.toString().equals(solution)) {
						printLabel.setText("�����Դϴ�!");
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
