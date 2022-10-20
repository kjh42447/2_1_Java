//Animal1_2클래스는 동물을 나타내는 클래스이고  Beast1_2는 맹수를 나타내는 클래스이다. Beast1_2를 상속받는 Tiger1_2클래스를 생성하라.
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
		System.out.println("먹이는 고기입니다.");
	}
}

class Tiger1_2 extends Beast1_2{
	
	Tiger1_2(String name, int age){
		super(name, age);
	}
	
	void types() {
		System.out.println("동물의 종은 호랑이입니다.");
	}
}
public class Example6_1_2 {
	public static void main(String[] args) {
		Tiger1_2 t = new Tiger1_2("Tiger", 2);
		t.feed();
		t.types();
	}
}
