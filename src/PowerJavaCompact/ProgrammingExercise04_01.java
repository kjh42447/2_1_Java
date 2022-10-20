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
		
		System.out.println("학생의 이름: " + s.name);
		System.out.println("학생의 학번: " + s.rollno);
		System.out.println("학생의 나이: " + s.age);
	}

}
