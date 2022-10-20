package PowerJavaCompact;

class ComplexNumber{
	int real;
	int image;
	
	//생성자
	ComplexNumber(int a, int b){
		this.real = a;
		this.image = b;
	}
	
	//출력
	void print() {
		System.out.format("%d%+di\n", this.real, this.image);
	}
}
public class ProgrammingExercise04_04 {

	public static void main(String[] args) {
		ComplexNumber cn1 = new ComplexNumber(10, 20);
		cn1.print();
	}

}
