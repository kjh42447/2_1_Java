//사용자에게 값을 입력받아 연산하는 프로그램을 작성하라. 입력은 문자열 형태로 입력받고 parse메소드를 이용하여 자료형을 변환하라.
package ch07_example;

import java.util.*;

public class Wrapper6 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int check;
		
		while (true) {
			System.out.println("====================================================================");
			System.out.println("1. 정수 연산");
			System.out.println("2. 실수 연산");
			System.out.println("3. 작업 종료");
			System.out.println("====================================================================");
			System.out.print("원하는 작업의 번호를 입력하세요 : ");
			check = Integer.parseInt(sc.nextLine());
			
			//정수연산
			if (check == 1) {
				System.out.println("====================================================================");
				System.out.print("정수를 입력하세요 : ");
				int a = Integer.parseInt(sc.nextLine());
				System.out.print("정수를 입력하세요 : ");
				int b = Integer.parseInt(sc.nextLine());
				System.out.println("====================================================================");
				
				System.out.println("a + b = " + (a + b));
				System.out.println("a - b = " + (a - b));
				System.out.println("a * b = " + (a * b));
				System.out.println("a / b = " + (a / b));
			}
			
			//실수연산
			else if (check == 2) {
				System.out.println("====================================================================");
				System.out.print("정수를 입력하세요 : ");
				double a = Double.parseDouble(sc.nextLine());
				System.out.print("정수를 입력하세요 : ");
				double b = Double.parseDouble(sc.nextLine());
				System.out.println("====================================================================");
				
				System.out.println("a + b = " + (a + b));
				System.out.println("a - b = " + (a - b));
				System.out.println("a * b = " + (a * b));
				System.out.println("a / b = " + (a / b));
			}
			
			
			else if (check == 3) {
				break;
			}
			
			
			else
				System.out.println("숫자를 정확히 입력하세요.");
		}
		
		sc.close();
	}

}
