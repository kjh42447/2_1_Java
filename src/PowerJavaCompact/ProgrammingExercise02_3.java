package PowerJavaCompact;

import java.util.Scanner;

public class ProgrammingExercise02_3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int money, price;
		
		//���� ���� ��ǰ���� �Է¹ޱ�
		System.out.print("���� ��: ");
		money = sc.nextInt();
		System.out.print("��ǰ ����: ");
		price = sc.nextInt();
				
		//�ΰ����� �ܵ� ���
		System.out.println("�ΰ���: " + price/10);
		System.out.println("�ܵ�: " + (money-price));
		
		sc.close();
	}

}
