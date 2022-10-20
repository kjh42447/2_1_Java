//복붙
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
			System.out.println("이름 : " + f.getName());
			System.out.println("경로 : " + f.getPath());
			System.out.println("부모 : " + f.getParent());
			System.out.println("절대경로 : " + f.getAbsolutePath());
			System.out.println("정규경로 : " + f.getCanonicalPath());
			System.out.println("디렉토리 여부 : " + f.isDirectory());
			System.out.println("파일여부 : " + f.isFile());
		}
		
	}

}
