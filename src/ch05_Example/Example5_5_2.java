//Athlete클래스를 만들어라. 인원을 입력받고 인원수만큼 이름과 운동종목을 입력받아 Athlete 객체배열에 저장 후 다시 출력하는 프로그램을 작성한다.
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
		
		System.out.print("인원을 입력하시오 : ");
		int x = sc.nextInt();
		sc.nextLine();//엔터를 먹는다.
		
		Athlete[] list = new Athlete[x];
		for (int i = 0; i < x; i++) {
			System.out.print("운동선수 이름 : ");
			String name = sc.nextLine();
			System.out.print("종목 이름 : ");
			String exercise = sc.nextLine();
			list[i] = new Athlete(name, exercise);
		}
		
		for(int i = 0; i < list.length; i++)
			System.out.println("{ " + list[i].name + ", " + list[i].exercise + " }");
		
		sc.close();
	}
}
