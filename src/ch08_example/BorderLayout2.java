//색이 다른 5개의 버튼을 BorderLayout으로 배치하라.
package ch08_example;

import java.awt.*;
import javax.swing.*;

class BorderLayout2_1 extends JFrame {
	
	public BorderLayout2_1() {
		Toolkit kit = Toolkit.getDefaultToolkit();
		Dimension screen = kit.getScreenSize();
		setLocation(screen.width/3, screen.height/3);
		setSize(600, 400);
		setTitle("BorderLayout2");
		
		setLayout(new BorderLayout(5, 5));
		
		JButton b1  = new JButton("NORTH");
		b1.setBackground(Color.CYAN);
		JButton b2  = new JButton("SOUTH");
		b2.setBackground(Color.LIGHT_GRAY);
		JButton b3  = new JButton("EAST");
		b3.setBackground(Color.MAGENTA);
		JButton b4  = new JButton("WEST");
		b4.setBackground(Color.RED);
		JButton b5  = new JButton("CENTER");
		b5.setBackground(Color.YELLOW);
	
		add(b1, BorderLayout.NORTH);
		add(b2, BorderLayout.SOUTH);
		add(b3, BorderLayout.EAST);
		add(b4, BorderLayout.WEST);
		add(b5, BorderLayout.CENTER);
		
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
}

public class BorderLayout2 {

	public static void main(String[] args) {
		BorderLayout2_1 f = new BorderLayout2_1();
	}

}
