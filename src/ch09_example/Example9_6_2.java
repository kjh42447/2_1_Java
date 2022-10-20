//Example9_6_1에 지우개 버튼을 추가하여 간단한 그림판을 작성하라.
package ch09_example;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Example9_6_2 extends JFrame implements MouseMotionListener {
	JPanel buttonPanel, drawingPanel;
	JButton pen, eraser;
	boolean check = true;
	
	public Example9_6_2() {
		setTitle("Example9_6_2");
		setSize(600, 600);
		setLayout(new FlowLayout());
		
		buttonPanel = new JPanel();
		buttonPanel.setPreferredSize(new Dimension(600, 50));
		buttonPanel.setBackground(Color.CYAN);
		drawingPanel = new JPanel();
		drawingPanel.setPreferredSize(new Dimension(600, 550));
		drawingPanel.addMouseMotionListener(this);
		drawingPanel.setBackground(Color.WHITE);
		drawingPanel.setLayout(null);
		
		pen = new JButton("pen");
		pen.addActionListener(e -> {
			check = true;
		});
		eraser = new JButton("eraser");
		eraser.addActionListener(e -> {
			check = false;
		});
		
		buttonPanel.add(pen);
		buttonPanel.add(eraser);
		add(buttonPanel);
		add(drawingPanel);
		
		
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

	@Override
	public void mouseDragged(MouseEvent e) {
		Graphics g = getGraphics();
		if(check) {
			g.setColor(Color.ORANGE);
			g.fillOval(e.getXOnScreen()-5, e.getYOnScreen()-5, 10, 10);
		}
		else {
			g.setColor(Color.WHITE);
			g.fillOval(e.getXOnScreen()-5, e.getYOnScreen()-5, 10, 10);
		}
	}
	@Override
	public void mouseMoved(MouseEvent e) {		}
	
	public static void main(String[] args) {
		Example9_6_2 f = new Example9_6_2();
	}

}
