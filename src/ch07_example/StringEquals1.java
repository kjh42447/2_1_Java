//문자열 비교 시 equals와 ==의 차이를 확인하라.
package ch07_example;

public class StringEquals1 {

	public static void main(String[] args) {
		String s1 = new String("String");
		String s2 = new String("String");
		String s3 = "String";
		String s4 = "String";
		
		System.out.println("String s1 = new String(\"String\");");
		System.out.println("String s2 = new String(\"String\");");
		System.out.println("String s3 = \"String\";");
		System.out.println("String s4 = \"String\";");
		System.out.println();
		
		System.out.println("s1.equals(s2) = " + s1.equals(s2));
		System.out.println("s1 == s2 = " + (s1 == s2));
		System.out.println("s3.equals(s4) = " + s3.equals(s4));
		System.out.println("s3 == s4 = " + (s3 == s4));
	}

}
