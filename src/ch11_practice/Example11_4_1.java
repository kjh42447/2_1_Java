//ㄹㅇ 바운스볼 만드셈
package ch11_practice;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

class BouncingBall2 extends JFrame implements ActionListener {
	int x, y;
	private int xSpeed = 0, ySpeed = 3;
	private static final int WIDTH = 600;
	private static final int HEIGHT = 600;
	private static final int PERIOD = 10;
	
	class MyPanel extends JPanel {
		
		@Override
		public void paintComponent(Graphics g) {
			super.paintComponent(g);
			g.setColor(Color.ORANGE);
			g.fillOval(x, y, 40, 40);
		}
		
	}
	
	public void update() {
		x += xSpeed;
		y += ySpeed*ySpeed;
		if(x > WIDTH - 60 || x < 0) {
			xSpeed = -xSpeed;
		}
		if(y > HEIGHT - 75 || y < 0) {
			ySpeed = -ySpeed;
		}
		
	}
	
	public BouncingBall2() {
		setSize(WIDTH, HEIGHT);
		setTitle("Bouncing Ball1");
		setResizable(false);
		
		add(new MyPanel());
		Timer timer = new Timer(PERIOD, this);
		timer.start();
		
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		update();
		repaint();
	}
	
}

public class Example11_4_1 {

	public static void main(String[] args) {
		new BouncingBall2();
	}

}
