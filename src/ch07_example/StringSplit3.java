//�и����ڸ� ", "�� �����Ͽ� ���ڿ��� �и��϶�.
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
