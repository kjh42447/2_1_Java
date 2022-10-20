//복붙 + 셔플추가
package ch12_practice;

import java.util.*;

public class Example12_10 {

	public static void main(String[] args) {
		int key = 5;
		List<Integer> list = new ArrayList<Integer>();
		
		for(int i = 0; i < 10; i++) {
			list.add(i);
		}
		
		int index = Collections.binarySearch(list, key);
		System.out.println("탐색의 반환값 : " + index);
		
		Collections.shuffle(list);
		System.out.println(list);
	}

}
