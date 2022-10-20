//사용자 정의 예외를 만들고 throws를 이용하여 예외를 처리하라.
package ch07_example;

import java.util.*;

class ToBigException extends Exception{
	public ToBigException() {
		super("문자가 너무 깁니다.");
	}
}

class ToSmallException extends Exception{
	public ToSmallException() {
		super("문자가 너무 짧습니다.");
	}
}

public class Throws2 {

	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)){
			System.out.print("글자 수가 10에서 30 사이인 문자열을 입력하세요 : ");
			String s = sc.nextLine();
			checkLength(s);
			
			System.out.println(s);
		}
		catch(ToBigException e) {
			System.err.println(e.getMessage());
		}
		catch(ToSmallException e) {
			System.err.println(e.getMessage());
		}
	}

	public static void checkLength(String s) throws ToBigException, ToSmallException{
		if(s.length() < 10) {
			throw new ToSmallException();
		}
		
		if(s.length() > 30) {
			throw new ToBigException();
		}
	}
}
