//게임 2048을 작성하라.
package ch09_example;

import java.awt.*;
import java.awt.event.*;
import java.util.*;
import javax.swing.*;

class Game2048 extends JFrame {
	private JPanel panel = new JPanel();
	private Random random = new Random();
	private JButton[][] button = new JButton[4][4];
	private int[][] num = new int[4][4];
	private boolean checkDefeatGame = false, checkVictoryGame = false, firstClear = true;
	private Color[] buttonColor = { Color.CYAN, Color.MAGENTA, Color.ORANGE, Color.PINK, 
			Color.WHITE, Color.YELLOW, Color.BLUE, Color.GRAY, Color.DARK_GRAY, Color.BLACK};
	
	//생성자
	public Game2048() {
		setTitle("Game 2048");
		setSize(500, 500);
		
		//버튼
		panel.setLayout(new GridLayout(4, 4, 10, 10));
		for(int i = 0; i < 4; i++) {
			for(int j = 0; j < 4; j++) {
				num[i][j] = 0;
				button[i][j] = new JButton("");
				button[i][j].setFont(new Font("SansSerif", Font.BOLD, 20));
				panel.add(button[i][j]);
			}
		}
		addNum();
		addNum();
		display();
		
		//방향키 입력
		panel.requestFocus();
		panel.setFocusable(true);
		panel.addKeyListener(new KeyListener() {
			@Override
			public void keyPressed(KeyEvent e) {	}
			@Override
			public void keyTyped(KeyEvent e) {		}
			@Override
			public void keyReleased(KeyEvent e) {
				int keycode = e.getKeyCode();
				if(keycode == KeyEvent.VK_UP) {
					moveUp();
					sumUp();
					moveUp();
					addNum();
				}
				if(keycode == KeyEvent.VK_DOWN) {
					moveDown();
					sumDown();
					moveDown();
					addNum();
				}
				if(keycode == KeyEvent.VK_LEFT) {
					moveLeft();
					sumLeft();
					moveLeft();
					addNum();
				}
				if(keycode == KeyEvent.VK_RIGHT) {
					moveRight();
					sumRight();
					moveRight();
					addNum();
				}
				
				checkVictoryAndDefeat();
				
				if(checkDefeatGame) {
					DefeatFrame df = new DefeatFrame();
					checkDefeatGame = false;
				}
				if(checkVictoryGame && firstClear) {
					VictoryFrame vf = new VictoryFrame();
					firstClear = false;
				}
				
				display();
			}
			
		});
		add(panel);
		
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	//숫자 생성
	void addNum() {
		boolean finAdd = false, noEmpty = true;
		boolean[] checkNotEmpty = new boolean[16];
		while(!finAdd) {
			int x = random.nextInt(4);
			int y = random.nextInt(4);
			
			if(num[x][y] == 0) {
				num[x][y] = (random.nextInt(8) == 3) ? 4 : 2;
				finAdd = true;
			}
			
			else {
				checkNotEmpty[x*4 + y] = true;
			}
			
			for(int i = 0; i < 16; i++) 
				if(checkNotEmpty[i] == false) {
					noEmpty = false;
					break;
				}
			
			if(noEmpty) {
				break;
			}
			
		}
		
	}
	
	//이동 메소드, 합 메소드
	void sumUp() {
		for(int i = 0; i < 3; i++) {
			for(int j = 0; j < 4; j++) {
				if(num[i][j] == num[i+1][j]) {
					num[i][j] += num[i+1][j];
					num[i+1][j] = 0;
				}
			}
		}
	}
	void moveUp() {
		for(int i = 2; i >= 0; i--) {
			for(int j = 0; j < 4; j++) {
				if(num[i][j] == 0) {
					for(int k = i; k < 3; k++) {
						num[k][j] = num[k+1][j];
						num[k+1][j] = 0;
					}
				}
			}
		}
	}
	
	void sumDown() {
		for(int i = 3; i > 0; i--) {
			for(int j = 0; j < 4; j++) {
				if(num[i][j] == num[i-1][j]) {
					num[i][j] += num[i-1][j];
					num[i-1][j] = 0;
				}
			}
		}
	}
	void moveDown() {
		for(int i = 1; i < 4; i++) {
			for(int j = 0; j < 4; j++) {
				if(num[i][j] == 0) {
					for(int k = i; k > 0; k--) {
						num[k][j] = num[k-1][j];
						num[k-1][j] = 0;
					}
				}
			}
		}
	}
	
	void sumLeft() {
		for(int i = 0; i < 4; i++) {
			for(int j = 0; j < 3; j++) {
				if(num[i][j] == num[i][j+1]) {
					num[i][j] += num[i][j+1];
					num[i][j+1] = 0;
				}
			}
		}
	}
	void moveLeft() {
		for(int i = 0; i < 4; i++) {
			for(int j = 2; j >= 0; j--) {
				if(num[i][j] == 0) {
					for(int k = j; k < 3; k++) {
						num[i][k] = num[i][k+1];
						num[i][k+1] = 0;
					}
				}
			}
		}
	}
	
	void sumRight() {
		for(int i = 0; i < 4; i++) {
			for(int j = 3; j > 0; j--) {
				if(num[i][j] == num[i][j-1]) {
					num[i][j] += num[i][j-1];
					num[i][j-1] = 0;
				}
			}
		}
	}
	void moveRight() {
		for(int i = 0; i < 4; i++) {
			for(int j = 1; j < 4; j++) {
				if(num[i][j] == 0) {
					for(int k = j; k > 0; k--) {
						num[i][k] = num[i][k-1];
						num[i][k-1] = 0;
					}
				}
			}
		}
	}
	
	//화면 표시
	void display() {
		for(int i = 0; i < 4; i++) 
			for(int j = 0; j < 4; j++) {
				if(num[i][j] != 0) {
					button[i][j].setText("" + num[i][j]);
					int setColorNum = 0, temp = num[i][j];
					
					do {
						temp /= 2;
						setColorNum++;
					} while(temp != 1);
					
					button[i][j].setBackground(buttonColor[setColorNum%10]);
					
				}
				else {
					button[i][j].setText("");
					button[i][j].setBackground(null);
				}
				
			}
		
	}
	
	//승패확인
	void checkVictoryAndDefeat() {
		boolean defeat = true;
		
		for(int i = 0; i < 4; i++) {
			for(int j = 0; j < 4; j++) {
				if(num[i][j] == 2048) {
					checkVictoryGame = true;
					break;
				}
			}
		}
		
		for(int i = 0; i < 3; i++) {
			for(int j = 0; j < 3; j++) {
				if(num[i][j] == num[i+1][j] || num[i][j] == num[i][j+1] || num[i][j] == 0) {
					defeat = false;
					break;
				}
			}
		}
		if(defeat) {
			for(int i = 3; i > 0; i--) {
				for(int j = 3; j > 0; j--) {
					if(num[i][j] == num[i-1][j] || num[i][j] == num[i][j-1] || num[i][j] == 0) {
						defeat = false;
						break;
					}
				}
			}
		}
		
		if(defeat) {
			checkDefeatGame = true;
		}
	}
	
}

//패배
class DefeatFrame extends JFrame{
	
	public DefeatFrame() {
		setSize(50, 100);
		JLabel label = new JLabel("패배");
		setLayout(new FlowLayout());
		add(label);
		
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
}

//승리
class VictoryFrame extends JFrame{
	
	public VictoryFrame() {
		setSize(50, 100);
		JLabel label = new JLabel("승리");
		setLayout(new FlowLayout());
		add(label);
		
		setVisible(true);
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
	}
	
}

public class Example9_3_2 {

	public static void main(String[] args) {
		Game2048 f = new Game2048();
	}

}
