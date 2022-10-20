//CircleŬ������ �����϶�. ���� Ŭ������ PointŬ������ �����ϰ� ���� �Է¹޾� ��ü�� �����ϴ� ���α׷��� �ۼ��϶�.
package ch05_Example;

import java.util.*;

class Circle{
	private double radius;
	private Point center;
	
	public void setRadius(double radius)	{	this.radius = radius;	}
	public double getRadius()	{	return radius;	}
	public void setCenter(Point center)		{	this.center = center;	}
	public Point getCenter()	{	return center;	}
	
	public Circle(double x, double y, double radius) {
		this.setCenter(new Point(x, y));
		this.setRadius(radius);
	}
	
	class Point{
		private double x, y;
		
		public void setX(double x)	{	this.x = x;		}
		public double getX()	{	return x;	}
		public void setY(double y)	{	this.y = y;		}
		public double getY()	{	return y;	}
		
		public Point(double x, double y) {
			this.setX(x);
			this.setY(y);
		}
	}
	
	double calcArea() {
		return 3.14*radius*radius;
	}
	
	void field() {
		System.out.println("���� �߽� ��ǥ : (" + this.getCenter().getX() + ", " + this.getCenter().getY() + ")");
		System.out.println("�������� ���� : (" + this.getRadius() + ")");
	}
}
public class Example5_7_3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		ArrayList<Circle> circle = new ArrayList<Circle>();
		
		//�� ����
		while(true) {
			System.out.println("==================================================================");
			System.out.print("�� ��ü�� �߰��Ϸ��� 1, �����Ϸ��� 2, �۾��� ���ϸ� 3�� �Է��Ͻÿ� : ");
			int check1 = sc.nextInt();
			sc.nextLine();
			if (check1 == 1) {
				System.out.print("�߽��� x��ǥ�� �Է��Ͻÿ� : ");
				double x = sc.nextDouble();
				sc.nextLine();
				System.out.print("�߽��� y��ǥ�� �Է��Ͻÿ� : ");
				double y = sc.nextDouble();
				sc.nextLine();
				System.out.print("���� �������� �Է��Ͻÿ� : ");
				double radius = sc.nextDouble();
				circle.add(new Circle(x, y, radius));
			}
			else if(check1 == 2)
				break;
			
			//�� �۾�
			else if(check1 == 3) {
				while(true) {
					System.out.println("==================================================================");
					System.out.print("���� ������ Ȯ���Ϸ��� 1, ���� ���̸� ���Ϸ��� 2, ���� �� �����ϰ� ������ 3�� �Է��Ͻÿ� : ");
					int check2 = sc.nextInt();
					sc.nextLine();
					if (check2 == 1) {
						for (int i = 0 ; i < circle.size() ; i++ ) {
							System.out.println((i+1) + "��° ���� ����");
							circle.get(i).field();
						}
					}
					else if(check2 == 2) {
						System.out.print("���̸� ���ϰ� ���� ���� ��ȣ�� �Է��Ͻÿ� : ");
						int num = sc.nextInt();
						sc.nextLine();
						System.out.println(num + "��° ���� ���� : " + circle.get(num-1).calcArea());
					}
					else if(check2 == 3)
						break;
					else
						System.out.println("�ٽ� �Է��Ͻÿ�");
				}
			}
			else
				System.out.println("�ٽ� �Է��Ͻÿ�");			
		}
		
		sc.close();
	}
}
