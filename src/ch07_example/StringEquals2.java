//사용자에게 문자열을 2번 입력받고 동일한 문자열인지 비교하여 출력하라.
package ch07_example;

import java.util.*;

public class StringEquals2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("문자열을 입력하세요 : ");
		String s1 = sc.nextLine();
		System.out.print("동일한 문자열을 입력하세요 : ");
		String s2 = sc.nextLine();
		
		if (s1.equals(s2)) {
			System.out.println("두 문자열은 동일합니다.");
		}
		
		else {
			System.out.println("두 문자열은 동일하지 않습니다.");
		}
		
		sc.close();
	}

}
