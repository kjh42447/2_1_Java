//���̺� �̹����� �߰��϶�. ���� �̹����� ����ּҿ� �����ּҸ� �̿��Ͽ� �����Ͷ�. 
package ch10_example;

import java.awt.*;
import javax.swing.*;

public class Example10_2_1 extends JFrame {
	private JPanel panel = new JPanel();
	private JLabel label1, label2;
	
	public Example10_2_1() {
		setTitle("Example10_2_1");
		setResizable(false);
		
		ImageIcon icon1 = new ImageIcon("E:\\����\\2�г�\\1�б�\\��ü�������α׷���\\�ǽ�\\src\\image\\�Ұ������.png");
		Image img1 = icon1.getImage();
		ImageIcon icon2 = new ImageIcon(".\\src\\image\\�Ұ������.png");
		Image img2 = icon2.getImage();
		
		label1 = new JLabel();
		label1.setIcon(new ImageIcon(img1.getScaledInstance(200, 200, Image.SCALE_SMOOTH)));
		label2 = new JLabel();
		label2.setIcon(new ImageIcon(img2.getScaledInstance(200, 200, Image.SCALE_SMOOTH)));
		
		panel.add(label1);
		panel.add(label2);
		add(panel);
		
		pack();
		
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	public static void main(String[] args) {
		Example10_2_1 f = new Example10_2_1();
	}

}
