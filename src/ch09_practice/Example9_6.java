//º¹ºÙ
package ch09_practice;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Example9_6 extends JFrame implements MouseListener {

	public Example9_6() {
		addMouseListener(this);
		setSize(300, 300);
		setLayout(null);
		
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	@Override
	public void mouseClicked(MouseEvent e) {
		Graphics g = getGraphics();
		g.setColor(Color.ORANGE);
		g.fillOval(e.getX()-30, e.getY()-30, 60, 60);
	}
	@Override
	public void mousePressed(MouseEvent e) {	}
	@Override
	public void mouseReleased(MouseEvent e) {	}
	@Override
	public void mouseEntered(MouseEvent e) {	}
	@Override
	public void mouseExited(MouseEvent e) {		}
	
	public static void main(String[] args) {
		Example9_6 f = new Example9_6();
	}

}
