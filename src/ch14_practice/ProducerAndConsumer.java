//������&�Һ���
package ch14_practice;

//�ɟ� ����
class Buffer {
	private int data;					
	private boolean empty = true;		//�Һ��ڱ� ��ٸ��� true, �����ڰ� ��ٸ��� false
	
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

//������
class Producer implements Runnable {
	private Buffer buffer;
	
	public Producer(Buffer buffer) {
		this.buffer = buffer;
	}
	
	@Override
	public void run() {
		for(int i = 0; i < 10; i++) {
			buffer.put(i);
			System.out.println("������ : " + i + "�� �ɟ��� �����Ͽ����ϴ�.");
			try {
				Thread.sleep((int) (Math.random()*100));
			}
			catch(InterruptedException e) {
				e.printStackTrace();
			}
		}
		
	}
	
}

//�Һ���
class Consumer implements Runnable {
	private Buffer buffer;
	
	public Consumer(Buffer drop) {
		this.buffer = drop;
	}
	
	@Override
	public void run() {
		for(int i = 0; i < 10; i++) {
			int data = buffer.get();
			System.out.println("�Һ��� : " + i + "�� �ɟ��� �Һ��Ͽ����ϴ�.");
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
