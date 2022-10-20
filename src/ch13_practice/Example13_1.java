//º¹ºÙ
package ch13_practice;

import java.io.*;

public class Example13_1 {

	public static void main(String[] args) throws Exception {
		FileReader fr = new FileReader(".\\src\\fio\\test.txt");
		int ch;
		while((ch = fr.read()) != -1) {
			System.out.print((char) ch); 
		}
		fr.close();
	}

}
