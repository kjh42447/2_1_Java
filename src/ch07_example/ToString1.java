//toStringŬ������ �������ϰ� �׽�Ʈ�϶�.
package ch07_example;

class ToStringTest1	{

	@Override
	public String toString() {
		return "�����ǵ� toStirng �޼ҵ� �Դϴ�.";
	}
	
}

public class ToString1 {

	public static void main(String[] args) {
		ToStringTest1 obj = new ToStringTest1();
		System.out.println(obj.toString());
	}

}
