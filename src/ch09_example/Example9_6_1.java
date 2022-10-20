//예제 9-6을 드래그시에 그려지도록 수정하라.
package ch09_example;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Example9_6_1 extends JFrame implements MouseMotionListener {
	
	public Example9_6_1() {
		addMouseMotionListener(this);
		setTitle("Example9_6_1");
		setSize(300, 300);
		setLayout(null);
		
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

	@Override
	public void mouseDragged(MouseEvent e) {
		Graphics g = getGraphics();
		g.setColor(Color.ORANGE);
		g.fillOval(e.getX()-5, e.getY()-5, 10, 10);
	}
	@Override
	public void mouseMoved(MouseEvent e) {		}
	
	public static void main(String[] args) {
		Example9_6_1 f = new Example9_6_1();
	}

}
