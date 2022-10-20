//�߻�Ŭ������ Shape6_4_1�� ��ӹ޴� ���� Ŭ�������� �����϶�.
package ch06_Example;

//����
abstract class Shape6_4_1{
	int x = 0, y = 0;
	
	public void move(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	public abstract double calcArea();
}

//��
class Circle6_4_1 extends Shape6_4_1{
	int radius = 0;
	public double calcArea() {
		return 3.14*radius*radius;
	}
}

//�簢��
class Rectangle6_4_1 extends Shape6_4_1{
	int width = 0, height = 0;
	public double calcArea() {
		return width*height;
	}
}


//�ﰢ��
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
		
		System.out.println("���� ���� : " + c.calcArea());
		System.out.println("�簢���� ���� : " + r.calcArea());
		System.out.println("�ﰢ���� ���� : " + t.calcArea());
	}
}
