//7_1의 행맨을 보완하라.
//한 단어만 입력가능하다.
//예외적으로, 정답을 입력할 경우 바로 정답으로 처리한다.
package ch07_example;

import java.util.*;

public class MiniProject7_2 {

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
			
			//정답 확인
			if(c.equals(solution)) {
				break;
			}
			
			//글자 수 제한
			if(c.length() != 1) {
				System.err.println("한 단어만 입력하세요.");
				continue;
			}
			
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
		
		System.out.println("현재의 상태 : " + solution);
		System.out.println("정답입니다. 축하합니다!");
		
		sc.close();
	}

}
