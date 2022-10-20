package PowerJavaCompact;

abstract class Shape4{
	int x, y;
	public void move(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	public abstract void draw();

}

class Rectangle4 extends Shape4{
	int width, height;
	public void draw() {
		System.out.println("사각형 그리기 메소드");
	}
}

class Circle4 extends Shape4{
	int radius;
	public void draw() {
		System.out.println("원 그리기 메소드");
	}
}

public class AbstractClassTest {

	public static void main(String[] args) {
		Rectangle4 sqare = new Rectangle4();
		Circle4 circle = new Circle4();
		sqare.draw();
		circle.draw();
	}

}
