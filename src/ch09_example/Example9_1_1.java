//예제에 감소버튼을 추가하라.
package ch09_example;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Example9_1_1 extends JFrame {
	private JPanel p1, p2;
	private JButton addButton, subButton;
	private JLabel label;
	int counter = 0;

	//증가
	class AddButton implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {
			counter++;
			label.setText("현재의 카운터값 : " + counter);
		}
		
	}
	
	//감소
	class SubButton implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {
			if(counter > 0)
				counter--;
			label.setText("현재의 카운터값 : " + counter);
		}
		
	}
	
	//생성자
	public Example9_1_1() {
		setTitle("Example9_1_1");
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
		addButton.addActionListener(new AddButton());
		subButton.addActionListener(new SubButton());
		p2.add(addButton);
		p2.add(subButton);
		add(p2);
		
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	public static void main(String[] args) {
		Example9_1_1 f = new Example9_1_1();
	}

}
