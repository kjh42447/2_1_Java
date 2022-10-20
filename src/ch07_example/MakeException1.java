//고의적으로 배열의 범위를 벗어나는 값을 인덱스하여 강제적으로 예외를 발생시켜라.
package ch07_example;

import java.util.*;

public class MakeException1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] list = {1, 2, 3};
		
		System.out.print("원하는 값을 입력하세요 : ");
		int i = sc.nextInt();
		sc.nextLine();
		
		System.out.println(list[i]);
		
		sc.close();
	}

}
