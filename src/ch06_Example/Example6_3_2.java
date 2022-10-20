//����� ��Ÿ���� Vehicle3_2Ŭ������ �������� ��� ���� ������ ������ Ŭ�������� �ۼ��϶�.
package ch06_Example;

class Vehicle3_2{	
	protected int speed = 0, seater = 0;
	
	Vehicle3_2(int speed, int seater){
		this.speed = speed;
		this.seater = seater;
	}
	
	void print() {
		System.out.println("�ӵ� : " + speed + ", �¼� �� : " + seater);
	}
}

class Car3_2 extends Vehicle3_2{	
	
	Car3_2(int speed, int seater){
		super(speed, seater);
	}
	
	void print() {
		System.out.println("�ӵ� : " + speed + ", �¼� �� : " + seater);
	}
}

class Truck3_2 extends Vehicle3_2{	
	protected int carryingCapacity;
	
	Truck3_2(int speed, int seater, int carryingCapacity){
		super(speed, seater);
		this.carryingCapacity = carryingCapacity;
	}
	
	void print() {
		System.out.println("�ӵ� : " + speed + ", �¼� �� : " + seater + ", ���緮 : " + carryingCapacity);
	}
}

class Bus3_2 extends Vehicle3_2{	
	
	Bus3_2(int speed, int seater){
		super(speed, seater);
	}
	
	void print() {
		System.out.println("�ӵ� : " + speed + ", �¼� �� : " + seater);
	}
}

class SportsCar3_2 extends Car3_2{	
	boolean turbo;
	
	SportsCar3_2(int speed, int seater, boolean turbo){
		super(speed, seater);
		this.turbo = turbo;
	}
	
	void print() {
		System.out.println("�ӵ� : " + speed + ", �¼� �� : " + seater + ", �ͺ� : " + turbo);
	}
}

class ElectricCar3_2 extends Car3_2{	
	int battery;
	
	ElectricCar3_2(int speed, int seater, int battery){
		super(speed, seater);
		this.battery = battery;
	}
	
	void print() {
		System.out.println("�ӵ� : " + speed + ", �¼� �� : " + seater + ", ���͸� : " + battery);
	}
}

class SmallTruck3_2 extends Truck3_2{	
	
	SmallTruck3_2(int speed, int seater, int carryingCapacity){
		super(speed, seater, carryingCapacity);
	}
	
	void print() {
		System.out.println("�ӵ� : " + speed + ", �¼� �� : " + seater + ", ���緮 : " + carryingCapacity);
	}
}

public class Example6_3_2 {
	public static void main(String[] args) {
		SportsCar3_2 sportscar = new SportsCar3_2(200, 2, true);
		sportscar.print();
	}
}
