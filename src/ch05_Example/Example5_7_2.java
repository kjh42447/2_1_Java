/*평면좌표상의 변이 x축, y축과 평행한 직사각형 Rectangle클래스를 정의하라.
내부 클래스로는 왼쪽 아래의 점의 좌표를 나타내는 Coordinate클래스와 변의 길이를 나타내는 Side클래스가 있다.*/
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
		
		System.out.print("직사각형 왼쪽 아래의 점 x좌표를 입력하시오 : ");
		double x = sc.nextDouble();
		sc.nextLine();
		System.out.print("직사각형 왼쪽 아래의 점 y좌표를 입력하시오 : ");
		double y = sc.nextDouble();
		sc.nextLine();
		System.out.print("길이를 입력하시오 : ");
		double length = sc.nextDouble();
		sc.nextLine();
		System.out.print("높이를 입력하시오  : ");
		double height = sc.nextDouble();
		sc.nextLine();
		Rectangle rectangle = new Rectangle(x, y, length, height);
		
		System.out.println("사각형의 넓이 : " + rectangle.width());
		sc.close();
	}
}
