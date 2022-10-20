//º¹ºÙ
package ch11_practice;

import java.awt.*;
import javax.swing.*;

public class Example11_1 extends JFrame {
	
	class MyPanel extends JPanel {
		@Override
		protected void paintComponent(Graphics g) {
			super.paintComponent(g);
			g.drawOval(60, 50, 60, 60);
			g.drawRect(120, 50, 60, 60);
			g.setColor(Color.BLUE);
			g.fillOval(180, 50, 60, 60);
			g.fillRect(240, 50, 60, 60);
		}
		
	}
	
	public Example11_1() {
		setTitle("Basic Painting");
		setSize(600, 200);
		
		add(new MyPanel());
		
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	public static void main(String[] args) {
		Example11_1 f = new Example11_1();
	}

}
