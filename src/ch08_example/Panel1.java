//하나의 프레임에 2개의 패널을 만들고 여러 메소드들을 테스트하라.
package ch08_example;

import java.awt.*;
import javax.swing.*;

public class Panel1 extends JFrame {
	JButton b1;
	JButton b2;
	
	public Panel1() {
		JPanel panel1 = new JPanel();
		JPanel panel2 = new JPanel();
		setLayout(new GridLayout(2, 0));
		
		panel1.setBackground(Color.orange);
		panel1.setLayout(new BoxLayout(panel1, BoxLayout.Y_AXIS));
		addButton(panel1);
		add(panel1);
		
		panel2.setBackground(Color.MAGENTA);
		panel2.setToolTipText("ToolTipTextTest");
		addButton(panel2);
		panel2.remove(b2);
		add(panel2);
		
		setSize(300, 200);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	void addButton(JPanel panel) {	
		b1 = new JButton("Button 1");
		b2 = new JButton("Button 2");
		
		b1.setToolTipText("button 1");
		b1.setBackground(Color.yellow);
		b1.setAlignmentX(Component.CENTER_ALIGNMENT);
		
		b2.setToolTipText("button 2");
		b2.setBackground(Color.green);
		b2.setAlignmentX(Component.CENTER_ALIGNMENT);
		
		panel.add(b1);
		panel.add(b2);
	}
	
	public static void main(String[] args) {
		Panel1 f = new Panel1();
	}

}
