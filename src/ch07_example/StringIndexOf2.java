//검색한 문자열의 위치를 전부 출력하는 프로그램을 작성하라.
package ch07_example;

import java.util.*;

public class StringIndexOf2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = "string another string";
		
		System.out.println(s);
		System.out.print("검색할 문자열을 입력하세요 : ");
		String search = sc.nextLine();
		
		for (int i = 0; i < s.length(); i++) {
			
			if (s.indexOf(search, i) == -1) {
				break;
			}
			
			else {
				System.out.print(s.indexOf(search, i) + " ");
				i = s.indexOf(search, i);
			}
	
		}
		
		sc.close();
	}

}
