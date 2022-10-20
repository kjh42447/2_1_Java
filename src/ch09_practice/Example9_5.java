//복붙
package ch09_practice;

import java.awt.event.*;
import javax.swing.*;

public class Example9_5 extends JFrame {
	
	int img_x = 150, img_y = 150;
	
	public Example9_5() {
		setSize(600, 300);
		JButton button = new JButton("");
		ImageIcon icon = new ImageIcon(".\\src\\image\\치즈피자.png");
		button.setIcon(icon);
		button.setLocation(img_x, img_y);
		JPanel panel = new JPanel();
		panel.add(button);
		panel.requestFocus();
		panel.setFocusable(true);
		panel.addMouseListener(new MouseListener() {
			@Override
			public void mousePressed(MouseEvent e) {
				img_x = e.getX();
				img_y = e.getY();
				button.setLocation(img_x-85, img_y-65);
			}
			@Override
			public void mouseReleased(MouseEvent e) {		}
			@Override
			public void mouseExited(MouseEvent e) {			}
			@Override
			public void mouseEntered(MouseEvent e) {		}
			@Override
			public void mouseClicked(MouseEvent e) {		}
		});
		add(panel);
		
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	public static void main(String[] args) {
		Example9_5 f = new Example9_5();
	}
}
