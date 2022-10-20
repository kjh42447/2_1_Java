//복붙
package ch09_practice;

import java.awt.event.*;
import javax.swing.*;

public class Example9_4 extends JFrame {
	
	int img_x = 150, img_y = 150;
	public Example9_4() {
		setSize(600, 300);
		JButton button = new JButton();
		//현재위치 : 루트프로젝트 폴더
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
				case KeyEvent.VK_UP:	img_y -= 10; break;
				case KeyEvent.VK_DOWN:	img_y += 10; break;
				case KeyEvent.VK_LEFT:	img_x -= 10; break;
				case KeyEvent.VK_RIGHT:	img_x += 10; break;
				}
				button.setLocation(img_x, img_y);
			}
			
		});
		add(panel);
		
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	public static void main(String[] args) {
		Example9_4 f = new Example9_4();
	}

}
