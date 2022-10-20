//0을 나누어 예외를 발생시키는 프로그램에 예외 처리기를 붙여 작성하라. 답을 구할 때 까지 반복해야한다.
package ch07_example;

import java.util.*;

public class ArithemeticException2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int x = 0, y = 0;
		
		//피제수 값 입력받기
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
		
		//제수 값 입력받고 결과 출력하기
		while(true) {
			try {
				//제수 값 입력받기
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
				
				//나누기
				int result = x/y;
				System.out.println(result);
				break;
			}
			
			catch(ArithmeticException e) {
				System.out.println("0으로 나눌 수 없습니다.");
				sc = new Scanner(System.in);
			}
			
		}
		
		sc.close();
	}

}
