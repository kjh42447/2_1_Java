package PowerJavaCompact;

public class ProgrammingExercise03_07 {

	public static void main(String[] args) {
		//a^2+b^=c^2을 만족하는 정수를 구하여 출력한다
		for (int a = 1; a <= 100; a++) {
			for (int b = 1; b <= 100; b++) {
				for (int c = b; c <= 100; c++) {
					if (a*a + b*b == c*c) {
						System.out.printf("%d %d %d\n", a,b,c);
					}
				}
			}
		}
	}

}
