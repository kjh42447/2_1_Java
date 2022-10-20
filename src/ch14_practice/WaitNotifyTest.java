//����
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
			System.out.println("������B�� ����Ǳ⸦ ��ٸ�");
			b.wait();
			System.out.println("��ü �հ� : " + b.total);
		}
		
	}

}
