//이름과 나이와 직업을 가지는 클래스 Person3을 정의하여 사용자에게 필드를 입력받고 동적 객체에 저장 후 출력하라.
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
				list.add(new Person3(name, age, job));
			}
			else if(check == 2)
				break;
			else
				System.out.println("다시 입력하시오 : ");
		}
		for (int i = 0; i < list.size(); i++)
			System.out.println(list.get(i).getName() + ", " + list.get(i).getAge() + ", " + list.get(i).getJob());
		
		sc.close();
	}
}
