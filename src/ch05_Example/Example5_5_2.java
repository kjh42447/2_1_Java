//AthleteŬ������ ������. �ο��� �Է¹ް� �ο�����ŭ �̸��� ������� �Է¹޾� Athlete ��ü�迭�� ���� �� �ٽ� ����ϴ� ���α׷��� �ۼ��Ѵ�.
package ch05_Example;

import java.util.Scanner;

class Athlete{
	String name, exercise;
	
	Athlete(String name, String exercise){
		this.name = name;
		this.exercise = exercise;
	}
}
public class Example5_5_2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("�ο��� �Է��Ͻÿ� : ");
		int x = sc.nextInt();
		sc.nextLine();//���͸� �Դ´�.
		
		Athlete[] list = new Athlete[x];
		for (int i = 0; i < x; i++) {
			System.out.print("����� �̸� : ");
			String name = sc.nextLine();
			System.out.print("���� �̸� : ");
			String exercise = sc.nextLine();
			list[i] = new Athlete(name, exercise);
		}
		
		for(int i = 0; i < list.length; i++)
			System.out.println("{ " + list[i].name + ", " + list[i].exercise + " }");
		
		sc.close();
	}
}
