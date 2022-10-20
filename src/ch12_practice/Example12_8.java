//º¹ºÙ
package ch12_practice;

import java.util.*;

class Student_8 implements Comparable<Student_8> {
	int number;
	String name;
	
	public Student_8(int number, String name) {
		this.number = number;
		this.name = name;
	}
	
	public String toString() {
		return name;
	}
	
	@Override
	public int compareTo(Student_8 s) {
		return number - s.number;
	}
	
}

public class Example12_8 {

	public static void main(String[] args) {
		Student_8[] array = {
				new Student_8(2, "±èÃ¶¼ö"),
				new Student_8(3, "ÀÌÃ¶¼ö"),
				new Student_8(1, "¹ÚÃ¶¼ö")
		};
		
		List<Student_8> list = Arrays.asList(array);
		Collections.sort(list);
		System.out.println(list);
	}

}
