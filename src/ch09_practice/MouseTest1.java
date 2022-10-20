//이것저것
package ch09_practice;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class MouseTest1 extends JFrame {
	JPanel panel = new JPanel();
	JButton button = new JButton("button");
	
	public MouseTest1() {
		setSize(500, 500);
		
		panel.add(button);
		
		panel.requestFocus();
		panel.setFocusable(true);
		panel.addMouseMotionListener(new MouseMotionListener() {
			@Override
			public void mouseMoved(MouseEvent e) {			}
			@Override
			public void mouseDragged(MouseEvent e) {
				int x = e.getX();
				int y = e.getY();
				button.setLocation(x, y);
			}
			
		});
		add(panel);
		
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	public static void main(String[] args) {
		MouseTest1 f = new MouseTest1();
	}

}
