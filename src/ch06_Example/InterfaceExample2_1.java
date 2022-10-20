//객체 내의 문자열 순서를 비교하는 Comparealbe_1 인터페이스를 작성하고 구현하라.
package ch06_Example;

interface Comparable_1{
	int compareTo(Object otherObject);
}

class Compare_1 implements Comparable_1{
	protected String s = new String();
	
	public Compare_1(String s) {
		this.s = s;
	}
	
	public int compareTo(Object otherObject) {
		Compare_1 other = (Compare_1) otherObject;
		return this.s.compareTo(other.s);
	}
}
public class InterfaceExample2_1 {
	public static void main(String[] args) {
		Compare_1 c1 = new Compare_1("abcde");
		Compare_1 c2 = new Compare_1("asdf");
		Compare_1 c3 = new Compare_1("abcd");
		
		if(c1.compareTo(c2) > 0)
			System.out.println("c1 > c2");
		else
			System.out.println("c1 <= c2");
		if(c1.compareTo(c3) > 0)
			System.out.println("c1 > c3");
		else
			System.out.println("c1 <= c3");
	}
}
