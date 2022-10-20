//수업 과목 중 현재 수업중인 과목을 출력하라.
package ch05_Example;

class Subject{
	static String nowSubject = new String();
	
	public Subject(String sj) {
		nowSubject = sj;
	}
}
public class Example5_1_2 {
	public static void main(String[] args) {
		Subject firstClass = new Subject("Discrete Mathematics");
		Subject secondClass = new Subject("Unix System");
		Subject thirdClass = new Subject("Java Programming");
		
		String nowClass = Subject.nowSubject;
		System.out.println("현재 수업중인 과목 : " + nowClass);
	}
}
