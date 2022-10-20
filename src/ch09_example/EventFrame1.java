//예제 9_1을 내부 클래스가 아닌 메인 클래스가 이벤트를 처리하도록 작성하라.
package ch09_example;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class EventFrame1 extends JFrame implements ActionListener {
	private JButton button;
	private JLabel label;
	int counter = 0;
	
	@Override
	public void actionPerformed(ActionEvent e) {
		counter++;
		label.setText("현재의 카운터값 : " + counter);
	}
	
	public EventFrame1() {
		setSize(400, 150);
		setTitle("EventFrame1");
		setLayout(new FlowLayout());
		button = new JButton("증가");
		label = new JLabel("현재의 카운터값 : " + counter);
		button.addActionListener(this);
		add(label);
		add(button);
		
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	public static void main(String[] args) {
		EventFrame1 f = new EventFrame1();
	}

}
