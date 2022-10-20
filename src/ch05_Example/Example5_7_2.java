/*�����ǥ���� ���� x��, y��� ������ ���簢�� RectangleŬ������ �����϶�.
���� Ŭ�����δ� ���� �Ʒ��� ���� ��ǥ�� ��Ÿ���� CoordinateŬ������ ���� ���̸� ��Ÿ���� SideŬ������ �ִ�.*/
package ch05_Example;

import java.util.Scanner;

class Rectangle{
	Coordinate p;
	Side s;
	
	Rectangle(double x, double y, double length, double height){
		this.p = new Coordinate(x, y);
		this.s = new Side(length, height);
	}
	class Coordinate{
		double x, y;
		
		Coordinate(double x, double y){
			this.x = x;
			this.y = y;
		}
	}
	
	class Side{
		double length, height;
		
		Side(double length, double height){
			this.length = length;
			this.height = height;
		}
	}
	
	double width() {
		return this.s.length * this.s.height;
	}
}
public class Example5_7_2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("���簢�� ���� �Ʒ��� �� x��ǥ�� �Է��Ͻÿ� : ");
		double x = sc.nextDouble();
		sc.nextLine();
		System.out.print("���簢�� ���� �Ʒ��� �� y��ǥ�� �Է��Ͻÿ� : ");
		double y = sc.nextDouble();
		sc.nextLine();
		System.out.print("���̸� �Է��Ͻÿ� : ");
		double length = sc.nextDouble();
		sc.nextLine();
		System.out.print("���̸� �Է��Ͻÿ�  : ");
		double height = sc.nextDouble();
		sc.nextLine();
		Rectangle rectangle = new Rectangle(x, y, length, height);
		
		System.out.println("�簢���� ���� : " + rectangle.width());
		sc.close();
	}
}
