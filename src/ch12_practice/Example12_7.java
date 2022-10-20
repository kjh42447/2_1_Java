//º¹ºÙ
package ch12_practice;

import java.util.*;

public class Example12_7 {

	public static void main(String[] args) {
		String[] sample = { "i", "walk", "the",  "line" };
		List<String> list = Arrays.asList(sample);
		Collections.sort(list);
		System.out.println(list);
	}

}
