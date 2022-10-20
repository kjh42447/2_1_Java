//컨테이너에 JButten 컴포넌트를 추가하고 화면위치를 중앙으로하라. 아이콘을 외부에서 가져와서 사용하라.
package ch08_example;

import javax.swing.*;
import java.awt.*;

public class MakeComponent1 extends JFrame {

	public MakeComponent1() {
		Toolkit kit = Toolkit.getDefaultToolkit();
		setSize(300, 200);
		setTitle("MakeComponent1");
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		//화면 위치 설정
		Dimension screenSize = kit.getScreenSize();
		setLocation(screenSize.width/2, screenSize.height/2);
		
		//아이콘 설정
		Image img = kit.getImage("E:\\공부\\2학년\\1학기\\객체지향프로그래밍\\image\\icon1.png");
		setIconImage(img);
		
		//버튼 레이아웃
		setLayout(new FlowLayout());
		JButton button1 = new JButton("버튼1");
		JButton button2 = new JButton("버튼2");
		add(button1);
		add(button2);
	}
	
	public static void main(String[] args) {
		MakeComponent1 mc = new MakeComponent1();
	}

}
