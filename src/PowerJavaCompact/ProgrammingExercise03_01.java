package PowerJavaCompact;

public class ProgrammingExercise03_01 {

	public static void main(String[] args) {
		int sum = 0;
		
		//����� ���� ���Ѵ�
		for(int i = 1; i <= 100; i++) {
			if (i%3 == 0 || i%4 == 0)
				sum += i;
		}
		System.out.println("3 �Ǵ� 4�� ����� ��=" + sum);
	}

}
