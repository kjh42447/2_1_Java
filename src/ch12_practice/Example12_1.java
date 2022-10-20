//복붙
package ch12_practice;

import java.util.*;

class Monster_1 {
	String name;
	double hp;
	
	public Monster_1(String name, double hp) {
		this.name = name;
		this.hp = hp;
	}
	
	@Override
	public String toString() {	return "{" + name + "," + hp + "}";	}
}

public class Example12_1 {

	public static void main(String[] args) {
		Vector<Monster_1> list = new Vector<Monster_1>();
		
		list.add(new Monster_1("Mon1", 100));
		list.add(new Monster_1("Mon2", 200));
		list.add(new Monster_1("Mon3", 300));
		
		System.out.println("벡터의 크기 : " + list.size());
		System.out.print(list);
	}

}
