//������ �������� ������ִ� ���� �޼ҵ尡 �ִ� SqSqrt Ŭ������ �ۼ��϶�.
package ch05_Example;

class SqSqrt{
	public static void print(double x) {
		System.out.println(x + "�� ���� = " + x*x);
		System.out.println(x + "�� ������ = " + Math.sqrt(x));
	}
}
public class Example5_2_2 {
	public static void main(String[] args) {
		SqSqrt.print(5);
	}
}
