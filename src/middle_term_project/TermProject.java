/*
 * 객체지향프로그래밍 중간고사 대체 과제 : 교재 6장까지 나오는 내용들이 가능한 한 많이 포함될 수 있도록 프로그램을 작성하라.
 * 각 챕터별 주요 항목들에 대햐여 예제나 예시 등을 메소드로 작성하고 테스트하는 프로그램
 * 예외 처리를 하지 않아 오류가 발생할 수 있다.
*/
package middle_term_project;

import java.util.*;

//챕터 클래스에서 공용으로 사용할 스캐너 객체
interface Ch{
	static Scanner sc = new Scanner(System.in);
}


//ch2
class Ch2 implements Ch{
	
	//기초 자료형
	public static void ch2_PrimitiveDataType() {
		//기초 자료형들을 이용하여 간단한 계산기를 만들어라.
		
		char check, operator;
		
		System.out.println("====================================================================");
		System.out.println("계산기");
		
		while (true) {
			System.out.println("====================================================================");
			System.out.println("e. 계산기 종료");
			System.out.println("s. 계산");
			System.out.println("====================================================================");
			check = sc.nextLine().charAt(0);
			
			//이전 화면
			if (check == 'e') {
				break;
			}
			
			//계산
			else if (check == 's') {
				System.out.println("====================================================================");
				System.out.println("작업 가능 연산자");
				System.out.println("+ : 더하기");
				System.out.println("- : 빼기");
				System.out.println("* : 곱하기");
				System.out.println("/ : 나누기");
				System.out.println("% : 나머지");
				System.out.println("^ : 제곱");
				System.out.println("====================================================================");
				
				System.out.print("숫자를 입력하세요 : ");
				double a = sc.nextDouble();
				sc.nextLine();
				
				System.out.print("연산자를 입력하세요 : ");
				operator = sc.nextLine().charAt(0);
				
				System.out.print("숫자를 입력하세요 : ");
				double b = sc.nextDouble();
				sc.nextLine();
				
				switch (operator) {
				
				case '+':
					System.out.println(a + b);
					break;
					
				case '-':
					System.out.println(a - b);
					break;
					
				case '*':
					System.out.println(a * b);
					break;
					
				case '/':
					System.out.println(a / b);
					break;
					
				case '%':
					System.out.println(a % b);
					break;
					
				case '^':
					System.out.println(Math.pow(a, b));
					break;
					
				default:
					System.out.println("연산자를 정확히 입력하세요.");
					break;
				}
			}
			
			else {
				System.out.println("다시 입력하세요.");
			}
		
		}
		
	}
	
	
	//문자열
	public static void ch2_String() {
		//문자열을 입력받고 간단한 작업을 하는 프로그램을 작성하라.
		//String의 다양한 메소드 이용은 Ch4에서 구현한다.
		
		while (true) {
			System.out.println("====================================================================");
			System.out.println("문자열 작업 프로그램");
			System.out.println("문자열을 입력하면 전체를 대문자, 소문자로 바꾸어 출력합니다.");
			System.out.println("대소문자 구분 없이 Exit 라고 입력하면 현재 메소드를 종료합니다.");
			System.out.println("====================================================================");
			System.out.println("아래애 문자열을 입력하세요");
			
			String s = sc.nextLine();
			
			if (s.compareToIgnoreCase("exit") == 0) {
				break;
			}
			
			System.out.println(s.toUpperCase());
			System.out.println(s.toLowerCase());
		}

		
	}
	
	
	//형변환
	public static void ch2_TypeConversion() {
		//다양한 형변환의 예시를 출력하라.
		int i;
		float f;
		double d;
		
		//자동적인 형 변환
		System.out.println("====================================================================");
		System.out.println("자동적인 형 변환");
		System.out.println("자동적인 형 변환은 착은 자료형에서 큰 자료형으로 변환가능하다.");
		System.out.println("====================================================================");
		
		System.out.println("ex1. int → double");
		i = 5;
		d = 10.0;
		System.out.printf("int i = %d, double d = %f\n", i, d);
		System.out.printf("d / i = %f\t //i가 int형에서 double형으로 형변환을 하여 계산된다.\n\n", d/i);
		
		System.out.println("ex2. float → double");
		f = 0.2f;
		d = 10.0;
		System.out.printf("float f = %f, double d = %f\n", f, d);
		System.out.printf("d * f = %f\t //f가 float형에서 double형으로 형변환을 하여 계산된다.\n\n", d/f);
		
		System.out.println("ex3. int → float");
		i = 5;
		f = 10.0f;
		System.out.printf("int i = %d, float f = %f\n", i, f);
		System.out.printf("f / i = %f\t //f가 float형에서 double형으로 형변환을 하여 계산된다.\n\n", f/i);
		
		
		//강제적인 형 변환
		System.out.println("====================================================================");
		System.out.println("강제적인 형 변환");
		System.out.println("강제적인 형 변환은 형변환 연산자를 추가하여 사용한다.");
		System.out.println("축소 변환을 할 경우 자료가 변형, 삭제될 수 있으므로 주의해야 한다.");
		System.out.println("====================================================================");
		
		System.out.println("ex1. double → int");
		d = 10.75;
		System.out.printf("double d = %f\n", d);
		System.out.printf("(int) d = %d\t //실수형에서 정수형으로 형 변환 시 소수점 이하가 버려진다.\n\n", (int) d);
		
		System.out.println("ex2. int → char");
		i = 89;
		System.out.printf("int i = %d\n", i);
		System.out.printf("(char) i = %c\t //ASCII코드의 범위 내애 있는 정수는 해당하는 문자로 변환된다.\n\n", (char) i);
		
		System.out.println("ex2. double → char");
		d = 89.83;
		System.out.printf("double d = %f\n", d);
		System.out.printf("(char) d = %c\t //ASCII코드의 범위 내애 있는 실수는 정수로 형변환 후 해당하는 문자로 변환된다.\n\n", (char) d);
		
	}
	
	
	//입력(스캐너)
	public static void ch2_Scanner() {
		//Scanner를 이용하여 개인정보를 입력받아 저장하고 관리하는 프로그램을 작성하라.
		
		System.out.println("====================================================================");
		System.out.println("개인정보 관리 프로그램");
		System.out.println("이름, 나이, 주민등록번호를 저장하고 편집합니다.");
		System.out.println("주민등록번호는 000000-0000000 의 형식으로 입력해야합니다.");
		
		int check;
		ArrayList<Ch2_Person> person = new ArrayList<Ch2_Person>();
		
		while (true) {
			System.out.println("====================================================================");
			System.out.println("1. 프로그램 종료");
			System.out.println("2. 정보 등록");
			System.out.println("3. 정보 확인");
			System.out.println("4. 정보 수정");
			System.out.println("====================================================================");
			System.out.print("원하는 작업의 번호를 입력하세요 : ");
			check = sc.nextInt();
			sc.nextLine();
			System.out.println("====================================================================");
			
			//프로그램 종료
			if (check == 1) {
				System.out.println("개인정보 관리 프로그램을 종료합니다.");
				break;
			}
			
			//정보 등록
			else if (check == 2) {
				System.out.print("이름 : ");
				String name = sc.nextLine();
				System.out.print("나이 : ");
				int age = sc.nextInt();
				sc.nextLine();
				System.out.print("주민등록번호 : ");
				String srrn = sc.nextLine();
				
				//주민등록번호를 정수형으로 바꿀 때 사용
				//String[] srrn = sc.nextLine().split("-");
				//long[] rrn = { Long.parseLong(srrn[0]), Long.parseLong(srrn[1])};
				
				person.add(new Ch2_Person(name, age, srrn));
			}
			
			//정보 확인
			else if (check == 3) {
				for (Ch2_Person p : person)
					System.out.println(p);
			}
			
			//정보 수정
			else if (check ==4) {
				System.out.print("수정을 원하는 사람의 이름을 입력하세요 : ");
				String name = sc.nextLine();
				
				for (int i = 0; i < person.size(); i++) {
					if (person.get(i).name.equals(name)) {
						System.out.print("이름 : ");
						person.get(i).name = sc.nextLine();
						System.out.print("나이 : ");
						person.get(i).age = sc.nextInt();
						sc.nextLine();
						System.out.print("주민등록번호 : ");
						String srrn = sc.nextLine();
						person.get(i).setRrn(srrn);
						
						continue;
					}
					
					System.out.println("이름을 정확히 입력하세요.");
					
				}
				
			}
			
			else {
				System.out.println("숫자를 정확히 입력하세요.");
			}
			
		}
		
	}
	
