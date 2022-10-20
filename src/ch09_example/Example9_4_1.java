//예제 9-4의 버튼이 프레임 밖을 벗어나지 못하게 하라.
package ch09_example;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Example9_4_1 extends JFrame {
	
	int img_x = 150, img_y = 150;
	public Example9_4_1() {
		setSize(600, 300);
		setTitle("Exmaple9_4_1");
		JButton button = new JButton();
		ImageIcon icon = new ImageIcon(".\\src\\image\\치즈피자.png");
		button.setIcon(icon);
		button.setLocation(img_x, img_y);
		JPanel panel = new JPanel();
		panel.add(button);
		panel.requestFocus();
		panel.setFocusable(true);
		panel.addKeyListener(new KeyListener() {
			@Override
			public void keyTyped(KeyEvent e) {			}
			@Override
			public void keyReleased(KeyEvent e) {			}
			@Override
			public void keyPressed(KeyEvent e) {
				int keyCode = e.getKeyCode();
				switch(keyCode) {
				case KeyEvent.VK_UP:
					if(img_y > 0)
						img_y -= 10;
					break;
				case KeyEvent.VK_DOWN:
					if(img_y < getHeight()-140)
						img_y += 10;
					break;
				case KeyEvent.VK_LEFT:
					if(img_x > 0)
						img_x -= 10;
					break;
				case KeyEvent.VK_RIGHT:
					if(img_x < getWidth()-180)
						img_x += 10;
					break;
				}
				button.setLocation(img_x, img_y);
			}
			
		});
		add(panel);
		
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	public static void main(String[] args) {
		Example9_4_1 f = new Example9_4_1();
	}

}
