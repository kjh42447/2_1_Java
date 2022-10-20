//기본
package ch11_practice;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

class MyPanelMini extends JPanel implements ActionListener {
	int light_number = 0;
	Color[] colorList = { Color.red, Color.orange, Color.green };
	
	public MyPanelMini() {
		setLayout(new BorderLayout());
		JButton b = new JButton("신호 변경");
		b.addActionListener(this);
		add(b, BorderLayout.SOUTH);
	}
	
	@Override
	protected void paintComponent(Graphics g) {
		super.paintComponent(g);
		g.drawOval(90, 10, 100, 100);
		g.drawOval(190, 10, 100, 100);
		g.drawOval(290, 10, 100, 100);
		g.setColor(colorList[light_number]);
		g.fillOval(90+light_number*100, 10, 100, 100);
	}
	
	@Override
	public void actionPerformed(ActionEvent arg0) {
		if(++light_number >= 3)
			light_number = 0;
		repaint();
	}
	
}

class TrafficLightFrame extends JFrame {
	
	public TrafficLightFrame() {
		setTitle("Traffic Light");
		setSize(500, 200);
		
		add(new MyPanelMini());
		
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}

public class MiniProject11 {

	public static void main(String[] args) {
		new TrafficLightFrame();
	}

}
