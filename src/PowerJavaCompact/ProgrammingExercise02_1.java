package PowerJavaCompact;

import java.util.Scanner;

public class ProgrammingExercise02_1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int x;
		
		//오랜지 개수 입력받기
		System.out.print("오렌지의 개수를 입력하시오: ");
		x = sc.nextInt();
		
		//박스 개수와 나머지 출력
		System.out.println(x/10 + "박스가 필요하고 " + x%10 + "개가 남습니다.");
		sc.close();
	}

}
