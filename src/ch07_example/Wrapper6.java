//����ڿ��� ���� �Է¹޾� �����ϴ� ���α׷��� �ۼ��϶�. �Է��� ���ڿ� ���·� �Է¹ް� parse�޼ҵ带 �̿��Ͽ� �ڷ����� ��ȯ�϶�.
package ch07_example;

import java.util.*;

public class Wrapper6 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int check;
		
		while (true) {
			System.out.println("====================================================================");
			System.out.println("1. ���� ����");
			System.out.println("2. �Ǽ� ����");
			System.out.println("3. �۾� ����");
			System.out.println("====================================================================");
			System.out.print("���ϴ� �۾��� ��ȣ�� �Է��ϼ��� : ");
			check = Integer.parseInt(sc.nextLine());
			
			//��������
			if (check == 1) {
				System.out.println("====================================================================");
				System.out.print("������ �Է��ϼ��� : ");
				int a = Integer.parseInt(sc.nextLine());
				System.out.print("������ �Է��ϼ��� : ");
				int b = Integer.parseInt(sc.nextLine());
				System.out.println("====================================================================");
				
				System.out.println("a + b = " + (a + b));
				System.out.println("a - b = " + (a - b));
				System.out.println("a * b = " + (a * b));
				System.out.println("a / b = " + (a / b));
			}
			
			//�Ǽ�����
			else if (check == 2) {
				System.out.println("====================================================================");
				System.out.print("������ �Է��ϼ��� : ");
				double a = Double.parseDouble(sc.nextLine());
				System.out.print("������ �Է��ϼ��� : ");
				double b = Double.parseDouble(sc.nextLine());
				System.out.println("====================================================================");
				
				System.out.println("a + b = " + (a + b));
				System.out.println("a - b = " + (a - b));
				System.out.println("a * b = " + (a * b));
				System.out.println("a / b = " + (a / b));
			}
			
			
			else if (check == 3) {
				break;
			}
			
			
			else
				System.out.println("���ڸ� ��Ȯ�� �Է��ϼ���.");
		}
		
		sc.close();
	}

}
