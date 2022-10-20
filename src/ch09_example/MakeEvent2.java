//이벤트 클래스를 내부클래스로 작성하라.
package ch09_example;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class MakeEvent2 extends JFrame {
	JButton button;
	
	class EventTest2 implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {
			button.setText("버튼 눌림");
		}
	}
		
	public MakeEvent2 () {
		setTitle("MakeEvent2");
		setSize(300, 200);
		setLayout(new FlowLayout());
		
		button = new JButton("버튼을 눌러보세요.");
		button.setPreferredSize(new Dimension(150, 40));
		add(button);
		button.addActionListener(new EventTest1());
		
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
		
	
	public static void main(String[] args) {
		MakeEvent2 f = new MakeEvent2();
	}

}
