//getClass 메소드를 이용하여 클래스명, 슈퍼클래스명, 필드목록, 메서드 목록을 출력하라.
package ch07_example;

class GetClassTest1_2 {
	
	protected int a;
	protected char s;
	
	public static void method1() {};
	
	public static void method2() {};
	
}

public class GetClass2 {

	public static void main(String[] args) {
		
		GetClassTest1_2 obj = new GetClassTest1_2();
		System.out.println("클래스명 : " + obj.getClass().getName());
		System.out.println("슈퍼클래스명 : " + obj.getClass().getSuperclass().getName());
		System.out.println();
		
		//필드
		System.out.println("필드 목록");
		for (int i = 0; i < obj.getClass().getDeclaredFields().length; i++) {
			System.out.println(obj.getClass().getDeclaredFields()[i]);
		}
		System.out.println();
		
		//메서드
		System.out.println("메서드 목록");
		for (int i = 0; i< obj.getClass().getDeclaredMethods().length; i++) {
			System.out.println(obj.getClass().getDeclaredMethods()[i]);
		}
	}

}
