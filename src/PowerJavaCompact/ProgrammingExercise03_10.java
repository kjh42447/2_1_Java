package PowerJavaCompact;

public class ProgrammingExercise03_10 {

	public static void main(String[] args) {
		double[] x = {1, 2, 3, 4};
		double max = 0, sum = 0;
		
		//�迭�� ���� ����ϸ鼭 �հ� �ִ밪�� ���Ѵ�
		for (double i:x) {
			System.out.print(i + " ");
			sum += i;
			if(max < i)
				max = i;
		}
		System.out.print("\n");
		System.out.println("���� " + sum);
		System.out.println("�ִ밪�� " + max);
	}

}
