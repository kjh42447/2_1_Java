//���翡 �����ִ� ������ �ϳ��� ��ģ Circle_i_1_1 Ŭ������ �ۼ��϶�.
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
		System.out.println("�����ͷ� ���� ����մϴ�.");
	}
	
	public void draw() {
		System.out.println("ȭ�鿡 ���� �׸��ϴ�.");
	}
}
public class InterfaceExample1_1 {
	public static void main(String[] args) {
		Circle_i_1_1 circle = new Circle_i_1_1();
		circle.print();
		circle.draw();
	}
}
