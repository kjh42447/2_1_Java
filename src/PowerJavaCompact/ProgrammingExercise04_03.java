package PowerJavaCompact;

class Date{
	public int year;
	public int month;
	public int day;
	
	Date(int a, int b, int c){
		this.year = a;
		this.month = b;
		this.day = c;
	}
	void print1() {
		System.out.printf("%d.%d.%d\n", this.year, this.month, this.day);
	}
	
	void print2() {
		String month = new String();
		
		switch(this.month) {
		case 1:	month = "January";		break;
		case 2:	month = "Febuary";		break;
		case 3:	month = "March";		break;
		case 4:	month = "April";		break;
		case 5:	month = "May";			break;
		case 6:	month = "June";			break;
		case 7:	month = "July";			break;
		case 8:	month = "August";		break;
		case 9:	month = "September";	break;
		case 10: month = "October";		break;
		case 11: month = "November";	break;
		case 12: month = "Decomber";	break;
		}
		System.out.printf("%s %d, %d\n", month, this.day, this.year);
		
	}
}
public class ProgrammingExercise04_03 {

	public static void main(String[] args) {
		Date date = new Date(2012,9,5);
		date.print1();
	}

}
