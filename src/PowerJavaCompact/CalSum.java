package PowerJavaCompact;

import java.util.Scanner;

public class CalSum {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int i = 1;
		int x;
		int sum = 0;
		System.out.print("정수를 입력하시오: ");
		x = sc.nextInt();
		while(i <= x) {
			sum = sum+i;
			i++;
		}
		System.out.println("합계=" + sum);
	}

}
