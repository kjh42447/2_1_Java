package PowerJavaCompact;

import java.util.Scanner;

public class ProgrammingExercise02_2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double mile;
		
		//���� �Է¹ޱ�
		System.out.print("������ �Է��Ͻÿ�: ");
		mile = sc.nextDouble();
		
		//ų�ι��ͷ� ��ȯ�Ͽ� ���
		System.out.println(mile + "������ " + mile*1.609 + "ų�ι����Դϴ�.");
		
		sc.close();
	}

}
