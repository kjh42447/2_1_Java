//���� ��ü 2���� �Է¹޾� ������ �� ���� ������ ���� ���� ����ϴ� �޼ҵ� moreToppings�� �ۼ��϶�.
package ch05_Example;

import java.util.ArrayList;

class Pizza{
	int toppingCount = 0;
	private ArrayList<String> topping = new ArrayList<String>();
	
	public void addTopping(String toppings) {
		topping.add(toppings);
		toppingCount++;
	}
	
	static Pizza moreToppings(Pizza p1, Pizza p2) {
		return p1.toppingCount < p2.toppingCount ? p2 : p1;
	}
}
public class Example5_3_1 {
	public static void main(String[] args) {
		Pizza p1 = new Pizza();
		Pizza p2 = new Pizza();
		
		p1.addTopping("cheeze");
		p2.addTopping("beef");
		p1.addTopping("mushroom");
		
		Pizza moreToppingsPizza = Pizza.moreToppings(p1, p2);
		System.out.println("���� ���� �� ���� ������ ���� ���� " + moreToppingsPizza.toppingCount + "�� �̴�.");
	}
}
