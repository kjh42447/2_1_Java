//����ڿ��� ���ڿ��� �и����ڸ� �Է¹޾� �и��Ͽ� ����ϴ� ���α׷��� �ۼ��϶�.
package ch07_example;

import java.util.*;

public class StringSplit4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("�и��� ���ڿ��� �Է��ϼ��� : ");
		String s = sc.nextLine();
		
		System.out.print("�и��ڸ� �Է��ϼ��� : ");
		String regex = sc.nextLine();
		
		for (String token : s.split(regex)) {
			System.out.println(token);
		}
		
		sc.close();
	}

}
