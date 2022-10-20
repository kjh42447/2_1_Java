//equals메소드를 재정의하라.
package ch07_example;

class EqualTest1 {
	int test;
	
	public EqualTest1(int test) {
		this.test = test;
	}
	
	@Override
	public boolean equals(Object obj) {
		if (obj instanceof EqualTest1) {
			EqualTest1 anotherequal = (EqualTest1) obj;
			if (test == anotherequal.test)	return true;
			else	return false;
		}
		return false;
	}
	
}

public class Equals1 {

	public static void main(String[] args) {
		EqualTest1 obj1 = new EqualTest1(10);
		EqualTest1 obj2 = new EqualTest1(10);
		EqualTest1 obj3 = new EqualTest1(15);
		
		System.out.println("obj1, obj2 필드 값의 크기 : " + obj1.equals(obj2));
		System.out.println("obj2, obj3 필드 값의 크기 : " + obj2.equals(obj3));
		System.out.println("obj3, obj2 필드 값의 크기 : " + obj3.equals(obj2));
	}

}
