//getClass �޼ҵ带 �̿��Ͽ� Ŭ������, ����Ŭ������, �ʵ���, �޼��� ����� ����϶�.
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
		System.out.println("Ŭ������ : " + obj.getClass().getName());
		System.out.println("����Ŭ������ : " + obj.getClass().getSuperclass().getName());
		System.out.println();
		
		//�ʵ�
		System.out.println("�ʵ� ���");
		for (int i = 0; i < obj.getClass().getDeclaredFields().length; i++) {
			System.out.println(obj.getClass().getDeclaredFields()[i]);
		}
		System.out.println();
		
		//�޼���
		System.out.println("�޼��� ���");
		for (int i = 0; i< obj.getClass().getDeclaredMethods().length; i++) {
			System.out.println(obj.getClass().getDeclaredMethods()[i]);
		}
	}

}
