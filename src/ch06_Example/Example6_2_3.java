//Shape2_3을 상속받는 도형 클래스들을 생성하라.
package ch06_Example;

import java.util.*;

//도형
class Shape2_3{
	protected double x = 0, y = 0;
	protected String shape;
	
	double calcArea()	{	return 0;	}
}

//원
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

//사각형
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

//삼각형
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
		
		//도형 생성
		while (true) {
			System.out.println("==============================================================================");
			System.out.print("원을 추가하려면 1, 사각형을 추가하려면 2, 삼각혁을 추가하려면 3, 생성을 종료하려면 4를 입력하시오 : ");
			int check = sc.nextInt();
			sc.nextLine();
			System.out.println("==============================================================================");
			
			//원 추가
			if (check == 1) {
				System.out.print("원 중심의 x좌표 : ");
				double x = sc.nextDouble();
				sc.nextLine();
				System.out.print("원 중심의 y좌표 : ");
				double y = sc.nextDouble();
				sc.nextLine();
				System.out.print("원 반지름 : ");
				double r = sc.nextDouble();
				sc.nextLine();
				list.add(new Circle2_3(x, y, r));
			}
			
			//사각형 추가
			else if (check == 2) {
				System.out.print("사각형 시작점의 x좌표 : ");
				double x = sc.nextDouble();
				sc.nextLine();
				System.out.print("사각형 시작점의 y좌표 : ");
				double y = sc.nextDouble();
				sc.nextLine();
				System.out.print("사각형의 길이 : ");
				double length = sc.nextDouble();
				sc.nextLine();
				System.out.print("사각형의 높이 : ");
				double height = sc.nextDouble();
				sc.nextLine();
				list.add(new Rectangle2_3(x, y, length, height));
			}
			
			//삼각형 추가
			else if (check == 3) {
				System.out.print("삼각형 시작점의 x좌표 : ");
				double x = sc.nextDouble();
				sc.nextLine();
				System.out.print("삼각형 시작점의 y좌표 : ");
				double y = sc.nextDouble();
				sc.nextLine();
				System.out.print("삼각형의 길이 : ");
				double length = sc.nextDouble();
				sc.nextLine();
				System.out.print("삼각형의 높이 : ");
				double height = sc.nextDouble();
				sc.nextLine();
				list.add(new Triangle2_3(x, y, length, height));
			}
			
			//종료
			else if (check == 4)
				break;
			
			else
				System.out.println("다시 입력하시오.");
		}
		
		//크기 출력
		for(Shape2_3 obj : list) {
			System.out.println("도형의 넓이 : " + obj.calcArea());
		}
		
		sc.close();
	}
}
