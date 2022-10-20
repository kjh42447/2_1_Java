//0을 나누어 예외를 발생시키는 프로그램에 예외 처리기를 붙여 작성하라.
package ch07_example;

import java.util.*;

public class ArithemeticException1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int x = 0, y = 0;
		
		
		while(true)	{
			try {
				System.out.print("피제수 : ");
				x = sc.nextInt();
				break;
			}
			
			catch(InputMismatchException e) {
				System.out.println("정수를 입력하세요.");
				System.out.println("프로그램은 계속 진행됩니다.");
				sc = new Scanner(System.in);
			}
			
		}
		
		while(true) {
			try {
				System.out.print("제수 : ");
				y = sc.nextInt();
				break;
			}
			
			catch(InputMismatchException e) {
				System.out.println("정수를 입력하세요.");
				sc = new Scanner(System.in);
			}
		}
		
		try {
			int result = x/y;
			System.out.println(result);
		}
		
		catch(ArithmeticException e) {
			System.out.println("0으로 나눌 수 없습니다.");
		}
		
		finally {
			sc.close();
		}
	}

}
