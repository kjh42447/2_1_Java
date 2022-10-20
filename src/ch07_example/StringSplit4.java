//사용자에게 문자열과 분리문자를 입력받아 분리하여 출력하는 프로그램을 작성하라.
package ch07_example;

import java.util.*;

public class StringSplit4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("분리할 문자열을 입력하세요 : ");
		String s = sc.nextLine();
		
		System.out.print("분리자를 입력하세요 : ");
		String regex = sc.nextLine();
		
		for (String token : s.split(regex)) {
			System.out.println(token);
		}
		
		sc.close();
	}

}
