//�Ϲ����� ������ ��Ÿ���� Shape2_1Ŭ������ �ۼ��ϰ� �̰��� ��ӹ޾� ���� ��Ÿ���� Circle2_1Ŭ������ �ۼ��϶�.
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
		System.out.println("��1 �� �߽� : (" + obj1.x + ", " + obj1.y + ")");
		System.out.println("��2 �� �߽� : (" + obj2.x + ", " + obj2.y + ")");
		
	}
}
