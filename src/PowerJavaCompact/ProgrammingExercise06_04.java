package PowerJavaCompact;

class sports{
	String getName() {	return "���� �������� ����";	}
	int getPlayers() {	return 0;	}
}

class Soccer extends sports{
	String getName() {	return "�౸";	}
	int getPlayers() {	return 11;	}
}

public class ProgrammingExercise06_04 {
	
	public static void main(String[] args) {
		Soccer sc = new Soccer();
		System.out.println("����̸�: " + sc.getName());
		System.out.println("����ڼ�: " + sc.getPlayers());
	}

}
