package PowerJavaCompact;

class Student{
	public String name;
	public int rollno;
	public int age;
	
}
public class ProgrammingExercise04_01 {

	public static void main(String[] args) {
		Student s = new Student();
		s.name = "Kim";
		s.rollno = 20180001;
		s.age = 20;
		
		System.out.println("�л��� �̸�: " + s.name);
		System.out.println("�л��� �й�: " + s.rollno);
		System.out.println("�л��� ����: " + s.age);
	}

}
