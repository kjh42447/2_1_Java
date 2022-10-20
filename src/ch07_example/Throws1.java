//throws를 이용해 main메소드로 예외를 넘겨서 처리하라.
package ch07_example;

import java.util.*;

public class Throws1 {

	public static void main(String[] args) {
		try {
			ThrowsTest();
		}
		catch(InputMismatchException e) {
			System.out.println("입력이 잘못되었습니다.");
		}
		catch(NegativeArraySizeException e) {
			System.out.println("입력이 잘못되었습니다.");
		}
	}
	
	static void ThrowsTest() throws InputMismatchException, NegativeArraySizeException{
		Scanner sc = new Scanner(System.in);
		System.out.print("자연수를 입력하세요 : ");
		int i = sc.nextInt();
		sc.nextLine();
		
		int[] array = new int[i];
		System.out.println("길이가 " + i + "인 정수 배열이 생성되었습니다.");
	
		sc.close();
	}
	
}
