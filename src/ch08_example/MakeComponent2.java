//사용자에게 화면의 크기, 버튼의 갯수를 입력받아 프레임을 출력하는 프로그램을 작성하라.
package ch08_example;

import java.util.*;
import java.awt.*;
import javax.swing.*;

public class MakeComponent2 extends JFrame{

	public MakeComponent2(int x, int y, int num) {
		Toolkit kit = Toolkit.getDefaultToolkit();
		setSize(x, y);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		//위치 설정
		Dimension screensize = kit.getScreenSize();
		setLocation(screensize.width/2, screensize.height/2);
		
		//버튼 생성
		setLayout(new FlowLayout());
		for(int i = 0; i < num; i++) {
			JButton button = new JButton("버튼" + (i+1));
			add(button);
		}
		
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int x = 0, y = 0, num = 0;
		
		//입력
		while(true) {
			try {
				System.out.print("화면의 넓이를 입력하세요 : ");
				x = sc.nextInt();
				sc.nextLine();
				break;
			}
			catch(InputMismatchException e) {
				System.out.println("넓이는 정수를 입력해주세요.");
				sc = new Scanner(System.in);
			}
		}
		
		while(true) {
			try {
				System.out.print("화면의 높이를 입력하세요 : ");
				y = sc.nextInt();
				sc.nextLine();
				break;
			}
			catch(InputMismatchException e) {
				System.out.println("높이는 정수를 입력해주세요.");
				sc = new Scanner(System.in);
			}
		}
		
		while(true) {
			try {
				System.out.print("버튼의 갯수를 입력하세요 : ");
				num = sc.nextInt();
				sc.nextLine();
				break;
			}
			catch(InputMismatchException e) {
				System.out.println("버튼의 갯수는 정수를 입력해주세요.");
				sc = new Scanner(System.in);
			}
		}
		
		//버튼 생성
		MakeComponent2 mc = new MakeComponent2(x, y , num);
		
		sc.close();
	}

}
