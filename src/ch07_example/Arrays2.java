//����ڿ��� �� �迭�� �Է¹ް� �������� ���Ͽ� ����ϴ� ���α׷��� �ۼ��϶�. 
package ch07_example;

import java.util.*;

public class Arrays2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("1��° �迭�� ������ ����� ������ �Է��ϼ���.");
		String[] s1 = sc.nextLine().split(" ");
		
		System.out.println("2��° �迭�� ������ ����� ������ �Է��ϼ���.");
		String[] s2 = sc.nextLine().split(" ");
		
		if(Arrays.equals(s1, s2))
			System.out.println("�� �迭�� �����մϴ�.");
		
		else
			System.out.println("�� �迭�� �������� �ʽ��ϴ�.");
		
		sc.close();
	}
	
}
