//���� �������� �Է¹����� ���̸� ����϶�.
package ch07_example;

import java.util.*;

public class Math1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("���� �������� �Է��ϼ��� : ");
		double r = sc.nextDouble();
		sc.nextLine();
		
		System.out.println("���� ���� : " + Math.PI*r*r);
		
		sc.close();
	}

}