	//Ch2_Scanner 개인 정보 저장 클래스
	static class Ch2_Person{
		
		public String name;
		public int age;
		private String rrn;
		
		
		public String getRrn() 	{			return rrn;		}
		public void setRrn(String rrn) 	{			this.rrn = rrn;		}
		
		//생성자
		public Ch2_Person(String name, int age, String rrn) {
			this.name = name;
			this.age = age;
			setRrn(rrn);
		}
		
		//toString 재정의
		@Override
		public String toString() {
			return "이름 : " + name + ", 나이 : " + age + ", 주민등록번호 : " + rrn;	
		}
		
	}
	
	
	//연산자
	@SuppressWarnings("unused")		//경고 제거
	public static void ch2_Operator() {
		//연산자 우선순위와 관련된 여러 식을 만들어보고 테스트하라.
		
		System.out.println("====================================================================");
		System.out.println("연산자 우선순위 비교");
		
		//산술
		System.out.println("====================================================================");
		System.out.println("산술연산자의 우선순위");
		System.out.println("3 + 4 * 2 = " + (3 + 4 * 2));
		System.out.println("8 / 2 + 3 = " + (8 / 2 + 3));
		System.out.println("6 - 2 + 3 = " + (6 - 2 + 3));
		System.out.println("6 + 3 - 2 = " + (6 + 3 - 2));
		System.out.println("9 / 3 * 2 = " + (9 / 3 * 2));
		System.out.println("9 * 2 / 3 = " + (9 * 2 / 3));
		System.out.println("7 - 5 % 2 = " + (7 - 5 % 2));
		System.out.println("산술연산자의 우선순위는 우리가 일반적으로 알고있는 사칙연산의 우선순위와 순서가 같다.");
		
		//증감
		System.out.println("====================================================================");
		System.out.println("증감연산자의 우선순위");
		int i = 10;
		System.out.println("int i = " + i);
		System.out.println("++i = " + (++i));
		System.out.println("i++ = " + (i++));
		System.out.println("i = " + i);
		i = 10;
		System.out.println("i = 10, i++ + i + --i = 10 + 11 + 10 = " + (i++ + i + --i));
		i = 10;
		System.out.println("i = 10, i++ + i * --i = 10 + 11 * 10 = " + (i++ + i * --i));
		System.out.println("피연산자의 앞에 증감연산자를 사용할 경우 현재의 값을 반환한 후 증감연산자를 적용한다.");
		System.out.println("피연산자의 뒤에 증감연산자를 사용할 경우 증감연산자를 적용한 후 변경된 값을 반환한다.");
		System.out.println("마지막 두 식과 같은 방법은 직관적이지 못하므로 좋지 않은 코드이다. 이러한 방식으로 돌아간다는 것을 설명하기 위하여 표시했다.");
		
		//관계연산자
		System.out.println("====================================================================");
		System.out.println("관계연산자의 우선순위");
		System.out.println("10 < 13  = " + (10 < 13));
		System.out.println("10 < 13 == 10 > 13 = " + (10 < 13 == 10 > 13));
		System.out.println("10 > 13 != 10 < 13 = " + (10 > 13 != 10 < 13));
		System.out.println("10 < 13 != 10 > 13 = " + (10 < 13 != 10 > 13));
		System.out.println("관계연산자끼리의 우선순위는 비교연산자가 먼저 연산되며 이후 동등연산자가 연산된다.");
		
		//논리
		System.out.println("====================================================================");
		System.out.println("논리연산자의 우선순위");
		System.out.println("true && true || false = " + (true && true || false));	//dead code
		System.out.println("true || true && false = " + (true || true && false));	//dead code
		System.out.println("true && !true = " + (true && !true));
		System.out.println("논리연산자들의 우선순위는 NOT, AND, OR 순이다.");
		
		//비트
		System.out.println("====================================================================");
		System.out.println("비트연산자의 우선순위");
		System.out.println("1 | 0 & 1 = " + (1 | 0 & 1));
		System.out.println("1 | 1 ^ 1 = " + (1 | 1 ^ 1));
		System.out.println("3 ^ 1 & 1 = " + (3 ^ 1 & 1));
		System.out.printf("~0000ffff = %x\n", (~0x0000ffff));
		System.out.printf("~0000ffff >> 4 = %x\n", (~0x0000ffff >> 4));
		System.out.printf("~0000ffff >> 4 | 0000ffff << 4 = %x\n", (~0x0000ffff >> 4 | 0x0000ffff << 4));
		System.out.println("비트연산자끼리의 우선순위는 NOT, 이동연산자, AND, XOR, OR 순이다.");
		
		//종합
		System.out.println("====================================================================");
		System.out.println("각 연산자들 간의 우선순위 비교");
		System.out.println("1. 단항연산자와 산술연산자의 우선순위");
		System.out.printf("~ffff0000 + ff000000 = %x\n", (~0xffff0000 + 0xff000000));
		System.out.println("단항연산자가 먼저 연산된다.");
		System.out.println();
		
		System.out.println("2. 산술연산자와 비트 이동연산자의 우선순위");
		System.out.println("3 << 1 + 2 << 1 = " + (3 << 1 + 2 >> 1));
		System.out.println("산술 연산자가 먼저 연산된다.");
		System.out.println();
		
		System.out.println("3. 비트 이동연산자와 관계연산자의 우선순위");
		System.out.println("0000ffff >> 4 < 00000fff << 4 = " + (0x0000ffff >> 4 < 0x00000fff << 4));
		System.out.println("비트 이동연산자가 먼저 연산된다.");
		System.out.println();
		
		System.out.println("4. 동등연산자와 비트연산자의 우선순위");
		System.out.println("5 ^ 3 != 4 = 에러 발생(3 != 4 가 먼저 연산되어 true로 반환하기 때문)");
		System.out.println("동등 연산자가 먼저 연산된다.");
		System.out.println();
		
		System.out.println("5. 동등연산자와 논리 연산자의 우선순위");
		System.out.println("true || false != true = " + (true || false != true));
		System.out.println("동등 연산자가 먼저 연산된다.");
		System.out.println();
		
		System.out.println("순서를 아는 것도 중요하지만 혼란이 오지 않게 괄호로 묶는 습관을 가지는 것이 더 좋다.");
		
	}
	
}


//ch3
class Ch3 implements Ch{
	
	//if
	public static void ch3_If() {
		//두 자연수를 입력받아 최대공약수를 출력하라.
		
		System.out.println("====================================================================");
		System.out.println("최대공약수 출력 프로그램");
		System.out.print("첫번째 자연수를 입력하세요 : ");
		int a = sc.nextInt();
		sc.nextLine();
		
		System.out.print("두번재 자연수를 입력하세요 : ");
		int b = sc.nextInt();
		sc.nextLine();
		
		System.out.println("====================================================================");
		System.out.println("두 수의 최대공약수는 " + gcd(a, b) + "입니다.");
	}
	
	//최대공약수
	static int gcd(int a, int b) {
		int big = (a<b) ? b : a;
		int small = (a<b) ? a : b;
		
		if(small == 0)
			return big;
		else
			return gcd(small, big%small);
	}
	
	
	//switch
	public static void ch3_Switch() {
		//switch문을 이용하여 간단한 계산기를 작성하라.
		//2장의 기초 자료형 메소드에서 불러온다.
		Ch2.ch2_PrimitiveDataType();
	}
	
