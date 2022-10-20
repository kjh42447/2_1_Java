package PowerJavaCompact;

import java.util.ArrayList;

class Person{
	String name;
	String tel;
	
	Person(String name, String tel){
		this.name = name;
		this.tel = tel;
	}
}
public class ArrayListTest2 {

	public static void main(String[] args) {
		ArrayList<Person> list = new ArrayList<Person>();
		list.add(new Person("È«±æµ¿", "01012345678"));
		list.add(new Person("±èÀ¯½Å", "01012345679"));
		list.add(new Person("ÃÖÀÚ¿µ", "01012345680"));
		list.add(new Person("±è¿µÈñ", "01012345681"));
		
		for (Person obj : list)
			System.out.println("(" + obj.name + ", " + obj.tel + ")");
	}

}
