//추상클래스인 Shape6_4_1을 상속받는 도형 클래스들을 생성하라.
package ch06_Example;

//도형
abstract class Shape6_4_1{
	int x = 0, y = 0;
	
	public void move(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	public abstract double calcArea();
}

//원
class Circle6_4_1 extends Shape6_4_1{
	int radius = 0;
	public double calcArea() {
		return 3.14*radius*radius;
	}
}

//사각형
class Rectangle6_4_1 extends Shape6_4_1{
	int width = 0, height = 0;
	public double calcArea() {
		return width*height;
	}
}


//삼각형
class Triangle6_4_1 extends Shape6_4_1{
	int width = 0, height = 0;
	public double calcArea() {
		return width*height/2;
	}
}
public class Example6_4_1 {
	public static void main(String[] args) {
		Circle6_4_1 c = new Circle6_4_1();
		Rectangle6_4_1 r = new Rectangle6_4_1();
		Triangle6_4_1 t = new Triangle6_4_1();
		
		c.radius = 5;
		r.width = 5;
		r.height = 5;
		t.width = 5;
		t.height = 5;
		
		System.out.println("원의 면적 : " + c.calcArea());
		System.out.println("사각형의 면적 : " + r.calcArea());
		System.out.println("삼각형의 면적 : " + t.calcArea());
	}
}
