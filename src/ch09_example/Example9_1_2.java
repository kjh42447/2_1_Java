//증가, 감소 버튼을 누를 때 마다 문자열이 증감되는 프레임을 작성하라. 문자열의 최대 개수는 10개이다.
package ch09_example;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Example9_1_2 extends JFrame {
	private JPanel p1, p2;
	private JButton addButton, subButton;
	private JLabel[] label = new JLabel[10];
	int counter = 0;
	
	//증가
	class AddButton implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {
			if(counter < 10) {
				label[counter].setText("문자열" + (counter+1));
				counter++;
			}
		}
		
	}
	
	//감소
	class SubButton implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {
			if(counter > 1) {
				label[counter-1].setText("");
				counter--;
			}
			
		}
		
	}	
	
	//생성자
	public Example9_1_2() {
		setTitle("Example9_1_2");
		setSize(300, 200);
		setLayout(new GridLayout(0, 2));
		
		//텍스트
		p1 = new JPanel();
		p1.setLayout(new GridLayout(0, 1));
		label[0] = new JLabel("문자열" + (counter+1));
		p1.add(label[0]);
		for(int i = 1; i < 10; i++) {
			label[i] = new JLabel("");
			p1.add(label[i]);
		}
		add(p1);
		
		//버튼
		p2 = new JPanel();
		addButton = new JButton("증가");
		subButton = new JButton("감소");
		addButton.addActionListener(new AddButton());
		subButton.addActionListener(new SubButton());
		p2.add(addButton);
		p2.add(subButton);
		add(p2);
		
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	public static void main(String[] args) {
		Example9_1_2 f = new Example9_1_2();
	}

}
