//�迭�� �޾Ƽ� ����� ����ϴ� �޼ҵ� avgArray(double[] list)�� �ۼ��϶�.
package ch05_Example;

public class Example5_4_2 {
	public static double avgArray(double[] list) {
		double sum = 0;
		
		for(double i : list) 
			sum += i;
		
		return sum/list.length;
	}
	public static void main(String[] args) {
		double[] list = {1.5, 2.7, 2.8, 5.7, 3.8};
		
		System.out.println("�迭�� ���  = " + avgArray(list));
	}
}
