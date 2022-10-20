//배열을 받아서 평균을 출력하는 메소드 avgArray(double[] list)를 작성하라.
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
		
		System.out.println("배열의 평균  = " + avgArray(list));
	}
}
