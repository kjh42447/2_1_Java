//º¹ºÙ
package ch14_practice;

class MyRunnable1 implements Runnable {
	String myName;
	
	public MyRunnable1(String name) {	myName = name;	}
	
	@Override
	public void run() {
		for(int i = 10; i >= 0; i--) {
			System.out.print(myName + i + " ");
		}
		
	}
	
}

public class Example14_1 {

	public static void main(String[] args) {
		Thread t1 = new Thread(new MyRunnable1("A"));
		Thread t2 = new Thread(new MyRunnable1("B"));
		
		t1.start();
		t2.start();
	}

}
