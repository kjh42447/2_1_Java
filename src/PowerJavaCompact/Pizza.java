package PowerJavaCompact;

class Circle{
	protected int radius;
	public Circle(int r) {	radius = r;	}
}
public class Pizza extends Circle {
	String type;
	
	public Pizza(String t, int r) {
		super(r);
		type = t;
	}
	
	void print() {
		System.out.println("������ ����: " + this.type + ", ������ ũ��: " + this.radius);
	}
	
	public static void main(String[] args) {
		Pizza obj = new Pizza("Pepperoni", 20);
		obj.print();
	}

}
