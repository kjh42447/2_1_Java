//Animal1_3Ŭ������ ��ӹ޴� Beast1_3Ŭ������ ����� Beast1_3Ŭ������ ��ӹ޴� Tiger1_3�� Lion1_3Ŭ������ �ۼ��϶�.
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
		System.out.println("�̸� : " + this.getName() + ", ���� : " + this.getAge() + ", ���� : " + this.types);
	}
}

class Beast1_3 extends Animal1_3{
	
	Beast1_3(String name, int age){
		super(name, age);
	}
	void feed() {
		System.out.println("���̴� ����Դϴ�.");
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
			System.out.print("ȣ���� ��ü�� �����Ϸ��� 1, ���� ��ä�� �����Ϸ��� 2, ������ �����Ϸ��� 3�� �Է��Ͻÿ� : ");
			int check = sc.nextInt();
			sc.nextLine();
			
			if(check == 1) {
				System.out.print("ȣ������ �̸��� �Է��Ͻÿ� : ");
				String name = sc.nextLine();
				System.out.print("ȣ������ ���̸� �Է��Ͻÿ� :");
				int age = sc.nextInt();
				sc.nextLine();
				list.add(new Tiger1_3(name, age));
			}
			
			else if(check == 2) {
				System.out.print("������ �̸��� �Է��Ͻÿ� : ");
				String name = sc.nextLine();
				System.out.print("������ ���̸� �Է��Ͻÿ� :");
				int age = sc.nextInt();
				sc.nextLine();
				list.add(new Lion1_3(name, age));
			}
			
			else if(check == 3) 
				break;
			
			else
				System.out.println("�ٽ� �Է��Ͻÿ�");
		}
	
		for(int i = 0; i < list.size(); i++) {
			list.get(i).print();
		}
		
		sc.close();
	}
}
