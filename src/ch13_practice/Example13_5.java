//����
package ch13_practice;

import java.io.*;
import java.util.*;

public class Example13_5 {

	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		System.out.println("���� ���� �̸��� Ȯ���� ���� �����Ͽ� �Է��Ͻÿ� : ");
		
		String inputFileName = sc.next();
		System.out.print("���� ���� �̸��� Ȯ���� ���� �����Ͽ� �Է��ϼ��� : ");
		String outputFileName = sc.next();
		
		try(InputStream inputStream = new FileInputStream(".\\src\\image\\" + inputFileName);
				OutputStream outputStream = new FileOutputStream(".\\src\\fio\\" + outputFileName)){
			int c;
			while((c = inputStream.read()) != -1) {
				outputStream.write(c);
			}
		}
		System.out.println(inputFileName + "�� " + outputFileName + "�� �����Ͽ����ϴ�.");
	}

}
