//����
package ch09_practice;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

class MyListener1_1 implements ActionListener {
	
	public void actionPerformed(ActionEvent e) {
		JButton button = (JButton) e.getSource();
		button.setText("��ư ����");
	}
	
}

public class MakeEvent1 extends JFrame {
	JButton button;
	
	public MakeEvent1 () {
		setSize(300, 200);
		
		button = new JButton("��ư�� ����������.");
		add(button);
		button.addActionListener(new MyListener1_1());
		
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	public static void main(String[] args) {
		MakeEvent1 f = new MakeEvent1();
	}

}
