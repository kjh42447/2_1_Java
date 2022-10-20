//Comparator 인터페이스를 구현하는 Compare_2 클래스를 작성하고 문자를 내림차순으로 정렬하여 출력하라.
package ch06_Example;

import java.util.*;

class CompareName implements Comparator<Student_2>{
	
	public int compare(Student_2 s1, Student_2 s2) {
		if (s1.getName().compareTo(s2.getName()) > 0)
			return -1;
		else
			return 1;
	}
}

class Student_2 {
	private String name;
	private double gpa;
	
	public String getName()	{	return name;	}
	public double getGpa()	{	return gpa;	}
	
	public Student_2(String n, double g) {
		name = n;
		gpa = g;
	}
}
public class InterfaceExample3_2 {
	public static void main(String[] args) {
		CompareName c = new CompareName();
		Student_2[] students = new Student_2[4];
		students[0] = new Student_2("홍길동", 3.39);
		students[1] = new Student_2("임꺽정", 4.19);
		students[2] = new Student_2("황진이", 4.22);
		students[3] = new Student_2("김유신", 3.88);
		
		Arrays.sort(students, c);
		for (Student_2 s : students)
			System.out.println("이름 : " + s.getName() + ", 평점 : " + s.getGpa());
	}
}
