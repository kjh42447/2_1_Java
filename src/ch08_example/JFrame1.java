//JFram�� �پ��� �޼ҵ���� �׽�Ʈ�϶�.
package ch08_example;

import java.awt.*;
import javax.swing.*;

public class JFrame1 extends JFrame {

	public JFrame1() {
		Toolkit kit = Toolkit.getDefaultToolkit();
		setSize(300, 200);
		setTitle("JFrame1");
		setResizable(true);
		setLayout(new FlowLayout());
		
		Dimension screen = kit.getScreenSize();
		setLocation(screen.width/2, screen.height/2);
		
		//����
		getContentPane().setBackground(Color.CYAN);
		
		//�޴�
		JMenuBar mb = new JMenuBar();
		setJMenuBar(mb);
		
		JMenu m1 = new JMenu("����");
		JMenu m2 = new JMenu("����");
		mb.add(m1);
		mb.add(m2);
		
		//���̺�
		JLabel label = new JLabel("�׽�Ʈ �������Դϴ� ");
		add(label);
		
		//��ư
		JButton button1 = new JButton("Ȯ��");
		JButton button2 = new JButton("���");
		add(button1);
		add(button2);
		
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		}
	
	public static void main(String[] args) {
		JFrame1 f = new JFrame1();
	}

}
