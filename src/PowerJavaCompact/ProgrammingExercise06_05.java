package PowerJavaCompact;

class Rectangle{
	int width, height;
	public Rectangle(int width, int height) {
		this.width = width;
		this.height = height;
	}
}

class ColorRectangle extends Rectangle{
	String color;
	public ColorRectangle(int width, int height, String color) {
		super(width, height);
		this.color = color;
		
	}
}

public class ProgrammingExercise06_05 {

	public static void main(String[] args) {
		ColorRectangle obj = new ColorRectangle(100, 100, "blue");
		System.out.println("����: " + obj.width);
		System.out.println("����: " + obj.height);
		System.out.println("����: " + obj.color);
	}

}
