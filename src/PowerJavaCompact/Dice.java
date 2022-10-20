package PowerJavaCompact;

public class Dice {
	private int value;
	
	public Dice() {
		value = 0;
	}
	
	public int getValue() {		return value;	}
	public void setValue(int value) {		this.value = value;		}
	
	//주사위에 무작위 값을 입력
	void roll() {
		this.setValue((int)(Math.random()*6+1));
	}
	
	public static void main(String[] args) {
		Dice dice1 = new Dice(), dice2 = new Dice();
		int count = 0;
		
		//주사위를 굴린다
		do {
			dice1.roll();
			dice2.roll();
			System.out.println("주사위1= " + dice1.getValue() + " 주사위2= " + dice2.getValue());
			count++;
		}while(dice1.getValue() + dice2.getValue() != 2);
		
		System.out.println("(1, 1)이 나오는데 걸린 횟수 = " + count);
	}

}
