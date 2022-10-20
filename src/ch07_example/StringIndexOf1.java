//indexOf 사용시 동일한 문자열이 여러개 있을 경우 어떠한 결과를 가져오는지 확인하라.
package ch07_example;

public class StringIndexOf1 {

	public static void main(String[] args) {
		String s = "on and on and on";
		
		System.out.println("s = " + s);
		System.out.println("s.indexOf(\"and\") = " + s.indexOf("and"));
	}

}
