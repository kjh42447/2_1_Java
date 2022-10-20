//º¹ºÙ
package ch13_practice;

import java.io.*;
import java.util.*;

public class Example13_7 {
	
	public static void main(String[] args) throws IOException {
		ObjectInputStream in = null;
		ObjectOutputStream out = null;
		
		try {
			out = new ObjectOutputStream(new FileOutputStream(".\\src\\fio\\objectsave.dat"));
			out.writeObject(new Date());
			
			out.flush();
			in = new ObjectInputStream(new FileInputStream(".\\src\\fio\\objectsave.dat"));
			Date d = (Date) in.readObject();
			System.out.println(d);	
		}
		catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		finally {
			if(in != null) {
				in.close();
			}
			if(out != null) {
				out.close();
			}
		}
	}
	
}
