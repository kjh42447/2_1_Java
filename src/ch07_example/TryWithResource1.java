//Try-With-Resource�� �׽�Ʈ�϶�.
package ch07_example;

import java.util.*;

public class TryWithResource1 {

	public static void main(String[] args) {
		try(Scanner sc = new Scanner(System.in)){
			System.out.print("���ڸ� �Է��ϼ��� : ");
			Double i = sc.nextDouble();
			sc.nextLine();
			
			System.out.println(i);
		}
		catch(InputMismatchException e) {
			System.out.println("�Է��� �߸��Ǿ����ϴ�.");
		}
	}

}
