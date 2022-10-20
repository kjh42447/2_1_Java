//인터페이스와 클래스를 상속받는 도형 클래스들을 만들고 테스트하라.
package ch06_Example;

interface Printable_i_1_2{
	void print();
}

interface Drawable_i_1_2{
	void draw();
}

class Shape_i_1_2{
	protected int x, y;
	
	public Shape_i_1_2(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	public Shape_i_1_2() {
		this(0, 0);
	}
}
class Circle_i_1_2 extends Shape_i_1_2 implements Printable_i_1_2, Drawable_i_1_2{
	int radius;
	
	public Circle_i_1_2(int x, int y, int radius) {
		super(x, y);
		this.radius = radius;
	}
	
	public Circle_i_1_2(int radius) {
		super();
		this.radius = radius;
	}
	
	public void print() {
		System.out.println("프린터로 원을 출력합니다.");
	}
	
	public void draw() {
		System.out.println("화면에 원을 그립니다.");
	}
}

class Rectangle_i_1_2 extends Shape_i_1_2 implements Printable_i_1_2{
	int width, height;
	
	public Rectangle_i_1_2(int x, int y, int width, int height) {
		super(x,y);
		this.width = width;
		this.height = height;
	}
	
	public Rectangle_i_1_2(int width, int height) {
		super();
		this.width = width;
		this.height = height;
	}
	
	public void print() {
		System.out.println("프린터로 사각형을 출력합니다.");
	}
}

class Triangle_i_1_2 extends Shape_i_1_2 implements Drawable_i_1_2{
	int width, height;
	
	public Triangle_i_1_2(int x, int y, int width, int height) {
		super(x, y);
		this.width = width;
		this.height = height;
	}
	
	public Triangle_i_1_2(int width, int height) {
		super();
		this.width = width;
		this.height = height;
	}
	
	public void draw() {
		System.out.println("화면에 삼각형을 그립니다.");
	}
}

public class InterfaceExample1_2 {
	public static void main(String[] args) {
		Shape_i_1_2[] s = new Shape_i_1_2[3];
		s[0] = new Circle_i_1_2(5);
		s[1] = new Rectangle_i_1_2(5, 5);
		s[2] = new Triangle_i_1_2(5, 5);
		
		for(Shape_i_1_2 shape : s) {
			if (shape instanceof Printable_i_1_2) 
				((Printable_i_1_2) shape).print();
			else
				System.out.println("프린트가 불가능합니다.");
			if (shape instanceof Drawable_i_1_2)
				((Drawable_i_1_2) shape).draw();
			else
				System.out.println("그릴 수 없습니다.");
		}
	}
}
