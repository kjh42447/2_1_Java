//�߻� Ŭ���� Shape4_3�� ��ӹ޴� ���� Ŭ�������� �ۼ��ϰ� ���� �Է¹޾� �����ϴ� ���α׷��� �ۼ��϶�.
package ch06_Example;

import java.util.*;

abstract class Shape4_3{
	protected double x, y;
	
	Shape4_3(double x, double y){
		this.x = x;
		this.y = y;
	}
	
	public void move(double x, double y) {
		this.x = x;
		this.y = y;
	}
	
	abstract double calcArea();
	abstract void print(int i);
}

//��
class Circle4_3 extends Shape4_3{
	double radius = 0;
	
	Circle4_3(double x, double y, double radius){
		super(x, y);
		this.radius = radius;
	}
	
	public double calcArea() {
		return 3.14*radius*radius;
	}
	
	public void print(int i) {
		System.out.println("��ȣ : " + i + ", ��ü ���� : ��, ��ǥ : (" + x + ", " + y + "), ������ : " + radius);
	}
}

//�簢��
class Rectangle4_3 extends Shape4_3{
	double width = 0, height = 0;
	
	Rectangle4_3(double x, double y, double width, double height){
		super(x, y);
		this.width = width;
		this.height = height;
	}
	
	public double calcArea() {
		return width*height;
	}
	
	public void print(int i) {
		System.out.println("��ȣ : " + i + ", ��ü ���� : �簢��, ��ǥ : (" + x + ", " + y + "),"
				+ "�ʺ� : " + width + ",���� : " + height);
	}
}


//�ﰢ��
class Triangle4_3 extends Shape4_3{
	double width = 0, height = 0;
	
	Triangle4_3(double x, double y, double width, double height){
		super(x, y);
		this.width = width;
		this.height = height;
	}
	
	public double calcArea() {
		return width*height/2;
	}
	
	public void print(int i) {
		System.out.println("��ȣ : " + i + ", ��ü ���� : �簢��, ��ǥ : (" + x + ", " + y + "),"
				+ "�ʺ� : " + width + ",���� : " + height);
	}
}

public class Example6_4_3 {
	
	//���� ȭ��
	static void makeShape(Scanner sc, ArrayList<Shape4_3> shape) {
		while(true) {
			System.out.println("==============================================================================");
			System.out.println("-���� ȭ��-");
			System.out.println("1. �� ����");
			System.out.println("2. �簢�� ����");
			System.out.println("3. �ﰢ�� ����");
			System.out.println("4. �۾�ȭ��");
			System.out.println("5. ����");
			System.out.println("==============================================================================");
			System.out.print("���ϴ� �۾� ��ȣ�� �Է��Ͻÿ� : ");
			int check = sc.nextInt();
			sc.nextLine();
			
			//�� ����
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
				shape.add(new Circle4_3(x, y, r));
			}
			
			//�簢�� ����
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
				shape.add(new Rectangle4_3(x, y, length, height));
			}
			
			
			//�ﰢ�� ����
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
				shape.add(new Triangle4_3(x, y, length, height));
			}
			
			//�۾� ȭ������ �̵�
			else if (check == 4) {
				workShape(sc, shape);
				break;
			}
				
			else if (check == 5)
				break;
			
			else
				System.out.println("�ٽ� �Է��Ͻÿ�.");
		}
	}
	
	//�۾� ȭ��
	static void workShape(Scanner sc, ArrayList<Shape4_3> shape) {
		while(true) {
			System.out.println("==============================================================================");
			System.out.println("-�۾� ȭ��-");
			System.out.println("1. ���� Ȯ��");
			System.out.println("2. ��ġ ����");
			System.out.println("3. ũ�� ���");
			System.out.println("4. ���� ȭ��");
			System.out.println("5. ����");
			System.out.println("==============================================================================");
			System.out.print("���ϴ� �۾� ��ȣ�� �Է��Ͻÿ� : ");
			int check = sc.nextInt();
			sc.nextLine();
			
			//���� Ȯ��
			if (check == 1) {
				for (int i = 0; i < shape.size(); i++) 
					shape.get(i).print(i);
			}
			
			//��ġ ����
			else if (check == 2) {
				System.out.print("��ġ ������ ���ϴ� ��ü ��ȣ�� �Է��Ͻÿ� : ");
				int n = sc.nextInt();
				sc.nextLine();
				
				if (n < shape.size() && 0 <= n) {
					System.out.print("x��ǥ�� �Է��Ͻÿ� : ");
					int x = sc.nextInt();
					sc.nextLine();
					System.out.print("y��ǥ�� �Է��Ͻÿ� : ");
					int y = sc.nextInt();
					sc.nextLine();
					shape.get(n).x = x;
					shape.get(n).y = y;
					
					System.out.println("��ġ�� ����Ǿ����ϴ�.");
				}
				
				else {
					System.out.println("��ȣ�� �ٽ� �Է��Ͻÿ�");
					continue;
				}
			}
			
			//ũ�� ���
			else if (check == 3) {
				System.out.print("ũ�� ����� ���ϴ� ��ü ��ȣ�� �Է��Ͻÿ� : ");
				int n = sc.nextInt();
				sc.nextLine();
				
				if (n < shape.size() && 0 <= n) {
					System.out.println("������ ���� : " + shape.get(n).calcArea());
				}
				
				else {
					System.out.println("��ȣ�� �ٽ� �Է��Ͻÿ�");
					continue;
				}
			}
			
			//���� ȭ��
			else if (check == 4) {
				makeShape(sc, shape);
				break;
			}
			
			else if (check == 5)
				break;
			
			else
				System.out.println("�ٽ� �Է��Ͻÿ�.");
		}
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ArrayList<Shape4_3> shape = new ArrayList<Shape4_3>();
		
		makeShape(sc, shape);
		
		sc.close();
	}
}
