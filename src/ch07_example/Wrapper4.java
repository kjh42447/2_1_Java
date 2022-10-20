//여러 기초 자료형을 문자열로 변환하고 출력하라.
package ch07_example;

public class Wrapper4 {

	public static void main(String[] args) {
		Byte by = 10;
		Short s = 10;
		Integer i = 10;
		Long l = 10L;
		Float f = 10.0f;
		Double d = 10.0;
		Boolean bl = true;
		Character c = 'C';
		
		System.out.println("Byte : " + Byte.toString(by));
		System.out.println("Short : " + Short.toString(s));
		System.out.println("Integer : " + Integer.toString(i));
		System.out.println("Long  : " + Long.toString(l));
		System.out.println("Float : " + Float.toString(f));
		System.out.println("Double : " + Double.toString(d));
		System.out.println("Boolean : " + Boolean.toString(bl));
		System.out.println("Character : " + Character.toString(c));
	}

}
