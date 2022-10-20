//��ư�� ������ �ش� ������ ���� ���α׷��� �ۼ��϶�.
package ch10_example;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

class ImageLabelButton extends JFrame {
	private JPanel imagePanel, buttonPanel;
	private JButton b1, b2, b3, b4;
	private JLabel imageLabel;
	
	public ImageLabelButton() {
		setTitle("Example10_2_2");
		setSize(500, 200);
		setResizable(false);
		setLayout(new FlowLayout());
		
		ImageIcon icon1 = new ImageIcon(".\\src\\image\\ġ������.png");
		ImageIcon icon2 = new ImageIcon(".\\src\\image\\�Ұ������.png");
		ImageIcon icon3 = new ImageIcon(".\\src\\image\\������������.png");
		ImageIcon icon4 = new ImageIcon(".\\src\\image\\�޺���̼�����.png");
		
		imagePanel = new JPanel();
		imageLabel = new JLabel();
		imageLabel.setIcon(icon1);
		imagePanel.add(imageLabel);
		add(imagePanel);
		
		buttonPanel = new JPanel();
		b1 = new JButton("ġ������");
		b1.requestFocus();
		b1.setFocusable(true);
		b1.addActionListener(e -> {
			imageLabel.setIcon(icon1);
		});
		buttonPanel.add(b1);
		
		b2 = new JButton("�Ұ������");
		b2.requestFocus();
		b2.setFocusable(true);
		b2.addActionListener(e -> {
			imageLabel.setIcon(icon2);
		});
		buttonPanel.add(b2);
		
		b3 = new JButton("������������");
		b3.requestFocus();
		b3.setFocusable(true);
		b3.addActionListener(e -> {
			imageLabel.setIcon(icon3);
		});
		buttonPanel.add(b3);
		
		b4 = new JButton("�޺���̼�����");
		b4.requestFocus();
		b4.setFocusable(true);
		b4.addActionListener(e -> {
			imageLabel.setIcon(icon4);
		});
		buttonPanel.add(b4);
		add(buttonPanel);
		
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
}

public class Example10_2_2{
	
	public static void main(String[] args) {
		ImageLabelButton f = new ImageLabelButton();
	}

}
