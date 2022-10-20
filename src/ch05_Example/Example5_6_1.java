//이름과 나이와 직업을 Person이라는 클래스로 정의하고 Person객체를 저장하는 동적 배열을 생성하는 프로그램을 작성하라.
package ch05_Example;

import java.util.ArrayList;

class Person{
	String name, job;
	int age;
	
	public Person(String name, int age, String job) {
		this.name = name;
		this.age = age;
		this.job = job;
	}
}
public class Example5_6_1 {
	public static void main(String[] args) {
		ArrayList<Person> list = new ArrayList<Person>();
		list.add(new Person("홍길동", 28, "teacher"));
		list.add(new Person("김유신", 38, "professor"));
		list.add(new Person("최자영", 33, "athlete"));
		list.add(new Person("김영희", 37, "housewife"));
		
		for (Person obj : list)
			System.out.println("(" + obj.name + ", " + obj.age + ", " + obj.job + ")");
	}
}
