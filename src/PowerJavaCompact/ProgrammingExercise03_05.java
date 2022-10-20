package PowerJavaCompact;

public class ProgrammingExercise03_05 {

	public static void main(String[] args) {
		//해를 구해서 출력한다
		for(int x = 0; x <= 10; x++) {
			for (int y = 0; y <= 10; y++) {
				if (3*x + 10*y == 100)
					System.out.printf("(%d,%d)\n", x, y);
			}
		}
	}

}
