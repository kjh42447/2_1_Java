//getClass 메소드를 이용하여 패키지명, 해쉬코드, 타입을 출력하라.
package ch07_example;

class GetClassTest1_1 {	}

public class GetClass1 {

	public static void main(String[] args) {
		
		GetClassTest1_1 obj = new GetClassTest1_1();
		System.out.println("obj객체의 패키지명 : " + obj.getClass().getPackageName());
		System.out.println("obj객체의 해쉬코드 : " + obj.getClass().hashCode());
		System.out.println("obj객체의 타입 : " + obj.getClass().getSimpleName());
	}

}
