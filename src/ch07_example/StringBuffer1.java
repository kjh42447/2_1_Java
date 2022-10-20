//StringBuffer 클래스를 테스트하라.
package ch07_example;

public class StringBuffer1 {

	public static void main(String[] args) {
		StringBuffer sb1 = new StringBuffer();
		sb1.append("test");
		sb1.insert(0, "StringBuffer ");
		StringBuffer sb2 = new StringBuffer(sb1.substring(0, 12));
		
		System.out.println(sb1);
		System.out.println("길이 : " + sb1.length() + ", 버퍼 크기 : " + sb1.capacity());
		System.out.println(sb2);
		System.out.println("길이 : " + sb2.length() + ", 버퍼 크기 : " + sb2.capacity());
	}

}
