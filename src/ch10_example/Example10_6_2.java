//Example10_6_1�� �̺�Ʈ�� ����Ŭ������ �ۼ��϶�
package ch10_example;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

class ShowPizza2 extends JFrame{
	private JPanel buttonPanel = new JPanel();
	private JPanel imagePanel = new JPanel();
	private JRadioButton cheeseButton, combinationButton, potatoButton, bulgogiButton;
	private JLabel imageLabel = new JLabel();
	
	public ShowPizza2() {
		setTitle("Show Pizza");
		setSize(300, 250);
		
		//��ư �г�
		buttonPanel.setLayout(new GridLayout(0, 1));
		ButtonGroup bg = new ButtonGroup();
		cheeseButton = new JRadioButton("ġ������");
		combinationButton = new JRadioButton("�޺���̼�����");
		potatoButton = new JRadioButton("������������");
		bulgogiButton = new JRadioButton("�Ұ������");
		
		cheeseButton.addActionListener(new PizzaEvent());
		combinationButton.addActionListener(new PizzaEvent());
		potatoButton.addActionListener(new PizzaEvent());
		bulgogiButton.addActionListener(new PizzaEvent());
		
		buttonPanel.add(cheeseButton);
		bg.add(cheeseButton);
		buttonPanel.add(combinationButton);
		bg.add(combinationButton);
		buttonPanel.add(potatoButton);
		bg.add(potatoButton);
		buttonPanel.add(bulgogiButton);
		bg.add(bulgogiButton);
		
		//�̹��� �г�
		imagePanel.setLayout(null);
		imageLabel.setBounds(20, 45, 180, 100);
		imagePanel.add(imageLabel);
		
		add(buttonPanel, BorderLayout.WEST);
		add(imagePanel);
		
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

	class PizzaEvent implements ActionListener {
		@Override
		public void actionPerformed(ActionEvent e) {
			JRadioButton cb = (JRadioButton) e.getSource();
			ImageIcon icon = new ImageIcon(".\\src\\image\\" + cb.getText() + ".png");
			imageLabel.setIcon(icon);
		}
	}
	
}

public class Example10_6_2 {

	public static void main(String[] args) {
		new ShowPizza2();
	}

}
