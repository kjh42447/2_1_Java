package PowerJavaCompact;

import java.util.Scanner;

public class ProgrammingExercise03_09 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = 0, b = 1, temp = 0;
		
		//����� ���� ������ �Է¹ް� ������ ����Ѵ�
		System.out.print("����� ���� ����: ");
		int x = sc.nextInt();
		
		System.out.printf("%d %d", a, b);
		for (int i = 2; i <= x; i++) {
			temp = b;
			b += a;
			a = temp;
			System.out.printf(" %d", a);
		}
		sc.close();
	}

}
