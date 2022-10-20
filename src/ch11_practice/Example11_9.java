//º¹ºÙ
package ch11_practice;

import java.awt.*;
import java.awt.event.*;
import java.util.*;
import javax.swing.*;

class Point {
	int x, y;
	public Point(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
}

public class Example11_9 extends JFrame {
	int x, y;
	Vector<Point> list = new Vector<Point>();
	
	class MyPanel_9 extends JPanel {
		public MyPanel_9() {
			addMouseMotionListener(new MouseMotionAdapter() {
				@Override
				public void mouseDragged(MouseEvent event) {
					x = event.getX();
					y = event.getY();
					list.add(new Point(x, y));
					repaint();
				}
				
			});
			
		}
		
		public void paintComponent(Graphics g) {
			super.paintComponents(g);
			for(Point p : list) {
				g.fillOval(p.x, p.y, 4, 4);
			}
			
		}
		
	}
	
	public Example11_9() {
		setSize(600,150);
		setTitle("My Paint");
		
		add(new MyPanel_9());
		
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	public static void main(String[] args) {
		Example11_9 f = new Example11_9();
	}

}
