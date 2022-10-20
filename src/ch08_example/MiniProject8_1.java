//간단한 계산기 프레임을 작성하라.
package ch08_example;

import java.awt.*;
import javax.swing.*;

public class MiniProject8_1 extends JFrame {
	private JPanel panel = new JPanel();
	private JPanel textpanel = new JPanel();
	private JButton[] buttons;
	
	private String[] labels = {
			"Backspace", "", "", "CE", "C", "7", "8", "9", "/", "sqrt", "4", "5", "6", "x", "%",
			"1", "2", "3", "-", "1/x", "0", "+/-", ".", "+", "="
	};
	
	public MiniProject8_1() {
		setLayout(new BoxLayout(getContentPane(), BoxLayout.Y_AXIS));
		JTextField textfield = new JTextField("0.");
		textfield.setPreferredSize(new Dimension(800, 25));
		add(textfield);
		
		panel.setLayout(new GridLayout(0, 5, 3, 3));
		buttons = new JButton[25];
		int index = 0;
		for(int rows = 0; rows < 5; rows++) {
			for(int cols = 0; cols < 5; cols++) {
				buttons[index] = new JButton(labels[index]);
				panel.add(buttons[index]);
				index++;
			}
		}
		
		add(panel);
		pack();
		
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	public static void main(String[] args) {
		MiniProject8_1 f = new MiniProject8_1();
	}

}
