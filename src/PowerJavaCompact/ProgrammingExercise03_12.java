package PowerJavaCompact;

import java.util.Scanner;

public class ProgrammingExercise03_12 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int sum = 0;
		
		for (int i = 1; i <= 5; i++) {
			System.out.print("������ �Է��ϼ���: ");
			sum += sc.nextInt();
		}
		System.out.println("�հ� : " + sum);
		System.out.println("��� : " + sum/5.0);
		
		sc.close();
	}

}
