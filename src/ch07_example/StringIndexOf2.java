//�˻��� ���ڿ��� ��ġ�� ���� ����ϴ� ���α׷��� �ۼ��϶�.
package ch07_example;

import java.util.*;

public class StringIndexOf2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = "string another string";
		
		System.out.println(s);
		System.out.print("�˻��� ���ڿ��� �Է��ϼ��� : ");
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