	//while
	public static void ch3_While() {
		//로또 번호 추첨기를 작성하라.
		
		int count = 0, wincount= 0;
		String[] s;
		boolean bonus = false;
		boolean[] overlapcheck = new boolean[45];
		int[] win = new int[7], mynum = new int[7];
		
		System.out.println("====================================================================");
		System.out.println("로또 번호 추첨기");
		System.out.println("1~45의 숫자 중 중복되지 않게 7개를 골라주세요");
		
		//번호 입력받기
		while(true) {
			System.out.print("7개의 숫자를 띄어쓰기로 분리하여 입력하세요 : ");
			s = sc.nextLine().split(" ");
			
			if(s.length != 7) {
				System.out.println("갯수가 맞지 않습니다. 다시 입력하세요.");
				continue;
			}
			else {
				break;
			}
		}
		
		//입력받은 번호를 숫자로 변환
		for(int i = 0; i < 7; i++) {
			mynum[i] = Integer.parseInt(s[i]);
		}
		
		//번호 추첨
		while(count < 7) {
			int num = (int)(Math.random()*45 + 1);
			
			//중복 체크
			if(overlapcheck[num-1]) {
				continue;
			}
			
			else {
				win[count] = num;
				overlapcheck[num-1] = true;
			}
			
			//입력값과 비교
			for(int i = 0; i < 7; i++) {
				if(mynum[i] == num) {
					if(count == 6) {
						bonus = true;
						break;
					}
					wincount++;
					break;
				}
			}
			
			count++;
		}
		
		//결과 출력
		System.out.println("====================================================================");
		System.out.print("당첨 번호 : ");
		for(int r : win)	System.out.printf("%d\t", r);
		System.out.println();
		
		System.out.print("입력 번호 : ");
		for(int r : mynum)	System.out.printf("%d\t", r);
		System.out.println();
		
		//당첨 결과
		if(wincount == 6) {
			System.out.println("1등 당첨!");
		}
		
		else if(wincount == 5 && bonus) {
			System.out.println("2등 당첨!");
		}
		
		else if(wincount == 5) {
			System.out.println("3등 당첨!");
		}
		
		else if(wincount == 4) {
			System.out.println("4등 당첨!");
		}
		
		else if(wincount == 3) {
			System.out.println("5등 당첨!");
		}
		
		else {
			System.out.println("꽝...");
		}
		
	}
	
	
	//do-while
	public static void ch3_DoWhile() {
		//0부터 99까지의 숫자 중 임의의 한 숫자를 맞춰야하는 프로그램을 작성하라.
		int hidden = (int)(Math.random()*100), n;
		
		System.out.println("====================================================================");
		System.out.println("숫자 맞추기 게임");
		System.out.println("0부터 99까지의 숫자 중 하나를 랜덤으로 지정합니다.");
		System.out.println("숫자를 입력 시 UP 또는 DOWN이라고 표시합니다.");
		
		//숫자 입력후 비교
		do {
			System.out.println("정답으로 생각하는 숫자를 입력해주세요 : ");
			n = sc.nextInt();
			sc.nextLine();
			
			if(n > hidden) {
				System.out.println("DOWN");
			}
			
			else if(n < hidden) {
				System.out.println("UP");
			}
			
		} while(n != hidden);
		
		System.out.println("정답입니다!");
		
	}
	
	
	//for
	public static void ch3_For() {
		//사용자에게 반지름을 입력받아 원을 출력하라.
		
		System.out.print("원의 반지름을 입력하세요 : ");
		int radius = sc.nextInt();
		sc.nextLine();
		
		//원 출력
		for(int i = -radius; i <= radius; i++) {
			for(int j = -radius; j <= radius; j++) {
				if(i*i + j*j < radius*radius)
					System.out.print(" *");
				else
					System.out.print("  ");
			}
			System.out.println();
		}
		
	}
	
	//배열
	public static void ch3_Array() {
		//Ch3.ch3_While의 필드 값으로 사용하였다.
		//해당 메소드를 불러온다.
		Ch3.ch3_While();
		
	}
	
	//for each
	public static void ch3_ForEach() {
		//Ch3.ch3_While메소드에서 결과출력에 사용하였다.
		//해당 메소드를 불러온다.
		Ch3.ch3_While();
	}
	
	//다차원배열
	public static void ch3_MultiDimensionArray() {
		//2차원 배열을 화면에 표시하고 사용자에게 입력받아 '▒', '.'를 표시하라.
		
		boolean [][] field = new boolean[10][20];
		String s;
		String[] stringint;
		
		System.out.println("====================================================================");
		System.out.println("2차원 필드");
		System.out.println("좌표번호를 입력시 출력형태가 변환됩니다.");
		System.out.println("좌표는 공백을 포함하여 구분해주세요. ex)3 4");
		System.out.println("종료를 원하면 '1'을 입력해주세요.");
		
		//입출력
		while(true) {
			System.out.println("====================================================================");
			System.out.printf("\t1 2 3 4 5 6 7 8 9 10\n");
			
			//화면 표시
			for(int i = 0; i < 10; i++) {
				System.out.printf("%d\t", (i+1));
				
				for(int j = 0; j < 10; j++) {
					if(field[i][j])		System.out.print("▒▒");
					else	System.out.print(" .");
				}
				
				System.out.println();
			}
			
			System.out.println("====================================================================");
			System.out.print("출력변경을 원하는 좌표를 입력하세요 : ");
			s = sc.nextLine();
			
			//종료
			if(s.equals("1"))	break;
			
			//좌표 값 변경
			stringint = s.split(" ");
			
			if(stringint.length != 2) {
				System.out.println("x좌표와 y좌표를 공백을 구분하여 입력해아합니다.");
				continue;
			}
			
			int x = Integer.parseInt(stringint[0]) - 1;
			int y = Integer.parseInt(stringint[1]) - 1;
			
			field[x][y] = !field[x][y];
			
		}
		
	}
	
	//ArrayList
	public static void ch3_ArrayList() {
		//Ch2.ch2_Scanner 메소드에서 Person객체를 ArrayList를 사용하여 생성하였다.
		//해당 메소드를 불러온다.
		Ch2.ch2_Scanner();
	}
	
}


//ch4
class Ch4 implements Ch{

	//클래스
	public static void ch4_Class() {
		//Ch4_Student클래스를 작성하라. 몇개의 필드와 메소드를 가지고 있다.
		
		ArrayList<Ch4_Student> students = new ArrayList<Ch4.Ch4_Student>();
		int check1;
		
		//기본 출력
		System.out.println("====================================================================");
		System.out.println("학생 정보 저장 프로그램");
		System.out.println("학생의 이름, 나이, 학번, 수강과목을 저장합니다.");
		
		//작업
		while(true) {
			System.out.println("====================================================================");
			System.out.println("1. 프로그램 종료");
			System.out.println("2. 학생 정보 입력");
			System.out.println("3. 학생 정보 출력");
			System.out.println("4. 수강 과목 관리");
			System.out.println("====================================================================");
			System.out.print("원하는 작업의 번호를 입력하세요 : ");
			check1 = sc.nextInt();
			sc.nextLine();
			System.out.println("====================================================================");
			
			//종료
			if(check1 == 1) {
				System.out.println("학생 정보 관리 프로그램을 종료합니다.");
				break;
			}
			
			//학생 정보 입력
			else if(check1 == 2) {
				System.out.print("학생의 이름을 입력하세요 : ");
				String name = sc.nextLine();
				System.out.print("학생의 나이를 입력하세요 : ");
				int age = sc.nextInt();
				sc.nextLine();
				System.out.print("학생의 학번을 입력하세요(9자리) : ");
				long studentId = sc.nextInt();
				
				students.add(new Ch4_Student(name, age, studentId));
			}
			
			//학생 정보 출력
			else if(check1 == 3) {
				for(Ch4_Student s : students) {
					s.print();
				}
			}
			
			//수강 과목 관리
			else if(check1 ==4) {
				boolean check2 = false;
				int check3, num = 0;
				System.out.print("수강과목 관리를 원하는 학생의 학번을 입력하세요 : ");
				long stid = sc.nextInt();
				sc.nextLine();
				
				//학번 확인
				for(int i = 0; i < students.size(); i++) {
					if(students.get(i).getStudentId() == stid) {
						check2 = true;
						num = i;
						System.out.println(students.get(i).name + "학생 확인되었습니다.");
						break;
					}
					
					check2 = false;
				}
				
				if(!check2) {
					System.out.println("해당 학번의 학생은 존재하지 않습니다.");
					continue;
				}
				
				
				while(true) {
					System.out.println("====================================================================");
					System.out.println("1. 학생 정보 관리");
					System.out.println("2. 수강 과목 목록 출력");
					System.out.println("3. 수강 과목 추가");
					System.out.println("4. 수강 과목 제거");
					System.out.println("====================================================================");
					System.out.print("원하는 작업의 번호를 입력하세요 : ");
					check3 = sc.nextInt();
					sc.nextLine();
					System.out.println("====================================================================");
					
					//종료
					if(check3 == 1) {
						System.out.println("학생 정보 관리 화면으로 이동합니다. ");
						break;
					}
					
					//수강 과목 목록 출력
					else if(check3 == 2) {
						students.get(num).subjectList();
					}
					
					//수강 과목 추가
					else if(check3 == 3) {
						System.out.print("수강 과목명을 입력하세요 : ");
						String sub = sc.nextLine();
						students.get(num).addSubject(sub);
					}
					
					//수강 과목 제거
					else if(check3 == 4) {
						System.out.print("수강 취소를 원하는 과목명을 입력하세요 : ");
						String sub = sc.nextLine();
						
						//수강 목록에 있는지 확인
						if(students.get(num).subject.indexOf(sub) == -1) {
							System.out.println("해당 과목을 수강하고 있지 않습니다.");
							continue;
						}
						
						students.get(num).removeSubject(sub);
					}
					
					else {
						System.out.println("다시 입력하세요.");
					}
					
				}
				
			}
			
			else {
				System.out.println("다시 입력하세요.");
			}
			
		}
		
	}
	
