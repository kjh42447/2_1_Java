package PowerJavaCompact;

import java.util.Scanner;

public class ProgrammingExercise03_08 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		//����� ���� 2���� �Է¹޴´�
		System.out.print("������ �Է��ϼ���:");
		char os = sc.next().charAt(0);
		System.out.print("���� 2���� �Է��ϼ���:");
		double a = sc.nextInt(), b = sc.nextInt();
		
		//���� ����� ����Ѵ�
		if (os == '+')
			System.out.printf("%.1f+%.1f = %.1f\n", a, b, a+b);
		else if (os == '-')
			System.out.printf("%.1f-%.1f = %.1f\n", a, b, a-b);
		else if (os == '*')
			System.out.printf("%.1f*%.1f = %.1f\n", a, b, a*b);
		else if (os == '/') {
			if (b == 0)
				System.out.println("�и��� ���� �ùٸ��� �ʽ��ϴ�.");
			else
				System.out.printf("%.1f/%.1f = %.1f\n", a, b, a/b);
		}
		else
			System.out.println("���� ��ȣ�� �ùٸ��� �ʽ��ϴ�.");
		sc.close();
	}
	
}
