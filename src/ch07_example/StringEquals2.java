//����ڿ��� ���ڿ��� 2�� �Է¹ް� ������ ���ڿ����� ���Ͽ� ����϶�.
package ch07_example;

import java.util.*;

public class StringEquals2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("���ڿ��� �Է��ϼ��� : ");
		String s1 = sc.nextLine();
		System.out.print("������ ���ڿ��� �Է��ϼ��� : ");
		String s2 = sc.nextLine();
		
		if (s1.equals(s2)) {
			System.out.println("�� ���ڿ��� �����մϴ�.");
		}
		
		else {
			System.out.println("�� ���ڿ��� �������� �ʽ��ϴ�.");
		}
		
		sc.close();
	}

}
