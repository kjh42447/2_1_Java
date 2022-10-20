//복붙
package ch12_practice;

import java.util.*;

public class Example12_5 {

	public static void main(String[] args) {
		HashSet<String> s = new HashSet<String>();
		String[] sample = { "사과", "사과", "바나나", "토마토" };
		
		for (String a : sample) {
			if(!s.add(a)) {
				System.out.println("중복된 단어 : " + a);
			}
		}
		
		System.out.println(s.size() + "개의 중복되지 않은 단어 : " + s);
	}

}
