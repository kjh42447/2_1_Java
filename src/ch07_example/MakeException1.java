//���������� �迭�� ������ ����� ���� �ε����Ͽ� ���������� ���ܸ� �߻����Ѷ�.
package ch07_example;

import java.util.*;

public class MakeException1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] list = {1, 2, 3};
		
		System.out.print("���ϴ� ���� �Է��ϼ��� : ");
		int i = sc.nextInt();
		sc.nextLine();
		
		System.out.println(list[i]);
		
		sc.close();
	}

}
