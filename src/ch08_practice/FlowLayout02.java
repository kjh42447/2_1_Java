//ppt + 이것저것
package ch08_practice;

import java.awt.*;
import javax.swing.*;

class FlowLayout02_Base extends JFrame {
	   private JPanel panel;   // 데이터

	   public FlowLayout02_Base() {
	      setTitle("FlowLayoutTest");                                    // 프레임의 구성
	      setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	      panelLayout();                                                    // 프레임에 컴포넌트 배치
	      add(panel);
	      pack();                                                             // 프레임 완성
	      setVisible(true);                                                  // 프레임 제시
	   }

	   private void panelLayout() {          // 패널 구성 : 패널에 컴포넌트 배치
	      panel = new JPanel(); 
	      panel.setLayout(new FlowLayout(FlowLayout.CENTER)); // 패널을 생성하고 배치 관리자를 FlowLayout으로 설정
	      
	      // 패널에 버튼을 생성하여 추가
	      panel.add(new JButton("Button1"));
	      panel.add(new JButton("Button2"));
	      panel.add(new JButton("Button3"));
	      panel.add(new JButton("B4"));
	      panel.add(new JButton("Long Button5"));
	   }
	
}

public class FlowLayout02 {

	public static void main(String[] args) {
		FlowLayout02_Base f = new FlowLayout02_Base();
	}

}
