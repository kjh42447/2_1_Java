//복붙
package ch14_practice;

import javax.swing.*;

public class Example14_3 extends JFrame {
	
	class MyThread3 implements Runnable {
		private JLabel label;
		private int x, y;
		
		public MyThread3(String fname, int x, int y) {
			this.x = x;
			this.y = y;
			label = new JLabel();
			label.setIcon(new ImageIcon(".\\src\\image\\" + fname));
			label.setBounds(x, y, 100, 100);
			add(label);
			
		}
		
		@Override
		public void run() {
			for(int i = 0; i < 200; i++) {
				x += 10 * Math.random();
				label.setBounds(x, y, 100, 100);
				repaint();
				
				try {
					Thread.sleep(100);
				}
				catch(InterruptedException e) {
					e.printStackTrace();
				}
				
			}
			
		}
		
	}
	
	public Example14_3() {
		setTitle("Pizza Race");
		setSize(700, 400);
		
		Thread t1 = new Thread(new MyThread3("치즈피자.png", 100, 0));
		Thread t2 = new Thread(new MyThread3("콤비네이션피자.png", 100, 120));
		Thread t3 = new Thread(new MyThread3("포테이토피자.png", 100, 240));
		
		t1.start();
		t2.start();
		t3.start();
		
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	public static void main(String[] args) {
		new Example14_3();
	}

}
