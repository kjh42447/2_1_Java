//นฬวม
package ch13_practice;

import java.io.*;

public class MiniProject13 {
	
	public static String encode(String plaintext, int x) {
		StringBuffer encodetext = new StringBuffer();
		
		for(char c : plaintext.toCharArray()) {
			char ch;
			if(Character.isLowerCase(c)) {
				ch = (char) ((c-'a'+x)%26 + 'a');
				encodetext.append(ch);
			}
			
			else if(Character.isUpperCase(c)) {
				ch = (char) ((c-'A'+x)%26 + 'A');
				encodetext.append(ch);
			}
			
			else {
				encodetext.append(c);
			}
			
		}
		
		return encodetext.toString();
	}
	
	public static String decode(String encodetext, int x) {
		StringBuffer decodetext = new StringBuffer();
		
		for(char c : encodetext.toCharArray()) {
			char ch;
			if(Character.isLowerCase(c)) {
				ch = (char) ((c-'a'-x+26)%26 + 'a');
				decodetext.append(ch);
			}
			
			else if(Character.isUpperCase(c)) {
				ch = (char) ((c-'A'-x+26)%26 + 'A');
				decodetext.append(ch);
			}
			
			else {
				decodetext.append(c);
			}
		}
		
		return decodetext.toString();
	}
	
	public static void main(String[] args) throws IOException {
		FileReader fr = new  FileReader(".\\src\\fio\\input.txt");
		BufferedReader br = new BufferedReader(fr);
		String plaintext = br.readLine();
		
		System.out.println(MiniProject13.encode(plaintext, 3));
		System.out.println(MiniProject13.decode(MiniProject13.encode(plaintext, 3), 3));
		fr.close();
	}

}
