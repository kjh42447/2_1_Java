//제곱과 제곱근을 출력해주는 정적 메소드가 있는 SqSqrt 클래스를 작성하라.
package ch05_Example;

class SqSqrt{
	public static void print(double x) {
		System.out.println(x + "의 제곱 = " + x*x);
		System.out.println(x + "의 제곱근 = " + Math.sqrt(x));
	}
}
public class Example5_2_2 {
	public static void main(String[] args) {
		SqSqrt.print(5);
	}
}
