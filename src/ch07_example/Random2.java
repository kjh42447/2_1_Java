//RandomŬ������ �̿��Ͽ� 3�ڸ� ���ھ߱� ���α׷��� �ۼ��϶�.
package ch07_example;

import java.util.*;

interface Ball{
	public void makeBall();
	public boolean checkBall(int[] b);
}

class BaseBall implements Ball{
	Random random = new Random(System.currentTimeMillis());
	
	int[] myball = new int[3];
	boolean[] check = new boolean[10];
	
	//������
	public BaseBall() {
		this.makeBall();
	}
	
	//��ȣ ����
	@Override
	public void makeBall() {
		for(int i = 0; i < 10; i++) {
			check[i] = false;
		}
		
		int count = 0;
		while(count < 3) {
			int t = random.nextInt(10);
			if(!check[t]) {
				myball[count] = t;
				check[t] = true;
				count++;
			}
		}
		
	}

	//��ȣ üũ
	@Override
	public boolean checkBall(int[] b) {
		int strike = 0, out = 0, ball = 0;
		
		for(int i = 0; i < 3; i++) {
			//out
			if(!check[b[i]]) out++;
			
			else {
				//strike
				if(b[i] == myball[i])	strike++;
				
				//ball
				else	ball++;
			}
		}
		
		System.out.println("STRIKE : " + strike);
		System.out.println("BALL : " + ball);
		System.out.println("OUT : " + out);
		
		if(strike == 3)		return true;
		else	return false;
	}
	
}

public class Random2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		BaseBall baseball = new BaseBall();
		boolean fin = false;
		int[] b = new int[3];
		String[] input;
		
		System.out.println("====================================================================");
		System.out.println("���ھ߱�");
		System.out.println("====================================================================");
		System.out.println("0~9������ ���� �� 3���� ���ڸ� ������� ���߸� �����մϴ�.");
		System.out.println("���ڴ� ���⸦ �̿��Ͽ� �����մϴ�.");
		System.out.println("ex)0 8 2");
		System.out.println("�ڸ��� ���ڰ� ��� ���� �� : STRIKE");
		System.out.println("�ڸ��� Ʋ������ ���ڰ� ���� �� : BALL");
		System.out.println("�ش� ���ڰ� �ƿ� ���� �� : OUT");
		
		while (true) {
			//�⺻ǥ��
			System.out.println("====================================================================");
			System.out.print("�������� �����ϴ� ���ڸ� �Է��ϼ��� : ");
			input = sc.nextLine().split(" ");
			System.out.println("====================================================================");
			
			//�Է� üũ
			if (input.length != 3) {
				System.out.println("�ٽ� �Է��ϼ���.");
				continue;
			}
			
			//���� ����
			for (int i = 0; i < input.length; i++) {
				b[i] = Integer.parseInt(input[i]);
			}
			
			//��ȣ üũ
			fin = baseball.checkBall(b);
			
			if (fin)	break;
			
		}
		
		System.out.println("�����մϴ�!");
		
		sc.close();
	}
	
}
