//분리문자를 ", "로 지정하여 문자열을 분리하라.
package ch07_example;

public class StringSplit3 {

	public static void main(String[] args) {
		String s = "Spring, Summer, Fall, Winter";
		
		System.out.println(s);
		for (String token : s.split(", ")) {
			System.out.println(token);
		}
	}

}