	//Ch4_Class에서 사용하기위한 클래스
	static class Ch4_Student{
		String name;
		int age;
		private long studentId;
		ArrayList<String> subject = new ArrayList<String>();
		
		//접근자, 설정자
		public long getStudentId() {			return studentId;		}
		public void setStudentId(long studentId) {			this.studentId = studentId;		}
		
		//생성자
		public Ch4_Student(String name, int age, long studentId) {
			this.name = name;
			this.age = age;
			setStudentId(studentId);
		}
		
		//과목 추가
		public void addSubject(String sub) {
			subject.add(sub);
		}
		
		//과목 제거
		public void removeSubject(String sub) {
			subject.remove(sub);
		}
		
		//수강 과목 리스트 출력
		public void subjectList() {
			System.out.println("수강 과목");
			for(String s : subject) {
				System.out.printf("%s\t", s);
			}
			System.out.println();
		}
		
		//학생 정보 출력
		public void print() {
			System.out.printf("학번 : %09d, 이름 : %s, 나이 : %d\n", getStudentId(), name, age);
			}
		
	}
	
	//생성자
	public static void ch4_Constructor() {
		//도형 클래스를 작성하라. 입력의 종류를 여러가지로 두고 각각의 생성자를 만들어라.
		
		ArrayList<Ch4_Shape> shape = new ArrayList<Ch4.Ch4_Shape>();
		
		System.out.println("====================================================================");
		System.out.println("도형 생성 및 작업 프로그램");
		
		Ch4.makeShape(shape);
		
		
	}
	
	//도형 기본 추상클래스
	abstract static class Ch4_Shape{
		protected double x = 0.0, y = 0.0;
		
		//좌표 이동
		public void move(double x, double y) {
			this.x = x;
			this.y = y;
		}
		
		//넓이 계산
		abstract double calcArea();
		
		//출력
		abstract void print(int i);
	}

	//원
	static class Ch4_Circle extends Ch4_Shape{
		protected double radius = 5.0;
		
		//디폴트 생성자
		public Ch4_Circle() {
			
		}
		
		//반지름 생성자
		public Ch4_Circle(double radius) {
			this.radius = radius;
		}
		
		//좌표 생성자
		public Ch4_Circle(double x, double y) {
			this.x = x;
			this.y = y;
		}
		
		//전체 입력 생성자
		public Ch4_Circle(double x, double y, double radius) {
			this.x = x;
			this.y = y;
			this.radius = radius;
		}
		
		//넓이 계산
		@Override
		public double calcArea() {
			return 3.14*radius*radius;
		}
		
		//출력
		@Override
		public void print(int i) {
			System.out.println("번호 : " + i + ", 객체 종류 : 원, 좌표 : (" + x + ", " + y + "), 반지름 : " + radius);
		}
	}

	//사각형
	static class Ch4_Rectangle extends Ch4_Shape{
		protected double width = 5.0, height = 5.0;
		
		//디폴트 생성자
		public Ch4_Rectangle() {
			
		}
		
		//길이, 높이 입력 생성자
		public Ch4_Rectangle(double width, double height) {
			this.width = width;
			this.height = height;
		}
		
		//최대 입력 생성자
		public Ch4_Rectangle(double x, double y, double width, double height) {
			this.x = x;
			this.y = y;
			this.width = width;
			this.height = height;
		}
		
		//넓이 계산
		@Override
		public double calcArea() {
			return width*height;
		}
		
		//출력
		@Override
		public void print(int i) {
			System.out.println("번호 : " + i + ", 객체 종류 : 사각형, 좌표 : (" + x + ", " + y + "),"
					+ "너비 : " + width + ",높이 : " + height);
		}
	}


	//삼각형
	static class Ch4_Triangle extends Ch4_Shape{
		protected double width = 5.0, height = 5.0;
		
		//디폴트 생성자
		public Ch4_Triangle() {
			
		}
		
		//길이, 높이 입력 생성자
		public Ch4_Triangle(double width, double height) {
			this.width = width;
			this.height = height;
		}
		
		//최대 입력 생성자
		public Ch4_Triangle(double x, double y, double width, double height) {
			this.x = x;
			this.y = y;
			this.width = width;
			this.height = height;
		}
		
		//넓이 계산
		@Override
		public double calcArea() {
			return width*height/2;
		}
		
		//출력
		@Override
		public void print(int i) {
			System.out.println("번호 : " + i + ", 객체 종류 : 삼각형, 좌표 : (" + x + ", " + y + "),"
					+ "너비 : " + width + ",높이 : " + height);
		}
	}
	
	//생성 화면
		static void makeShape(ArrayList<Ch4_Shape> shape) {
			
			int check;
			
			while(true) {
				System.out.println("====================================================================");
				System.out.println("-생성 화면-");
				System.out.println("1. 종료");
				System.out.println("2. 원 생성");
				System.out.println("3. 사각형 생성");
				System.out.println("4. 삼각형 생성");
				System.out.println("5. 작업화면");
				System.out.println("====================================================================");
				System.out.print("원하는 작업 번호를 입력하세요 : ");
				check = sc.nextInt();
				sc.nextLine();
				System.out.println("====================================================================");
				
				//종료
				if(check == 1) {
					System.out.println("도형 생성 및 작업 프로그램을 종료합니다.");
					break;
				}
				
				//원 생성
				else if (check == 2) {
					System.out.println("1. 기본값으로 생성");
					System.out.println("2. 반지름 길이만 변경하여 생성");
					System.out.println("3. 좌표만 변경하여 생성");
					System.out.println("4. 모든 값을 직접 설정");
					System.out.println("====================================================================");
					System.out.print("원하는 작업 번호를 입력하세요  : ");
					check = sc.nextInt();
					sc.nextLine();
					
					//디폴트 생성
					if(check == 1) {
						shape.add(new Ch4_Circle());
						System.out.println("원 객체가 생성되었습니다.");
					}
					
					//반지름 변경 생성
					else if(check == 2) {
						System.out.print("원 반지름 : ");
						double r = sc.nextDouble();
						sc.nextLine();
						shape.add(new Ch4_Circle(r));
						System.out.println("원 객체가 생성되었습니다.");
					}
					
					//좌표 변경 생성
					else if(check == 3) {
						System.out.print("원 중심의 x좌표 : ");
						double x = sc.nextDouble();
						sc.nextLine();
						System.out.print("원 중심의 y좌표 : ");
						double y = sc.nextDouble();
						sc.nextLine();
						shape.add(new Ch4_Circle(x, y));
						System.out.println("원 객체가 생성되었습니다.");
					}
					
					//최대 입력 생성
					else if(check == 4) {
						System.out.print("원 중심의 x좌표 : ");
						double x = sc.nextDouble();
						sc.nextLine();
						System.out.print("원 중심의 y좌표 : ");
						double y = sc.nextDouble();
						sc.nextLine();
						System.out.print("원 반지름 : ");
						double r = sc.nextDouble();
						sc.nextLine();
						shape.add(new Ch4_Circle(x, y, r));
						System.out.println("원 객체가 생성되었습니다.");
					}
					
					else {
						System.out.println("다시 입력하세요.");
					}
					
				}
				
				//사각형 생성
				else if (check == 3) {
					System.out.println("1. 기본값으로 생성");
					System.out.println("2. 높이, 길이만 변경하여 생성");
					System.out.println("3. 모든 값을 직접 설정");
					System.out.println("====================================================================");
					System.out.print("원하는 작업 번호를 입력하세요  : ");
					check = sc.nextInt();
					sc.nextLine();
					
					//디폴트 생성
					if(check == 1) {
						shape.add(new Ch4_Rectangle());
						System.out.println("사각형 객체가 생성되었습니다.");
					}
					
					//높이, 길이만 변경하여 생성
					else if(check == 2) {
						System.out.print("사각형의 길이 : ");
						double length = sc.nextDouble();
						sc.nextLine();
						System.out.print("사각형의 높이 : ");
						double height = sc.nextDouble();
						sc.nextLine();
						shape.add(new Ch4_Rectangle(length, height));
						System.out.println("사각형 객체가 생성되었습니다.");
					}
					
					//최대 입력 생성
					else if(check == 3) {
						System.out.print("사각형 시작점의 x좌표 : ");
						double x = sc.nextDouble();
						sc.nextLine();
						System.out.print("사각형 시작점의 y좌표 : ");
						double y = sc.nextDouble();
						sc.nextLine();
						System.out.print("사각형의 길이 : ");
						double length = sc.nextDouble();
						sc.nextLine();
						System.out.print("사각형의 높이 : ");
						double height = sc.nextDouble();
						sc.nextLine();
						shape.add(new Ch4_Rectangle(x, y, length, height));
						System.out.println("사각형 객체가 생성되었습니다.");
					}
					
					else {
						System.out.println("번호를 다시 입력하세요");
						continue;
					}
					
				}
				
				
				//삼각형 생성
				else if (check == 4) {
					System.out.println("1. 기본값으로 생성");
					System.out.println("2. 높이, 길이만 변경하여 생성");
					System.out.println("3. 모든 값을 직접 설정");
					System.out.println("====================================================================");
					System.out.print("원하는 작업 번호를 입력하세요  : ");
					check = sc.nextInt();
					sc.nextLine();
					
					//디폴트 생성
					if(check == 1) {
						shape.add(new Ch4_Triangle());
						System.out.println("삼각형 객체가 생성되었습니다.");
					}
					
					//높이, 길이만 변경하여 생성
					else if(check == 2) {
						System.out.print("삼각형의 길이 : ");
						double length = sc.nextDouble();
						sc.nextLine();
						System.out.print("삼각형의 높이 : ");
						double height = sc.nextDouble();
						sc.nextLine();
						shape.add(new Ch4_Triangle(length, height));
						System.out.println("삼각형 객체가 생성되었습니다.");
					}
					
					//최대 입력 생성
					else if(check == 3) {
						System.out.print("삼각형 시작점의 x좌표 : ");
						double x = sc.nextDouble();
						sc.nextLine();
						System.out.print("삼각형 시작점의 y좌표 : ");
						double y = sc.nextDouble();
						sc.nextLine();
						System.out.print("삼각형의 길이 : ");
						double length = sc.nextDouble();
						sc.nextLine();
						System.out.print("삼각형의 높이 : ");
						double height = sc.nextDouble();
						sc.nextLine();
						shape.add(new Ch4_Triangle(x, y, length, height));
						System.out.println("삼각형 객체가 생성되었습니다.");
					}
					
					else {
						System.out.println("번호를 다시 입력하세요");
						continue;
					}
					
				}
				
				//작업 화면으로 이동
				else if (check == 5) {
					System.out.println("작업 화면으로 이동합니다.");
					workShape(shape);
					break;
				}
				
				else
					System.out.println("다시 입력하세요.");
			}
			
		}
		
