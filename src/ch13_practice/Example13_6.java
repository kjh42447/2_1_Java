//º¹ºÙ
package ch13_practice;

import java.io.*;

public class Example13_6 {

	public static void main(String[] args) {
		try( BufferedReader in = new BufferedReader(new FileReader(".\\src\\fio\\test.txt"));
				PrintWriter out = new PrintWriter(new FileWriter(".\\src\\fio\\copyline.txt"))){
			String line;
			while((line = in.readLine()) != null) {
				out.println( line);
			}
		}
		catch(IOException e) {
			e.printStackTrace();
		}
	
	}

}
