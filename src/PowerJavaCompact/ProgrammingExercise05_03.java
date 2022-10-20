package PowerJavaCompact;

import java.util.Scanner;

public class ProgrammingExercise05_03 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int sum = 0;
		
		for (int i = 1; i <= 5; i++) {
			System.out.print("성적을 입력하세요: ");
			sum += sc.nextInt();
		}
		System.out.print("\n");
		System.out.println("합계 : " + sum);
		System.out.println("평균 : " + sum/5.0);
		
		sc.close();
	}

}
