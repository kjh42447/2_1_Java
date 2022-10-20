//Example5_2_2를 어뎁터클래스를 이용하여 구현하라.
package ch09_example;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class AdapterClass1 extends JFrame {
	
private int img_x = 150, img_y = 150, x = 100, y = 100;
	
	public AdapterClass1() {
		setSize(600, 300);
		setTitle("AdapterClass1");
		
		JPanel panel = new JPanel();
		panel.setLayout(null);
		
		JButton button = new JButton("");
		ImageIcon icon = new ImageIcon(".\\src\\image\\치즈피자.png");
		button.setIcon(icon);
		button.setBounds(x, y, img_x, img_y);
		
		panel.add(button);
		button.requestFocus();
		button.setFocusable(true);
		button.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) {
				if(button.contains(new Point(e.getX(), e.getY()))) {
					//버튼위치를 마우스 중앙으로 이동
					x = e.getXOnScreen()-(button.getWidth()/2);
					y = e.getYOnScreen()-(button.getHeight()/2);
					button.setLocation(x, y);
				}	
			}
		});
		
		button.addMouseMotionListener(new MouseMotionListener() {
			@Override
			public void mouseMoved(MouseEvent e) {			}
			@Override
			public void mouseDragged(MouseEvent e) {
				button.setLocation(e.getXOnScreen()-(button.getWidth()/2),
						e.getYOnScreen()-(button.getHeight()/2));
			}
			
		});
		add(panel);
		
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	public static void main(String[] args) {
		AdapterClass1 f = new AdapterClass1();
	}

}
