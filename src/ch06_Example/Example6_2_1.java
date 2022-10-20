//일반적인 도형을 나타내는 Shape2_1클래스를 작성하고 이것을 상속받아 원을 나타내는 Circle2_1클래스를 작성하라.
package ch06_Example;

class Shape2_1{
	int x, y;
}

class Circle2_1 extends Shape2_1{
	int radius;
	
	public Circle2_1(int radius) {
		this.radius = radius;
		x = 0;
		y = 0;
	}
	
	public Circle2_1(int x, int y, int radius) {
		this.x = x;
		this.y = y;
		this.radius = radius;
	}
	
	double calcArea() {
		return 3.14*radius*radius;
	}
}
public class Example6_2_1 {
	public static void main(String[] args) {
		Circle2_1 obj1 = new Circle2_1(10);
		Circle2_1 obj2 = new Circle2_1(5, 5, 10);
		System.out.println("원1 의 중심 : (" + obj1.x + ", " + obj1.y + ")");
		System.out.println("원2 의 중심 : (" + obj2.x + ", " + obj2.y + ")");
		
	}
}
