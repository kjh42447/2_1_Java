//����� ���� ���ܸ� ����� throws�� �̿��Ͽ� ���ܸ� ó���϶�.
package ch07_example;

import java.util.*;

class ToBigException extends Exception{
	public ToBigException() {
		super("���ڰ� �ʹ� ��ϴ�.");
	}
}

class ToSmallException extends Exception{
	public ToSmallException() {
		super("���ڰ� �ʹ� ª���ϴ�.");
	}
}

public class Throws2 {

	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)){
			System.out.print("���� ���� 10���� 30 ������ ���ڿ��� �Է��ϼ��� : ");
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
