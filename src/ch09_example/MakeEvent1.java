//�̺�Ʈ Ŭ������ ���������� �����϶�.
package ch09_example;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

class EventTest1 implements ActionListener {

	@Override
	public void actionPerformed(ActionEvent e) {
		JButton button = (JButton) e.getSource();
		button.setText("��ư ����");
	}
	
}

public class MakeEvent1 extends JFrame {
	JButton button;
	
	public MakeEvent1 () {
		setTitle("MakeEvnet1");
		setSize(300, 200);
		setLayout(new FlowLayout());
		
		button = new JButton("��ư�� ����������.");
		button.setPreferredSize(new Dimension(150, 40));
		add(button);
		button.addActionListener(new EventTest1());
		
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	public static void main(String[] args) {
		MakeEvent1 f = new MakeEvent1();
	}

}
