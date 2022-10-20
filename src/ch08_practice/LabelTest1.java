//ppt
package ch08_practice;

import java.awt.*;
import javax.swing.*;

public class LabelTest1 extends JFrame {

	public LabelTest1() {
		setSize(300, 200);
		setTitle("LableTest1");
		
		JPanel panel = new JPanel();
		JLabel label = new JLabel("안녕하세요?");
		JButton button = new JButton("버튼");
		panel.add(label);
		panel.add(button);
		add(panel);
		
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	public static void main(String[] args) {
		LabelTest1 f = new LabelTest1();
	}

}
