//13, 14
package finaltest_preparation;

import java.util.*;
import java.io.*;

/*
 * ����� ��Ʈ�� - ����� ��Ʈ�� - �Է� ����Ʈ ��Ʈ��(...InputStream)
 * 					   - ��� ����Ʈ ��Ʈ��(...OutputStream)
 * 			- ���� ��Ʈ�� - �Է� ���� ��Ʈ��(...Reader)
 * 					  - ��� ���� ��Ʈ��(...Writer)
 * 
 * �� ���� : BufferedReader or Writer(new FileReader or Writer)
 * readline(), println()
 * 
 * �����ڷ��� ���� : DataIn or Out...
 * readByte(), readInt(), readUTF()...
 * 
 * ����ȭ : ObjectIn...(fis) or Out...(fos)
 * 
 * File(������ �̸��� ��Ÿ��), Path(���) Ŭ����
 */

public class Ch13 {

	public static void main(String[] args) throws IOException, InterruptedException {
		Scanner s = new Scanner(System.in);
		
		try(FileInputStream fis = new FileInputStream("");		//����Ʈ�����Է�
				FileOutputStream fos = new FileOutputStream("");//���
				FileReader fr = new FileReader("");				//���������Է�
				FileWriter fw = new FileWriter("")) 			//���
		{	
			//��ĳ�� ����, ��¦�� �ᵵ �����ҵ�? ��ū���� �и��ϱ�
			s = new Scanner(new BufferedReader(new FileReader("")));
			
			while(s.hasNext()) {
				if(s.hasNextDouble()) {
					//�����̳�
				}
				System.out.println(s.next());
			}
			
			//�Է¿���
			String line;
			while((line = s.nextLine()) != null) {
				//BufferedReader�� readLine() ����
			}
			
			//����ȭ - ������Ʈ�� ���ϴ°� ������
			ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(""));
			oos.writeObject(new Object());
			
		}
		catch(IOException e) {
			e.printStackTrace();
		}
		finally {
			if(s != null) {
				s.close();
			}
		}
		
		//������
		
		//extends Thread, implements Runnable
		Thread t1 = new Thread(new Runnable() {		public void run() {		/*�ʿ��Ѱ� ��� �� */	}	});
		
		//���ٷ�
		Runnable run = () -> {		};
		new Thread(run).start();
		
		//���ͷ�Ʈ
		try {
			Thread.sleep(1000);
			t1.join(1000);	//1�ʵ��� t1�� �ױ⸦ ��ٸ�
		}
		catch(InterruptedException e) {
			e.printStackTrace();
		}
		
		//����ȭ : public synchronized void printCounter() �䷱ ������
		
		//�����尣 ���� wait(), notify(), notifyAll()
		//polling�� cpu ���� ��Ƹ����ϱ� ��������
		//������ �Һ��ڹ��� 41p ������, �Һ��ڰ� �۾� ���������� �ٸ� �۾��� �ϸ� �ȵ�
		
		
	}

}
