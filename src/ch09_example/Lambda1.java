//Example9_1_1의 버튼 이벤트를 람다식으로 작성하라.
package ch09_example;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Lambda1 extends JFrame {
	
	private JPanel p1, p2;
	private JButton addButton, subButton;
	private JLabel label;
	int counter = 0;
	
	//생성자
	public Lambda1() {
		setTitle("Lambda1");
		setSize(300, 150);
		setLayout(new GridLayout(2, 0));
		
		//텍스트
		p1 = new JPanel();
		label = new JLabel("현재의 카운터값 : " + counter);
		p1.add(label);
		add(p1);
		
		//버튼
		p2 = new JPanel();
		addButton = new JButton("증가");
		subButton = new JButton("감소");
		addButton.addActionListener(e -> {
			counter++;
			label.setText("현재의 카운터값 : " + counter);
		});
		subButton.addActionListener(e -> {
			if(counter > 0)
				counter--;
			label.setText("현재의 카운터값 : " + counter);
		});
		p2.add(addButton);
		p2.add(subButton);
		add(p2);
		
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	public static void main(String[] args) {
		Lambda1 f = new Lambda1();
	}

}
