package PowerJavaCompact;

import java.util.Scanner;

public class ProgrammingExercise02_4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double rad;
		
		//구의 반지름을 입력받음
		System.out.print("구의 반지름: ");
		rad = sc.nextDouble();
		
		//구의 부피를 출력
		System.out.println("구의 부피: " + 4*rad*rad*rad/3);
		
		sc.close();
	}

}
