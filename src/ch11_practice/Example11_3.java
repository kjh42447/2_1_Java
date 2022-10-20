//º¹ºÙ
package ch11_practice;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

class SnowManFace extends JFrame {
	
	class MyPanel extends JPanel {
		
		@Override
		public void paintComponent(Graphics g) {
			super.paintComponent(g);
			g.setColor(Color.YELLOW);
			g.fillOval(20, 30, 200, 200);
			g.setColor(Color.BLACK);
			g.drawArc(50, 80, 50, 50, 180, -180);
			g.drawArc(140, 80, 50, 50, 180, -180);
			g.drawArc(70, 130, 100, 70, 180, 180);
		}
		
	}
	
	public SnowManFace() {
		setSize(300, 300);
		setTitle("´«»ç¶÷ ¾ó±¼");
		
		add(new MyPanel());
		
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}

public class Example11_3 {

	public static void main(String[] args) {
		SnowManFace f = new SnowManFace();
	}

}
