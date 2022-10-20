//버튼을 BorderLayout으로 배치하는 프레임을 생성하라.
package ch08_example;

import java.awt.*;
import javax.swing.*;

public class BorderLayout1 extends JFrame {

	public BorderLayout1() {
		Toolkit kit = Toolkit.getDefaultToolkit();
		Dimension screen = kit.getScreenSize();
		setLocation(screen.width/2, screen.height/2);
		setTitle("BorderLayoutTest");
		setSize(300, 200);
		
		//BorderLayout으로 레이아웃 세팅, 버튼 간 3프레임 간격
		setLayout(new BorderLayout(3, 3));
		
		JButton b1  = new JButton("NORTH");
		JButton b2  = new JButton("SOUTH");
		JButton b3  = new JButton("EAST");
		JButton b4  = new JButton("WEST");
		JButton b5  = new JButton("CENTER");
		
		add(b1, BorderLayout.NORTH);
		add(b2, BorderLayout.SOUTH);
		add(b3, BorderLayout.EAST);
		add(b4, BorderLayout.WEST);
		add(b5, BorderLayout.CENTER);
		
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	public static void main(String[] args) {
		BorderLayout1 f = new BorderLayout1();
	}

}
