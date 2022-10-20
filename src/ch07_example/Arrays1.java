//Arrays클래스의 다양한 메소드들을 테스트하라.
package ch07_example;

import java.util.*;

public class Arrays1 {

	public static void printArray(int[] array) {
		System.out.print("{ ");
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i] + " ");
		}
		System.out.println("}");
	}
	
	public static void main(String[] args) {
		int[] array1 = { 9, 3, 5, 7, 2, 4, 8 };
		
		//copyOf
		int[] array2 = Arrays.copyOf(array1, array1.length);
		printArray(array1);
		printArray(array2);
		
		//equals
		System.out.println(Arrays.equals(array1, array2));
		
		//sort
		Arrays.sort(array1);
		printArray(array1);
		
		//binarySearch
		System.out.println("4의 위치 : " + Arrays.binarySearch(array1, 4));
		
		//fill
		Arrays.fill(array1, 7);
		printArray(array1);
		
	}

}
