package PowerJavaCompact;

import java.util.Scanner;

public class ProgrammingExercise02_4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double rad;
		
		//���� �������� �Է¹���
		System.out.print("���� ������: ");
		rad = sc.nextDouble();
		
		//���� ���Ǹ� ���
		System.out.println("���� ����: " + 4*rad*rad*rad/3);
		
		sc.close();
	}

}
