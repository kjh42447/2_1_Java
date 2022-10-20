//복붙
package ch14_practice;

class ThreadB extends Thread {
	int total;
	
	@Override
	public void run() {
		synchronized(this) {
			for(int i = 0; i < 1000; i++) {
				total += i;
				
				try {
					Thread.sleep(1);
				}
				catch(InterruptedException e) {
					e.printStackTrace();
				}
				
			}
			notify();
		}
	}
}

public class WaitNotifyTest {

	public static void main(String[] args) throws InterruptedException {
		ThreadB b = new ThreadB();
		b.start();
		
		synchronized(b) {
			System.out.println("스레드B가 종료되기를 기다림");
			b.wait();
			System.out.println("전체 합계 : " + b.total);
		}
		
	}

}
