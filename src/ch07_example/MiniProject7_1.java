//���� ��� ���α׷�
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
			System.out.println("������ ���� : " + answer);
			System.out.print("���ڸ� �����Ͻÿ� : ");
			c = sc.nextLine();
			
			//���� ã��
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
		
		System.out.println("������ ���� : " + answer);
		System.out.println("�����Դϴ�. �����մϴ�!");
		
		sc.close();
	}

}