		//작업 화면
		static void workShape(ArrayList<Ch4_Shape> shape) {
			while(true) {
				System.out.println("====================================================================");
				System.out.println("-작업 화면-");
				System.out.println("1. 종료");
				System.out.println("2. 정보 확인");
				System.out.println("3. 위치 변경");
				System.out.println("4. 크기 계산");
				System.out.println("5. 생성 화면");
				System.out.println("====================================================================");
				System.out.print("원하는 작업 번호를 입력하세요 : ");
				int check = sc.nextInt();
				sc.nextLine();
				System.out.println("====================================================================");
				
				//종료
				if (check == 1) {
					break;	
				}
				
				//정보 확인
				else if (check == 2) {
					for (int i = 0; i < shape.size(); i++) 
						shape.get(i).print(i);
				}
				
				//위치 변경
				else if (check == 3) {
					System.out.print("위치 변경을 원하는 객체 번호를 입력하세요 : ");
					int n = sc.nextInt();
					sc.nextLine();
					
					if (n < shape.size() && 0 <= n) {
						System.out.print("x좌표를 입력하세요 : ");
						int x = sc.nextInt();
						sc.nextLine();
						System.out.print("y좌표를 입력하세요 : ");
						int y = sc.nextInt();
						sc.nextLine();
						shape.get(n).x = x;
						shape.get(n).y = y;
						
						System.out.println("위치가 변경되었습니다.");
					}
					
					else {
						System.out.println("번호를 다시 입력하세요");
						continue;
					}
					
				}
				
				//크기 계산
				else if (check == 4) {
					System.out.print("크기 계산을 원하는 객체 번호를 입력하세요 : ");
					int n = sc.nextInt();
					sc.nextLine();
					
					if (n < shape.size() && 0 <= n) {
						System.out.println("도형의 면적 : " + shape.get(n).calcArea());
					}
					
					else {
						System.out.println("번호를 다시 입럭하세요");
						continue;
					}
				}
				
				//생성 화면
				else if (check == 5) {
					System.out.println("생성 화면으로 이동합니다.");
					makeShape(shape);
					break;
				}
				
				else
					System.out.println("다시 입력하세요.");
			}
			
		}
	
	
	//접근제어
	public static void ch4_AccessControl() {
		//각 접근제어별로 필드를 생성해보고 테스트하라.
		Ch4_Access test = new Ch4_Access();
		
		System.out.println(test.pubstr);
		System.out.println("public으로 선언된 요소는 어디서든 접근가능합니다.");
		System.out.println();
		System.out.println(test.ptdstr);
		System.out.println("protected로 선언된 요소는 상속을 하였을 경우 접근가능합니다.");
		System.out.println();
		System.out.println(test.dftstr);
		System.out.println("default로 선언된(다른 접근제어문이 없는) 요소는 같은 패키지 내애서 접근가능합니다.");
		System.out.println();
		System.out.println(test.getPvtstr());
		System.out.println("private로 선언된 요소는 외부에서 접근이 불가능합니다.");
		
	}
	
	//String클래스 메소드
	public static void ch4_String() {
		//String클래스의 여러 메소드들을 이용하여 문자열을 관리하는 프로그램을 작성하라.
		
		ArrayList<String> list = new ArrayList<String>();
		int index, check, n;
		
		while(true) {
			System.out.println("====================================================================");
			System.out.println("1. 프로그램 종료");
			System.out.println("2. 문자열 입력");
			System.out.println("3. 문자열 길이 출력");
			System.out.println("4. 문자 추출");
			System.out.println("5. 문자열 변경");
			System.out.println("6. 문자열 목록 출력");
			System.out.println("7. 문자열 비교");
			System.out.println("====================================================================");
			System.out.print("원하는 작업의 번호를 입력하세요 : ");
			check = sc.nextInt();
			sc.nextLine();
			System.out.println("====================================================================");
			
			//프로그램 종료
			if(check == 1) {
				System.out.println("문자열 작업 프로그램을 종료합니다.");
				break;
			}
			
			//문자열 입력
			else if(check == 2) {
				System.out.print("문자열을 입력하세요 : ");
				list.add(sc.nextLine());
			}
			
			//문자열 길이 출력
			else if(check == 3) {
				System.out.print("길이 출력을 원하는 문자열 번호을 입력하세요 : ");
				index = sc.nextInt();
				sc.nextLine();
				
				if (0 <= index && index < list.size()) {
					System.out.println(list.get(index).length());
				}
				
				else {
					System.out.println("번호가 잘못되었습니다.");
				}
			}
			
			//문자 추출
			else if(check == 4) {
				System.out.print("문자 추출을 원하는 문자열 번호를 입력하세요 : ");
				index = sc.nextInt();
				sc.nextLine();
				
				if(0 <= index && index < list.size()) {
					System.out.print("추출을 원하는 문자의 번호를 입력하세요 : ");
					n = sc.nextInt();
					sc.nextLine();
					
					if (0 <= n && n < list.get(index).length()) {
						System.out.println("추출한 문자는 " + list.get(index).charAt(n) + "입니다.");
					}
					
					else {
						System.out.println("문자열 길이의 범위를 벗어났습니다.");
					}
					
				}
					
				else {
					System.out.println("번호가 잘못되었습니다.");
				}
			}
			
			//문자열 변경
			else if(check == 5) {
				System.out.print("변경할 문자열 번호을 입력하세요 : ");
				index = sc.nextInt();
				sc.nextLine();
				
				if (0 <= index && index < list.size()) {
					System.out.print("변경할 문자열을 입력하세요 : ");
					list.set(index, sc.nextLine());
				}
				
				else {
					System.out.println("번호가 잘못되었습니다.");
				}
			}
			
			//문자열 목록 출력
			else if(check == 6) {
				for (String s : list) {
					System.out.println(s);
				}
			}
			
			//문자열 비교
			else if(check == 7) {
				int index1, index2;
				System.out.print("문자열 번호을 입력하세요 : ");
				index1 = sc.nextInt();
				sc.nextLine();
				
				System.out.print("비교할 문자열 번호을 입력하세요 : ");
				index2 = sc.nextInt();
				sc.nextLine();
				
				if(list.get(index1).equals(list.get(index2))) {
					System.out.println("두 문자열은 동일합니다.");
				}
				
				else {
					System.out.println("두 문자열은 동일하지 않습니다.");
				}
			}
			
			//예외
			else {
				System.out.println("숫자를 정확히 입력하세요.");
			}
		}
		
	}
	
}

