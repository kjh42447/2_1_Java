package PowerJavaCompact;

public class ProgrammingExercise03_10 {

	public static void main(String[] args) {
		double[] x = {1, 2, 3, 4};
		double max = 0, sum = 0;
		
		//배열의 값을 출력하면서 합과 최대값을 구한다
		for (double i:x) {
			System.out.print(i + " ");
			sum += i;
			if(max < i)
				max = i;
		}
		System.out.print("\n");
		System.out.println("합은 " + sum);
		System.out.println("최대값은 " + max);
	}

}
