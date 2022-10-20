//Wrapper객체에 기초 자료형의 값을 저장하고 출력하라.
package ch07_example;

public class Wrapper1 {

	public static void main(String[] args) {
		
		Integer obj1 = 100;
		int value1 = obj1.intValue();
		
		Double obj2 = new Double(3.141592);	//해당 형식은 version9부터 사용하지 않는 형식이라고 한다.
		double value2 = obj2.doubleValue();
		
		System.out.println("value1의 값 : " + value1);
		System.out.println("vlaue2의 값 : " + value2);
	}

}
