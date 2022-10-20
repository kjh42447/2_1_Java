package PowerJavaCompact;

public class Dice {
	private int value;
	
	public Dice() {
		value = 0;
	}
	
	public int getValue() {		return value;	}
	public void setValue(int value) {		this.value = value;		}
	
	//�ֻ����� ������ ���� �Է�
	void roll() {
		this.setValue((int)(Math.random()*6+1));
	}
	
	public static void main(String[] args) {
		Dice dice1 = new Dice(), dice2 = new Dice();
		int count = 0;
		
		//�ֻ����� ������
		do {
			dice1.roll();
			dice2.roll();
			System.out.println("�ֻ���1= " + dice1.getValue() + " �ֻ���2= " + dice2.getValue());
			count++;
		}while(dice1.getValue() + dice2.getValue() != 2);
		
		System.out.println("(1, 1)�� �����µ� �ɸ� Ƚ�� = " + count);
	}

}
