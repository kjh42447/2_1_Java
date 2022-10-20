//예제 8-5의 파자주문화면 버튼에 실제 피자사잔을 추가하라.
package ch08_example;

import java.awt.*;
import javax.swing.*;

class PizzaOrderFrame extends JFrame {
	
	public PizzaOrderFrame() {
		setSize(600, 350);
		setTitle("JAVA Pizza");
		
		//패널
		JPanel defaultpanel = new JPanel();
		JPanel textepanel = new JPanel();
		JPanel buttonpanel = new JPanel(new GridLayout(2, 2, 10, 10));
		
		//레이블
		JLabel label = new JLabel("자바 피자에 오신 것을 환영합니다. 피자의 종류를 선택하세요.");
		label.setFont(new Font("SansSerif", Font.BOLD, 15));
		textepanel.add(label);
		
		//이미지
		ImageIcon cheese = new ImageIcon("E:\\공부\\2학년\\1학기\\객체지향프로그래밍\\image\\치즈피자.png");
		ImageIcon combination = new ImageIcon("E:\\공부\\2학년\\1학기\\객체지향프로그래밍\\image\\콤비네이션피자.png");
		ImageIcon potato = new ImageIcon("E:\\공부\\2학년\\1학기\\객체지향프로그래밍\\image\\포테이토피자.png");
		ImageIcon bulgogi = new ImageIcon("E:\\공부\\2학년\\1학기\\객체지향프로그래밍\\image\\불고기피자.png");
		
		//버튼
		JButton chb = new JButton("치즈피자", cheese);
		JButton cob = new JButton("콤비네이션피자", combination);
		JButton pob = new JButton("포테이토피자", potato);
		JButton bub = new JButton("불고기피자", bulgogi);
		
		buttonpanel.add(chb);
		buttonpanel.add(cob);
		buttonpanel.add(pob);
		buttonpanel.add(bub);
		
		defaultpanel.add(textepanel);
		defaultpanel.add(buttonpanel);
		add(defaultpanel);
		
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
}

public class Example8_5_1 {

	public static void main(String[] args) {
		PizzaOrderFrame f = new PizzaOrderFrame();
	}

}
