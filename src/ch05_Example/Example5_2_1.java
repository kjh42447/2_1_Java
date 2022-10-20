//삼각형, 사각형, 원의 넓이를 구하는 Width 클래스를 작성하라.
package ch05_Example;

class Width{
	public static double circle(double radius)	{	return radius*radius*3.14;	}
	public static double retangle(double length, double height)	{	return length*height;	}
	public static double triangle(double length, double height)	{	return length*height*0.5;	}
}
public class Example5_2_1 {
	public static void main(String[] args) {
		System.out.println("반지름이 5인 원의 넓이 = " + Width.circle(5));
		System.out.println("높이 5, 길이 5인 사각형의 넓이 = " + Width.retangle(5, 5));
		System.out.println("높이 5, 길이 5인 삼각형의 넓이 = " + Width.triangle(5, 5));
	}
}
