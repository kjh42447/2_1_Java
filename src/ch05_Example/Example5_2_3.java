//10진수를 입력받아 2진수, 8진수, 16진수 표현으로 출력하는 정적 메소드가 있는 ChangeInt 클래스를 작성하라.
package ch05_Example;

import java.util.Scanner;

class ChangeInt{
	public static void print(int x) {
		System.out.println("2진수  : " + Integer.toBinaryString(x));
		System.out.println("8진수 : " + Integer.toOctalString(x));
		System.out.println("16진수 : " + Integer.toHexString(x));
	}
}
public class Example5_2_3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("10진수를 입력하시오 : ");
		int x = sc.nextInt();
		
		ChangeInt.print(x);
		sc.close();
	}
}
