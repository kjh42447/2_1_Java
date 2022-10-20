//객체 내의 문자열이나 숫자를 비교하는 Comparable_3 인터페이스를 작성하고 구현하라. 사용자로부터 값을 입력받아 결과를 출력하라.
package ch06_Example;

import java.util.*;

interface Comparable_3{
	void compare(int x, int y);
	void compare(String a, String b);
}

class Compare_3 implements Comparable_3{
	
	public void compare(int x, int y) {
		if (Integer.compare(x, y) > 0)
			System.out.println(x + " > " + y);
		else if(Integer.compare(x, y) < 0)
			System.out.println(x + " < " + y);
		else
			System.out.println(x + " = " + y);
	}
	
	public void compare(String a, String b) {
		if (a.compareTo(b) > 0)
			System.out.println(a + " > " + b);
		else if(a.compareTo(b) < 0)
			System.out.println(a + " < " + b);
		else
			System.out.println(a + " = " + b);
	}
}

public class InterfaceExample2_3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Compare_3 c = new Compare_3();
		
		while (true) {
			System.out.print("숫자를 비교하려면 1, 문자를 비교하려면 2, 종료하려면 3을 입력하시오 : ");
			int check = sc.nextInt();
			sc.nextLine();
			
			if (check == 1) {
				System.out.print("첫 번째 숫자를 입력하시오 : ");
				int x = sc.nextInt();
				sc.nextLine();
				System.out.print("두 번재 숫자를 입력하시오  : ");
				int y = sc.nextInt();
				sc.nextLine();
				
				c.compare(x, y);
			}
			
			else if (check == 2) {
				System.out.print("첫 번째 문자를 입력하시오 : ");
				String a = sc.nextLine();
				System.out.print("두 번재 문자를 입력하시오  : ");
				String b = 	sc.nextLine();
				
				c.compare(a, b);
			}
			
			else if (check == 3) {
				break;
			}
			
			else
				System.out.println("다시 입력하시오.");
		}
		
		sc.close();
	}
}
