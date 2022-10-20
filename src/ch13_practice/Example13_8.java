//����
package ch13_practice;

import java.io.*;
import java.util.*;

public class Example13_8 {

	public static void main(String[] args) throws IOException {
		String name = ".\\src\\fio";
		File dir = new File(name);
		String[] fileName = dir.list();
		
		for(String s : fileName) {
			File f = new File(name + "\\" + s);
			System.out.println("====================================================");
			System.out.println("�̸� : " + f.getName());
			System.out.println("��� : " + f.getPath());
			System.out.println("�θ� : " + f.getParent());
			System.out.println("������ : " + f.getAbsolutePath());
			System.out.println("���԰�� : " + f.getCanonicalPath());
			System.out.println("���丮 ���� : " + f.isDirectory());
			System.out.println("���Ͽ��� : " + f.isFile());
		}
		
	}

}
