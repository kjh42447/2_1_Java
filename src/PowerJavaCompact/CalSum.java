package PowerJavaCompact;

import java.util.Scanner;

public class CalSum {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int i = 1;
		int x;
		int sum = 0;
		System.out.print("������ �Է��Ͻÿ�: ");
		x = sc.nextInt();
		while(i <= x) {
			sum = sum+i;
			i++;
		}
		System.out.println("�հ�=" + sum);
	}

}
