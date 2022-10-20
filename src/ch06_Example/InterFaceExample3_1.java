//Comparable 인터페이스를 구현하는 Student_1 클래스를 작성하고 이름 순으로 정렬하라.
package ch06_Example;

import java.util.*;

class Student_1 implements Comparable<Student_1>{
	private String name;
	private double gpa;
	
	public String getName()	{	return name;	}
	public double getGpa()	{	return gpa;	}
	
	public Student_1(String n, double g) {
		name = n;
		gpa = g;
	}
	
	public int compareTo(Student_1 s) {
		return this.name.compareTo(s.name);
	}
}
public class InterFaceExample3_1 {
	public static void main(String[] args) {
		Student_1[] students = new Student_1[4];
		students[0] = new Student_1("홍길동", 3.39);
		students[1] = new Student_1("임꺽정", 4.19);
		students[2] = new Student_1("황진이", 4.22);
		students[3] = new Student_1("김유신", 3.88);
		
		Arrays.sort(students);
		for (Student_1 s : students)
			System.out.println("이름 : " + s.getName() + ", 평점 : " + s.getGpa());
	}
}
