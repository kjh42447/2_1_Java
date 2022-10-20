//Shape2_2는 일반적인 도형을 나타내는 클래스이다. Shape2_2를 상속받는 여러 도형 클래스를 생성하라.
package ch06_Example;

class Shape2_2{
	double x = 0, y = 0;
}

class Circle2_2 extends Shape2_2{
	double radius;
	
	public Circle2_2(double radius) {
		this.radius = radius;
	}
	
	public Circle2_2(double x, double y, double radius) {
		this.x = x;
		this.y = y;
		this.radius = radius;
	}
	
	double calcArea() {
		return 3.14*radius*radius;
	}
}

class Rectangle2_2 extends Shape2_2{
	double length, height;
	
	public Rectangle2_2(double length, double height) {
		this.length = length;
		this.height = height;
	}
	
	public Rectangle2_2(double x, double y, double length, double height) {
		this.x = x;
		this.y = y;
		this.length = length;
		this.height = height;
	}
	
	double calcWidth() {
		return length*height;
	}
}

class Triangle2_2 extends Shape2_2{
	double length, height;
	
	public Triangle2_2(double length, double height) {
		this.length = length;
		this.height = height;
	}
	
	public Triangle2_2(double x, double y, double length, double height) {
		this.x = x;
		this.y = y;
		this.length = length;
		this.height = height;
	}
	
	double calcWidth() {
		return length*height/2;
	}
}
public class Example6_2_2 {
	public static void main(String[] args) {
		Circle2_2 c = new Circle2_2(5);
		Rectangle2_2 r = new Rectangle2_2(2.5, 2.5, 5, 5);
		Triangle2_2 t = new Triangle2_2(5,5);
		
		System.out.println("원의 면적 : " + c.calcArea());
		System.out.println("사각형의 면적 : " + r.calcWidth());
		System.out.println("삼각형의 면적 : " + t.calcWidth());
	}
}
