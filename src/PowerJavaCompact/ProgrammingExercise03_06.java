package PowerJavaCompact;

public class ProgrammingExercise03_06 {

	public static void main(String[] args) {
		System.out.print("2부터 100사이의 모든 소수 : ");
		
		//소수를 구하여 출력한다
		for (int x = 2; x <= 100; x++) {
			int check = 0;
			for (int y = 2; y < x; y++) {
				if (x%y == 0) {
					check = 1;
					break;
				}
			}
			if (check == 0)
				System.out.print(" " + x);
		}
	}

}
