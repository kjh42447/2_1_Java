//Comparator 인터페이스를 구현하는 Compare_3 클래스를 작성하고 점수를 내림차순으로, 점수가 같다면 이름을 오름차순으로 정렬하여 출력하라.
package ch06_Example;

import java.util.*;

class CompareStudent implements Comparator<Student_3>{
	
	public int compare(Student_3 s1, Student_3 s2) {
		if (s1.getGpa() > s2.getGpa())
			return -1;
		else if (s1.getGpa() < s2.getGpa())
			return 1;
		else {
			if (s1.getName().compareTo(s2.getName()) > 0)
				return 1;
			else if (s1.getName().compareTo(s2.getName()) < 0)
				return -1;
			else
				return 0;
		}
	}
}

class Student_3 {
	private String name;
	private double gpa;
	
	public String getName()	{	return name;	}
	public double getGpa()	{	return gpa;	}
	
	public Student_3(String n, double g) {
		name = n;
		gpa = g;
	}
}

public class InterfaceExample3_3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		CompareStudent c = new CompareStudent();
		ArrayList<Student_3> students = new ArrayList<Student_3>();
		
		while (true) {
			System.out.print("학생의 정보를 입력하려면 1, 입력을 종료하고 정렬을 하려면 2를 입력하시오 : ");
			int check = sc.nextInt();
			sc.nextLine();
			
			if (check == 1) {
				System.out.print("이름 : ");
				String name = sc.nextLine();
				System.out.print("점수 : ");
				double gpa = sc.nextDouble();
				sc.nextLine();
				
				students.add(new Student_3(name, gpa));
			}
			
			else if (check ==2)
				break;
			
			else
				System.out.println("다시 입력하시오.");
		}
		
		Collections.sort(students, c);
		for (Student_3 s : students) {
			System.out.println("이름 : " + s.getName() + ", 평점 : " + s.getGpa());
		}
		
		sc.close();
	}
}
