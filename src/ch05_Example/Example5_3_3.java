//�� �ֿϰ��� �̸��� �ٲٴ� changeName �޼ҵ带 �ۼ��϶�.
package ch05_Example;

class MyPet{
	String name;
	
	MyPet(String name){
		this.name = name;
	}
	
	static void changeName(MyPet p1, MyPet p2) {
		String temp = p1.name;
		p1.name = p2.name;
		p2.name = temp;
	}
}
public class Example5_3_3 {
	public static void main(String[] args) {
		MyPet p1 = new MyPet("happy");
		MyPet p2 = new MyPet("Lucky");
		
		System.out.println("�ٲٱ� �� - ù��° �� : " + p1.name + ", �ι�° �� : " + p2.name);
		MyPet.changeName(p1, p2);
		System.out.println("�ٲ� �� - ù��° �� : " + p1.name + ", �ι�° �� : " + p2.name);
	}
}
