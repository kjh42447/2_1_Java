package PowerJavaCompact;

public class DoubleList {

	public static void main(String[] args) {
		double[] l = new double[10];
		
		for (int i = 0; i < 10; i++)
			l[i] = (double)i/10;
		for (int i = 0; i < 10; i++)
			System.out.print(l[i] + " ");
	}

}
