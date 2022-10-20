package PowerJavaCompact;

import java.util.Scanner;

public class ProgrammingExercise02_3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int money, price;
		
		//받은 돈과 상품가격 입력받기
		System.out.print("받은 돈: ");
		money = sc.nextInt();
		System.out.print("상품 가격: ");
		price = sc.nextInt();
				
		//부가세와 잔돈 출력
		System.out.println("부가세: " + price/10);
		System.out.println("잔돈: " + (money-price));
		
		sc.close();
	}

}
