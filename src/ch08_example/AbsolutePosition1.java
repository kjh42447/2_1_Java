//절대 위치를 이용하여 버튼을 x자 형태로 배치하라.
package ch08_example;

import java.awt.*;
import javax.swing.*;

public class AbsolutePosition1 extends JFrame {

	public AbsolutePosition1() {
		setTitle("AbsolutePosition1");
		setSize(300, 200);
		setResizable(false);
		
		//절대 위치 사용
		setLayout(null);
		
		//버튼 배치
		JButton b1 = new JButton("버튼 1");
		add(b1);
		b1.setBounds(10, 10, 80, 40);
		
		JButton b2 = new JButton("버튼 2");
		add(b2);
		b2.setBounds(200, 10, 80, 40);
		
		JButton b3 = new JButton("버튼 3");
		add(b3);
		b3.setBounds(105, 60, 80, 40);
		
		JButton b4 = new JButton("버튼 4");
		add(b4);
		b4.setBounds(10, 110, 80, 40);
		
		JButton b5 = new JButton("버튼 5");
		add(b5);
		b5.setBounds(200, 110, 80, 40);
		
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	public static void main(String[] args) {
		AbsolutePosition1 f = new AbsolutePosition1();
	}

}
