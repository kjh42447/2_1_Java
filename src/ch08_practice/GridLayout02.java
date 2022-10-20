//실험
package ch08_practice;

import java.awt.*;
import javax.swing.*;

public class GridLayout02 extends JFrame {

	public GridLayout02() {
		setTitle("GridLayoutTest");
		setSize(300, 200);
		setLayout(new GridLayout(2, 5, 1, 1));	//행 먼저 조건 맞춤
		
		add(new JButton("Button1"));
		add(new JButton("Button2"));
		add(new JButton("Button3"));
		add(new JButton("B4"));
		add(new JButton("LongButton5"));
		
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	public static void main(String[] args) {
		GridLayout02 f = new GridLayout02();
	}

}
