//Animal1_1Ŭ������ �Ϲ����� ������ ��Ÿ����. Cat1_1Ŭ������ ����̸� ��Ÿ����. Animal1_1Ŭ������ ��ӹ޾� Cat1_1Ŭ������ �ۼ��϶�.
package ch06_Example;

class Animal1_1{
	void eat() {
		System.out.println("�԰� ����");
	}
}
class Cat1_1 extends Animal1_1{
	void meow() {
		System.out.println("��� ����");
	}
}
public class Example6_1_1 {
	public static void main(String[] args) {
		Cat1_1 c = new Cat1_1();
		c.meow();
		c.eat();
	}
}
