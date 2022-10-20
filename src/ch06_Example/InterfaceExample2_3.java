//��ü ���� ���ڿ��̳� ���ڸ� ���ϴ� Comparable_3 �������̽��� �ۼ��ϰ� �����϶�. ����ڷκ��� ���� �Է¹޾� ����� ����϶�.
package ch06_Example;

import java.util.*;

interface Comparable_3{
	void compare(int x, int y);
	void compare(String a, String b);
}

class Compare_3 implements Comparable_3{
	
	public void compare(int x, int y) {
		if (Integer.compare(x, y) > 0)
			System.out.println(x + " > " + y);
		else if(Integer.compare(x, y) < 0)
			System.out.println(x + " < " + y);
		else
			System.out.println(x + " = " + y);
	}
	
	public void compare(String a, String b) {
		if (a.compareTo(b) > 0)
			System.out.println(a + " > " + b);
		else if(a.compareTo(b) < 0)
			System.out.println(a + " < " + b);
		else
			System.out.println(a + " = " + b);
	}
}

public class InterfaceExample2_3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Compare_3 c = new Compare_3();
		
		while (true) {
			System.out.print("���ڸ� ���Ϸ��� 1, ���ڸ� ���Ϸ��� 2, �����Ϸ��� 3�� �Է��Ͻÿ� : ");
			int check = sc.nextInt();
			sc.nextLine();
			
			if (check == 1) {
				System.out.print("ù ��° ���ڸ� �Է��Ͻÿ� : ");
				int x = sc.nextInt();
				sc.nextLine();
				System.out.print("�� ���� ���ڸ� �Է��Ͻÿ�  : ");
				int y = sc.nextInt();
				sc.nextLine();
				
				c.compare(x, y);
			}
			
			else if (check == 2) {
				System.out.print("ù ��° ���ڸ� �Է��Ͻÿ� : ");
				String a = sc.nextLine();
				System.out.print("�� ���� ���ڸ� �Է��Ͻÿ�  : ");
				String b = 	sc.nextLine();
				
				c.compare(a, b);
			}
			
			else if (check == 3) {
				break;
			}
			
			else
				System.out.println("�ٽ� �Է��Ͻÿ�.");
		}
		
		sc.close();
	}
}
