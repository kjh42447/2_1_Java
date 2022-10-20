//ppt꺼
package ch08_practice;

import java.awt.*;
import javax.swing.*;

public class JFrame02 extends JFrame {

	public JFrame02() {
		//툴킷
		Toolkit kit = Toolkit.getDefaultToolkit();		
		
		//크기 자동 설정
		//pack();			//너무 작은데?
		
		setSize(300, 200);
		
		//스크린 크기 가져오기
		Dimension screen = kit.getScreenSize();			
		
		//위치
		setLocation(screen.width/2, screen.height/2);		
		
		//이미지 가져오기 & 아이콘 변경
		Image img = kit.getImage("E:\\공부\\2학년\\1학기\\객체지향프로그래밍\\image");
		setIconImage(img);
		
		//레이아웃 설정
		setLayout(new FlowLayout());
		
		//배경색
		getContentPane().setBackground(Color.DARK_GRAY);
		
		//버튼
		JButton button = new JButton("버튼");
		add(button);
		
		//메뉴바
		JMenuBar mb = new JMenuBar();
		setJMenuBar(mb);
		
		//메뉴
		JMenu m = new JMenu("파일");
		mb.add(m);
		
		//프레임 크기변경 가능여부
		setResizable(true);
		
		//화면에 표시
		setVisible(true);								
		
		//창 종료시 프로세스 같이 종료
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);	
	}
	
	
	public static void main(String[] args) {
		JFrame02 f1 = new JFrame02();
		//JFrame02 f2 = new JFrame02();
	}

}
