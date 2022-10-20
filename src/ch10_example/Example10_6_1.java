//üũ�� ��ư�� �ش��ϴ� �̹����� ����϶�.
package ch10_example;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

class ShowPizza1 extends JFrame{
	private JPanel buttonPanel = new JPanel();
	private JPanel imagePanel = new JPanel();
	private JRadioButton cheeseButton, combinationButton, potatoButton, bulgogiButton;
	private JLabel imageLabel = new JLabel();
	
	//�̹���
	ImageIcon cheese = new ImageIcon(".\\src\\image\\ġ������.png");
	ImageIcon combination = new ImageIcon(".\\src\\image\\�޺���̼�����.png");
	ImageIcon potato = new ImageIcon(".\\src\\image\\������������.png");
	ImageIcon bulgogi = new ImageIcon(".\\src\\image\\�Ұ������.png");
	
	public ShowPizza1() {
		setTitle("Show Pizza");
		setSize(300, 250);
		
		//��ư �г�
		buttonPanel.setLayout(new GridLayout(0, 1));
		ButtonGroup bg = new ButtonGroup();
		cheeseButton = new JRadioButton("Cheese");
		combinationButton = new JRadioButton("combination");
		potatoButton = new JRadioButton("potato");
		bulgogiButton = new JRadioButton("bulgogi");
		
		cheeseButton.addActionListener(e -> {
			imageLabel.setIcon(cheese);
		});
		combinationButton.addActionListener(e -> {
			imageLabel.setIcon(combination);
		});
		potatoButton.addActionListener(e -> {
			imageLabel.setIcon(potato);
		});
		bulgogiButton.addActionListener(e -> {
			imageLabel.setIcon(bulgogi);
		});
		
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

	
}

public class Example10_6_1 {

	public static void main(String[] args) {
		new ShowPizza1();
	}

}
