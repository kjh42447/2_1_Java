//기초자료형 변환이 가능한 여러 문자열들을 기초자료형으로 변환하라.
package ch07_example;

public class Wrapper5 {

	public static void main(String[] args) {
		byte by = Byte.parseByte("10");
		short s = Short.parseShort("10");
		int i = Integer.parseInt("10");
		long l = Long.parseLong("10");
		float f = Float.parseFloat("10.0");
		double d = Double.parseDouble("10.0");
		boolean bl = Boolean.parseBoolean("true");
		
		System.out.println("byte by = " + by);
		System.out.println("short s = " + s);
		System.out.println("int i = " + i);
		System.out.println("long l = " + l);
		System.out.println("float f = " + f);
		System.out.println("double d = " + d);
		System.out.println("boolean bl = " + bl);
	}

}
