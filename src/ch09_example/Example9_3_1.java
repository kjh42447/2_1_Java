//버튼 5개를 생성하여 방향키로 값을 설정하라.
package ch09_example;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

class ArrowKey1 extends JFrame {
	JPanel panel = new JPanel();
	JButton[] button = new JButton[5];
	int[] num = new int[5];
	private int buttonIndex = 0;
	
	//생성자
	public ArrowKey1() {
		setTitle("ArrowKey1");
		setSize(300, 80);
		
		//버튼
		for(int i = 0; i < 5; i++) {
			num[i] = 1;
			button[i] = new JButton("" + num[i]);
			panel.add(button[i]);
		}
		add(panel);
		
		//방향키 입력
		panel.requestFocus();
		panel.setFocusable(true);
		
		panel.addKeyListener(new KeyListener() {
			@Override
			public void keyTyped(KeyEvent e) {		}
			@Override
			public void keyReleased(KeyEvent e) {	}
			@Override
			public void keyPressed(KeyEvent e) {
				int keyCode = e.getKeyCode();
				if(keyCode == KeyEvent.VK_UP) {
					num[buttonIndex]++;
					button[buttonIndex].setText("" + num[buttonIndex]);
				}
				if(keyCode == KeyEvent.VK_DOWN) {
					if(num[buttonIndex] > 1) {
						num[buttonIndex]--;
						button[buttonIndex].setText("" + num[buttonIndex]);
					}
				}
				if(keyCode == KeyEvent.VK_LEFT) {
					if(buttonIndex > 0) {
						button[buttonIndex].setBackground(null);
						buttonIndex--;
						button[buttonIndex].setBackground(Color.CYAN);
					}
				}
				if(keyCode == KeyEvent.VK_RIGHT) {
					if(buttonIndex < 4) {
						button[buttonIndex].setBackground(null);
						buttonIndex++;
						button[buttonIndex].setBackground(Color.CYAN);
					}
				}
			}
			
		});
		
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}

public class Example9_3_1 {

	public static void main(String[] args) {
		ArrowKey1 f = new ArrowKey1();
		f.button[0].setBackground(Color.CYAN);
	}

}
