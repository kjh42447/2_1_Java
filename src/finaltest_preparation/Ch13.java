//13, 14
package finaltest_preparation;

import java.util.*;
import java.io.*;

/*
 * 입출력 스트림 - 입출력 스트림 - 입력 바이트 스트림(...InputStream)
 * 					   - 출력 바이트 스트림(...OutputStream)
 * 			- 문자 스트림 - 입력 문자 스트림(...Reader)
 * 					  - 출력 문자 스트림(...Writer)
 * 
 * 줄 단위 : BufferedReader or Writer(new FileReader or Writer)
 * readline(), println()
 * 
 * 기초자료형 단위 : DataIn or Out...
 * readByte(), readInt(), readUTF()...
 * 
 * 직렬화 : ObjectIn...(fis) or Out...(fos)
 * 
 * File(파일의 이름을 나타냄), Path(경로) 클래스
 */

public class Ch13 {

	public static void main(String[] args) throws IOException, InterruptedException {
		Scanner s = new Scanner(System.in);
		
		try(FileInputStream fis = new FileInputStream("");		//바이트파일입력
				FileOutputStream fos = new FileOutputStream("");//출력
				FileReader fr = new FileReader("");				//문자파일입력
				FileWriter fw = new FileWriter("")) 			//출력
		{	
			//스캐너 쓰까, 위짝에 써도 무관할듯? 토큰으로 분리하기
			s = new Scanner(new BufferedReader(new FileReader("")));
			
			while(s.hasNext()) {
				if(s.hasNextDouble()) {
					//더블이네
				}
				System.out.println(s.next());
			}
			
			//입력예제
			String line;
			while((line = s.nextLine()) != null) {
				//BufferedReader면 readLine() 쓰셈
			}
			
			//직렬화 - 오브젝트에 원하는거 넣으셈
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
		
		//쓰레드
		
		//extends Thread, implements Runnable
		Thread t1 = new Thread(new Runnable() {		public void run() {		/*필요한거 요따 씀 */	}	});
		
		//람다로
		Runnable run = () -> {		};
		new Thread(run).start();
		
		//인터럽트
		try {
			Thread.sleep(1000);
			t1.join(1000);	//1초동안 t1이 죽기를 기다림
		}
		catch(InterruptedException e) {
			e.printStackTrace();
		}
		
		//동기화 : public synchronized void printCounter() 요런 식으로
		
		//스레드간 조정 wait(), notify(), notifyAll()
		//polling은 cpu 존나 잡아먹으니까 하지마셈
		//생산자 소비자문제 41p 생산자, 소비자가 작업 끝날때까지 다른 작업은 하면 안됨
		
		
	}

}
