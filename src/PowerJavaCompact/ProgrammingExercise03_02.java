package PowerJavaCompact;

import java.util.Scanner;

public class ProgrammingExercise03_02 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		//정수를 입력받고 문자를 출력
		System.out.print("정수를 입력하세요: ");
		int x = sc.nextInt();
		
		switch(x) {
		case 1:
			System.out.println("ONE");
			break;
		case 2:
			System.out.println("TWO");
			break;
		case 3:
			System.out.println("THREE");
			break;
		case 4:
			System.out.println("FOUR");
			break;
		case 5:
			System.out.println("FIVE");
			break;
		case 6:
			System.out.println("SIX");
			break;
		case 7:
			System.out.println("SEVEN");
			break;
		case 8:
			System.out.println("EIGHT");
			break;
		case 9:
			System.out.println("NINE");
			break;
		default:
			System.out.println("OTHER");
			break;
		}
		sc.close();
	}
	
}
