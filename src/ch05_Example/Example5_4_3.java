//�迭�� ������������ �������ִ� �޼ҵ� sortArray�� �ۼ��϶�.
package ch05_Example;

public class Example5_4_3 {
	public static void sortArray(double[] list) {
		for (int i = list.length-1; i >= 1; i--) {
			for (int j = 0; j < i; j++) {
				if (list[j+1] < list[j]) {
					double temp = list[j+1];
					list[j+1] = list[j];
					list[j] = temp;
				}
			}
		}
	}
	public static void print(double[] list) {
		for(double i : list)
			System.out.print(i + " ");
		System.out.println("");
	}
	public static void main(String[] args) {
		double[] list = {5.5, -4.4, 6.6, -2.2, 3.3, 1.1, 0};
		
		System.out.print("���� �� �迭  : ");
		print(list);
		sortArray(list);
		System.out.print("���� �� �迭 : ");
		print(list);
		
	}

}
