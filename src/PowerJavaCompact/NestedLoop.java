package PowerJavaCompact;

public class NestedLoop {

	public static void main(String[] args) {
		for (int y = 2; y <= 9; y++) {
			for (int x = 1; x <= 9; x++) 
				System.out.print(y + "x" + x + "=" + x*y + "\t");
			System.out.println("");
		}
	}

}
