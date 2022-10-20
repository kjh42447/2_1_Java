//��ư�� ũ�⸦ �ٲ㰡�� FlowLayout ��ġ�� Ư¡�� Ȯ���϶�.
package ch08_example;

import java.awt.*;
import javax.swing.*;

class FlowLayout2_Base extends JFrame {
	Toolkit kit = Toolkit.getDefaultToolkit();
	Dimension screen = kit.getScreenSize();
	
	public FlowLayout2_Base() {
		JMenuBar mb = new JMenuBar();
		setJMenuBar(mb);
		setLayout(new FlowLayout());
		
		mb.add(new JMenu("����"));
		mb.add(new JMenu("����"));
		mb.add(new JMenu("����"));
		mb.add(new JMenu("����"));
		
		setVisible(true);
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
	}
	
}

class FLLargeButton extends FlowLayout2_Base {
	
	public FLLargeButton() {
		super();
		setSize(300, 350);
		setTitle("LargeButton");
		setLocation(0, 0);
		
		JButton[] b = new JButton[5];
		for(int i = 0; i < 5; i++) {
			b[i] = new JButton("ū ��ư");
			b[i].setPreferredSize(new Dimension(200, 50));		//FlowLayout���� ��ư ũ�⺯��޼ҵ�
			add(b[i]);
		}
	}
	
}

class FLMiddleButton extends FlowLayout2_Base {
	
	public FLMiddleButton() {
		super();
		setSize(300, 250);
		setTitle("MiddleButton");
		setLocation(0, screen.height/3);
		
		JButton[] b = new JButton[5];
		for(int i = 0; i < 5; i++) {
			b[i] = new JButton("�߰� ��ư");
			b[i].setPreferredSize(new Dimension(120, 50));
			add(b[i]);
		}
	}
	
}

class FLSmallButton extends FlowLayout2_Base {
	
	public FLSmallButton() {
		super();
		setSize(300, 200);
		setTitle("SmallButton");
		setLocation(0, screen.height/3*2);
		
		JButton[] b = new JButton[5];
		for(int i = 0; i < 5; i++) {
			b[i] = new JButton("���� ��ư");
			b[i].setPreferredSize(new Dimension(80, 50));
			add(b[i]);
		}
	}
	
}

public class FlowLayout2 {

	public static void main(String[] args) {
		FLLargeButton f1 = new FLLargeButton();
		FLMiddleButton f2 = new FLMiddleButton();
		FLSmallButton f3 = new FLSmallButton();
	}

}
