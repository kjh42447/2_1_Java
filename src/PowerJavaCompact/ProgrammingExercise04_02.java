package PowerJavaCompact;

class Dogs{
	public String breed;
	public int age;
	public String color;
	
	void barking() {	System.out.println("barking()");	}
	void hungry() {	System.out.println("hungry()");	}
	void sleeping() {	System.out.println("sleeping()");	}
}
public class ProgrammingExercise04_02 {

	public static void main(String[] args) {
		Dogs dog = new Dogs();
		dog.breed = "york";
		dog.age = 1;
		dog.color = "orange";
		
		System.out.printf("(%s,%d,%s)\n", dog.breed, dog.age, dog.color);
		dog.barking();
		dog.hungry();
		dog.sleeping();
	}

}
