//�Ϸ翡 �ǸŵǴ� ������ ������ ���ϴ� ���α׷��� �ۼ��϶�.
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
		System.out.println("���ݱ��� �Ǹŵ� ���� ���� = " + n);
	}

}
