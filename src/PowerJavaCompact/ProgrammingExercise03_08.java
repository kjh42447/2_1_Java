package PowerJavaCompact;

import java.util.Scanner;

public class ProgrammingExercise03_08 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		//연산과 숫자 2개를 입력받는다
		System.out.print("연산을 입력하세요:");
		char os = sc.next().charAt(0);
		System.out.print("숫자 2개를 입력하세요:");
		double a = sc.nextInt(), b = sc.nextInt();
		
		//연산 결과를 출력한다
		if (os == '+')
			System.out.printf("%.1f+%.1f = %.1f\n", a, b, a+b);
		else if (os == '-')
			System.out.printf("%.1f-%.1f = %.1f\n", a, b, a-b);
		else if (os == '*')
			System.out.printf("%.1f*%.1f = %.1f\n", a, b, a*b);
		else if (os == '/') {
			if (b == 0)
				System.out.println("분모의 값이 올바르지 않습니다.");
			else
				System.out.printf("%.1f/%.1f = %.1f\n", a, b, a/b);
		}
		else
			System.out.println("연산 기호가 올바르지 않습니다.");
		sc.close();
	}
	
}
