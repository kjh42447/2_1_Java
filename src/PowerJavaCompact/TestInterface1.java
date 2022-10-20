package PowerJavaCompact;

interface Drawable{
	void draw();
}

class CircleTI1 implements Drawable{
	int radius;
	public void draw() {
		System.out.println("Circle Draw");
	}
}

public class TestInterface1 {

	public static void main(String[] args) {
		Drawable obj = new CircleTI1();
		obj.draw();
	}

}
