//getClass �޼ҵ带 �̿��Ͽ� ��Ű����, �ؽ��ڵ�, Ÿ���� ����϶�.
package ch07_example;

class GetClassTest1_1 {	}

public class GetClass1 {

	public static void main(String[] args) {
		
		GetClassTest1_1 obj = new GetClassTest1_1();
		System.out.println("obj��ü�� ��Ű���� : " + obj.getClass().getPackageName());
		System.out.println("obj��ü�� �ؽ��ڵ� : " + obj.getClass().hashCode());
		System.out.println("obj��ü�� Ÿ�� : " + obj.getClass().getSimpleName());
	}

}
