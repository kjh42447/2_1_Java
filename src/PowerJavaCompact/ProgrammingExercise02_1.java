package PowerJavaCompact;

import java.util.Scanner;

public class ProgrammingExercise02_1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int x;
		
		//������ ���� �Է¹ޱ�
		System.out.print("�������� ������ �Է��Ͻÿ�: ");
		x = sc.nextInt();
		
		//�ڽ� ������ ������ ���
		System.out.println(x/10 + "�ڽ��� �ʿ��ϰ� " + x%10 + "���� �����ϴ�.");
		sc.close();
	}

}
