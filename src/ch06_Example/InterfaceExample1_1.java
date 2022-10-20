//교재에 나와있는 예제를 하나로 합친 Circle_i_1_1 클래스를 작성하라.
package ch06_Example;

interface Printable_i_1_1{
	void print();
}

interface Drawable_i_1_1{
	void draw();
}

class Shape_i_1_1{
	protected int x, y;
}
class Circle_i_1_1 extends Shape_i_1_1 implements Printable_i_1_1, Drawable_i_1_1{
	int radius;
	
	public void print() {
		System.out.println("프린터로 원을 출력합니다.");
	}
	
	public void draw() {
		System.out.println("화면에 원을 그립니다.");
	}
}
public class InterfaceExample1_1 {
	public static void main(String[] args) {
		Circle_i_1_1 circle = new Circle_i_1_1();
		circle.print();
		circle.draw();
	}
}
