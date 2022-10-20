//Circle클래스를 정의하라. 내부 클래스로 Point클래스를 정의하고 값을 입력받아 객체에 저장하는 프로그램을 작성하라.
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
		System.out.println("원의 중심 좌표 : (" + this.getCenter().getX() + ", " + this.getCenter().getY() + ")");
		System.out.println("반지름의 길이 : (" + this.getRadius() + ")");
	}
}
public class Example5_7_3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		ArrayList<Circle> circle = new ArrayList<Circle>();
		
		//원 생성
		while(true) {
			System.out.println("==================================================================");
			System.out.print("원 객체를 추가하려면 1, 종료하려면 2, 작업을 원하면 3을 입력하시오 : ");
			int check1 = sc.nextInt();
			sc.nextLine();
			if (check1 == 1) {
				System.out.print("중심의 x좌표를 입력하시오 : ");
				double x = sc.nextDouble();
				sc.nextLine();
				System.out.print("중심의 y좌표를 입력하시오 : ");
				double y = sc.nextDouble();
				sc.nextLine();
				System.out.print("원의 반지릅을 입력하시오 : ");
				double radius = sc.nextDouble();
				circle.add(new Circle(x, y, radius));
			}
			else if(check1 == 2)
				break;
			
			//원 작업
			else if(check1 == 3) {
				while(true) {
					System.out.println("==================================================================");
					System.out.print("원의 정보를 확인하려면 1, 원의 넓이를 구하려면 2, 원을 더 생성하고 싶으면 3을 입력하시오 : ");
					int check2 = sc.nextInt();
					sc.nextLine();
					if (check2 == 1) {
						for (int i = 0 ; i < circle.size() ; i++ ) {
							System.out.println((i+1) + "번째 원의 정보");
							circle.get(i).field();
						}
					}
					else if(check2 == 2) {
						System.out.print("넓이를 구하고 싶은 원의 번호를 입력하시오 : ");
						int num = sc.nextInt();
						sc.nextLine();
						System.out.println(num + "번째 원의 넓이 : " + circle.get(num-1).calcArea());
					}
					else if(check2 == 3)
						break;
					else
						System.out.println("다시 입력하시오");
				}
			}
			else
				System.out.println("다시 입력하시오");			
		}
		
		sc.close();
	}
}
