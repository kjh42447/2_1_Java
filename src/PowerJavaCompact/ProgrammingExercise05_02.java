package PowerJavaCompact;

import java.util.Scanner;

public class ProgrammingExercise05_02 {

	public static void main(String[] args) {
		Scanner sc =  new Scanner(System.in);
		int[] sit = new int[10];
		int count = 0;
		
		while (count < 10) {
			//�ڸ� ��Ȳ�� �����ְ� �¼� �Է¹���
			System.out.println("------------------------------");
			System.out.println("0 1 2 3 4 5 6 7 8 9");
			System.out.println("------------------------------");
			for (int i : sit) System.out.print(i + " ");
			System.out.println("\n------------------------------");
			System.out.print("���° �¼��� �����Ͻðڽ��ϱ�? ");
			int sitNum = sc.nextInt();
		
			//�¼� Ȯ���ϰ� ����
			if (sit[sitNum] == 1) {
				System.out.println("�̹� ���� �Ϸ�� �¼��Դϴ�. ");
				continue;
			}
			else {
				sit[sitNum] = 1;
				count++;
				System.out.println("����Ǿ����ϴ�.\n");
			}
		}
		sc.close();
	}

}
