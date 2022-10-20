//위치를 지정받아 2개의 컨테이너를 생성하라.
package ch08_example;

import javax.swing.*;
import java.util.*;

public class MakeContainer2 extends JFrame{

	public MakeContainer2(int x, int y) {
		setSize(500, 400);
		setVisible(true);
		setLocation(x, y);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ArrayList<MakeContainer2> list = new ArrayList<MakeContainer2>();
		
		for(int i = 0; i < 2; i++) {
			int x = 0, y = 0;
			
			//좌표 입력받기
			while(true) {
				try {
					System.out.print((i+1) + "번째 화면의 x좌표를 입력하세요 : ");
					x = sc.nextInt();
					sc.nextLine();
					break;
				}
				catch(InputMismatchException e) {
					System.out.println("좌표 값의 범위는 화면 픽셀 내의 범위의 정수여야합니다.");
					sc = new Scanner(System.in);
				}
			}
			
			while(true) {
				try {
					System.out.print((i+1) + "번째 화면의 y좌표를 입력하세요 : ");
					y = sc.nextInt();
					sc.nextLine();
					break;
				}
				catch(InputMismatchException e) {
					System.out.println("좌표 값의 범위는 화면 픽셀 내의 범위의 정수여아 합니다.");
					sc = new Scanner(System.in);
				}
				
			}
			
			//화면 표시하기
			list.add(new MakeContainer2(x, y));
			list.get(i).setTitle((i+1) + "번째 화면");
			
		}
		
		
		sc.close();
	}

}
