//�ﰢ��, �簢��, ���� ���̸� ���ϴ� Width Ŭ������ �ۼ��϶�.
package ch05_Example;

class Width{
	public static double circle(double radius)	{	return radius*radius*3.14;	}
	public static double retangle(double length, double height)	{	return length*height;	}
	public static double triangle(double length, double height)	{	return length*height*0.5;	}
}
public class Example5_2_1 {
	public static void main(String[] args) {
		System.out.println("�������� 5�� ���� ���� = " + Width.circle(5));
		System.out.println("���� 5, ���� 5�� �簢���� ���� = " + Width.retangle(5, 5));
		System.out.println("���� 5, ���� 5�� �ﰢ���� ���� = " + Width.triangle(5, 5));
	}
}
