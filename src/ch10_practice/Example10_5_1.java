//일단은 복붙
package ch10_practice;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Example10_5_1 extends JFrame {
	
	public Example10_5_1() {
		setTitle("CheckBox Test");
		setSize(500,  150);
		
		JPanel panel = new JPanel();
		add(panel);
		
		JCheckBox checkbox1 = new JCheckBox("사과");
		JCheckBox checkbox2 = new JCheckBox("바나나");
		JCheckBox checkbox3 = new JCheckBox("포도");
		JCheckBox checkbox4 = new JCheckBox("오렌지");
		JCheckBox checkbox5 = new JCheckBox("배");
		
		panel.setBorder(BorderFactory.createTitledBorder("과일"));
		
		panel.add(checkbox1);
		panel.add(checkbox2);
		panel.add(checkbox3);
		panel.add(checkbox4);
		panel.add(checkbox5);
		
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	public static void main(String[] args) {
		new Example10_5_1();
	}

}
