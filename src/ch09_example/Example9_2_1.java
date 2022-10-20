//버튼을 누를 때 마다 버튼의 색이 랜덤으로 바뀌는 프레임을 작성하라.
package ch09_example;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

class RandomColorButton1 extends JFrame implements ActionListener {
	JPanel p = new JPanel();
	JButton b1, b2, b3, b4;
	
	//색 변경
	
	
	//버튼 이벤트
	@Override
	public void actionPerformed(ActionEvent e) {
		JButton button = (JButton)e.getSource();
		int R = (int)(Math.random()*255);
		int G = (int)(Math.random()*255);
		int B = (int)(Math.random()*255);
		button.setBackground(new Color(R, G, B));
	}
	
	//생성자
	public RandomColorButton1() {
		setTitle("ColorButton1");
		setSize(400, 400);
		
		p.setLayout(new GridLayout(2, 2));
		
		b1 = new JButton("버튼 1");
		b2 = new JButton("버튼 2");
		b3 = new JButton("버튼 3");
		b4 = new JButton("버튼 4");
		
		b1.addActionListener(this);
		b2.addActionListener(this);
		b3.addActionListener(this);
		b4.addActionListener(this);
		
		p.add(b1);
		p.add(b2);
		p.add(b3);
		p.add(b4);
		
		add(p);
		
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
}

public class Example9_2_1 {
	
	public static void main(String[] args) {
		RandomColorButton1 f = new RandomColorButton1();
	}

}
