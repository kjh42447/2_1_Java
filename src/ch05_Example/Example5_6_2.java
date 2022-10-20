//이름과 나이와 직업을 가지고 있는 Person2 클래스를 정의하고 사용자에게 필드를 입력받고 Persen2객체에 저장하라.
package ch05_Example;

import java.util.*;

class Person2{
	String name, job;
	int age;
	
	Person2(String name, int age, String job){
		this.name = name;
		this.age = age;
		this.job = job;
	}
}
public class Example5_6_2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ArrayList<Person2> list = new ArrayList<Person2>();
		
		while(true) {
			System.out.print("객체를 추가하려면 1, 종료하려면 2를 입력하시오 : ");
			int check = sc.nextInt();
			sc.nextLine();
			if (check == 1) {
				System.out.print("이름을 입력하시오 : ");
				String name = sc.nextLine();
				System.out.print("나이를 입력하시오 : ");
				int age = sc.nextInt();
				sc.nextLine();
				System.out.print("직업을 입력하시오 : ");
				String job = sc.nextLine();
				list.add(new Person2(name, age, job));
			}
			else if(check == 2)
				break;
			else
				System.out.println("다시 입력하시오 : ");
		}
		for(Person2 obj : list)
			System.out.println(obj.name + ", " + obj.age + ", " + obj.job);
		
		sc.close();
	}
}
