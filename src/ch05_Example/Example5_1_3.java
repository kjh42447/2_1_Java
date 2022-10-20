//주사위의 갯수를 입력받고 주사위를 굴린 후, 최고숫자를 출력하는 프로그램을 작성하라.
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
		
		System.out.print("주사위의 갯수를 입력하세요 : ");
		int roll = sc.nextInt();
		Dice[] dice = new Dice[roll];
		
		//주사위 객체를 생성
		for(int i = 0; i < roll; i++) {
			dice[i] = new Dice();
		}
		
		System.out.println("주사위의 최고숫자 : " + Dice.maxNum);
		sc.close();
	}

}
