//����
package ch12_practice;

import java.util.*;

public class Example12_5 {

	public static void main(String[] args) {
		HashSet<String> s = new HashSet<String>();
		String[] sample = { "���", "���", "�ٳ���", "�丶��" };
		
		for (String a : sample) {
			if(!s.add(a)) {
				System.out.println("�ߺ��� �ܾ� : " + a);
			}
		}
		
		System.out.println(s.size() + "���� �ߺ����� ���� �ܾ� : " + s);
	}

}
