//������ ��Ÿ���� Beast Ŭ������ �����϶�. ����, ����, ������ �Է¹޾� ��ü�� �����ϰ� ����ϴ� ���α׷��� �ۼ��϶�.
package ch05_Example;

import java.util.Scanner;

class Beast{
	private String type, sex;
	private int age;
	
	public Beast(String type, int age, String sex){
		this.setType(type);
		this.setAge(age);
		this.setSex(sex);
	}
	public int getAge()	{		return age;		}
	public void setAge(int age)	{		this.age = age;		}
	public String getType() {		return type;	}
	public void setType(String type) {		this.type = type;	}
	public String getSex() {		return sex;		}
	public void setSex(String sex) {		this.sex = sex;	}
}
public class Example5_5_3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("������ ���� �Է��Ͻÿ� : ");
		int x = sc.nextInt();
		sc.nextLine();
		Beast[] beast = new Beast[x];
		
		for(int i = 0; i < x; i++) {
			System.out.print("������ �Է��Ͻÿ� : ");
			String name = sc.nextLine();
			System.out.print("���̸� �Է��Ͻÿ� : ");
			int age = sc.nextInt();
			sc.nextLine();
			System.out.print("������ �Է��Ͻÿ� : ");
			String sex = sc.nextLine();
			beast[i] = new Beast(name, age, sex);
		}
		
		for(Beast b : beast) 
			System.out.println("������ ���� : " + b.getType() + ", ���� : " + b.getAge() + ", ���� : " + b.getSex());
		
		sc.close();
	}
}
