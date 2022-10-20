//운송을 나타내는 Vehicle3_2클래스를 시작으로 상속 계층 구조를 가지는 클래스들을 작성하라.
package ch06_Example;

class Vehicle3_2{	
	protected int speed = 0, seater = 0;
	
	Vehicle3_2(int speed, int seater){
		this.speed = speed;
		this.seater = seater;
	}
	
	void print() {
		System.out.println("속도 : " + speed + ", 좌석 수 : " + seater);
	}
}

class Car3_2 extends Vehicle3_2{	
	
	Car3_2(int speed, int seater){
		super(speed, seater);
	}
	
	void print() {
		System.out.println("속도 : " + speed + ", 좌석 수 : " + seater);
	}
}

class Truck3_2 extends Vehicle3_2{	
	protected int carryingCapacity;
	
	Truck3_2(int speed, int seater, int carryingCapacity){
		super(speed, seater);
		this.carryingCapacity = carryingCapacity;
	}
	
	void print() {
		System.out.println("속도 : " + speed + ", 좌석 수 : " + seater + ", 적재량 : " + carryingCapacity);
	}
}

class Bus3_2 extends Vehicle3_2{	
	
	Bus3_2(int speed, int seater){
		super(speed, seater);
	}
	
	void print() {
		System.out.println("속도 : " + speed + ", 좌석 수 : " + seater);
	}
}

class SportsCar3_2 extends Car3_2{	
	boolean turbo;
	
	SportsCar3_2(int speed, int seater, boolean turbo){
		super(speed, seater);
		this.turbo = turbo;
	}
	
	void print() {
		System.out.println("속도 : " + speed + ", 좌석 수 : " + seater + ", 터보 : " + turbo);
	}
}

class ElectricCar3_2 extends Car3_2{	
	int battery;
	
	ElectricCar3_2(int speed, int seater, int battery){
		super(speed, seater);
		this.battery = battery;
	}
	
	void print() {
		System.out.println("속도 : " + speed + ", 좌석 수 : " + seater + ", 배터리 : " + battery);
	}
}

class SmallTruck3_2 extends Truck3_2{	
	
	SmallTruck3_2(int speed, int seater, int carryingCapacity){
		super(speed, seater, carryingCapacity);
	}
	
	void print() {
		System.out.println("속도 : " + speed + ", 좌석 수 : " + seater + ", 적재량 : " + carryingCapacity);
	}
}

public class Example6_3_2 {
	public static void main(String[] args) {
		SportsCar3_2 sportscar = new SportsCar3_2(200, 2, true);
		sportscar.print();
	}
}
