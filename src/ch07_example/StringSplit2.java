//����ڿ��� ���ڿ��� �Է¹޾� ������ �������� �и��Ͽ� ����϶�.
package ch07_example;

import java.util.*;

public class StringSplit2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("���� ������ ���� ���ڿ��� �Է��ϼ��� : ");
		String s = sc.nextLine();
		
		for (String token : s.split(" "))
			System.out.println(token);
		
		sc.close();
	}

}
