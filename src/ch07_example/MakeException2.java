//���������� �迭�� ũ�⸦ ������ ����� ���ܸ� �߻����Ѷ�.
package ch07_example;

import java.util.*;

public class MakeException2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("�迭�� ũ�⸦ �Է��ϼ��� : ");
		int i = sc.nextInt();
		sc.nextLine();
		
		int[] list = new int[i];
		
		System.out.println(list[0]);
		
		sc.close();
	}

}
