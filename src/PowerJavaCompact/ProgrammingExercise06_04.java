package PowerJavaCompact;

class sports{
	String getName() {	return "아직 결정되지 않음";	}
	int getPlayers() {	return 0;	}
}

class Soccer extends sports{
	String getName() {	return "축구";	}
	int getPlayers() {	return 11;	}
}

public class ProgrammingExercise06_04 {
	
	public static void main(String[] args) {
		Soccer sc = new Soccer();
		System.out.println("경기이름: " + sc.getName());
		System.out.println("경기자수: " + sc.getPlayers());
	}

}
