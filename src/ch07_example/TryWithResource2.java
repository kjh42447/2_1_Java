//Try-With-Resource를 테스트하라.
package ch07_example;

import java.util.*;

public class TryWithResource2 {

	public static void main(String[] args) {
		try(Scanner sc = new Scanner(System.in)) {
			System.out.print("자연수를 입력하세요 : ");
			int i = sc.nextInt();
			sc.nextLine();
			
			int[] array = new int[i];
			System.out.println("길이가 " + i + "인 정수 배열이 생성되었습니다.");
		}
		catch(InputMismatchException e) {
			System.out.println("문자가 입력되었습니다.");
		}
		catch(NegativeArraySizeException e) {
			System.out.println("정수가 입력되었습니다.");
		}
	}

}
