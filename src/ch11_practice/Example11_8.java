//복붙
package ch11_practice;

import java.awt.*;
import javax.swing.*;

public class Example11_8 extends JFrame{
	Image img;
	int pos_x = 150, pos_y = 0;
	
	public Example11_8() {
		ImageIcon icon = new ImageIcon(".\\src\\image\\치즈피자.png");
		img = icon.getImage();
		setSize(500, 200);
		
		add(new MyPanel_8(), BorderLayout.CENTER);
		JPanel panel = new JPanel();
		Button b1 = new Button("왼쪽으로 이동");
		Button b2 = new Button("오른쪽으로 이동");
		b1.addActionListener(e -> {	pos_x -= 10;	repaint();	});
		b2.addActionListener(e -> {	pos_x += 10;	repaint();	});
		panel.add(b1);
		panel.add(b2);
		add(panel, BorderLayout.SOUTH);
		
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	class MyPanel_8 extends JPanel{
		public void paintComponent(Graphics g) {
			super.paintComponent(g);
			g.drawImage(img, pos_x, pos_y, this);
		}
	}
	
	public static void main(String[] args) {
		Example11_8 f = new Example11_8();
	}

}
