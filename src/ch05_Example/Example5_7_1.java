//species클래스를 내부 클래스로 가지는 Animal클래스를 정의하고 값을 입력받아 저장하고 출력하가.
package ch05_Example;

class Animal{
	String name;
	Species species;
	Animal(String name, String type, String sex){
		this.name = name;
		this.species = new Species(type, sex);
	}
	class Species{
		String type, sex;
		
		Species(String type, String sex){
			this.type = type;
			this.sex = sex;
		}
	}
	
}
public class Example5_7_1 {
	public static void main(String[] args) {
		Animal obj = new Animal("바둑이", "개", "수컷");
		System.out.println(obj.name + ", " + obj.species.type + ", " + obj.species.sex);
	}
}
