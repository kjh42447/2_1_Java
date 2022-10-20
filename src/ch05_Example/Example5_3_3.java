//두 애완견의 이름을 바꾸는 changeName 메소드를 작석하라.
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
		
		System.out.println("바꾸기 전 - 첫번째 펫 : " + p1.name + ", 두번째 펫 : " + p2.name);
		MyPet.changeName(p1, p2);
		System.out.println("바꾼 후 - 첫번째 펫 : " + p1.name + ", 두번째 펫 : " + p2.name);
	}
}
