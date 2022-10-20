//배열을 오름차순으로 정렬해주는 메소드 sortArray를 작성하라.
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
		
		System.out.print("정렬 전 배열  : ");
		print(list);
		sortArray(list);
		System.out.print("정렬 후 배열 : ");
		print(list);
		
	}

}
