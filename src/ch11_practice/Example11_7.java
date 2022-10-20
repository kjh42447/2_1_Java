//복붙
package ch11_practice;

import java.awt.*;
import javax.swing.*;

public class Example11_7 extends JFrame {
	Image img;
	
	public Example11_7() {
		ImageIcon icon = new ImageIcon(".\\src\\image\\치즈피자.png");
		img = icon.getImage();
		setSize(500, 200);
		
		add(new MyPanel_7());
		
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	class MyPanel_7 extends JPanel{
		public void paintComponent(Graphics g) {
			super.paintComponent(g);
			g.drawImage(img, 0, 0, this);
		}

	}
	
	public static void main(String[] args) {
		new Example11_7();
	}

}
