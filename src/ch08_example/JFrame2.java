//JFrame�� �޼ҵ带 �̿��Ͽ� �⺻ �������� �����ϰ� ���� �������� �����϶�.
package ch08_example;

import java.awt.*;
import javax.swing.*;

class JFrame2_Base extends JFrame{
	Toolkit kit = Toolkit.getDefaultToolkit();
	Dimension screen = kit.getScreenSize();
	
	public JFrame2_Base() {
		
		setSize(300, 200);
		setResizable(true);
		setLayout(new FlowLayout());
		
		//�޴�
		JMenuBar mb = new JMenuBar();
		setJMenuBar(mb);
		
		JMenu m1 = new JMenu("����");
		JMenu m2 = new JMenu("����");
		JMenu m3 = new JMenu("����");
		mb.add(m1);
		mb.add(m2);
		mb.add(m3);
		
		setVisible(true);
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
	}
	
}

class JFrame2_1 extends JFrame2_Base{
	
	public JFrame2_1() {
		super();
		setTitle("1�� ���");
		
		setLocation(0, 0);
		
		getContentPane().setBackground(Color.CYAN);
		
		JButton button1 = new JButton("Ȯ��");
		JButton button2 = new JButton("���");
		add(button1);
		add(button2);
	}
	
}

class JFrame2_2 extends JFrame2_Base{
	
	public JFrame2_2() {
		super();
		setTitle("2�� ���");
		
		setLocation(0, screen.height/3);
		
		getContentPane().setBackground(Color.LIGHT_GRAY);
		
		add(new Label("2�� ����Դϴ�."));
	}
	
}

class JFrame2_3 extends JFrame2_Base{
	
	public JFrame2_3() {
		super();
		setTitle("3�� ���");
		setLocation(0, screen.height/3*2);
		
		getContentPane().setBackground(Color.WHITE);
		
		JMenuBar mb = new JMenuBar();
		setJMenuBar(mb);
		
		JMenu m1 = new JMenu("����");
		JMenu m2 = new JMenu("����");
		JMenu m3 = new JMenu("����");
		JMenu m4 = new JMenu("����");
		mb.add(m1);
		mb.add(m2);
		mb.add(m3);
		mb.add(m4);
		
		JButton button1 = new JButton("Ȯ��");
		add(button1);
	}
	
}

public class JFrame2{

	public static void main(String[] args) {
		JFrame2_1 f1 = new JFrame2_1();
		JFrame2_2 f2 = new JFrame2_2();
		JFrame2_3 f3 = new JFrame2_3();
	}

}
