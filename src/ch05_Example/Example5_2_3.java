//10������ �Է¹޾� 2����, 8����, 16���� ǥ������ ����ϴ� ���� �޼ҵ尡 �ִ� ChangeInt Ŭ������ �ۼ��϶�.
package ch05_Example;

import java.util.Scanner;

class ChangeInt{
	public static void print(int x) {
		System.out.println("2����  : " + Integer.toBinaryString(x));
		System.out.println("8���� : " + Integer.toOctalString(x));
		System.out.println("16���� : " + Integer.toHexString(x));
	}
}
public class Example5_2_3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("10������ �Է��Ͻÿ� : ");
		int x = sc.nextInt();
		
		ChangeInt.print(x);
		sc.close();
	}
}
