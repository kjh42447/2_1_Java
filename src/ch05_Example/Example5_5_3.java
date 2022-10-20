//동물을 나타내는 Beast 클래스를 정의하라. 종류, 나이, 성별을 입력받아 객체로 저장하고 출력하는 프로그램을 작성하라.
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
		
		System.out.print("동물의 수를 입력하시오 : ");
		int x = sc.nextInt();
		sc.nextLine();
		Beast[] beast = new Beast[x];
		
		for(int i = 0; i < x; i++) {
			System.out.print("종류를 입력하시오 : ");
			String name = sc.nextLine();
			System.out.print("나이를 입력하시오 : ");
			int age = sc.nextInt();
			sc.nextLine();
			System.out.print("성별을 입력하시오 : ");
			String sex = sc.nextLine();
			beast[i] = new Beast(name, age, sex);
		}
		
		for(Beast b : beast) 
			System.out.println("동물의 종류 : " + b.getType() + ", 나이 : " + b.getAge() + ", 성별 : " + b.getSex());
		
		sc.close();
	}
}
