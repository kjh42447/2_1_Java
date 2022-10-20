//��ü ���� ���ڿ��̳� ���ڸ� ���ϴ� Comparable_2 �������̽��� �ۼ��ϰ� �����϶�.
package ch06_Example;

interface Comparable_2{
	int compare(int x, int y);
	int compare(String a, String b);
}

class Compare_2 implements Comparable_2{
	
	public int compare(int x, int y) {
		return Integer.compare(x, y);
	}
	
	public int compare(String a, String b) {
		return a.compareTo(b);
	}
}

public class InterfaceExample2_2 {
	public static void main(String[] args) {
		Compare_2 c = new Compare_2();
		int x = 10, y = 4;
		String a = "abcde", b = "asdfg";
		
		if (c.compare(x, y) > 0) {
			System.out.println("x > y");
		}
		else {
			System.out.println("x <= y");
		}
		if(c.compare(a, b) > 0) {
			System.out.println("a > b");
		}
		else
			System.out.println("a <= b");
	}
}
