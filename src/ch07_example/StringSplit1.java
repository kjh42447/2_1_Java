//문자열을 공백을 기준으로 분리시켜라.
package ch07_example;

public class StringSplit1 {

	public static void main(String[] args) {
		String s = "Apple Banana Orange Mango";
		
		System.out.println("s = " + s);
		
		for (String token : s.split(" ")) {
			System.out.println(token);
		}
	}

}
