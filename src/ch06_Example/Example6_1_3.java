//Animal1_3클래스를 상속받는 Beast1_3클래스를 만들고 Beast1_3클래스를 상속받는 Tiger1_3과 Lion1_3클래스를 작성하라.
package ch06_Example;

import java.util.*;

class Animal1_3{
	private String name;
	private int age;
	public String types;
		
	public String getName() {		return name;	}
	public void setName(String name) {		this.name = name;	}
	public int getAge() {		return age;	}
	public void setAge(int age) {		this.age = age;	}

	public Animal1_3(String name, int age){
		setName(name);
		setAge(age);
	}
	
	void print() {
		System.out.println("이름 : " + this.getName() + ", 나이 : " + this.getAge() + ", 종류 : " + this.types);
	}
}

class Beast1_3 extends Animal1_3{
	
	Beast1_3(String name, int age){
		super(name, age);
	}
	void feed() {
		System.out.println("먹이는 고기입니다.");
	}
}

class Tiger1_3 extends Beast1_3{
	
	Tiger1_3(String name, int age){
		super(name, age);
		this.types = "Tiger";
	}
	
}

class Lion1_3 extends Beast1_3{
	
	Lion1_3(String name, int age){
		super(name, age);
		this.types = "Lion";
	}
	
}
public class Example6_1_3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ArrayList<Animal1_3> list = new ArrayList<Animal1_3>();
		
		while(true) {
			System.out.print("호랑이 객체를 생성하려면 1, 사자 객채를 생성하려면 2, 생성을 종료하려면 3을 입력하시오 : ");
			int check = sc.nextInt();
			sc.nextLine();
			
			if(check == 1) {
				System.out.print("호랑이의 이름을 입력하시오 : ");
				String name = sc.nextLine();
				System.out.print("호랑이의 나이를 입력하시오 :");
				int age = sc.nextInt();
				sc.nextLine();
				list.add(new Tiger1_3(name, age));
			}
			
			else if(check == 2) {
				System.out.print("사자의 이름을 입력하시오 : ");
				String name = sc.nextLine();
				System.out.print("사자의 나이를 입력하시오 :");
				int age = sc.nextInt();
				sc.nextLine();
				list.add(new Lion1_3(name, age));
			}
			
			else if(check == 3) 
				break;
			
			else
				System.out.println("다시 입력하시오");
		}
	
		for(int i = 0; i < list.size(); i++) {
			list.get(i).print();
		}
		
		sc.close();
	}
}
