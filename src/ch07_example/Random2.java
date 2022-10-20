//Random클래스를 이용하여 3자리 숫자야구 프로그램을 작성하라.
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
	
	//생성자
	public BaseBall() {
		this.makeBall();
	}
	
	//번호 생성
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

	//번호 체크
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
		System.out.println("숫자야구");
		System.out.println("====================================================================");
		System.out.println("0~9까지의 숫자 중 3개의 숫자를 순서대로 맞추면 성공합니다.");
		System.out.println("숫자는 띄어쓰기를 이용하여 구분합니다.");
		System.out.println("ex)0 8 2");
		System.out.println("자리와 숫자가 모두 맞을 시 : STRIKE");
		System.out.println("자리는 틀리지만 숫자가 맞을 시 : BALL");
		System.out.println("해당 숫자가 아예 없을 시 : OUT");
		
		while (true) {
			//기본표시
			System.out.println("====================================================================");
			System.out.print("정답으로 생각하는 숫자를 입력하세요 : ");
			input = sc.nextLine().split(" ");
			System.out.println("====================================================================");
			
			//입력 체크
			if (input.length != 3) {
				System.out.println("다시 입력하세요.");
				continue;
			}
			
			//숫자 추출
			for (int i = 0; i < input.length; i++) {
				b[i] = Integer.parseInt(input[i]);
			}
			
			//번호 체크
			fin = baseball.checkBall(b);
			
			if (fin)	break;
			
		}
		
		System.out.println("축하합니다!");
		
		sc.close();
	}
	
}
