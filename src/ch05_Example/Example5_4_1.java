//�迭�� �޾� �ִ밪�� ����Ͽ� ��ȯ�ϴ� �޼ҵ� maxArray(double[] list) �� �ۼ��϶�.
package ch05_Example;

public class Example5_4_1 {
	
	public static double maxArray(double[] list) {
		double max = list[0];
		
		for (int i = 1; i < list.length; i++) {
			if(list[i] > max)
				max = list[i];
		}
		return max;
	}
	public static void main(String[] args) {
		double[] a = {1.1, 2.2, 3.3, 4.4, 5.5, 6.6};
		double[] b = {-2.0, 2.7, -9.0, 2.9, 11.5};
		
		double max;
		
		max = maxArray(a);
		System.out.println("ù ��° �迭�� �ִ밪 = " + max);
		max = maxArray(b);
		System.out.println("�� ��° �迭�� �ִ밪 = " + max);
	}
}
