//Calendar클래스를 이용해 현재시간을 출력하라.
package ch07_example;

import java.util.*; 

public class Calendar2 {

	public static void main(String[] args) {
		Calendar c = Calendar.getInstance();
		
		System.out.println("현재시간");
		
		System.out.println(c.get(Calendar.YEAR) + "/" + (c.get(Calendar.MONTH)+1) + "/" + c.get(Calendar.DATE));
		System.out.println(c.get(Calendar.HOUR) + ":" + c.get(Calendar.MINUTE) + ":" + c.get(Calendar.SECOND));

	}

}
