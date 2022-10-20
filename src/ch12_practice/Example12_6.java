//복붙
package ch12_practice;

import java.util.*;

public class Example12_6 {

	public static void main(String[] args) {
		HashMap<String, String> list = new HashMap<String, String>();
		
		list.put("100", "홍길동");
		list.put("200", "김유신");
		list.put("300", "김철수");
		
		//모든 항목을 출력한다
		System.out.println(list);
		
		//하나의 항목을 삭제한다
		list.remove("200");
		
		//하나의 항목을 대치한다
		list.put("100", "최자영");
		
		//값을 참조한다
		System.out.println(list.get("300"));
		
		//모든 항목을 방문한다.
		for(String key : list.keySet()) {
			String value = list.get(key);
			System.out.println("key = " + key + ", value = " + value);
		}
		
		//람다식
		list.forEach((key, value) -> {
			System.out.println("key = " + key + ", value = " + value);
		});
	}

}
