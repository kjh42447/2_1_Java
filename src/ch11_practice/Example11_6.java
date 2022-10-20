//º¹ºÙ
package ch11_practice;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Example11_6 extends JFrame {
	Font f;
	
	class MyPanel_6 extends JPanel {
		public void paintComponent(Graphics g) {
			super.paintComponent(g);
			g.setFont(f);
			g.drawString("Dialog 30 points BOLD + ITALIC", 10, 30);
		}
		
	}
	
	public Example11_6() {
		f = new Font("Dialog", Font.BOLD | Font.ITALIC, 20);
		setSize(600, 100);
		setTitle("Font test");
		
		add(new MyPanel_6());
		
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	public static void main(String[] args) {
		Example11_6 f = new Example11_6();
	}

}
