//���ڿ��� ������ �������� �и����Ѷ�.
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
