//무명클래스를 이용하여 문자열의 갯수를 증감하는 프로그램을 작성하라. 
package ch09_example;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class AnonymousClass1 extends JFrame {
	private JPanel p1, p2;
	private JButton addButton, subButton;
	private JLabel[] label = new JLabel[10];
	int counter = 0;
	
	//생성자
	public AnonymousClass1() {
		setTitle("AnonymousClass1");
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
		
		addButton.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				if(counter < 10) {
					label[counter].setText("문자열" + (counter+1));
					counter++;
				}
			}
		});
		
		subButton.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				if(counter > 1) {
					label[counter-1].setText("");
					counter--;
				}
				
			}
		});
		
		p2.add(addButton);
		p2.add(subButton);
		add(p2);
		
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	public static void main(String[] args) {
		AnonymousClass1 f = new AnonymousClass1();
	}

}
