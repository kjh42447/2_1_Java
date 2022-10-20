//Tic-Tac-Toe 게임 작성
package ch09_example;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

class TIC_TAC_TOE extends JFrame {
	private JPanel panel = new JPanel();
	private JButton[][] buttons = new JButton[3][3];
	private char turn = 'X';
	
	//버튼액션
	class CheckButton implements ActionListener {
		@Override
		public void actionPerformed(ActionEvent e) {
			for(int i = 0; i < 3; i++) {
				for(int j = 0; j < 3; j++) {
					if(e.getSource() == buttons[i][j] && buttons[i][j].getText().equals(" ") == true) {
						if(turn == 'X') {
							buttons[i][j].setText("X");
							checkVictory(i, j);
							turn = 'O';
						}
						else {
							buttons[i][j].setText("O");
							checkVictory(i, j);
							turn = 'X';
						}
					}
				}
			}
		}
	}
	
	//승리 화면
	class VictoryTTT extends JFrame {
		
		public VictoryTTT(char turn) {
			setSize(50, 100);
			JLabel label = new JLabel(turn + "승리");
			setLayout(new FlowLayout());
			add(label);
			
			setVisible(true);
			setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		}
		
	}
	
	//생성자
	public TIC_TAC_TOE() {
		setTitle("TIC TAC TOE");
		setSize(300, 300);
		panel.setLayout(new GridLayout(3, 3, 5, 5));
		
		for(int i = 0; i < 3; i++) {
			for(int j = 0; j < 3; j++) {
				buttons[i][j] = new JButton(" ");
				buttons[i][j].setFont(new Font("SansSerif", Font.BOLD + Font.ITALIC, 50));
				buttons[i][j].addActionListener(new CheckButton());
				panel.add(buttons[i][j]);
			}
		}
		
		add(panel);
		
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	//결과 체크
	void checkVictory(int x, int y) {
		
		if(buttons[x][(y+1)%3].getText().charAt(0) == turn
				&& buttons[x][(y+2)%3].getText().charAt(0) == turn) {
			VictoryTTT f =  new VictoryTTT(turn);
		}
		
		else if(buttons[(x+1)%3][y].getText().charAt(0) == turn
				&& buttons[(x+2)%3][y].getText().charAt(0) == turn) {
			VictoryTTT f =  new VictoryTTT(turn);
		}
		
		else if(buttons[0][0].getText().charAt(0) == turn
				&& buttons[1][1].getText().charAt(0) == turn
				&& buttons[2][2].getText().charAt(0) == turn) {
			VictoryTTT f = new VictoryTTT(turn);
		}
		
		else if(buttons[2][0].getText().charAt(0) == turn
				&& buttons[1][1].getText().charAt(0) == turn
				&& buttons[0][2].getText().charAt(0) == turn) {
			VictoryTTT f = new VictoryTTT(turn);
		}
		
	}
	
}

public class MiniProject9_1 {

	public static void main(String[] args) {
		TIC_TAC_TOE f = new TIC_TAC_TOE();
	}

}
