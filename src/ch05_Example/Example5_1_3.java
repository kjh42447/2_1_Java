//�ֻ����� ������ �Է¹ް� �ֻ����� ���� ��, �ְ���ڸ� ����ϴ� ���α׷��� �ۼ��϶�.
package ch05_Example;

import java.util.*;

class Dice{
	private int number;
	static int maxNum = 0;
	
	public Dice() {
		this.number = (int)(Math.random()*6) + 1;
		maxNum = this.number > maxNum ? this.number : maxNum;
	}
}
public class Example5_1_3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("�ֻ����� ������ �Է��ϼ��� : ");
		int roll = sc.nextInt();
		Dice[] dice = new Dice[roll];
		
		//�ֻ��� ��ü�� ����
		for(int i = 0; i < roll; i++) {
			dice[i] = new Dice();
		}
		
		System.out.println("�ֻ����� �ְ���� : " + Dice.maxNum);
		sc.close();
	}

}
