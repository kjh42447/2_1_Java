//0�� ������ ���ܸ� �߻���Ű�� ���α׷��� ���� ó���⸦ �ٿ� �ۼ��϶�. ���� ���� �� ���� �ݺ��ؾ��Ѵ�.
package ch07_example;

import java.util.*;

public class ArithemeticException2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int x = 0, y = 0;
		
		//������ �� �Է¹ޱ�
		while(true)	{
			try {
				System.out.print("������ : ");
				x = sc.nextInt();
				break;
			}
			
			catch(InputMismatchException e) {
				System.out.println("������ �Է��ϼ���.");
				System.out.println("���α׷��� ��� ����˴ϴ�.");
				sc = new Scanner(System.in);
			}
			
		}
		
		//���� �� �Է¹ް� ��� ����ϱ�
		while(true) {
			try {
				//���� �� �Է¹ޱ�
				while(true) {
					try {
						System.out.print("���� : ");
						y = sc.nextInt();
						break;
					}
					
					catch(InputMismatchException e) {
						System.out.println("������ �Է��ϼ���.");
						sc = new Scanner(System.in);
					}
				}
				
				//������
				int result = x/y;
				System.out.println(result);
				break;
			}
			
			catch(ArithmeticException e) {
				System.out.println("0���� ���� �� �����ϴ�.");
				sc = new Scanner(System.in);
			}
			
		}
		
		sc.close();
	}

}
