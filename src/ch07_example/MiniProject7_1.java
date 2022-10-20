//교재 행맨 프로그램
package ch07_example;

import java.util.*;

public class MiniProject7_1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String[] words = { "java", "count", "school", "book", "student", "programmer" };
		String c;
		
		int index = (new Random()).nextInt(words.length);
		String solution = words[index];
		StringBuffer answer = new StringBuffer(solution.length());
		
		for(int i = 0; i < solution.length(); i++) {
			answer.append("_");
		}
		
		while(!(solution.equals(answer.toString()))) {
			System.out.println("현재의 상태 : " + answer);
			System.out.print("글자를 추측하시오 : ");
			c = sc.nextLine();
			
			//문자 찾기
			for(int i = 0; i < solution.length(); i++) {
				if(solution.indexOf(c, i) != -1) {
					i = solution.indexOf(c, i);
					answer.replace(i, i+1, c);
				}
				else {
					break;
				}
			}
		}
		
		System.out.println("현재의 상태 : " + answer);
		System.out.println("정답입니다. 축하합니다!");
		
		sc.close();
	}

}
