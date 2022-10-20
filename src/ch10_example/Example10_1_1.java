//폰트 스타일별로 사용하라.
package ch10_example;

import java.awt.*;
import javax.swing.*;

public class Example10_1_1 extends JFrame {
	private JPanel panel = new JPanel();
	private JLabel labelb, labeli, labelp, labelbi, labelbp, labelip, labelbip;
	
	public Example10_1_1() {
		setTitle("Example10_1_1");
		setSize(300, 500);
		panel.setLayout(new GridLayout(0, 1));
		
		labelb = new JLabel("BOLD");
		labeli = new JLabel("ITALIC");
		labelp = new JLabel("PLAIN");
		labelbi = new JLabel("BOLD+ITALIC");
		labelbp = new JLabel("BOLD+PLAIN");
		labelip = new JLabel("ITALIC+PLAIN");
		labelbip = new JLabel("BOLD+ITALIC+PLAIN");
		labelb.setFont(new Font("Serif", Font.BOLD, 20));
		labeli.setFont(new Font("Serif", Font.ITALIC, 20));
		labelp.setFont(new Font("Serif", Font.PLAIN, 20));
		labelbi.setFont(new Font("Serif", Font.BOLD+Font.ITALIC, 20));
		labelbp.setFont(new Font("Serif", Font.BOLD+Font.PLAIN, 20));
		labelip.setFont(new Font("Serif", Font.ITALIC+Font.PLAIN, 20));
		labelbip.setFont(new Font("Serif", Font.BOLD+Font.ITALIC+Font.PLAIN, 20));
		panel.add(labelb);
		panel.add(labeli);
		panel.add(labelp);
		panel.add(labelbi);
		panel.add(labelbp);
		panel.add(labelip);
		panel.add(labelbip);
		add(panel);
		
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	public static void main(String[] args) {
		Example10_1_1 f = new Example10_1_1();
	}

}
