//Comparator �������̽��� �����ϴ� Compare_3 Ŭ������ �ۼ��ϰ� ������ ������������, ������ ���ٸ� �̸��� ������������ �����Ͽ� ����϶�.
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
			System.out.print("�л��� ������ �Է��Ϸ��� 1, �Է��� �����ϰ� ������ �Ϸ��� 2�� �Է��Ͻÿ� : ");
			int check = sc.nextInt();
			sc.nextLine();
			
			if (check == 1) {
				System.out.print("�̸� : ");
				String name = sc.nextLine();
				System.out.print("���� : ");
				double gpa = sc.nextDouble();
				sc.nextLine();
				
				students.add(new Student_3(name, gpa));
			}
			
			else if (check ==2)
				break;
			
			else
				System.out.println("�ٽ� �Է��Ͻÿ�.");
		}
		
		Collections.sort(students, c);
		for (Student_3 s : students) {
			System.out.println("�̸� : " + s.getName() + ", ���� : " + s.getGpa());
		}
		
		sc.close();
	}
}
