//º¹ºÙ
package ch12_practice;

import java.util.*;

class Student_9 {
	int number;
	String name;
	
	public Student_9(int number, String name) {
		this.number = number;
		this.name = name;
	}
	
	@Override
	public String toString() {	return name;	}
	
}

public class Example12_9 {

	public static void main(String[] args) {
		Student_9[] array = {
				new Student_9(2, "±èÃ¶¼ö"),
				new Student_9(3, "ÀÌÃ¶¼ö"),
				new Student_9(1, "¹ÚÃ¶¼ö")
		};
		
		List<Student_9> list = Arrays.asList(array);
		Collections.sort(list, (Student_9 s1, Student_9 s2) -> {
			return (s1.number - s2.number);
		});
		
		System.out.println(list);
	}

}
