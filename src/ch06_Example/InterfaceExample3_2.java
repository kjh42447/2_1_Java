//Comparator �������̽��� �����ϴ� Compare_2 Ŭ������ �ۼ��ϰ� ���ڸ� ������������ �����Ͽ� ����϶�.
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
		students[0] = new Student_2("ȫ�浿", 3.39);
		students[1] = new Student_2("�Ӳ���", 4.19);
		students[2] = new Student_2("Ȳ����", 4.22);
		students[3] = new Student_2("������", 3.88);
		
		Arrays.sort(students, c);
		for (Student_2 s : students)
			System.out.println("�̸� : " + s.getName() + ", ���� : " + s.getGpa());
	}
}
