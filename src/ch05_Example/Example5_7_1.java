//speciesŬ������ ���� Ŭ������ ������ AnimalŬ������ �����ϰ� ���� �Է¹޾� �����ϰ� ����ϰ�.
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
		Animal obj = new Animal("�ٵ���", "��", "����");
		System.out.println(obj.name + ", " + obj.species.type + ", " + obj.species.sex);
	}
}
