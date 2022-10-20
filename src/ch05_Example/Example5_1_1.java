//하루에 판매되는 음료의 개수를 구하는 프로그램을 작성하라.
package ch05_Example;

class Drink{
	private String type;
	static int count = 0;
	
	public void setType(String type)	{	this.type = type;	}
	public String getType()		{	return type;	}
	
	public Drink(String type) {
		this.type = type;
		count++;
	}
}
public class Example5_1_1 {
	public static void main(String[] args) {
		Drink d1 = new Drink("cola");
		Drink d2 = new Drink("cider");
		Drink d3 = new Drink("beer");
		
		int n = Drink.count;
		System.out.println("지금까지 판매된 음료 개수 = " + n);
	}

}
