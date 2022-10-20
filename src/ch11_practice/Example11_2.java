//º¹ºÙ
package ch11_practice;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Example11_2 extends JFrame {
	int x, y;
	
	class MyPanel extends JPanel{
		
		public MyPanel() {
			addMouseListener(new MouseAdapter() {
				public void mousePressed(MouseEvent e) {
					x = e.getX();
					y = e.getY();
					repaint();
					}
		
			});
		
		}
		
		protected void paintComponent(Graphics g) {
			super.paintComponent(g);
			g.setColor(Color.ORANGE);
			g.fillRect(x, y, 100, 100);
		}
		
	}
	
	public Example11_2() {
		setTitle("Basic Painting");
		setSize(600, 200);
		add(new MyPanel());
		
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	public static void main(String[] args) {
		Example11_2 f = new Example11_2();
	}

}
