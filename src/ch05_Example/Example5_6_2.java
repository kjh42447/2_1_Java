//�̸��� ���̿� ������ ������ �ִ� Person2 Ŭ������ �����ϰ� ����ڿ��� �ʵ带 �Է¹ް� Persen2��ü�� �����϶�.
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
			System.out.print("��ü�� �߰��Ϸ��� 1, �����Ϸ��� 2�� �Է��Ͻÿ� : ");
			int check = sc.nextInt();
			sc.nextLine();
			if (check == 1) {
				System.out.print("�̸��� �Է��Ͻÿ� : ");
				String name = sc.nextLine();
				System.out.print("���̸� �Է��Ͻÿ� : ");
				int age = sc.nextInt();
				sc.nextLine();
				System.out.print("������ �Է��Ͻÿ� : ");
				String job = sc.nextLine();
				list.add(new Person2(name, age, job));
			}
			else if(check == 2)
				break;
			else
				System.out.println("�ٽ� �Է��Ͻÿ� : ");
		}
		for(Person2 obj : list)
			System.out.println(obj.name + ", " + obj.age + ", " + obj.job);
		
		sc.close();
	}
}
