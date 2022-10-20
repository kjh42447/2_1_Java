//Math클래스의 여러 메소드들을 이용하여 도형을 연산하는 프로그램을 작성하라.
package ch07_example;

import java.util.*;

abstract class ShapeMath2{
	protected double x, y;
	
	ShapeMath2(double x, double y){
		this.x = x;
		this.y = y;
	}
	
	public void move(double x, double y) {
		this.x = x;
		this.y = y;
	}
	
	abstract double calcArea();
	public abstract String toString();
}

//원
class CircleMath2 extends ShapeMath2{
	double radius = 0;
	
	CircleMath2(double x, double y, double radius){
		super(x, y);
		this.radius = radius;
	}
	
	public double calcArea() {
		return Math.PI*radius*radius;
	}
	
	@Override
	public String toString() {
		return "객체 종류 : 원, 좌표 : (" + x + ", " + y + "), 반지름 : " + radius;
	}
}

//사각형
class RectangleMath2 extends ShapeMath2{
	double width = 0, height = 0;
	
	RectangleMath2(double x, double y, double width, double height){
		super(x, y);
		this.width = width;
		this.height = height;
	}
	
	public double calcArea() {
		return width*height;
	}
	
	@Override
	public String toString() {
		return "객체 종류 : 사각형, 좌표 : (" + x + ", " + y + ")," + "너비 : " + width + ",높이 : " + height;
	}
}


//삼각형
class TriangleMath2 extends ShapeMath2{
	double width = 0, height = 0;
	
	TriangleMath2(double x, double y, double width, double height){
		super(x, y);
		this.width = width;
		this.height = height;
	}
	
	public double calcArea() {
		return width*height/2;
	}
	
	@Override
	public String toString() {
		return "객체 종류 : 사각형, 좌표 : (" + x + ", " + y + ")," + "너비 : " + width + ",높이 : " + height;
	}
}

public class Math2 {
	
	//생성 화면
	static void makeShape(Scanner sc, ArrayList<ShapeMath2> shape) {
		while(true) {
			System.out.println("==============================================================================");
			System.out.println("-생성 화면-");
			System.out.println("1. 원 생성");
			System.out.println("2. 사각형 생성");
			System.out.println("3. 삼각형 생성");
			System.out.println("4. 작업화면");
			System.out.println("5. 종료");
			System.out.println("==============================================================================");
			System.out.print("원하는 작업 번호를 입력하세요 : ");
			int check = sc.nextInt();
			sc.nextLine();
			
			//원 생성
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
				shape.add(new CircleMath2(x, y, r));
			}
			
			//사각형 생성
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
				shape.add(new RectangleMath2(x, y, length, height));
			}
			
			
			//삼각형 생성
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
				shape.add(new TriangleMath2(x, y, length, height));
			}
			
			//작업 화면으로 이동
			else if (check == 4) {
				workShape(sc, shape);
				break;
			}
				
			else if (check == 5)
				break;
			
			else
				System.out.println("다시 입력하세요.");
		}
	}
	
	//작업 화면
	static void workShape(Scanner sc, ArrayList<ShapeMath2> shape) {
		while(true) {
			System.out.println("==============================================================================");
			System.out.println("-작업 화면-");
			System.out.println("1. 정보 확인");
			System.out.println("2. 위치 변경");
			System.out.println("3. 크기 계산");
			System.out.println("4. 생성 화면");
			System.out.println("5. 종료");
			System.out.println("==============================================================================");
			System.out.print("원하는 작업 번호를 입력하세요 : ");
			int check = sc.nextInt();
			sc.nextLine();
			
			//정보 확인
			if (check == 1) {
				for (int i = 0; i < shape.size(); i++) 
					System.out.println("번호 : " + i + ", " + shape.get(i));
			}
			
			//위치 변경
			else if (check == 2) {
				System.out.print("위치 변경을 원하는 객체 번호를 입력하세요 : ");
				int n = sc.nextInt();
				sc.nextLine();
				
				if (n < shape.size() && 0 <= n) {
					System.out.print("x좌표를 입력하세요 : ");
					int x = sc.nextInt();
					sc.nextLine();
					System.out.print("y좌표를 입력하세요 : ");
					int y = sc.nextInt();
					sc.nextLine();
					shape.get(n).x = x;
					shape.get(n).y = y;
					
					System.out.println("위치가 변경되었습니다.");
				}
				
				else {
					System.out.println("번호를 다시 입력하세요");
					continue;
				}
			}
			
			//크기 계산
			else if (check == 3) {
				System.out.print("크기 계산을 원하는 객체 번호를 입력하세요 : ");
				int n = sc.nextInt();
				sc.nextLine();
				
				if (n < shape.size() && 0 <= n) {
					System.out.println("도형의 면적 : " + shape.get(n).calcArea());
				}
				
				else {
					System.out.println("번호를 다시 입럭하세요");
					continue;
				}
			}
			
			//생성 화면
			else if (check == 4) {
				makeShape(sc, shape);
				break;
			}
			
			else if (check == 5)
				break;
			
			else
				System.out.println("다시 입력하세요.");
		}
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ArrayList<ShapeMath2> shape = new ArrayList<ShapeMath2>();
		
		makeShape(sc, shape);
		
		sc.close();
	}
}
