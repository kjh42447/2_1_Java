//Animal1_2Ŭ������ ������ ��Ÿ���� Ŭ�����̰�  Beast1_2�� �ͼ��� ��Ÿ���� Ŭ�����̴�. Beast1_2�� ��ӹ޴� Tiger1_2Ŭ������ �����϶�.
package ch06_Example;

class Animal1_2{
	String name;
	int age;
	
	Animal1_2(String name, int age){
		this.name = name;
		this.age = age;
	}
}

class Beast1_2 extends Animal1_2{
	
	Beast1_2(String name, int age){
		super(name, age);
	}
	void feed() {
		System.out.println("���̴� ����Դϴ�.");
	}
}

class Tiger1_2 extends Beast1_2{
	
	Tiger1_2(String name, int age){
		super(name, age);
	}
	
	void types() {
		System.out.println("������ ���� ȣ�����Դϴ�.");
	}
}
public class Example6_1_2 {
	public static void main(String[] args) {
		Tiger1_2 t = new Tiger1_2("Tiger", 2);
		t.feed();
		t.types();
	}
}
