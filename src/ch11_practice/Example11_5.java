//º¹ºÙ
package ch11_practice;

import java.awt.*;
import javax.swing.*;

class Slice_5 {
	double value;
	Color color;
	
	public Slice_5(double value, Color color) {
		this.value = value;
		this.color = color;
	}
	
}

class MyPanel_5 extends JPanel {
	Slice_5[] list = { new Slice_5(10, Color.RED), new Slice_5(20, Color.BLUE),
			new Slice_5(30, Color.orange), new Slice_5(40, Color.green) };
	
	public void paintComponent(Graphics g) {
		double total = 0.0D;
		for(Slice_5 s : list) {
			total += s.value;
		}
		
		double currValue = 0.0;
		int start = 0;
		for (Slice_5 s : list) {
			start = (int) (currValue * 360 / total);
			int angle = (int) (s.value * 360 / total);
			
			g.setColor(s.color);
			g.fillArc(100, 50, 200, 200, start, angle);
			currValue += s.value; 
		}
		
	}
	
}

public class Example11_5 extends JFrame {
	public Example11_5() {
		setSize(600, 300);
		setTitle("Pie Chart");
		
		add(new MyPanel_5());
		
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

	public static void main(String[] args) {
		Example11_5 f = new Example11_5();
	}

}
