//복붙
package ch14_practice;

import java.awt.*;
import javax.swing.*;

public class Example14_2 extends JFrame {
	private JLabel label;
	
	class MyThread2 implements Runnable {
		@Override
		public void run() {
			for(int i = 10; i >= 0; i--) {
				try {
					Thread.sleep(1000);
				}
				catch (InterruptedException e) {
					e.printStackTrace();
				}
				
				label.setText(i + "");
			}
			
		}
		
	}
	
	public Example14_2() {
		setTitle("카운트다운");
		setSize(400, 150);
		
		label = new JLabel("Start");
		label.setFont(new Font("Serif", Font.BOLD, 100));
		add(label);
		
		Thread t1 = new Thread(new MyThread2());
		t1.start();
		
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	public static void main(String[] args) {
		Example14_2 f = new Example14_2();
	}

}
