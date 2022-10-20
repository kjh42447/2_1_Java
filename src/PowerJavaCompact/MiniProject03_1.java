package PowerJavaCompact;

import java.util.Scanner;

public class MiniProject03_1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int count = 0;
		int guess;
		
		//난수 생성
		int i = (int)(Math.random()*100);
		
		//숫자를 입력받고 크기를 비교
		do {
			System.out.print("정답을 추측하여 보시오: ");
			guess = sc.nextInt();
			count++;
			if (guess < i)
				System.out.println("HIGH");
			else if (guess > i)
				System.out.println("LOW");
		}while(guess != i);
		
		//정답화면과 시도횟수 출력
		System.out.println("축하합니다. 시도횟수=" + count);
		
		sc.close();
	}

}
