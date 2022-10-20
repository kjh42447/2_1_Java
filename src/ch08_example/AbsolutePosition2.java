//AbsolutePosition1의 프레임에 배경색, 버튼색, 메뉴바를 추가하라.
package ch08_example;

import java.awt.*;
import javax.swing.*;

public class AbsolutePosition2 extends JFrame {
	
	public AbsolutePosition2() {
		setTitle("AbsolutePosition2");
		setSize(300, 220);
		setResizable(false);
		getContentPane().setBackground(Color.CYAN);
		
		//절대 위치 사용
		setLayout(null);
		
		//버튼 배치
		JButton b1 = new JButton("버튼 1");
		add(b1);
		b1.setBounds(10, 10, 80, 40);
		b1.setBackground(Color.yellow);
		
		JButton b2 = new JButton("버튼 2");
		add(b2);
		b2.setBounds(200, 10, 80, 40);
		b2.setBackground(Color.yellow);
		
		JButton b3 = new JButton("버튼 3");
		add(b3);
		b3.setBounds(105, 60, 80, 40);
		b3.setBackground(Color.yellow);
		
		JButton b4 = new JButton("버튼 4");
		add(b4);
		b4.setBounds(10, 110, 80, 40);
		b4.setBackground(Color.yellow);
		
		JButton b5 = new JButton("버튼 5");
		add(b5);
		b5.setBounds(200, 110, 80, 40);
		b5.setBackground(Color.yellow);
		
		//메뉴바
		JMenuBar mb = new JMenuBar();
		setJMenuBar(mb);
		
		mb.add(new JMenu("파일"));
		mb.add(new JMenu("편집"));
		mb.add(new JMenu("설정"));
		mb.add(new JMenu("도움말"));
		
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	public static void main(String[] args) {
		AbsolutePosition2 f = new AbsolutePosition2();
	}

}
