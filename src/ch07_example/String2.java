//���ڿ� ��ü�� 2���� ����� �̿��Ͽ� ������ ������ ���϶�.
package ch07_example;

public class String2 {

	public static void main(String[] args) {
		String s1 = new String("String");
		String s2 = new String("String");
		String s3 = "String";
		String s4 = "String";
		
		System.out.println(s1 == s2);
		System.out.println(s2 == s3);
		System.out.println(s3 == s4);
	}

}
