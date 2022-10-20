//0�� ������ ���ܸ� �߻���Ű�� ���α׷��� ���� ó���⸦ �ٿ� �ۼ��϶�.
package ch07_example;

import java.util.*;

public class ArithemeticException1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int x = 0, y = 0;
		
		
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
		
		try {
			int result = x/y;
			System.out.println(result);
		}
		
		catch(ArithmeticException e) {
			System.out.println("0���� ���� �� �����ϴ�.");
		}
		
		finally {
			sc.close();
		}
	}

}
