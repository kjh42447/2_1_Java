//�̸��� ���̿� ������ Person�̶�� Ŭ������ �����ϰ� Person��ü�� �����ϴ� ���� �迭�� �����ϴ� ���α׷��� �ۼ��϶�.
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
		list.add(new Person("ȫ�浿", 28, "teacher"));
		list.add(new Person("������", 38, "professor"));
		list.add(new Person("���ڿ�", 33, "athlete"));
		list.add(new Person("�迵��", 37, "housewife"));
		
		for (Person obj : list)
			System.out.println("(" + obj.name + ", " + obj.age + ", " + obj.job + ")");
	}
}
