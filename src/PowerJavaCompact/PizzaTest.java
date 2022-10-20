package PowerJavaCompact;

class Pizzat{
	int radius;
	
	Pizzat(int r){
		radius = r;
	}
	Pizzat whosLargest(Pizzat p1, Pizzat p2) {
		if(p1.radius > p2.radius)
			return p1;
		else
			return p2;
	}
}
public class PizzaTest {

	public static void main(String[] args) {
		Pizzat obj1 = new Pizzat(14);
		Pizzat obj2 = new Pizzat(18);
		
		Pizzat largest = obj1.whosLargest(obj1, obj2);
		System.out.println(largest.radius + "인치 피자가 더 큼.");
	}

}
