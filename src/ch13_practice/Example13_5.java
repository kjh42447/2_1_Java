//복붙
package ch13_practice;

import java.io.*;
import java.util.*;

public class Example13_5 {

	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		System.out.println("원본 파일 이름을 확장자 명을 포함하여 입력하시오 : ");
		
		String inputFileName = sc.next();
		System.out.print("복사 파일 이름을 확장자 명을 포함하여 입력하세요 : ");
		String outputFileName = sc.next();
		
		try(InputStream inputStream = new FileInputStream(".\\src\\image\\" + inputFileName);
				OutputStream outputStream = new FileOutputStream(".\\src\\fio\\" + outputFileName)){
			int c;
			while((c = inputStream.read()) != -1) {
				outputStream.write(c);
			}
		}
		System.out.println(inputFileName + "을 " + outputFileName + "로 복사하였습니다.");
	}

}
