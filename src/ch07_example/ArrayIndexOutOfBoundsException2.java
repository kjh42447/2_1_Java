//����ڿ��� �迭 ������ �Է¹޾� �迭�� ����� ���� ������ϴ� ���α׷��� �ۼ��϶�.
package ch07_example;

import java.util.*;

public class ArrayIndexOutOfBoundsException2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String[] array;
		int i, range;
		boolean exit = false;
		
		//�迭 ����
		while(true) {
			try {
				System.out.print("���ڿ� �迭�� ������ �Է��ϼ��� : ");
				range = sc.nextInt();
				sc.nextLine();
				array = new String[range];
				break;
			}
			
			catch(InputMismatchException e) {
				System.out.println("�ڿ����� �Է��ϼ���.");
				System.out.println("���α׷��� ��� ����˴ϴ�.");
				sc = new Scanner(System.in);
			}
			
			catch(NegativeArraySizeException e) {
				System.out.println("�ڿ����� �Է��ϼ���.");
				System.out.println("���α׷��� ��� ����˴ϴ�.");
				sc = new Scanner(System.in);
			}
		}
		
		//�����
		while(!exit) {
			System.out.println("�Է��� ���ϸ� '�Է�', ����� ���ϸ� '���', ���Ḧ ���ϸ� '����'�� �Է��ϼ���.");
			String check = sc.nextLine();
			
			switch(check) {
			//�Է�
			case "�Է�": 
				while(true) {
					try {
						System.out.print("�Է��� ���ϴ� �迭�� ��ȣ�� �Է��ϼ��� : ");
						i = sc.nextInt();
						sc.nextLine();
						
						try {
							array[i] = null;
							System.out.print("���ڿ��� �Է��ϼ��� : ");
							array[i] = sc.nextLine();
							break;
						}
						catch(ArrayIndexOutOfBoundsException e) {
							System.out.println("�ε��� " + i + "�� ����� �� �����ϴ�.");
							sc = new Scanner(System.in);
						}
					}
					catch(InputMismatchException e) {
						System.out.println("������ �Է��ϼ���.");
						System.out.println("���α׷��� ��� ����˴ϴ�.");
						sc = new Scanner(System.in);
					}
				}
				break;
			
			//���
			case "���":
				while(true) {
					try {
						System.out.print("����� ���ϴ� �迭�� ��ȣ�� �Է��ϼ��� : ");
						i = sc.nextInt();
						sc.nextLine();
						
						try {
							System.out.println(array[i]);
							break;
						}
						catch(ArrayIndexOutOfBoundsException e) {
							System.out.println("�ε��� " + i + "�� ����� �� �����ϴ�.");
							sc = new Scanner(System.in);
						}
					}
					catch(InputMismatchException e) {
						System.out.println("������ �Է��ϼ���.");
						System.out.println("���α׷��� ��� ����˴ϴ�.");
						sc = new Scanner(System.in);
					}
				}
				break;
				
			//����
			case "����":
				exit = true;
				break;
			
			//����
			default:
				System.out.println("����� �ٽ� �Է��ϼ���.");
				break;
				
			}
		}
		
		sc.close();
	}

}
