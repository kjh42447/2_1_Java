package PowerJavaCompact;

import java.util.Scanner;

public class ProgrammingExercise02_2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double mile;
		
		//마일 입력받기
		System.out.print("마일을 입력하시오: ");
		mile = sc.nextDouble();
		
		//킬로미터로 변환하여 출력
		System.out.println(mile + "마일은 " + mile*1.609 + "킬로미터입니다.");
		
		sc.close();
	}

}
