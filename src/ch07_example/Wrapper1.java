//Wrapper��ü�� ���� �ڷ����� ���� �����ϰ� ����϶�.
package ch07_example;

public class Wrapper1 {

	public static void main(String[] args) {
		
		Integer obj1 = 100;
		int value1 = obj1.intValue();
		
		Double obj2 = new Double(3.141592);	//�ش� ������ version9���� ������� �ʴ� �����̶�� �Ѵ�.
		double value2 = obj2.doubleValue();
		
		System.out.println("value1�� �� : " + value1);
		System.out.println("vlaue2�� �� : " + value2);
	}

}
