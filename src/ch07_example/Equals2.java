//equals �޼ҵ带 �������ϰ� ���������� ���� �޼ҵ�� ���϶�.
package ch07_example;

class EqualTest2_1 {
	int test;
	
	public EqualTest2_1(int test) {
		this.test = test;
	}
	
	@Override
	public boolean equals(Object obj) {
		if (obj instanceof EqualTest2_1) {
			EqualTest2_1 anotherequal = (EqualTest2_1) obj;
			if (test == anotherequal.test)	return true;
			else	return false;
		}
		return false;
	}
	
}

class EqualTest2_2	{
	int test;
	
	public EqualTest2_2(int test) {
		this.test = test;
	}
}

public class Equals2 {

	public static void main(String[] args) {
		EqualTest2_1 obj1 = new EqualTest2_1(10);
		EqualTest2_1 obj2 = new EqualTest2_1(10);
		
		EqualTest2_2 obj3 = new EqualTest2_2(10);
		EqualTest2_2 obj4 = new EqualTest2_2(10);
		
		System.out.println("������ �� equals �޼ҵ��� ��� : " + obj1.equals(obj2));
		System.out.println("������ ���� ���� equals �޼ҵ��� ��� : " + obj3.equals(obj4));
		
	}

}
