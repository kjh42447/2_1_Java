//ArrayIndexOutOfBoundsException을 예외처리하여 작성하라.
package ch07_example;

public class ArrayIndexOutOfBoundsException1 {

	public static void main(String[] args) {
		int[] array = {1, 2, 3, 4, 5};
		int i = 0;
		
		try {
			for (i = 0; i <= array.length; i++) {
				System.out.print(array[i] + " ");
			}
			System.out.println();
		}
		catch(ArrayIndexOutOfBoundsException e) {
			System.out.println();
			System.out.println("인덱스 " + i + "는 사용할 수 없습니다.");
		}
		finally {
			System.out.println("프로그램을 종료합니다.");
		}
	}

}
