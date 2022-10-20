//이전에 만든 프로그램 중 하나를 가져와 출력부분을 toString메소드 재정의를 이용하여 작성하라.
package ch07_example;

import java.util.*;

class Animal2_2{
	private String name;
	private int age;
	public String types;
		
	public String getName() {		return name;	}
	public void setName(String name) {		this.name = name;	}
	public int getAge() {		return age;	}
	public void setAge(int age) {		this.age = age;	}

	public Animal2_2(String name, int age){
		setName(name);
		setAge(age);
	}
	
	@Override
	public String toString() {
		return "이름 : " + this.getName() + ", 나이 : " + this.getAge() + ", 종류 : " + this.types;
	}
}

class Beast2_2 extends Animal2_2{
	
	Beast2_2(String name, int age){
		super(name, age);
	}
	void feed() {
		System.out.println("먹이는 고기입니다.");
	}
}

class Tiger2_2 extends Beast2_2{
	
	Tiger2_2(String name, int age){
		super(name, age);
		this.types = "Tiger";
	}
	
}

class Lion2_2 extends Beast2_2{
	
	Lion2_2(String name, int age){
		super(name, age);
		this.types = "Lion";
	}
	
}
public class ToString2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ArrayList<Animal2_2> list = new ArrayList<Animal2_2>();
		
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
				list.add(new Tiger2_2(name, age));
			}
			
			else if(check == 2) {
				System.out.print("사자의 이름을 입력하시오 : ");
				String name = sc.nextLine();
				System.out.print("사자의 나이를 입력하시오 :");
				int age = sc.nextInt();
				sc.nextLine();
				list.add(new Lion2_2(name, age));
			}
			
			else if(check == 3) 
				break;
			
			else
				System.out.println("다시 입력하시오");
		}
	
		for(int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}
		
		sc.close();
	}
}
