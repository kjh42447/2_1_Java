//���� 9_5�� ���콺 �巡�׷� �̵��ϰ� �ۼ��϶�.
package ch09_example;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Example9_5_1 extends JFrame {
	
	int img_x = 150, img_y = 150;
	
	public Example9_5_1() {
		setSize(600, 300);
		setTitle("Example9_5_1");
		JButton button = new JButton("");
		ImageIcon icon = new ImageIcon(".\\src\\image\\ġ������.png");
		button.setIcon(icon);
		button.setLocation(img_x, img_y);
		JPanel panel = new JPanel();
		panel.add(button);
		panel.requestFocus();
		panel.setFocusable(true);
		panel.addMouseMotionListener(new MouseMotionListener() {
			@Override
			public void mouseMoved(MouseEvent e) {			}
			@Override
			public void mouseDragged(MouseEvent e) {
				img_x = e.getX();
				img_y = e.getY();
				button.setLocation(img_x-85, img_y-65);
			}
			
		});
		add(panel);
		
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	public static void main(String[] args) {
		Example9_5_1 f = new Example9_5_1();
	}

}
