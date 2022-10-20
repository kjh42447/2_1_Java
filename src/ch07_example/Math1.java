//원의 반지름을 입력받으면 넓이를 출력하라.
package ch07_example;

import java.util.*;

public class Math1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("원의 반지름을 입력하세요 : ");
		double r = sc.nextDouble();
		sc.nextLine();
		
		System.out.println("원의 넓이 : " + Math.PI*r*r);
		
		sc.close();
	}

}
