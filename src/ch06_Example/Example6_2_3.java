//Shape2_3�� ��ӹ޴� ���� Ŭ�������� �����϶�.
package ch06_Example;

import java.util.*;

//����
class Shape2_3{
	protected double x = 0, y = 0;
	protected String shape;
	
	double calcArea()	{	return 0;	}
}

//��
class Circle2_3 extends Shape2_3{
	double radius;
	
	public Circle2_3(double radius) {
		this.radius = radius;
		shape = "Circle";
	}
	
	public Circle2_3(double x, double y, double radius) {
		this.x = x;
		this.y = y;
		this.radius = radius;
		shape = "Circle";
	}
	
	double calcArea() {
		return 3.14*radius*radius;
	}
}

//�簢��
class Rectangle2_3 extends Shape2_3{
	double length, height;
	
	public Rectangle2_3(double length, double height) {
		this.length = length;
		this.height = height;
		shape = "Rectangle";
	}
	
	public Rectangle2_3(double x, double y, double length, double height) {
		this.x = x;
		this.y = y;
		this.length = length;
		this.height = height;
		shape = "Rectangle";
	}
	
	double calcArea() {
		return length*height;
	}
}

//�ﰢ��
class Triangle2_3 extends Shape2_3{
	double length, height;
	
	public Triangle2_3(double length, double height) {
		this.length = length;
		this.height = height;
		shape = "Triangle";
	}
	
	public Triangle2_3(double x, double y, double length, double height) {
		this.x = x;
		this.y = y;
		this.length = length;
		this.height = height;
		shape = "Triangle";
	}
	
	double calcArea() {
		return length*height/2;
	}
}

public class Example6_2_3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ArrayList<Shape2_3> list = new ArrayList<Shape2_3>();
		
		//���� ����
		while (true) {
			System.out.println("==============================================================================");
			System.out.print("���� �߰��Ϸ��� 1, �簢���� �߰��Ϸ��� 2, �ﰢ���� �߰��Ϸ��� 3, ������ �����Ϸ��� 4�� �Է��Ͻÿ� : ");
			int check = sc.nextInt();
			sc.nextLine();
			System.out.println("==============================================================================");
			
			//�� �߰�
			if (check == 1) {
				System.out.print("�� �߽��� x��ǥ : ");
				double x = sc.nextDouble();
				sc.nextLine();
				System.out.print("�� �߽��� y��ǥ : ");
				double y = sc.nextDouble();
				sc.nextLine();
				System.out.print("�� ������ : ");
				double r = sc.nextDouble();
				sc.nextLine();
				list.add(new Circle2_3(x, y, r));
			}
			
			//�簢�� �߰�
			else if (check == 2) {
				System.out.print("�簢�� �������� x��ǥ : ");
				double x = sc.nextDouble();
				sc.nextLine();
				System.out.print("�簢�� �������� y��ǥ : ");
				double y = sc.nextDouble();
				sc.nextLine();
				System.out.print("�簢���� ���� : ");
				double length = sc.nextDouble();
				sc.nextLine();
				System.out.print("�簢���� ���� : ");
				double height = sc.nextDouble();
				sc.nextLine();
				list.add(new Rectangle2_3(x, y, length, height));
			}
			
			//�ﰢ�� �߰�
			else if (check == 3) {
				System.out.print("�ﰢ�� �������� x��ǥ : ");
				double x = sc.nextDouble();
				sc.nextLine();
				System.out.print("�ﰢ�� �������� y��ǥ : ");
				double y = sc.nextDouble();
				sc.nextLine();
				System.out.print("�ﰢ���� ���� : ");
				double length = sc.nextDouble();
				sc.nextLine();
				System.out.print("�ﰢ���� ���� : ");
				double height = sc.nextDouble();
				sc.nextLine();
				list.add(new Triangle2_3(x, y, length, height));
			}
			
			//����
			else if (check == 4)
				break;
			
			else
				System.out.println("�ٽ� �Է��Ͻÿ�.");
		}
		
		//ũ�� ���
		for(Shape2_3 obj : list) {
			System.out.println("������ ���� : " + obj.calcArea());
		}
		
		sc.close();
	}
}
