//�̸��� ���̿� ������ ������ Ŭ���� Person3�� �����Ͽ� ����ڿ��� �ʵ带 �Է¹ް� ���� ��ü�� ���� �� ����϶�.
package ch05_Example;

import java.util.*;

class Person3{
	private String name, job;
	private int age;
	
	public Person3(String name, int age, String job) {
		this.setName(name);
		this.setAge(age);
		this.setJob(job);
	}
	
	public void setName(String name)	{ 	this.name = name;	}
	public String getName()		{	return name;	}
	public void setAge(int age)	{	this.age = age;	}
	public int getAge()		{	return age;		}
	public void setJob(String job)	{	this.job = job;		}
	public String getJob()		{	return job;		}
}
public class Example5_6_3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ArrayList<Person3> list = new ArrayList<Person3>();
		
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
				list.add(new Person3(name, age, job));
			}
			else if(check == 2)
				break;
			else
				System.out.println("�ٽ� �Է��Ͻÿ� : ");
		}
		for (int i = 0; i < list.size(); i++)
			System.out.println(list.get(i).getName() + ", " + list.get(i).getAge() + ", " + list.get(i).getJob());
		
		sc.close();
	}
}
