//length, charAt, concat 메소드를 테스트하라.
package ch07_example;

public class StringFoundation1 {
	public static void main(String[] args) {
		String s = "StringFoundation";
		
		System.out.println("문자열의 길이(length()) : " + s.length());
		System.out.println("문자열의 7번째 문자(charAt(6)) : " + s.charAt(6));
		System.out.println("문자열을 더하여 출력(concat(s)) : " + s.concat(s));
	}
}
