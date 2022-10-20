//º¹ºÙ
package ch09_practice;

import java.awt.event.*;
import javax.swing.*;

public class Example9_3 extends JFrame {
	int n1, n2, n3;
	JButton button1, button2, button3;
	
	public Example9_3() {
		setTitle("Example9_3");
		setSize(300, 150);
		JPanel panel = new JPanel();
		button1 = new JButton("" + n1);
		panel.add(button1);
		button2 = new JButton("" + n2);
		panel.add(button2);
		button3 = new JButton("" + n3);
		panel.add(button3);
		panel.requestFocus();
		panel.setFocusable(true);
		panel.addKeyListener(new KeyListener() {
			@Override
			public void keyTyped(KeyEvent e) {			}
			@Override
			public void keyReleased(KeyEvent e) {			}
			@Override
			public void keyPressed(KeyEvent e) {
				int keycord = e.getKeyCode();
				if(keycord == KeyEvent.VK_ENTER) {
					n1 = (int)(Math.random()*10);
					n2 = (int)(Math.random()*10);
					n3 = (int)(Math.random()*10);
					button1.setText(""+n1);
					button2.setText(""+n2);
					button3.setText(""+n3);
				}
				
			}
			
		});
		add(panel);
		
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	public static void main(String[] args) {
		Example9_3 f = new Example9_3();
	}

}