//접근제어 테스트를 위한 클래스
class Ch4_Access{
	public String pubstr = "public String입니다.";
	protected String ptdstr = "protected Stirng입니다.";
	String dftstr = "default String입니다.";
	private String pvtstr = "private String입니다";
	
	//pvtstr 접근자, 설정자
	public String getPvtstr() {			return pvtstr;		}
	public void setPvtstr(String pvtstr) {			this.pvtstr = pvtstr;		}
}


//ch5
class Ch5 implements Ch{

	//정적 멤버
	public static void ch5_StaticMember() {
		//그룹 클래스를 만들고 정적 변수와 메소드를 이용하여 모임의 돈을 관리하는 프로그램을 작성하라.
		
		ArrayList<Ch5_Group> member = new ArrayList<Ch5.Ch5_Group>();
		int check;
		
		//기본 출력
		System.out.println("====================================================================");
		System.out.println("모임 계죄 관리 프로그램");
		
		//작업 환경
		while(true) {
			System.out.println("====================================================================");
			System.out.println("1. 프로그램 종료");
			System.out.println("2. 가입하기");
			System.out.println("3. 입금하기");
			System.out.println("4. 출금하기");
			System.out.println("5. 계좌 잔액 확인");
			System.out.println("6. 비밀번호 변경");
			System.out.println("7. 회원 목록 보기");
			System.out.println("====================================================================");
			System.out.print("원하는 작업의 번호를 입력하세요 : ");
			check = sc.nextInt();
			sc.nextLine();
			System.out.println("====================================================================");
			
			//프로그램 종료
			if(check == 1) {
				System.out.println("계좌 관리 프로그램을 종료합니다.");
				break;
			}
			
			//가입하기
			else if(check == 2) {
				boolean hasName = false;
				
				System.out.print("이름을 입력하세요 : ");
				String name = sc.nextLine();
				
				//회원 확인
				for(Ch5_Group g : member) {
					if(g.name.equals(name)) {
						hasName = true;
						break;
						}
				}
				
				if(hasName) {
					System.out.println("해당 이름은 이미 존재합니다.");
					break;
				}
				
				member.add(new Ch5_Group(name));
			}
			
			//입금하기
			else if(check == 3) {
				System.out.print("입금을 원하는 금액을 입력하세요 : ");
				long money = sc.nextLong();
				Ch5_Group.addBalance(money);
			}
			
			//출금하기
			else if(check == 4) {
				boolean hasName = false;
				
				System.out.print("이름을 입력하세요 : ");
				String name = sc.nextLine();
				
				//회원 확인
				for(Ch5_Group g : member) {
					if(g.name.equals(name)) {
						hasName = true;
						Ch5_Group mem = g;
						
						System.out.print("비밀번호를 입력하세요 : ");
						String password = sc.nextLine();
						
						//비밀번호 체크//
						if(mem.getPassword().equals(password)) {
							System.out.print("출금을 원하는 금액을 입력하세요 : ");
							long money = sc.nextLong();
							mem.subBalance(money);
						}
						
						else {
							System.out.println("비밀번호가 틀렸습니다.");
						}
						
						break;
					}
				}
				
				if(!hasName) {
					System.out.println("해당 이름은 존재하지 않습니다.");
					break;
				}
				
			}
			
			//계좌 잔액 확인
			else if(check == 5) {
				System.out.println("잔액은 " + Ch5_Group.balance + "원 입니다.");
			}
			
			//비밀번호 변경
			else if(check == 6) {
				boolean hasName = false;
				
				System.out.print("이름을 입력하세요 : ");
				String name = sc.nextLine();
				
				//회원 확인
				for(Ch5_Group g : member) {
					if(g.name.equals(name)) {
						hasName = true;
						Ch5_Group mem = g;
						
						System.out.print("비밀번호를 입력하세요 : ");
						String password = sc.nextLine();
						
						//비밀번호 체크//
						if(mem.getPassword().equals(password)) {
							System.out.print("변경할 비밀번호 입력하세요 : ");
							String newPassword = sc.nextLine();
							mem.setPassword(newPassword);
							System.out.println("비밀번호 변경이 완료되었습니다.");
						
						}
						
						else {
							System.out.println("비밀번호가 틀렸습니다.");
						}
						
						break;
					}
				}
				
				if(!hasName) {
					System.out.println("해당 이름은 존재하지 않습니다.");
					break;
				}
			}
			
			//회원 목록 보기
			else if(check == 7) {
				for(Ch5_Group g : member) {
					System.out.println(g.name);
				}
			}
			
			else {
				System.out.println("다시 입력하세요.");
			}
			
		}
			
	}
	
	//그룹 클래스
	static class Ch5_Group{
		protected static long balance = 0;
		public String name;
		private String password = "password";
		
		//비밀번호 접근자, 설정자
		public String getPassword() {			return password;		}
		public void setPassword(String password) {			this.password = password;		}
		
		//생성자
		public Ch5_Group(String name) {
			this.name = name;
			System.out.println(name + "님 가입을 축하합니다.");
			System.out.println("최초 비밀번호는 'password'입니다.");
		}
		
		//입금
		static void addBalance(long money) {
			if(balance >= 0) {
				balance += money;
				System.out.println(money + "원 입금되었습니다.");
				System.out.println("잔액은 " + balance + "원 입니다.");
			}
			
			else {
				System.out.println("출금은 출금 항목을 이용해주세요.");
			}
		}
		
		//출금
		void subBalance(long money) {
			if(balance >= 0) {
				if(balance < money) {
					System.out.println("출금액이 잔액보다 많습니다.");
				}
				
				else {
					balance -= money;
					System.out.println(money + "원 출금되었습니다.");
					System.out.println("잔액은 " + balance + "원 입니다.");
				}
			}
			
			else {
				System.out.println("입금은 입금 항목을 이용해주세요.");
			}
		}
	}
	
	//클래스 인수 전달 방법
	public static void ch5_CallByValue() {
		//Ch4.ch4_Constructor에서 구현하였다.
		//해당 메소드를 불러온다.
		Ch4.ch4_Constructor();
	}
	
	//객체 배열
	public static void ch5_ObjectArray() {
		//Ch6.ch6_Interface에서 작성하였다.
		//해당 메소드를 불러온다.
		Ch6.ch6_Interface();
	}

	//내부 클래스
	public static void ch5_InnerClass() {
		//내부 클래스를 작성하고 외부클래스 객체를 생성하여 접근제어를 테스트하라.
		
		//외부클래스 객체 생성
		Ch5_OuterClass oc = new Ch5_OuterClass();
		
		System.out.println(oc.getS());
		System.out.println(oc.ic.getS());			
		//System.out.println(oc.pic.getS());		private클래스이므로 외보부에서 접근이 불가능하다.
		
	}
	
}

//Ch5.ch5_IneerClass의 클래스
class Ch5_OuterClass {
	private String s = "OuterClass의 private String s입니다. 외부에서 접근 가능합니다.";
	Ch5_PrivateInnerClass pic = new Ch5_PrivateInnerClass();
	Ch5_InnerClass ic = new Ch5_InnerClass();
	
	public String getS() {		return s;		}
	
	//Ch5_PrivateInnerClass
	private class Ch5_PrivateInnerClass{
		private String s = "Ch5_PrivateInnerClass의 private String s입니다. 외부에서는 접근, 확인 할 수 없습니다.";
		
		
		@SuppressWarnings("unused")			//사용하지 않을 메소드임
		public String getS() {		return s;	}
	}
	
	//Ch5_InnerClass
	class Ch5_InnerClass{
		private String s = "Ch5_InnerClass의 private String s입니다. 외부에서는 접근할 수 없습니다.";
		
		public String getS() {		return s;	}
	}
	
