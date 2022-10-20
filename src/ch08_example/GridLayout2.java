//버튼을 GridLayout, BoxLayout으로 정렬한 프레임들을 출력하라.
package ch08_example;

import java.awt.*;
import javax.swing.*;

class LayoutBase extends JFrame {
	Toolkit kit = Toolkit.getDefaultToolkit();
	Dimension screen = kit.getScreenSize();
	
	public LayoutBase() {
		setSize(300, 200);
		
		JMenuBar mb = new JMenuBar();
		setJMenuBar(mb);
		
		JMenu m1 = new JMenu("파일");
		JMenu m2 = new JMenu("편집");
		JMenu m3 = new JMenu("설정");
		mb.add(m1);
		mb.add(m2);
		mb.add(m3);
		
		setVisible(true);
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
	}
}

class GridLayoutTest extends LayoutBase {
	
	public GridLayoutTest() {
		super();
		JButton[] b = new JButton[5];
		
		setTitle("GridLayout");
		setLocation(0, 0);
		setLayout(new GridLayout(0, 3, 1, 1));
		for(int i = 0; i < 5; i++) {
			b[i] = new JButton("버튼" + (i+1));
			add(b[i]);
		}
		
	}
	
}

class BoxLayoutTest extends LayoutBase {
	
	public BoxLayoutTest() {
		super();
		JButton[] b = new JButton[5];
		
		setTitle("BoxLayout");
		setLocation(0, screen.height/3);
		JPanel panel = new JPanel();
		panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));
		for(int i = 0; i < 5; i++) {
			b[i] = new JButton("버튼" + (i+1));
			b[i].setAlignmentX(Component.CENTER_ALIGNMENT);
			panel.add(b[i]);
		}
		add(panel);
	}
	
}

public class GridLayout2{
	
	public static void main(String[] args) {
		GridLayoutTest f1 = new GridLayoutTest();
		BoxLayoutTest f2 = new BoxLayoutTest();
	}

}
