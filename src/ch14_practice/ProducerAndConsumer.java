//생산자&소비자
package ch14_practice;

//케잌 저장
class Buffer {
	private int data;					
	private boolean empty = true;		//소비자기 기다리면 true, 생산자가 기다리면 false
	
	public synchronized int get() {
		while(empty) {
			try {
				wait();
			}
			catch(InterruptedException e) {
				e.printStackTrace();
			}
			
		}
		
		empty = true;
		notifyAll();
		return data;
	}
	
	public synchronized void put(int data) {
		while(!empty) {
			try {
				wait();
			}
			catch(InterruptedException e) {
				e.printStackTrace();
			}
		
		}
		
		empty = false;
		this.data = data;
		notifyAll();
	}
	
}

//생산자
class Producer implements Runnable {
	private Buffer buffer;
	
	public Producer(Buffer buffer) {
		this.buffer = buffer;
	}
	
	@Override
	public void run() {
		for(int i = 0; i < 10; i++) {
			buffer.put(i);
			System.out.println("생산자 : " + i + "번 케잌을 생산하였습니다.");
			try {
				Thread.sleep((int) (Math.random()*100));
			}
			catch(InterruptedException e) {
				e.printStackTrace();
			}
		}
		
	}
	
}

//소비자
class Consumer implements Runnable {
	private Buffer buffer;
	
	public Consumer(Buffer drop) {
		this.buffer = drop;
	}
	
	@Override
	public void run() {
		for(int i = 0; i < 10; i++) {
			int data = buffer.get();
			System.out.println("소비자 : " + i + "번 케잌을 소비하였습니다.");
			try {
				Thread.sleep((int) (Math.random()*100));
			}
			catch(InterruptedException e) {
				e.printStackTrace();
			}
			
		}
			
	}
	
}

public class ProducerAndConsumer {

	public static void main(String[] args) {
		Buffer buffer = new Buffer();
		(new Thread(new Producer(buffer))).start();
		(new Thread(new Consumer(buffer))).start();
	}

}
