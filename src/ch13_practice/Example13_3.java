//º¹ºÙ
package ch13_practice;

import java.io.*;

public class Example13_3 {

	public static void main(String[] args) {
		byte[] list = {10, 20, 30, 40, 50, 60};
		try(FileOutputStream out = new FileOutputStream(".\\src\\fio\\test.bin"))	{
			for(byte b : list) {
				out.write(b);
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
