//º¹ºÙ
package ch13_practice;

import java.io.*;

public class Example13_4 {

	public static void main(String[] args) {
		byte[] list = new byte[6];
		try(FileInputStream out = new FileInputStream(".\\src\\fio\\test.bin")) {
			out.read(list);
		}
		catch(IOException e) {
			e.printStackTrace();
		}
		
		for (byte b : list) {
			System.out.print(b + " ");
		}
	}

}
