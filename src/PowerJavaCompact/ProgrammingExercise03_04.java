package PowerJavaCompact;

import java.util.Scanner;

public class ProgrammingExercise03_04 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int hight, weight;
		
		//Ű�� �����Ը� �Է¹޴´�
		System.out.print("Ű�� �Է��ϼ���: ");
		hight = sc.nextInt();
		System.out.print("�����Ը� �Է��ϼ���: ");
		weight = sc.nextInt();
		
		//ǥ��ü�߰� ���Ͽ� ����� ����Ѵ�
		if (weight > (hight - 100)*0.9)
			System.out.println("��ü���Դϴ�.");
		else if (weight < (hight-100)*0.9)
			System.out.println("��ü���Դϴ�.");
		else
			System.out.print("ǥ��ü���Դϴ�.");
		
		sc.close();
	}

}
