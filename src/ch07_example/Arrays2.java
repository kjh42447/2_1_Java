//사용자에게 두 배열을 입력받고 동일한지 비교하여 출력하는 프로그램을 작성하라. 
package ch07_example;

import java.util.*;

public class Arrays2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("1번째 배열의 값들을 띄어쓰기로 나누어 입력하세요.");
		String[] s1 = sc.nextLine().split(" ");
		
		System.out.println("2번째 배열의 값들을 띄어쓰기로 나누어 입력하세요.");
		String[] s2 = sc.nextLine().split(" ");
		
		if(Arrays.equals(s1, s2))
			System.out.println("두 배열을 동일합니다.");
		
		else
			System.out.println("두 배열은 동일하지 않습니다.");
		
		sc.close();
	}
	
}
