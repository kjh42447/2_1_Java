//������ ���� ���α׷� �� �ϳ��� ������ ��ºκ��� toString�޼ҵ� �����Ǹ� �̿��Ͽ� �ۼ��϶�.
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
		return "�̸� : " + this.getName() + ", ���� : " + this.getAge() + ", ���� : " + this.types;
	}
}

class Beast2_2 extends Animal2_2{
	
	Beast2_2(String name, int age){
		super(name, age);
	}
	void feed() {
		System.out.println("���̴� ����Դϴ�.");
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
			System.out.print("ȣ���� ��ü�� �����Ϸ��� 1, ���� ��ä�� �����Ϸ��� 2, ������ �����Ϸ��� 3�� �Է��Ͻÿ� : ");
			int check = sc.nextInt();
			sc.nextLine();
			
			if(check == 1) {
				System.out.print("ȣ������ �̸��� �Է��Ͻÿ� : ");
				String name = sc.nextLine();
				System.out.print("ȣ������ ���̸� �Է��Ͻÿ� :");
				int age = sc.nextInt();
				sc.nextLine();
				list.add(new Tiger2_2(name, age));
			}
			
			else if(check == 2) {
				System.out.print("������ �̸��� �Է��Ͻÿ� : ");
				String name = sc.nextLine();
				System.out.print("������ ���̸� �Է��Ͻÿ� :");
				int age = sc.nextInt();
				sc.nextLine();
				list.add(new Lion2_2(name, age));
			}
			
			else if(check == 3) 
				break;
			
			else
				System.out.println("�ٽ� �Է��Ͻÿ�");
		}
	
		for(int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}
		
		sc.close();
	}
}
