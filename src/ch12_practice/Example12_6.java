//����
package ch12_practice;

import java.util.*;

public class Example12_6 {

	public static void main(String[] args) {
		HashMap<String, String> list = new HashMap<String, String>();
		
		list.put("100", "ȫ�浿");
		list.put("200", "������");
		list.put("300", "��ö��");
		
		//��� �׸��� ����Ѵ�
		System.out.println(list);
		
		//�ϳ��� �׸��� �����Ѵ�
		list.remove("200");
		
		//�ϳ��� �׸��� ��ġ�Ѵ�
		list.put("100", "���ڿ�");
		
		//���� �����Ѵ�
		System.out.println(list.get("300"));
		
		//��� �׸��� �湮�Ѵ�.
		for(String key : list.keySet()) {
			String value = list.get(key);
			System.out.println("key = " + key + ", value = " + value);
		}
		
		//���ٽ�
		list.forEach((key, value) -> {
			System.out.println("key = " + key + ", value = " + value);
		});
	}

}
