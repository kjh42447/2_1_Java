//MiniProject8_1�� ���⸦ �����϶�. �ִ��� ������ ����ϰ� �����϶�.
package ch08_example;

import java.awt.*;
import javax.swing.*;

public class Miniproject8_2 extends JFrame {
	private JPanel defaultpanel = new JPanel();
	private JPanel panel = new JPanel();
	private JPanel textpanel = new JPanel();
	private JButton[] buttons;
	
	private String[] labels = {
			"Backspace", "", "", "CE", "C", "7", "8", "9", "/", "sqrt", "4", "5", "6", "x", "%",
			"1", "2", "3", "-", "1/x", "0", "+/-", ".", "+", "="
	};
	
	//������
	public Miniproject8_2() {
		defaultpanel.setLayout(new BoxLayout(defaultpanel, BoxLayout.Y_AXIS));
		defaultpanel.setPreferredSize(new Dimension(800, 200));
		defaultpanel.add(Box.createVerticalStrut(2));
		
		//�ؽ�Ʈ�ʵ�
		JTextField textfield = new JTextField("0.");
		textfield.setForeground(Color.GRAY);
		textfield.setPreferredSize(new Dimension(800, 20));
		defaultpanel.add(textfield);
		
		//��ư
		panel.setLayout(new GridLayout(0, 5, 3, 3));
		buttons = new JButton[25];
		int index = 0;
		for(int rows = 0; rows < 5; rows++) {
			for(int cols = 0; cols < 5; cols++) {
				buttons[index] = new JButton(labels[index]);
				
				//��ư ��
				buttons[index].setBackground(new Color(201, 255, 0));
				if(cols >= 3) {
					buttons[index].setForeground(Color.RED);
				}
				
				panel.add(buttons[index]);
				index++;
			}
		}
		
		//ũ�⼳��
		panel.setPreferredSize(new Dimension(800, 180));
		defaultpanel.add(panel);
		add(defaultpanel);
		pack();
		
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	public static void main(String[] args) {
		Miniproject8_2 f = new Miniproject8_2();
	}

}
