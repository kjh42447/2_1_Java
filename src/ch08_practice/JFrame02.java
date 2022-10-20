//ppt��
package ch08_practice;

import java.awt.*;
import javax.swing.*;

public class JFrame02 extends JFrame {

	public JFrame02() {
		//��Ŷ
		Toolkit kit = Toolkit.getDefaultToolkit();		
		
		//ũ�� �ڵ� ����
		//pack();			//�ʹ� ������?
		
		setSize(300, 200);
		
		//��ũ�� ũ�� ��������
		Dimension screen = kit.getScreenSize();			
		
		//��ġ
		setLocation(screen.width/2, screen.height/2);		
		
		//�̹��� �������� & ������ ����
		Image img = kit.getImage("E:\\����\\2�г�\\1�б�\\��ü�������α׷���\\image");
		setIconImage(img);
		
		//���̾ƿ� ����
		setLayout(new FlowLayout());
		
		//����
		getContentPane().setBackground(Color.DARK_GRAY);
		
		//��ư
		JButton button = new JButton("��ư");
		add(button);
		
		//�޴���
		JMenuBar mb = new JMenuBar();
		setJMenuBar(mb);
		
		//�޴�
		JMenu m = new JMenu("����");
		mb.add(m);
		
		//������ ũ�⺯�� ���ɿ���
		setResizable(true);
		
		//ȭ�鿡 ǥ��
		setVisible(true);								
		
		//â ����� ���μ��� ���� ����
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);	
	}
	
	
	public static void main(String[] args) {
		JFrame02 f1 = new JFrame02();
		//JFrame02 f2 = new JFrame02();
	}

}
