//피아노 건반을 절대 위치로 배치, GridLayout 2가지 방식을 이용하여 작성하라.
package ch08_example;

import java.awt.*;
import javax.swing.*;

class PianoBase extends JFrame{
	JPanel panel1, panel2;
	
	public PianoBase() {
		setTitle("Piano");
		setSize(600, 300);
		setLayout(new GridLayout(2, 0, 5, 5));
		
		panel1 = new JPanel();
		PianoGrid(panel1);
		add(panel1);
		
		panel2 = new JPanel();
		PianoAbsolute(panel2);
		add(panel2);
		
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	void PianoGrid(JPanel panel) {
		panel.setSize(600, 150);
		panel.setLayout(new GridLayout(0, 10, 5, 3));
		
		for(int i = 0; i < 10; i++) {
			JButton button = new JButton("C" + i);
			panel.add(button);
		}
	}
	
	void PianoAbsolute(JPanel panel) {
		panel.setSize(600, 130);
		panel.setLayout(null);
		
		for(int i = 0; i < 10; i++) {
			JButton button = new JButton("D" + i);
			button.setLocation(i*59, 0);
			button.setSize(53, 130);
			panel.add(button);
		}
	}
	
}

public class Example8_2_1 {

	public static void main(String[] args) {
		PianoBase f = new PianoBase();
	}

}
