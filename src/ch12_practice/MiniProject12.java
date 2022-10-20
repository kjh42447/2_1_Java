//미니 프로젝트
package ch12_practice;

import java.awt.*;
import java.awt.event.*;
import java.util.*;
import javax.swing.*;

class Monster12 implements ActionListener{
	int x, y, hp;
	Image img;
	
	public Monster12(int x, int y, int hp) {
		this.x = x;
		this.y = y;
		this.hp = hp;
		ImageIcon icon = new ImageIcon(".\\src\\image\\치즈피자.png");
		img = icon.getImage();
	}
	
	public void draw(Graphics g) {
		g.drawImage(img, x, y, null);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		
	}
	
}

class GameFrame12 extends JFrame {
	
	class MyPanel12 extends JPanel {
		ArrayList<Monster12> monsters = new ArrayList<Monster12>();
		
		public MyPanel12() {
			for(int i = 0; i < 10; i++) {
				int x = (int) (Math.random()*900);
				int y = (int) (Math.random()*700);
				
				monsters.add(new Monster12(x, y, 100));
			}
			repaint();
		}
		
		@Override
		public void paintComponent(Graphics g) {
			super.paintComponent(g);
			for(Monster12 m : monsters) {
				m.draw(g);
			}
		}
		
	}
	
	public GameFrame12() {
		setTitle("Monster Catch Game");
		setSize(1000, 800);
		
		add(new MyPanel12());
		
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
}

public class MiniProject12 {

	public static void main(String[] args) {
		GameFrame12 f = new GameFrame12();
	}

}
