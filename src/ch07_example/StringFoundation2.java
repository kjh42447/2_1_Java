//�Է¹��� ���ڿ��� �����ϴ� ���α׷��� �ۼ��϶�.
package ch07_example;

import java.util.*;

public class StringFoundation2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ArrayList<String> list = new ArrayList<String>();
		int check, index, n;
		
		
		while (true) {
			System.out.println("====================================================================");
			System.out.println("1. ���ڿ� �Է�");
			System.out.println("2. ���ڿ� ���� ���");
			System.out.println("3. ���� ����");
			System.out.println("4. ���ڿ� ����");
			System.out.println("5. ���ڿ� ��� ���");
			System.out.println("6. ���α׷� ����");
			System.out.println("====================================================================");
			System.out.print("���ϴ� �۾��� ��ȣ�� �Է��ϼ��� : ");
			check = sc.nextInt();
			sc.nextLine();
			System.out.println("====================================================================");
			
			//���ڿ� �Է�
			if (check == 1) {
				System.out.print("���ڿ��� �Է��ϼ��� : ");
				list.add(sc.nextLine());
			}
			
			//���ڿ� ���� ���
			else if (check == 2) {
				System.out.print("���� ����� ���ϴ� ���ڿ� ��ȣ�� �Է��ϼ��� : ");
				index = sc.nextInt();
				sc.nextLine();
				
				if (0 <= index && index < list.size()) {
					System.out.println(list.get(index).length());
				}
				
				else {
					System.out.println("��ȣ�� �߸��Ǿ����ϴ�.");
				}
			}
			
			//���� ����
			else if (check == 3) {
				System.out.print("���� ������ ���ϴ� ���ڿ� ��ȣ�� �Է��ϼ��� : ");
				index = sc.nextInt();
				sc.nextLine();
				
				if (0 <= index && index < list.size()) {
					System.out.print("������ ���ϴ� ������ ��ȣ�� �Է��ϼ��� : ");
					n = sc.nextInt();
					sc.nextLine();
					
					if (0 <= n && n < list.get(index).length()) {
						System.out.println("������ ���ڴ� " + list.get(index).charAt(n) + "�Դϴ�.");
					}
					
					else {
						System.out.println("���ڿ� ������ ������ ������ϴ�.");
					}
					
				}
					
				else {
					System.out.println("��ȣ�� �߸��Ǿ����ϴ�.");
				}
			}
			
			//���ڿ� ����
			else if (check == 4) {
				System.out.print("������ ���ڿ� ��ȣ�� �Է��ϼ��� : ");
				index = sc.nextInt();
				sc.nextLine();
				
				if (0 <= index && index < list.size()) {
					System.out.print("������ ���ڿ��� �Է��ϼ��� : ");
					list.set(index, sc.nextLine());
				}
				
				else {
					System.out.println("��ȣ�� �߸��Ǿ����ϴ�.");
				}
			}
			
			//���ڿ� ��� ���
			else if (check == 5) {
				for (String s : list) {
					System.out.println(s);
				}
			}
			
			//���α׷� ����
			else if (check == 6) {
				break;
			}
			
			//����
			else {
				System.out.println("���ڸ� ��Ȯ�� �Է��ϼ���.");
			}
		}
		
		sc.close();
	}

}
