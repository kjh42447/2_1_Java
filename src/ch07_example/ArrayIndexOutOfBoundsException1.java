//ArrayIndexOutOfBoundsException�� ����ó���Ͽ� �ۼ��϶�.
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
			System.out.println("�ε��� " + i + "�� ����� �� �����ϴ�.");
		}
		finally {
			System.out.println("���α׷��� �����մϴ�.");
		}
	}

}