	public Ch5_OuterClass() {
		System.out.println(ic.s);
		System.out.println(pic.s);
	}
	
}


//ch6
class Ch6 implements Ch{

	//상속
	public static void ch6_Inheritance() {
		//Shape객체를 상속하는 도형 클래스들을 작성하라.
		//Ch4.ch4_Constructor에서 구현하였다.
		//해당 메소드를 불러온다.
		Ch4.ch4_Constructor();
	}
	
	//protect 접근자
	public static void ch6_Protected() {
		//Ch4.ch4_AccessControl에서 작성하였다.
		//해당 메소드를 불러온다.
		Ch4.ch4_AccessControl();
	}
	
	//부모 클래스 호출
	public static void ch6_Super() {
		//Ch6.ch6_Interface에서 작성하였다.
		//해당 메소드를 불러온다.
		Ch6.ch6_Interface();
	}
	
	//메소드 재정의
	public static void ch6_MethodOverride() {
		//toString메소드를 재정의하라.
		//Ch4.ch4_Class메소드에서 작성하였다.
		//해당 메소드를 불러온다.
		Ch4.ch4_Class();
	}
	
	//추상클래스
	public static void ch6_AbstractClass() {
		//Ch4.ch4_Constructor에서 작성하고 구현하였다.
		//해당 메소드를 불러온다.
		Ch4.ch4_Constructor();
	}
	
	//다형성
	public static void ch6_Polymorphism() {
		//Ch6.ch6_Interface에서 작성하였다.
		//해당 메소드를 불러온다.
		Ch6.ch6_Interface();
	}
	
	//인터페이스
	public static void ch6_Interface() {
		//Pet 인터페이스를 작성하고 구현하는 애완동물 클래스들을 만들고 관리하는 프로그램을 작성하라.
		
		ArrayList<Ch6_Animal> animals = new ArrayList<Ch6_Animal>();
		int check;
		
		//기본 출력
		System.out.println("====================================================================");
		System.out.println("동물 정보 저장 관리 프로그램");
				
		//작업 환경
		while(true) {
			System.out.println("====================================================================");
			System.out.println("1. 프로그램 종료");
			System.out.println("2. 동물 정보 추가");
			System.out.println("3. 동물 정보 제거");
			System.out.println("4. 프로필 확인");
			System.out.println("5. 정보 및 특이사항 변경");
			System.out.println("====================================================================");
			System.out.print("원하는 작업의 번호를 입력하세요 : ");
			check = sc.nextInt();
			sc.nextLine();
			System.out.println("====================================================================");
					
			//프로그램 종료
			if(check == 1) {
				System.out.println("동물 정보 저장 관리 프로그램을 종료합니다.");
				break;
			}
			
			//동물 정보 추가
			else if(check == 2) {
				while(true) {
					System.out.println("1. 고양이");
					System.out.println("2. 개");
					System.out.println("3. 토끼");
					System.out.println("4. 거북");
					System.out.println("5. 햄스터");
					System.out.println("====================================================================");
					System.out.print("입력을 원하는 동물의 번호를 입력하세요 : ");
					check = sc.nextInt();
					sc.nextLine();
					System.out.println("====================================================================");
					
					System.out.print("이름을 입력하세요 : ");
					String name = sc.nextLine();
					System.out.print("나이를 입력하세요 : ");
					int age = sc.nextInt();
					sc.nextLine();
					System.out.print("성별을 입력하세요(수컷, 암컷) : ");
					String sex = sc.nextLine();
					System.out.print("몸무게를 입력하시오(g) : ");
					double weight = sc.nextDouble();
					sc.nextLine();
					
					//고양이
					if(check == 1) {
						animals.add(new Ch6_Cat(name, age, sex, weight));
						break;
					}
					
					//개
					else if(check == 2) {
						animals.add(new Ch6_Dog(name, age, sex, weight));
						break;
					}
					
					//토끼
					else if(check == 3) {
						animals.add(new Ch6_Rabbit(name, age, sex, weight));
						break;
					}
					
					//거북
					else if(check == 4) {
						animals.add(new Ch6_Turtle(name, age, sex, weight));
						break;
					}
					
					//햄스터
					else if(check == 5) {
						animals.add(new Ch6_Hamster(name, age, sex, weight));
						break;
					}
					
					else {
						System.out.println("다시 입력하세요.");
					}
				}
				
			}
			
			//동물 정보 제거
			else if(check == 3) {
				boolean hasPet = false;
				
				System.out.print("정보 제거를 원하는 동물의 종을 입력하세요 : ");
				String type = sc.nextLine();
				System.out.print("이름을 입력하세요 : ");
				String name = sc.nextLine();
				
				//해당 동물이 있는지 검색
				for(int i = 0; i < animals.size(); i++) {
					if(animals.get(i).type().equals(type) && animals.get(i).name.equals(name)) {
						hasPet = true;
						animals.remove(i);
						System.out.println(name + "의 정보가 삭제되었습니다.");
						break;
					}
				}
				
				if(!hasPet) {
					System.out.println("해당 이름의 동물은 존재하지 않습니다.");
				}
				
			}
			
			//프로필 확인
			else if(check == 4) {
				for(Ch6_Animal a : animals) {
					a.profile();
				}
			}
			
			//정보 및 특이사항 변경
			else if(check == 5) {
				boolean hasPet = false;
				
				System.out.print("정보 변경을 원하는 동물의 종을 입력하세요 : ");
				String type = sc.nextLine();
				System.out.print("이름을 입력하세요 : ");
				String name = sc.nextLine();
				
				//해당 동물이 있는지 검색
				for(int i = 0; i < animals.size(); i++) {
					if(animals.get(i).type().equals(type) && animals.get(i).name.equals(name)) {
						hasPet = true;
						
						//변경
						while(true) {
							System.out.println("====================================================================");
							System.out.println("1. 변경 종료");
							System.out.println("2. 이름 변경");
							System.out.println("3. 나이 변경");
							System.out.println("4. 몸무게 변경");
							System.out.println("5. 특이 사항 변경");
							System.out.println("====================================================================");
							System.out.print("입력을 원하는 동물의 번호를 입력하세요 : ");
							check = sc.nextInt();
							sc.nextLine();
							System.out.println("====================================================================");
							
							if(check == 1) {
								System.out.println("정보 변경을 마칩니다.");
								break;
							}
							
							//이름 변경
							else if(check == 2) {
								System.out.print("변경할 이름을 입력하세요 : ");
								String newName = sc.nextLine();
								animals.get(i).name = newName;
							}
							
							//나이 변경
							else if(check == 3) {
								System.out.print("변경할 나이을 입력하세요 : ");
								int newAge = sc.nextInt();
								sc.nextLine();
								animals.get(i).age = newAge;
							}
							
							//몸무게 변경
							else if(check == 4) {
								System.out.print("변경할 몸무게을 입력하세요(g) : ");
								double newWeight = sc.nextDouble();
								sc.nextLine();
								animals.get(i).weight = newWeight;
							}
							
							//특이사항 변경
							else if(check == 5) {
								System.out.print("특이사항을 새로 입력하세요 : ");
								String newRemark = sc.nextLine();
								animals.get(i).remark = newRemark;
							}
							
							else {
								System.out.println("다시 입력하세요.");
							}
							
						}
						
						break;
					}
				}
				
				if(!hasPet) {
					System.out.println("해당 이름의 동물은 존재하지 않습니다.");
				}
			}
			
			else {
				System.out.println("다시 입력하세요.");
			}
			
		}		
		
	}
	
}

//Ch6_Interface에서 쓸 동물 인터페이스
interface Ch6_Pet{
		
	//동물 종 출력
	String type();
	
	//프로필
	void profile();
	
}

//Ch6_Interface에서 쓸 동물
class Ch6_Animal implements Ch6_Pet{
	//기본 필드
	protected String name, sex, remark = "없음";
	protected int age;
	protected double weight;
	
	//생성자
	public Ch6_Animal(String name, int age, String sex, double weight) {
		this.name = name;
		this.age = age;
		this.sex = sex;
		this.weight = weight;
		System.out.println(name + "의 정보 입력이 완료되었습니다.");
	}

	@Override
	public String type() {
		return "애완동물";
	}

	@Override
	public void profile() {
		System.out.println("종류 : " + type());
		System.out.println("이름 : " + name);
		System.out.println("나이 : " + age);
		System.out.println("성별 : " + sex);
		System.out.println("무게 : " + weight + "g");
		System.out.println("특이사항 : " + remark);
		System.out.println();
	}
}

