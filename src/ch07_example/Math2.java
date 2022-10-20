//MathŬ������ ���� �޼ҵ���� �̿��Ͽ� ������ �����ϴ� ���α׷��� �ۼ��϶�.
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

//��
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
		return "��ü ���� : ��, ��ǥ : (" + x + ", " + y + "), ������ : " + radius;
	}
}

//�簢��
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
		return "��ü ���� : �簢��, ��ǥ : (" + x + ", " + y + ")," + "�ʺ� : " + width + ",���� : " + height;
	}
}


//�ﰢ��
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
		return "��ü ���� : �簢��, ��ǥ : (" + x + ", " + y + ")," + "�ʺ� : " + width + ",���� : " + height;
	}
}

public class Math2 {
	
	//���� ȭ��
	static void makeShape(Scanner sc, ArrayList<ShapeMath2> shape) {
		while(true) {
			System.out.println("==============================================================================");
			System.out.println("-���� ȭ��-");
			System.out.println("1. �� ����");
			System.out.println("2. �簢�� ����");
			System.out.println("3. �ﰢ�� ����");
			System.out.println("4. �۾�ȭ��");
			System.out.println("5. ����");
			System.out.println("==============================================================================");
			System.out.print("���ϴ� �۾� ��ȣ�� �Է��ϼ��� : ");
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
				shape.add(new CircleMath2(x, y, r));
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
				shape.add(new RectangleMath2(x, y, length, height));
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
				shape.add(new TriangleMath2(x, y, length, height));
			}
			
			//�۾� ȭ������ �̵�
			else if (check == 4) {
				workShape(sc, shape);
				break;
			}
				
			else if (check == 5)
				break;
			
			else
				System.out.println("�ٽ� �Է��ϼ���.");
		}
	}
	
	//�۾� ȭ��
	static void workShape(Scanner sc, ArrayList<ShapeMath2> shape) {
		while(true) {
			System.out.println("==============================================================================");
			System.out.println("-�۾� ȭ��-");
			System.out.println("1. ���� Ȯ��");
			System.out.println("2. ��ġ ����");
			System.out.println("3. ũ�� ���");
			System.out.println("4. ���� ȭ��");
			System.out.println("5. ����");
			System.out.println("==============================================================================");
			System.out.print("���ϴ� �۾� ��ȣ�� �Է��ϼ��� : ");
			int check = sc.nextInt();
			sc.nextLine();
			
			//���� Ȯ��
			if (check == 1) {
				for (int i = 0; i < shape.size(); i++) 
					System.out.println("��ȣ : " + i + ", " + shape.get(i));
			}
			
			//��ġ ����
			else if (check == 2) {
				System.out.print("��ġ ������ ���ϴ� ��ü ��ȣ�� �Է��ϼ��� : ");
				int n = sc.nextInt();
				sc.nextLine();
				
				if (n < shape.size() && 0 <= n) {
					System.out.print("x��ǥ�� �Է��ϼ��� : ");
					int x = sc.nextInt();
					sc.nextLine();
					System.out.print("y��ǥ�� �Է��ϼ��� : ");
					int y = sc.nextInt();
					sc.nextLine();
					shape.get(n).x = x;
					shape.get(n).y = y;
					
					System.out.println("��ġ�� ����Ǿ����ϴ�.");
				}
				
				else {
					System.out.println("��ȣ�� �ٽ� �Է��ϼ���");
					continue;
				}
			}
			
			//ũ�� ���
			else if (check == 3) {
				System.out.print("ũ�� ����� ���ϴ� ��ü ��ȣ�� �Է��ϼ��� : ");
				int n = sc.nextInt();
				sc.nextLine();
				
				if (n < shape.size() && 0 <= n) {
					System.out.println("������ ���� : " + shape.get(n).calcArea());
				}
				
				else {
					System.out.println("��ȣ�� �ٽ� �Է��ϼ���");
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
				System.out.println("�ٽ� �Է��ϼ���.");
		}
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ArrayList<ShapeMath2> shape = new ArrayList<ShapeMath2>();
		
		makeShape(sc, shape);
		
		sc.close();
	}
}
