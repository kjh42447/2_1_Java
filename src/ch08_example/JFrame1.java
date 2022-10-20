//JFram의 다양한 메소드들을 테스트하라.
package ch08_example;

import java.awt.*;
import javax.swing.*;

public class JFrame1 extends JFrame {

	public JFrame1() {
		Toolkit kit = Toolkit.getDefaultToolkit();
		setSize(300, 200);
		setTitle("JFrame1");
		setResizable(true);
		setLayout(new FlowLayout());
		
		Dimension screen = kit.getScreenSize();
		setLocation(screen.width/2, screen.height/2);
		
		//배경색
		getContentPane().setBackground(Color.CYAN);
		
		//메뉴
		JMenuBar mb = new JMenuBar();
		setJMenuBar(mb);
		
		JMenu m1 = new JMenu("파일");
		JMenu m2 = new JMenu("편집");
		mb.add(m1);
		mb.add(m2);
		
		//레이블
		JLabel label = new JLabel("테스트 프레임입니다 ");
		add(label);
		
		//버튼
		JButton button1 = new JButton("확인");
		JButton button2 = new JButton("취소");
		add(button1);
		add(button2);
		
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		}
	
	public static void main(String[] args) {
		JFrame1 f = new JFrame1();
	}

}
