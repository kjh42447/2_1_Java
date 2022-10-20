//toString클래스를 제정의하고 테스트하라.
package ch07_example;

class ToStringTest1	{

	@Override
	public String toString() {
		return "재정의된 toStirng 메소드 입니다.";
	}
	
}

public class ToString1 {

	public static void main(String[] args) {
		ToStringTest1 obj = new ToStringTest1();
		System.out.println(obj.toString());
	}

}
