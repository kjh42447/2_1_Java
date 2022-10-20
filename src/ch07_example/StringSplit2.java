//사용자에게 문자열을 입력받아 공백을 기준으로 분리하여 출력하라.
package ch07_example;

import java.util.*;

public class StringSplit2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("공백 단위로 끊을 문자열을 입력하세요 : ");
		String s = sc.nextLine();
		
		for (String token : s.split(" "))
			System.out.println(token);
		
		sc.close();
	}

}
