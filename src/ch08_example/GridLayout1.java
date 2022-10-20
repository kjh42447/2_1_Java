//GridLayout 설정 시 행과 열을 버튼 갯수보다 크게 잡으면 어떻게 되는지 확인하라.
package ch08_example;

import java.awt.*;
import javax.swing.*;

class GridLayoutTest1 extends JFrame {
	
	public GridLayoutTest1() {
		setTitle("GridLayoutTest");
		setSize(300, 200);
		
		add(new JButton("Button1"));
		add(new JButton("Button2"));
		add(new JButton("Button3"));
		add(new JButton("B4"));
		add(new JButton("LongButton5"));
		
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
}

public class GridLayout1 {

	public static void main(String[] args) {
		GridLayoutTest1 f1 = new GridLayoutTest1();
		GridLayoutTest1 f2 = new GridLayoutTest1();
		GridLayoutTest1 f3 = new GridLayoutTest1();
		
		f1.setLayout(new GridLayout(7, 7, 1, 1));	
		f2.setLayout(new GridLayout(3, 7, 1, 1));
		f3.setLayout(new GridLayout(0, 7, 1, 1));
	}

}
