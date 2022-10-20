//레이블에 이미지를 추가하라. 같은 이미지를 상대주소와 절대주소를 이용하여 가져와라. 
package ch10_example;

import java.awt.*;
import javax.swing.*;

public class Example10_2_1 extends JFrame {
	private JPanel panel = new JPanel();
	private JLabel label1, label2;
	
	public Example10_2_1() {
		setTitle("Example10_2_1");
		setResizable(false);
		
		ImageIcon icon1 = new ImageIcon("E:\\공부\\2학년\\1학기\\객체지향프로그래밍\\실습\\src\\image\\불고기피자.png");
		Image img1 = icon1.getImage();
		ImageIcon icon2 = new ImageIcon(".\\src\\image\\불고기피자.png");
		Image img2 = icon2.getImage();
		
		label1 = new JLabel();
		label1.setIcon(new ImageIcon(img1.getScaledInstance(200, 200, Image.SCALE_SMOOTH)));
		label2 = new JLabel();
		label2.setIcon(new ImageIcon(img2.getScaledInstance(200, 200, Image.SCALE_SMOOTH)));
		
		panel.add(label1);
		panel.add(label2);
		add(panel);
		
		pack();
		
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	public static void main(String[] args) {
		Example10_2_1 f = new Example10_2_1();
	}

}
