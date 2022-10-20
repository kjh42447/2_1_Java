//Random클래스의 여러가지 메소드들을 테스트하라.
package ch07_example;

import java.util.*;

public class Random1 {

	public static void main(String[] args) {
		Random r1 = new Random();
		Random r2 = new Random();
		Random r3 = new Random(1);
		Random r4 = new Random(1);
		
		System.out.printf("r1\tr2\tr3\tr4\n");
		
		//동일한 시드는 동일한 값을 가진다.
		for (int i = 0; i < 10; i++) {
			System.out.printf("%d\t", r1.nextInt(100));
			System.out.printf("%d\t", r2.nextInt(100));
			System.out.printf("%d\t", r3.nextInt(100));
			System.out.printf("%d\n", r4.nextInt(100));
		}
		
	}

}
