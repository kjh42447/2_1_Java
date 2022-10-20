//FlowLayout�� ���Ĺ�ĺ��� �������� ������.
package ch08_example;

import java.awt.*;
import javax.swing.*;

class FlowLayout1_Base extends JFrame {
	Toolkit kit = Toolkit.getDefaultToolkit();
	Dimension screen = kit.getScreenSize();
	
	public FlowLayout1_Base() {
		JMenuBar mb = new JMenuBar();
		setJMenuBar(mb);
		setSize(300, 200);
		
		mb.add(new JMenu("����"));
		mb.add(new JMenu("����"));
		mb.add(new JMenu("����"));
		mb.add(new JMenu("����"));
		
		add(new JButton("Button1"));
		add(new JButton("Button2"));
		add(new JButton("Button3"));
		add(new JButton("Button4"));
		add(new JButton("Button5"));
		
		setVisible(true);
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
	}
	
}

class FLLeading1 extends FlowLayout1_Base {
	
	public FLLeading1() {
		super();
		setTitle("LEADING");
		setLocation(0, 0);
		
		setLayout(new FlowLayout(FlowLayout.LEADING));
	}
	
}

class FLCenter1 extends FlowLayout1_Base {
	
	public FLCenter1() {
		super();
		setTitle("CENTER");
		setLocation(0, screen.height/3);
		
		setLayout(new FlowLayout(FlowLayout.CENTER));
	}
	
}

class FLTrailing1 extends FlowLayout1_Base {
	
	public FLTrailing1() {
		super();
		setTitle("TRAILING");
		setLocation(0, screen.height/3*2);
		
		setLayout(new FlowLayout(FlowLayout.TRAILING));
	}
	
}

public class FlowLayout1 {

	public static void main(String[] args) {
		FLLeading1 f1 = new FLLeading1();
		FLCenter1 f2 = new FLCenter1();
		FLTrailing1 f3 = new FLTrailing1();
	}

}
