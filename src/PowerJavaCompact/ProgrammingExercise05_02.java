package PowerJavaCompact;

import java.util.Scanner;

public class ProgrammingExercise05_02 {

	public static void main(String[] args) {
		Scanner sc =  new Scanner(System.in);
		int[] sit = new int[10];
		int count = 0;
		
		while (count < 10) {
			//자리 상황을 보여주고 좌석 입력받음
			System.out.println("------------------------------");
			System.out.println("0 1 2 3 4 5 6 7 8 9");
			System.out.println("------------------------------");
			for (int i : sit) System.out.print(i + " ");
			System.out.println("\n------------------------------");
			System.out.print("몇번째 좌석을 예악하시겠습니까? ");
			int sitNum = sc.nextInt();
		
			//좌석 확인하고 예약
			if (sit[sitNum] == 1) {
				System.out.println("이미 예약 완료된 좌석입니다. ");
				continue;
			}
			else {
				sit[sitNum] = 1;
				count++;
				System.out.println("예약되었습니다.\n");
			}
		}
		sc.close();
	}

}
