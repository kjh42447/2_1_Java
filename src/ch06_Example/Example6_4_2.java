//추상클래스 Shape4_2를 상속받는 도형 클래스들을 만들고 연산을 하는 프로그램을 작성하라.
package ch06_Example;

abstract class Shape4_2{
	protected int x, y;
	
	Shape4_2(int x, int y){
		this.x = x;
		this.y = y;
	}
	
	public void move(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	abstract double calcArea();
}

//원
class Circle4_2 extends Shape4_2{
	int radius = 0;
	
	Circle4_2(int x, int y, int radius){
		super(x, y);
		this.radius = radius;
	}
	
	public double calcArea() {
		return 3.14*radius*radius;
	}
}

//사각형
class Rectangle4_2 extends Shape4_2{
	int width = 0, height = 0;
	
	Rectangle4_2(int x, int y, int width, int height){
		super(x, y);
		this.width = width;
		this.height = height;
	}
	
	public double calcArea() {
		return width*height;
	}
}

//삼각형
class Triangle4_2 extends Shape4_2{
	int width = 0, height = 0;
	
	Triangle4_2(int x, int y, int width, int height){
		super(x, y);
		this.width = width;
		this.height = height;
	}
	
	public double calcArea() {
		return width*height/2;
	}
}
public class Example6_4_2 {
	public static void main(String[] args) {
		Circle4_2 c = new Circle4_2(5, 5, 10);
		Rectangle4_2 r = new Rectangle4_2(0, 0, 5, 5);
		Triangle4_2 t = new Triangle4_2(4, 4, 5, 5);
		
		System.out.println("이동하기 전의 좌표 : " + c.x + ", " + c.y);
		c.move(3, 3);
		System.out.println("이동한 후의 좌표 : " + c.x + ", " + c.y);
		
		System.out.println("사각형의 넓이 : " + r.calcArea());
		System.out.println("삼각형의 넓이 : " + t.calcArea());
	}
}
