package PowerJavaCompact;

class Circlet{
	class Point {
		int x, y;
		Point (int x, int y){
			this.x = x;
			this.y = y;
		}
	}
	int radius;
	Point center;
	
	Circlet(int radius, int x, int y){
		this.radius = radius;
		this.center = new Point(x, y);
	}
	
	double calcArea() {
		return 3.14*radius*radius;
	}
}
public class InnerTest {

	public static void main(String[] args) {
		Circlet obj = new Circlet(10, 0, 0);
		System.out.println("원의 면적 = " + obj.calcArea());
	}

}
