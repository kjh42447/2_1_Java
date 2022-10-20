//Example9_5_1을 버튼을 클릭하고 드래그 할 시에만 적용되도록 수정하라.
package ch09_example;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Example9_5_2 extends JFrame {
	
	private int img_x = 150, img_y = 150, x = 100, y = 100;
	
	public Example9_5_2() {
		setSize(600, 300);
		setTitle("Example9_5_2");
		
		JPanel panel = new JPanel();
		panel.setLayout(null);
		
		JButton button = new JButton("");
		ImageIcon icon = new ImageIcon(".\\src\\image\\치즈피자.png");
		button.setIcon(icon);
		button.setBounds(x, y, img_x, img_y);
		
		panel.add(button);
		button.requestFocus();
		button.setFocusable(true);
		button.addMouseListener(new MouseListener() {
			@Override
			public void mousePressed(MouseEvent e) {
				if(button.contains(new Point(e.getX(), e.getY()))) {
					//버튼위치를 마우스 중앙으로 이동
					x = e.getXOnScreen()-(button.getWidth()/2);
					y = e.getYOnScreen()-(button.getHeight()/2);
					button.setLocation(x, y);
				}
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
		Example9_5_2 f = new Example9_5_2();
	}

}
