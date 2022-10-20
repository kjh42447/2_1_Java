//고의적으로 배열의 크기를 음수로 만들어 예외를 발생시켜라.
package ch07_example;

import java.util.*;

public class MakeException2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("배열의 크기를 입력하세요 : ");
		int i = sc.nextInt();
		sc.nextLine();
		
		int[] list = new int[i];
		
		System.out.println(list[0]);
		
		sc.close();
	}

}
