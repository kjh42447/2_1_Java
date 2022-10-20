//JFram 복붙
package ch08_practice;

import java.awt.*;
import javax.swing.*;

public class JFrame01 extends JFrame {

	public JFrame01() {
		Toolkit kit = Toolkit.getDefaultToolkit();
		setSize(300, 200);
		Dimension screen = kit.getScreenSize();
		setLocation(screen.width/2, screen.height/2);
		setTitle("JFrame1");
		setLayout(new FlowLayout());
		getContentPane().setBackground(Color.DARK_GRAY);
		JButton button1 = new JButton("확인");
		JButton button2 = new JButton("취소");
		add(button1);
		add(button2);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		}
	
	public static void main(String[] args) {
		JFrame01 f = new JFrame01();
	}

}
