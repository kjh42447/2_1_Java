//Try-With-Resource를 테스트하라.
package ch07_example;

import java.util.*;

public class TryWithResource1 {

	public static void main(String[] args) {
		try(Scanner sc = new Scanner(System.in)){
			System.out.print("숫자를 입력하세요 : ");
			Double i = sc.nextDouble();
			sc.nextLine();
			
			System.out.println(i);
		}
		catch(InputMismatchException e) {
			System.out.println("입력이 잘못되었습니다.");
		}
	}

}
