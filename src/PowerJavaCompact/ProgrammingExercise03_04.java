package PowerJavaCompact;

import java.util.Scanner;

public class ProgrammingExercise03_04 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int hight, weight;
		
		//키와 몸무게를 입력받는다
		System.out.print("키를 입력하세요: ");
		hight = sc.nextInt();
		System.out.print("몸무게를 입력하세요: ");
		weight = sc.nextInt();
		
		//표준체중과 비교하여 결과를 출력한다
		if (weight > (hight - 100)*0.9)
			System.out.println("과체중입니다.");
		else if (weight < (hight-100)*0.9)
			System.out.println("저체중입니다.");
		else
			System.out.print("표준체중입니다.");
		
		sc.close();
	}

}
