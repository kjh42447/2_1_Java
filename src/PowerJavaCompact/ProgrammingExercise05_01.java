package PowerJavaCompact;

class MyMetric{
	final static double metric = 0.6213881811967936;
	
	static double kiloToMile(double kilo) {
		return kilo*metric;
	}
	
	static double mileToKilo(double mile) {
		return mile/metric;
	}
}
public class ProgrammingExercise05_01 {

	public static void main(String[] args) {
		double kilo = 1;
		System.out.println(kilo + "Km를 마일로 바꾸면 " + MyMetric.kiloToMile(kilo));
	}

}
