//StringBuffer Ŭ������ �׽�Ʈ�϶�.
package ch07_example;

public class StringBuffer1 {

	public static void main(String[] args) {
		StringBuffer sb1 = new StringBuffer();
		sb1.append("test");
		sb1.insert(0, "StringBuffer ");
		StringBuffer sb2 = new StringBuffer(sb1.substring(0, 12));
		
		System.out.println(sb1);
		System.out.println("���� : " + sb1.length() + ", ���� ũ�� : " + sb1.capacity());
		System.out.println(sb2);
		System.out.println("���� : " + sb2.length() + ", ���� ũ�� : " + sb2.capacity());
	}

}
