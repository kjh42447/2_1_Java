//복붙
package ch13_practice;

import java.io.*;

public class Example13_2 {

	public static void main(String[] args) throws IOException {
		try(FileReader in = new FileReader(".\\src\\fio\\test.txt");
			FileWriter out = new  FileWriter(".\\src\\fio\\copy.txt"))	{	//2개이상 가능
				int c;
				
				while((c = in.read()) != -1) {
					out.write(c);
				}
		}
		
	}

}
