//º¹ºÙ
package ch14_practice;

class Counter4 {
	private int value = 0;
	public synchronized void increment() {	value++;	}
	public synchronized void decrement() {	value--;	}
	public synchronized void printCounter() {	System.out.println(value);	}
}

class MyThread4 extends Thread {
	Counter4 sharedCounter;
	
	public MyThread4(Counter4 c) {
		this.sharedCounter = c;
	}
	
	@Override
	public void run() {
		int i = 0;
		while(i < 20000) {
			sharedCounter.increment();
			sharedCounter.decrement();
			
			if(i%40 == 0) {
				sharedCounter.printCounter();
			}
			
			try {
				sleep(((int) (Math.random() * 2))*100);
			}
			catch (InterruptedException e) { }
			i++;
		}
	
	}
	
}

public class Example14_4 {

	public static void main(String[] args) {
		Counter4 c = new Counter4();
		new MyThread4(c).start();
		new MyThread4(c).start();
		new MyThread4(c).start();
		new MyThread4(c).start();
		new MyThread4(c).start();
		new MyThread4(c).start();
		new MyThread4(c).start();
		new MyThread4(c).start();
	}

}
