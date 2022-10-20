//throws�� �̿��� main�޼ҵ�� ���ܸ� �Ѱܼ� ó���϶�.
package ch07_example;

import java.util.*;

public class Throws1 {

	public static void main(String[] args) {
		try {
			ThrowsTest();
		}
		catch(InputMismatchException e) {
			System.out.println("�Է��� �߸��Ǿ����ϴ�.");
		}
		catch(NegativeArraySizeException e) {
			System.out.println("�Է��� �߸��Ǿ����ϴ�.");
		}
	}
	
	static void ThrowsTest() throws InputMismatchException, NegativeArraySizeException{
		Scanner sc = new Scanner(System.in);
		System.out.print("�ڿ����� �Է��ϼ��� : ");
		int i = sc.nextInt();
		sc.nextLine();
		
		int[] array = new int[i];
		System.out.println("���̰� " + i + "�� ���� �迭�� �����Ǿ����ϴ�.");
	
		sc.close();
	}
	
}
