package PowerJavaCompact;

import java.util.Scanner;

public class ProgrammingExercise02_5 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int x, y;
		int toBinary = 0;
		
		//������ �Է¹���
		System.out.print("����: ");
		x = sc.nextInt();
		y =x;
		
		//2������ ��ȯ�Ͽ� ���
		toBinary += x%2;
		x /= 2;
		toBinary += x%2*10;
		x /= 2;
		toBinary += x%2*100;
		x /= 2;
		toBinary += x%2*1000;
		x /= 2;
		toBinary += x%2*10000;
		x /= 2;
		toBinary += x%2*100000;
		x /= 2;
		toBinary += x%2*1000000;
		x /= 2;
		toBinary += x%2*10000000;
		x /= 2;
		toBinary += x%2*100000000;
		x /= 2;
		toBinary += x%2*1000000000;
		System.out.println(y + ": " + toBinary);
		
		sc.close();
	}

}
