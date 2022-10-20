//ch6 mini게임
package ch09_example;

import java.awt.*;
import java.awt.event.*;
import java.util.Scanner;
import javax.swing.*;

abstract class Sprite2{
	protected int x = 3, y = 3;
	protected String icon;
	
	abstract void move(int keyCode);
}

//플레이어
class Player2 extends Sprite2{
	
	public Player2() {
		icon = "P";
	}
	void move(int keyCode) {
		if (keyCode == KeyEvent.VK_LEFT && x > 0)	--x;
		else if (keyCode == KeyEvent.VK_DOWN && y < 19)	++y;
		else if (keyCode == KeyEvent.VK_UP && y > 0)	--y;
		else if (keyCode == KeyEvent.VK_RIGHT && x < 19)	++x;
	}
}

//몬스터
class Monster2 extends Sprite2{
	public Monster2() {
		x = y = 7;
		icon = "M";
	}
	
	void move(int keyCode) {
		if(((Math.random()-0.5))>0) {
			if (x > 0)	--x;
		}
		else {
			if (x < 19)	++x;
		}
		
		if(((Math.random()-0.5)>0)) {
			if (y > 0)	--y;
		}
		else {
			if(y < 19)	++y;
		}
	}	
}

//골드
class Gold2 extends Sprite2{
	
	public Gold2() {
		x = 13;
		y = 17;
		icon = "G";
	}
	void move(int keyCode)	{}
}

class GetGoldGame extends JFrame {
	private JPanel panel = new JPanel();
	private Player2 player = new Player2();
	private Monster2 monster = new Monster2();
	private Gold2 gold = new Gold2();
	private JLabel p, m, g;
	
	//생성자
	public GetGoldGame() {
		setTitle("GettingGold");
		setSize(600, 630);
		
		panel.setLayout(null);
		
		p = new JLabel(player.icon);
		m = new JLabel(monster.icon);
		g = new JLabel(gold.icon);
		
		p.setSize(30, 30);
		m.setSize(30, 30);
		g.setSize(30, 30);
		
		panel.add(p);
		panel.add(m);
		panel.add(g);
		
		display();
		
		panel.requestFocus();
		panel.setFocusable(true);
		panel.addKeyListener(new KeyListener() {
			@Override
			public void keyTyped(KeyEvent e) {		}
			@Override
			public void keyReleased(KeyEvent e) {		}
			@Override
			public void keyPressed(KeyEvent e) {
				int keyCode = e.getKeyCode();
				player.move(keyCode);
				monster.move(keyCode);
				display();
				victoryOrDefeat();
			}
			
		});
		add(panel);
		
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
		
	//출력
	void display() {
		p.setLocation(player.x*30, player.y*30);
		m.setLocation(monster.x*30, monster.y*30);
		g.setLocation(gold.x*30, gold.y*30);
	}
	
	//승패확인
	
	void victoryOrDefeat() {
		if(player.x == gold.x && player.y == gold.y) {
			VictoryFrameG f = new VictoryFrameG();
		}
		else if(player.x == monster.x && player.y == monster.y) {
			DefeatFrameG f = new DefeatFrameG();
		}
	}
	
}

//패배
class DefeatFrameG extends JFrame{
	
	public DefeatFrameG() {
		setSize(50, 100);
		JLabel label = new JLabel("패배");
		setLayout(new FlowLayout());
		add(label);
		
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
}

//승리
class VictoryFrameG extends JFrame{
	
	public VictoryFrameG() {
		setSize(50, 100);
		JLabel label = new JLabel("승리");
		setLayout(new FlowLayout());
		add(label);
		
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
}

public class Example9_4_2 {

	public static void main(String[] args) {
		GetGoldGame f = new GetGoldGame();
	}

}
