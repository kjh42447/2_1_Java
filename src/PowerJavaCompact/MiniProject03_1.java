package PowerJavaCompact;

import java.util.Scanner;

public class MiniProject03_1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int count = 0;
		int guess;
		
		//���� ����
		int i = (int)(Math.random()*100);
		
		//���ڸ� �Է¹ް� ũ�⸦ ��
		do {
			System.out.print("������ �����Ͽ� ���ÿ�: ");
			guess = sc.nextInt();
			count++;
			if (guess < i)
				System.out.println("HIGH");
			else if (guess > i)
				System.out.println("LOW");
		}while(guess != i);
		
		//����ȭ��� �õ�Ƚ�� ���
		System.out.println("�����մϴ�. �õ�Ƚ��=" + count);
		
		sc.close();
	}

}