//고양이
class Ch6_Cat extends Ch6_Animal{
	
	//생성자
	public Ch6_Cat(String name, int age, String sex, double weight) {
		super(name, age, sex, weight);
	}

	//동물 종 출력
	@Override
	public String type() {
		return "고양이";
	}

}

//개
class Ch6_Dog extends Ch6_Animal implements Ch6_Pet{
	
	//생성자
	public Ch6_Dog(String name, int age, String sex, double weight) {
		super(name, age, sex, weight);
	}

	//동물 종 출력
	@Override
	public String type() {
		return "개";
	}
	
}

//토끼
class Ch6_Rabbit extends Ch6_Animal implements Ch6_Pet{
	
	//생성자
	public Ch6_Rabbit(String name, int age, String sex, double weight) {
		super(name, age, sex, weight);
	}

	//동물 종 출력
	@Override
	public String type() {
		return "토끼";
	}

}

//거북
class Ch6_Turtle extends Ch6_Animal implements Ch6_Pet{
	
	//생성자
	public Ch6_Turtle(String name, int age, String sex, double weight) {
		super(name, age, sex, weight);
	}

	//동물 종 출력
	@Override
	public String type() {
		return "거북";
	}

}

//햄스터
class Ch6_Hamster extends Ch6_Animal implements Ch6_Pet{
	
	//생성자
	public Ch6_Hamster(String name, int age, String sex, double weight) {
		super(name, age, sex, weight);
	}

	//동물 종 출력
	@Override
	public String type() {
		return "햄스터";
	}

}
	

//메인 클래스
public class TermProject {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		while (true) {
			System.out.println("====================================================================");
			System.out.println("1. 종료");
			System.out.println("2. 2장");
			System.out.println("3. 3장");
			System.out.println("4. 4장");
			System.out.println("5. 5장");
			System.out.println("6. 6장");
			System.out.println("====================================================================");
			System.out.print("원하는 작업의 번호를 입력하세요 : ");
			int check = sc.nextInt();
			sc.nextLine();
			
			if (check == 1) {
				break;
			}
			
			//ch2
			else if (check == 2) {
				while (true) {
					System.out.println("====================================================================");
					System.out.println("1. 이전 화면");
					System.out.println("2. 기초 자료형");
					System.out.println("3. 문자열");
					System.out.println("4. 형변환");
					System.out.println("5. 입력받기");
					System.out.println("6. 연산자");
					System.out.println("====================================================================");
					System.out.print("원하는 작업의 번호를 입력하세요 : ");
					check = sc.nextInt();
					sc.nextLine();
					
					//이전 화면
					if (check == 1) {
						break;
					}
					
					//기초 자료형
					else if (check == 2) {
						Ch2.ch2_PrimitiveDataType();
					}
				
					//문자열
					else if (check == 3) {
						Ch2.ch2_String();
					}
				
					//형변환
					else if (check == 4) {
						Ch2.ch2_TypeConversion();
					}
				
					//입력(스캐너)
					else if (check == 5) {
						Ch2.ch2_Scanner();
					}
				
					//연산자
					else if (check == 6) {
						Ch2.ch2_Operator();
					}
					
					else {
						System.out.println("숫자를 정확히 입력하세요.");
					}
				}
			}
			
			//ch3
			else if (check == 3) {
				while (true) {
					System.out.println("====================================================================");
					System.out.println("1. 이전 화면");
					System.out.println("2. if-else");
					System.out.println("3. switch");
					System.out.println("4. while");
					System.out.println("5. do-while");
					System.out.println("6. for");
					System.out.println("7. 배열");
					System.out.println("8. for-each");
					System.out.println("9. 다차원 배열");
					System.out.println("10. ArrayList");
					System.out.println("====================================================================");
					System.out.print("원하는 작업의 번호를 입력하세요 : ");
					check = sc.nextInt();
					sc.nextLine();
					
					//이전 화면
					if (check == 1) {
						break;
					}
					
					//if
					else if (check == 2) {
						Ch3.ch3_If();
					}
					
					//switch
					else if (check == 3) {
						Ch3.ch3_Switch();
					}
					
					//while
					else if (check == 4) {
						Ch3.ch3_While();
					}
					
					//do-while
					else if (check == 5) {
						Ch3.ch3_DoWhile();
					}
					
					//for
					else if (check == 6) {
						Ch3.ch3_For();
					}
					
					//배열
					else if (check == 7) {
						Ch3.ch3_Array();
					}
					
					//for each
					else if (check == 8) {
						Ch3.ch3_ForEach();
					}
					
					//다차원배열
					else if (check == 9) {
						Ch3.ch3_MultiDimensionArray();
					}
					
					//ArrayList
					else if (check == 10) {
						Ch3.ch3_ArrayList();
					}
					
					else {
						System.out.println("숫자를 정확히 입력하세요.");
					}
				}
			}
			
			//ch4
			else if (check == 4) {
				while (true) {
					System.out.println("====================================================================");
					System.out.println("1. 이전 화면");
					System.out.println("2. 클래스");
					System.out.println("3. 생성자");
					System.out.println("4. 접근제어");
					System.out.println("5. String클래스와 대표 메소드");
					System.out.println("====================================================================");
					System.out.print("원하는 작업의 번호를 입력하세요 : ");
					check = sc.nextInt();
					sc.nextLine();
					
					if (check == 1) {
						break;
					}
					
					//클래스
					else if (check == 2) {
						Ch4.ch4_Class();
					}
					
					//생성자
					else if (check == 3) {
						Ch4.ch4_Constructor();
					}
				
					//접근제어
					else if (check == 4) {
						Ch4.ch4_AccessControl();
					}
				
					//String클래스 메소드
					else if (check == 5) {
						Ch4.ch4_String();
					}
					
					else {
						System.out.println("숫자를 정확히 입력하세요.");
					}
				}
			}
			
			//ch5
			else if (check ==5) {
				while (true) {
					System.out.println("====================================================================");
					System.out.println("1. 이전 화면");
					System.out.println("2. 정적 멤버");
					System.out.println("3. 클래스 인수 전달 방법");
					System.out.println("4. 객체 배열");
					System.out.println("5. 내부 클래스");
					System.out.println("====================================================================");
					System.out.print("원하는 작업의 번호를 입력하세요 : ");
					check = sc.nextInt();
					sc.nextLine();
					
					if (check == 1) {
						break;
					}
					
					//정적 멤버
					else if (check == 2) {
						Ch5.ch5_StaticMember();
					}
				
					//클래스 인수 전달 방법
					else if (check == 3) {
						Ch5.ch5_CallByValue();
					}
				
					//객체 배열
					else if (check == 4) {
						Ch5.ch5_ObjectArray();
					}
				
					//내부 클래스
					else if (check == 5) {
						Ch5.ch5_InnerClass();
					}
					
					else {
						System.out.println("숫자를 정확히 입력하세요.");
					}
					
				}
				
			}
		
			//ch6
			else if (check == 6) {
				while (true) {
					System.out.println("====================================================================");
					System.out.println("1. 이전 화면");
					System.out.println("2. 상속");
					System.out.println("3. protected 접근자");
					System.out.println("4. 상위 클래스 호출");
					System.out.println("5. 메소드 재정의");
					System.out.println("6. 추상클래스");
					System.out.println("7. 다형성");
					System.out.println("8. 인터페이스");
					System.out.println("====================================================================");
					System.out.print("원하는 작업의 번호를 입력하세요 : ");
					check = sc.nextInt();
					sc.nextLine();
					
					if (check == 1) {
						break;
					}
					
					//상속
					else if (check == 2) {
						Ch6.ch6_Inheritance();
					}
					
					//protect 접근자
					else if (check == 3) {
						Ch6.ch6_Protected();
					}
					
					//상위 클래스 호출
					else if (check == 4) {
						Ch6.ch6_Super();
					}
					
					//메소드 재정의
					else if (check == 5) {
						Ch6.ch6_MethodOverride();
					}
					
					//추상클래스
					else if (check == 6) {
						Ch6.ch6_AbstractClass();
					}
					
					//다형성
					else if (check == 7) {
						Ch6.ch6_Polymorphism();
					}
					
					//인터페이스
					else if (check == 8) {
						Ch6.ch6_Interface();
					}
					
					else {
						System.out.println("숫자를 정확히 입력하세요.");
					}
					
				}
				
			}
			
			else {
				System.out.println("숫자를 정확히 입력하세요.");
			}
		}
		
		sc.close();
		
	}
	
}
