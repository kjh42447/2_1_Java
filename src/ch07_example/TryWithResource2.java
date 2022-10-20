//Try-With-Resource�� �׽�Ʈ�϶�.
package ch07_example;

import java.util.*;

public class TryWithResource2 {

	public static void main(String[] args) {
		try(Scanner sc = new Scanner(System.in)) {
			System.out.print("�ڿ����� �Է��ϼ��� : ");
			int i = sc.nextInt();
			sc.nextLine();
			
			int[] array = new int[i];
			System.out.println("���̰� " + i + "�� ���� �迭�� �����Ǿ����ϴ�.");
		}
		catch(InputMismatchException e) {
			System.out.println("���ڰ� �ԷµǾ����ϴ�.");
		}
		catch(NegativeArraySizeException e) {
			System.out.println("������ �ԷµǾ����ϴ�.");
		}
	}

}
