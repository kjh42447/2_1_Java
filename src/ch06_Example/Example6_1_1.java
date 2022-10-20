//Animal1_1클래스는 일반적인 동물을 나타낸다. Cat1_1클래스는 고양이를 나타낸다. Animal1_1클래스를 상속받아 Cat1_1클래스를 작성하라.
package ch06_Example;

class Animal1_1{
	void eat() {
		System.out.println("먹고 있음");
	}
}
class Cat1_1 extends Animal1_1{
	void meow() {
		System.out.println("울고 있음");
	}
}
public class Example6_1_1 {
	public static void main(String[] args) {
		Cat1_1 c = new Cat1_1();
		c.meow();
		c.eat();
	}
}
