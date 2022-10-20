/*
 * ��ü�������α׷��� �߰���� ��ü ���� : ���� 6����� ������ ������� ������ �� ���� ���Ե� �� �ֵ��� ���α׷��� �ۼ��϶�.
 * �� é�ͺ� �ֿ� �׸�鿡 ���Ῡ ������ ���� ���� �޼ҵ�� �ۼ��ϰ� �׽�Ʈ�ϴ� ���α׷�
 * ���� ó���� ���� �ʾ� ������ �߻��� �� �ִ�.
*/
package middle_term_project;

import java.util.*;

//é�� Ŭ�������� �������� ����� ��ĳ�� ��ü
interface Ch{
	static Scanner sc = new Scanner(System.in);
}


//ch2
class Ch2 implements Ch{
	
	//���� �ڷ���
	public static void ch2_PrimitiveDataType() {
		//���� �ڷ������� �̿��Ͽ� ������ ���⸦ ������.
		
		char check, operator;
		
		System.out.println("====================================================================");
		System.out.println("����");
		
		while (true) {
			System.out.println("====================================================================");
			System.out.println("e. ���� ����");
			System.out.println("s. ���");
			System.out.println("====================================================================");
			check = sc.nextLine().charAt(0);
			
			//���� ȭ��
			if (check == 'e') {
				break;
			}
			
			//���
			else if (check == 's') {
				System.out.println("====================================================================");
				System.out.println("�۾� ���� ������");
				System.out.println("+ : ���ϱ�");
				System.out.println("- : ����");
				System.out.println("* : ���ϱ�");
				System.out.println("/ : ������");
				System.out.println("% : ������");
				System.out.println("^ : ����");
				System.out.println("====================================================================");
				
				System.out.print("���ڸ� �Է��ϼ��� : ");
				double a = sc.nextDouble();
				sc.nextLine();
				
				System.out.print("�����ڸ� �Է��ϼ��� : ");
				operator = sc.nextLine().charAt(0);
				
				System.out.print("���ڸ� �Է��ϼ��� : ");
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
					System.out.println("�����ڸ� ��Ȯ�� �Է��ϼ���.");
					break;
				}
			}
			
			else {
				System.out.println("�ٽ� �Է��ϼ���.");
			}
		
		}
		
	}
	
	
	//���ڿ�
	public static void ch2_String() {
		//���ڿ��� �Է¹ް� ������ �۾��� �ϴ� ���α׷��� �ۼ��϶�.
		//String�� �پ��� �޼ҵ� �̿��� Ch4���� �����Ѵ�.
		
		while (true) {
			System.out.println("====================================================================");
			System.out.println("���ڿ� �۾� ���α׷�");
			System.out.println("���ڿ��� �Է��ϸ� ��ü�� �빮��, �ҹ��ڷ� �ٲپ� ����մϴ�.");
			System.out.println("��ҹ��� ���� ���� Exit ��� �Է��ϸ� ���� �޼ҵ带 �����մϴ�.");
			System.out.println("====================================================================");
			System.out.println("�Ʒ��� ���ڿ��� �Է��ϼ���");
			
			String s = sc.nextLine();
			
			if (s.compareToIgnoreCase("exit") == 0) {
				break;
			}
			
			System.out.println(s.toUpperCase());
			System.out.println(s.toLowerCase());
		}

		
	}
	
	
	//����ȯ
	public static void ch2_TypeConversion() {
		//�پ��� ����ȯ�� ���ø� ����϶�.
		int i;
		float f;
		double d;
		
		//�ڵ����� �� ��ȯ
		System.out.println("====================================================================");
		System.out.println("�ڵ����� �� ��ȯ");
		System.out.println("�ڵ����� �� ��ȯ�� ���� �ڷ������� ū �ڷ������� ��ȯ�����ϴ�.");
		System.out.println("====================================================================");
		
		System.out.println("ex1. int �� double");
		i = 5;
		d = 10.0;
		System.out.printf("int i = %d, double d = %f\n", i, d);
		System.out.printf("d / i = %f\t //i�� int������ double������ ����ȯ�� �Ͽ� ���ȴ�.\n\n", d/i);
		
		System.out.println("ex2. float �� double");
		f = 0.2f;
		d = 10.0;
		System.out.printf("float f = %f, double d = %f\n", f, d);
		System.out.printf("d * f = %f\t //f�� float������ double������ ����ȯ�� �Ͽ� ���ȴ�.\n\n", d/f);
		
		System.out.println("ex3. int �� float");
		i = 5;
		f = 10.0f;
		System.out.printf("int i = %d, float f = %f\n", i, f);
		System.out.printf("f / i = %f\t //f�� float������ double������ ����ȯ�� �Ͽ� ���ȴ�.\n\n", f/i);
		
		
		//�������� �� ��ȯ
		System.out.println("====================================================================");
		System.out.println("�������� �� ��ȯ");
		System.out.println("�������� �� ��ȯ�� ����ȯ �����ڸ� �߰��Ͽ� ����Ѵ�.");
		System.out.println("��� ��ȯ�� �� ��� �ڷᰡ ����, ������ �� �����Ƿ� �����ؾ� �Ѵ�.");
		System.out.println("====================================================================");
		
		System.out.println("ex1. double �� int");
		d = 10.75;
		System.out.printf("double d = %f\n", d);
		System.out.printf("(int) d = %d\t //�Ǽ������� ���������� �� ��ȯ �� �Ҽ��� ���ϰ� ��������.\n\n", (int) d);
		
		System.out.println("ex2. int �� char");
		i = 89;
		System.out.printf("int i = %d\n", i);
		System.out.printf("(char) i = %c\t //ASCII�ڵ��� ���� ���� �ִ� ������ �ش��ϴ� ���ڷ� ��ȯ�ȴ�.\n\n", (char) i);
		
		System.out.println("ex2. double �� char");
		d = 89.83;
		System.out.printf("double d = %f\n", d);
		System.out.printf("(char) d = %c\t //ASCII�ڵ��� ���� ���� �ִ� �Ǽ��� ������ ����ȯ �� �ش��ϴ� ���ڷ� ��ȯ�ȴ�.\n\n", (char) d);
		
	}
	
	
	//�Է�(��ĳ��)
	public static void ch2_Scanner() {
		//Scanner�� �̿��Ͽ� ���������� �Է¹޾� �����ϰ� �����ϴ� ���α׷��� �ۼ��϶�.
		
		System.out.println("====================================================================");
		System.out.println("�������� ���� ���α׷�");
		System.out.println("�̸�, ����, �ֹε�Ϲ�ȣ�� �����ϰ� �����մϴ�.");
		System.out.println("�ֹε�Ϲ�ȣ�� 000000-0000000 �� �������� �Է��ؾ��մϴ�.");
		
		int check;
		ArrayList<Ch2_Person> person = new ArrayList<Ch2_Person>();
		
		while (true) {
			System.out.println("====================================================================");
			System.out.println("1. ���α׷� ����");
			System.out.println("2. ���� ���");
			System.out.println("3. ���� Ȯ��");
			System.out.println("4. ���� ����");
			System.out.println("====================================================================");
			System.out.print("���ϴ� �۾��� ��ȣ�� �Է��ϼ��� : ");
			check = sc.nextInt();
			sc.nextLine();
			System.out.println("====================================================================");
			
			//���α׷� ����
			if (check == 1) {
				System.out.println("�������� ���� ���α׷��� �����մϴ�.");
				break;
			}
			
			//���� ���
			else if (check == 2) {
				System.out.print("�̸� : ");
				String name = sc.nextLine();
				System.out.print("���� : ");
				int age = sc.nextInt();
				sc.nextLine();
				System.out.print("�ֹε�Ϲ�ȣ : ");
				String srrn = sc.nextLine();
				
				//�ֹε�Ϲ�ȣ�� ���������� �ٲ� �� ���
				//String[] srrn = sc.nextLine().split("-");
				//long[] rrn = { Long.parseLong(srrn[0]), Long.parseLong(srrn[1])};
				
				person.add(new Ch2_Person(name, age, srrn));
			}
			
			//���� Ȯ��
			else if (check == 3) {
				for (Ch2_Person p : person)
					System.out.println(p);
			}
			
			//���� ����
			else if (check ==4) {
				System.out.print("������ ���ϴ� ����� �̸��� �Է��ϼ��� : ");
				String name = sc.nextLine();
				
				for (int i = 0; i < person.size(); i++) {
					if (person.get(i).name.equals(name)) {
						System.out.print("�̸� : ");
						person.get(i).name = sc.nextLine();
						System.out.print("���� : ");
						person.get(i).age = sc.nextInt();
						sc.nextLine();
						System.out.print("�ֹε�Ϲ�ȣ : ");
						String srrn = sc.nextLine();
						person.get(i).setRrn(srrn);
						
						continue;
					}
					
					System.out.println("�̸��� ��Ȯ�� �Է��ϼ���.");
					
				}
				
			}
			
			else {
				System.out.println("���ڸ� ��Ȯ�� �Է��ϼ���.");
			}
			
		}
		
	}
	
	//Ch2_Scanner ���� ���� ���� Ŭ����
	static class Ch2_Person{
		
		public String name;
		public int age;
		private String rrn;
		
		
		public String getRrn() 	{			return rrn;		}
		public void setRrn(String rrn) 	{			this.rrn = rrn;		}
		
		//������
		public Ch2_Person(String name, int age, String rrn) {
			this.name = name;
			this.age = age;
			setRrn(rrn);
		}
		
		//toString ������
		@Override
		public String toString() {
			return "�̸� : " + name + ", ���� : " + age + ", �ֹε�Ϲ�ȣ : " + rrn;	
		}
		
	}
	
	
	//������
	@SuppressWarnings("unused")		//��� ����
	public static void ch2_Operator() {
		//������ �켱������ ���õ� ���� ���� ������ �׽�Ʈ�϶�.
		
		System.out.println("====================================================================");
		System.out.println("������ �켱���� ��");
		
		//���
		System.out.println("====================================================================");
		System.out.println("����������� �켱����");
		System.out.println("3 + 4 * 2 = " + (3 + 4 * 2));
		System.out.println("8 / 2 + 3 = " + (8 / 2 + 3));
		System.out.println("6 - 2 + 3 = " + (6 - 2 + 3));
		System.out.println("6 + 3 - 2 = " + (6 + 3 - 2));
		System.out.println("9 / 3 * 2 = " + (9 / 3 * 2));
		System.out.println("9 * 2 / 3 = " + (9 * 2 / 3));
		System.out.println("7 - 5 % 2 = " + (7 - 5 % 2));
		System.out.println("����������� �켱������ �츮�� �Ϲ������� �˰��ִ� ��Ģ������ �켱������ ������ ����.");
		
		//����
		System.out.println("====================================================================");
		System.out.println("������������ �켱����");
		int i = 10;
		System.out.println("int i = " + i);
		System.out.println("++i = " + (++i));
		System.out.println("i++ = " + (i++));
		System.out.println("i = " + i);
		i = 10;
		System.out.println("i = 10, i++ + i + --i = 10 + 11 + 10 = " + (i++ + i + --i));
		i = 10;
		System.out.println("i = 10, i++ + i * --i = 10 + 11 * 10 = " + (i++ + i * --i));
		System.out.println("�ǿ������� �տ� ���������ڸ� ����� ��� ������ ���� ��ȯ�� �� ���������ڸ� �����Ѵ�.");
		System.out.println("�ǿ������� �ڿ� ���������ڸ� ����� ��� ���������ڸ� ������ �� ����� ���� ��ȯ�Ѵ�.");
		System.out.println("������ �� �İ� ���� ����� ���������� ���ϹǷ� ���� ���� �ڵ��̴�. �̷��� ������� ���ư��ٴ� ���� �����ϱ� ���Ͽ� ǥ���ߴ�.");
		
		//���迬����
		System.out.println("====================================================================");
		System.out.println("���迬������ �켱����");
		System.out.println("10 < 13  = " + (10 < 13));
		System.out.println("10 < 13 == 10 > 13 = " + (10 < 13 == 10 > 13));
		System.out.println("10 > 13 != 10 < 13 = " + (10 > 13 != 10 < 13));
		System.out.println("10 < 13 != 10 > 13 = " + (10 < 13 != 10 > 13));
		System.out.println("���迬���ڳ����� �켱������ �񱳿����ڰ� ���� ����Ǹ� ���� ������ڰ� ����ȴ�.");
		
		//��
		System.out.println("====================================================================");
		System.out.println("���������� �켱����");
		System.out.println("true && true || false = " + (true && true || false));	//dead code
		System.out.println("true || true && false = " + (true || true && false));	//dead code
		System.out.println("true && !true = " + (true && !true));
		System.out.println("�������ڵ��� �켱������ NOT, AND, OR ���̴�.");
		
		//��Ʈ
		System.out.println("====================================================================");
		System.out.println("��Ʈ�������� �켱����");
		System.out.println("1 | 0 & 1 = " + (1 | 0 & 1));
		System.out.println("1 | 1 ^ 1 = " + (1 | 1 ^ 1));
		System.out.println("3 ^ 1 & 1 = " + (3 ^ 1 & 1));
		System.out.printf("~0000ffff = %x\n", (~0x0000ffff));
		System.out.printf("~0000ffff >> 4 = %x\n", (~0x0000ffff >> 4));
		System.out.printf("~0000ffff >> 4 | 0000ffff << 4 = %x\n", (~0x0000ffff >> 4 | 0x0000ffff << 4));
		System.out.println("��Ʈ�����ڳ����� �켱������ NOT, �̵�������, AND, XOR, OR ���̴�.");
		
		//����
		System.out.println("====================================================================");
		System.out.println("�� �����ڵ� ���� �켱���� ��");
		System.out.println("1. ���׿����ڿ� ����������� �켱����");
		System.out.printf("~ffff0000 + ff000000 = %x\n", (~0xffff0000 + 0xff000000));
		System.out.println("���׿����ڰ� ���� ����ȴ�.");
		System.out.println();
		
		System.out.println("2. ��������ڿ� ��Ʈ �̵��������� �켱����");
		System.out.println("3 << 1 + 2 << 1 = " + (3 << 1 + 2 >> 1));
		System.out.println("��� �����ڰ� ���� ����ȴ�.");
		System.out.println();
		
		System.out.println("3. ��Ʈ �̵������ڿ� ���迬������ �켱����");
		System.out.println("0000ffff >> 4 < 00000fff << 4 = " + (0x0000ffff >> 4 < 0x00000fff << 4));
		System.out.println("��Ʈ �̵������ڰ� ���� ����ȴ�.");
		System.out.println();
		
		System.out.println("4. ������ڿ� ��Ʈ�������� �켱����");
		System.out.println("5 ^ 3 != 4 = ���� �߻�(3 != 4 �� ���� ����Ǿ� true�� ��ȯ�ϱ� ����)");
		System.out.println("���� �����ڰ� ���� ����ȴ�.");
		System.out.println();
		
		System.out.println("5. ������ڿ� �� �������� �켱����");
		System.out.println("true || false != true = " + (true || false != true));
		System.out.println("���� �����ڰ� ���� ����ȴ�.");
		System.out.println();
		
		System.out.println("������ �ƴ� �͵� �߿������� ȥ���� ���� �ʰ� ��ȣ�� ���� ������ ������ ���� �� ����.");
		
	}
	
}


//ch3
class Ch3 implements Ch{
	
	//if
	public static void ch3_If() {
		//�� �ڿ����� �Է¹޾� �ִ������� ����϶�.
		
		System.out.println("====================================================================");
		System.out.println("�ִ����� ��� ���α׷�");
		System.out.print("ù��° �ڿ����� �Է��ϼ��� : ");
		int a = sc.nextInt();
		sc.nextLine();
		
		System.out.print("�ι��� �ڿ����� �Է��ϼ��� : ");
		int b = sc.nextInt();
		sc.nextLine();
		
		System.out.println("====================================================================");
		System.out.println("�� ���� �ִ������� " + gcd(a, b) + "�Դϴ�.");
	}
	
	//�ִ�����
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
		//switch���� �̿��Ͽ� ������ ���⸦ �ۼ��϶�.
		//2���� ���� �ڷ��� �޼ҵ忡�� �ҷ��´�.
		Ch2.ch2_PrimitiveDataType();
	}
	
	//while
	public static void ch3_While() {
		//�ζ� ��ȣ ��÷�⸦ �ۼ��϶�.
		
		int count = 0, wincount= 0;
		String[] s;
		boolean bonus = false;
		boolean[] overlapcheck = new boolean[45];
		int[] win = new int[7], mynum = new int[7];
		
		System.out.println("====================================================================");
		System.out.println("�ζ� ��ȣ ��÷��");
		System.out.println("1~45�� ���� �� �ߺ����� �ʰ� 7���� ����ּ���");
		
		//��ȣ �Է¹ޱ�
		while(true) {
			System.out.print("7���� ���ڸ� ����� �и��Ͽ� �Է��ϼ��� : ");
			s = sc.nextLine().split(" ");
			
			if(s.length != 7) {
				System.out.println("������ ���� �ʽ��ϴ�. �ٽ� �Է��ϼ���.");
				continue;
			}
			else {
				break;
			}
		}
		
		//�Է¹��� ��ȣ�� ���ڷ� ��ȯ
		for(int i = 0; i < 7; i++) {
			mynum[i] = Integer.parseInt(s[i]);
		}
		
		//��ȣ ��÷
		while(count < 7) {
			int num = (int)(Math.random()*45 + 1);
			
			//�ߺ� üũ
			if(overlapcheck[num-1]) {
				continue;
			}
			
			else {
				win[count] = num;
				overlapcheck[num-1] = true;
			}
			
			//�Է°��� ��
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
		
		//��� ���
		System.out.println("====================================================================");
		System.out.print("��÷ ��ȣ : ");
		for(int r : win)	System.out.printf("%d\t", r);
		System.out.println();
		
		System.out.print("�Է� ��ȣ : ");
		for(int r : mynum)	System.out.printf("%d\t", r);
		System.out.println();
		
		//��÷ ���
		if(wincount == 6) {
			System.out.println("1�� ��÷!");
		}
		
		else if(wincount == 5 && bonus) {
			System.out.println("2�� ��÷!");
		}
		
		else if(wincount == 5) {
			System.out.println("3�� ��÷!");
		}
		
		else if(wincount == 4) {
			System.out.println("4�� ��÷!");
		}
		
		else if(wincount == 3) {
			System.out.println("5�� ��÷!");
		}
		
		else {
			System.out.println("��...");
		}
		
	}
	
	
	//do-while
	public static void ch3_DoWhile() {
		//0���� 99������ ���� �� ������ �� ���ڸ� ������ϴ� ���α׷��� �ۼ��϶�.
		int hidden = (int)(Math.random()*100), n;
		
		System.out.println("====================================================================");
		System.out.println("���� ���߱� ����");
		System.out.println("0���� 99������ ���� �� �ϳ��� �������� �����մϴ�.");
		System.out.println("���ڸ� �Է� �� UP �Ǵ� DOWN�̶�� ǥ���մϴ�.");
		
		//���� �Է��� ��
		do {
			System.out.println("�������� �����ϴ� ���ڸ� �Է����ּ��� : ");
			n = sc.nextInt();
			sc.nextLine();
			
			if(n > hidden) {
				System.out.println("DOWN");
			}
			
			else if(n < hidden) {
				System.out.println("UP");
			}
			
		} while(n != hidden);
		
		System.out.println("�����Դϴ�!");
		
	}
	
	
	//for
	public static void ch3_For() {
		//����ڿ��� �������� �Է¹޾� ���� ����϶�.
		
		System.out.print("���� �������� �Է��ϼ��� : ");
		int radius = sc.nextInt();
		sc.nextLine();
		
		//�� ���
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
	
	//�迭
	public static void ch3_Array() {
		//Ch3.ch3_While�� �ʵ� ������ ����Ͽ���.
		//�ش� �޼ҵ带 �ҷ��´�.
		Ch3.ch3_While();
		
	}
	
	//for each
	public static void ch3_ForEach() {
		//Ch3.ch3_While�޼ҵ忡�� �����¿� ����Ͽ���.
		//�ش� �޼ҵ带 �ҷ��´�.
		Ch3.ch3_While();
	}
	
	//�������迭
	public static void ch3_MultiDimensionArray() {
		//2���� �迭�� ȭ�鿡 ǥ���ϰ� ����ڿ��� �Է¹޾� '��', '.'�� ǥ���϶�.
		
		boolean [][] field = new boolean[10][20];
		String s;
		String[] stringint;
		
		System.out.println("====================================================================");
		System.out.println("2���� �ʵ�");
		System.out.println("��ǥ��ȣ�� �Է½� ������°� ��ȯ�˴ϴ�.");
		System.out.println("��ǥ�� ������ �����Ͽ� �������ּ���. ex)3 4");
		System.out.println("���Ḧ ���ϸ� '1'�� �Է����ּ���.");
		
		//�����
		while(true) {
			System.out.println("====================================================================");
			System.out.printf("\t1 2 3 4 5 6 7 8 9 10\n");
			
			//ȭ�� ǥ��
			for(int i = 0; i < 10; i++) {
				System.out.printf("%d\t", (i+1));
				
				for(int j = 0; j < 10; j++) {
					if(field[i][j])		System.out.print("�Ƣ�");
					else	System.out.print(" .");
				}
				
				System.out.println();
			}
			
			System.out.println("====================================================================");
			System.out.print("��º����� ���ϴ� ��ǥ�� �Է��ϼ��� : ");
			s = sc.nextLine();
			
			//����
			if(s.equals("1"))	break;
			
			//��ǥ �� ����
			stringint = s.split(" ");
			
			if(stringint.length != 2) {
				System.out.println("x��ǥ�� y��ǥ�� ������ �����Ͽ� �Է��ؾ��մϴ�.");
				continue;
			}
			
			int x = Integer.parseInt(stringint[0]) - 1;
			int y = Integer.parseInt(stringint[1]) - 1;
			
			field[x][y] = !field[x][y];
			
		}
		
	}
	
	//ArrayList
	public static void ch3_ArrayList() {
		//Ch2.ch2_Scanner �޼ҵ忡�� Person��ü�� ArrayList�� ����Ͽ� �����Ͽ���.
		//�ش� �޼ҵ带 �ҷ��´�.
		Ch2.ch2_Scanner();
	}
	
}


//ch4
class Ch4 implements Ch{

	//Ŭ����
	public static void ch4_Class() {
		//Ch4_StudentŬ������ �ۼ��϶�. ��� �ʵ�� �޼ҵ带 ������ �ִ�.
		
		ArrayList<Ch4_Student> students = new ArrayList<Ch4.Ch4_Student>();
		int check1;
		
		//�⺻ ���
		System.out.println("====================================================================");
		System.out.println("�л� ���� ���� ���α׷�");
		System.out.println("�л��� �̸�, ����, �й�, ���������� �����մϴ�.");
		
		//�۾�
		while(true) {
			System.out.println("====================================================================");
			System.out.println("1. ���α׷� ����");
			System.out.println("2. �л� ���� �Է�");
			System.out.println("3. �л� ���� ���");
			System.out.println("4. ���� ���� ����");
			System.out.println("====================================================================");
			System.out.print("���ϴ� �۾��� ��ȣ�� �Է��ϼ��� : ");
			check1 = sc.nextInt();
			sc.nextLine();
			System.out.println("====================================================================");
			
			//����
			if(check1 == 1) {
				System.out.println("�л� ���� ���� ���α׷��� �����մϴ�.");
				break;
			}
			
			//�л� ���� �Է�
			else if(check1 == 2) {
				System.out.print("�л��� �̸��� �Է��ϼ��� : ");
				String name = sc.nextLine();
				System.out.print("�л��� ���̸� �Է��ϼ��� : ");
				int age = sc.nextInt();
				sc.nextLine();
				System.out.print("�л��� �й��� �Է��ϼ���(9�ڸ�) : ");
				long studentId = sc.nextInt();
				
				students.add(new Ch4_Student(name, age, studentId));
			}
			
			//�л� ���� ���
			else if(check1 == 3) {
				for(Ch4_Student s : students) {
					s.print();
				}
			}
			
			//���� ���� ����
			else if(check1 ==4) {
				boolean check2 = false;
				int check3, num = 0;
				System.out.print("�������� ������ ���ϴ� �л��� �й��� �Է��ϼ��� : ");
				long stid = sc.nextInt();
				sc.nextLine();
				
				//�й� Ȯ��
				for(int i = 0; i < students.size(); i++) {
					if(students.get(i).getStudentId() == stid) {
						check2 = true;
						num = i;
						System.out.println(students.get(i).name + "�л� Ȯ�εǾ����ϴ�.");
						break;
					}
					
					check2 = false;
				}
				
				if(!check2) {
					System.out.println("�ش� �й��� �л��� �������� �ʽ��ϴ�.");
					continue;
				}
				
				
				while(true) {
					System.out.println("====================================================================");
					System.out.println("1. �л� ���� ����");
					System.out.println("2. ���� ���� ��� ���");
					System.out.println("3. ���� ���� �߰�");
					System.out.println("4. ���� ���� ����");
					System.out.println("====================================================================");
					System.out.print("���ϴ� �۾��� ��ȣ�� �Է��ϼ��� : ");
					check3 = sc.nextInt();
					sc.nextLine();
					System.out.println("====================================================================");
					
					//����
					if(check3 == 1) {
						System.out.println("�л� ���� ���� ȭ������ �̵��մϴ�. ");
						break;
					}
					
					//���� ���� ��� ���
					else if(check3 == 2) {
						students.get(num).subjectList();
					}
					
					//���� ���� �߰�
					else if(check3 == 3) {
						System.out.print("���� ������� �Է��ϼ��� : ");
						String sub = sc.nextLine();
						students.get(num).addSubject(sub);
					}
					
					//���� ���� ����
					else if(check3 == 4) {
						System.out.print("���� ��Ҹ� ���ϴ� ������� �Է��ϼ��� : ");
						String sub = sc.nextLine();
						
						//���� ��Ͽ� �ִ��� Ȯ��
						if(students.get(num).subject.indexOf(sub) == -1) {
							System.out.println("�ش� ������ �����ϰ� ���� �ʽ��ϴ�.");
							continue;
						}
						
						students.get(num).removeSubject(sub);
					}
					
					else {
						System.out.println("�ٽ� �Է��ϼ���.");
					}
					
				}
				
			}
			
			else {
				System.out.println("�ٽ� �Է��ϼ���.");
			}
			
		}
		
	}
	
	//Ch4_Class���� ����ϱ����� Ŭ����
	static class Ch4_Student{
		String name;
		int age;
		private long studentId;
		ArrayList<String> subject = new ArrayList<String>();
		
		//������, ������
		public long getStudentId() {			return studentId;		}
		public void setStudentId(long studentId) {			this.studentId = studentId;		}
		
		//������
		public Ch4_Student(String name, int age, long studentId) {
			this.name = name;
			this.age = age;
			setStudentId(studentId);
		}
		
		//���� �߰�
		public void addSubject(String sub) {
			subject.add(sub);
		}
		
		//���� ����
		public void removeSubject(String sub) {
			subject.remove(sub);
		}
		
		//���� ���� ����Ʈ ���
		public void subjectList() {
			System.out.println("���� ����");
			for(String s : subject) {
				System.out.printf("%s\t", s);
			}
			System.out.println();
		}
		
		//�л� ���� ���
		public void print() {
			System.out.printf("�й� : %09d, �̸� : %s, ���� : %d\n", getStudentId(), name, age);
			}
		
	}
	
	//������
	public static void ch4_Constructor() {
		//���� Ŭ������ �ۼ��϶�. �Է��� ������ ���������� �ΰ� ������ �����ڸ� ������.
		
		ArrayList<Ch4_Shape> shape = new ArrayList<Ch4.Ch4_Shape>();
		
		System.out.println("====================================================================");
		System.out.println("���� ���� �� �۾� ���α׷�");
		
		Ch4.makeShape(shape);
		
		
	}
	
	//���� �⺻ �߻�Ŭ����
	abstract static class Ch4_Shape{
		protected double x = 0.0, y = 0.0;
		
		//��ǥ �̵�
		public void move(double x, double y) {
			this.x = x;
			this.y = y;
		}
		
		//���� ���
		abstract double calcArea();
		
		//���
		abstract void print(int i);
	}

	//��
	static class Ch4_Circle extends Ch4_Shape{
		protected double radius = 5.0;
		
		//����Ʈ ������
		public Ch4_Circle() {
			
		}
		
		//������ ������
		public Ch4_Circle(double radius) {
			this.radius = radius;
		}
		
		//��ǥ ������
		public Ch4_Circle(double x, double y) {
			this.x = x;
			this.y = y;
		}
		
		//��ü �Է� ������
		public Ch4_Circle(double x, double y, double radius) {
			this.x = x;
			this.y = y;
			this.radius = radius;
		}
		
		//���� ���
		@Override
		public double calcArea() {
			return 3.14*radius*radius;
		}
		
		//���
		@Override
		public void print(int i) {
			System.out.println("��ȣ : " + i + ", ��ü ���� : ��, ��ǥ : (" + x + ", " + y + "), ������ : " + radius);
		}
	}

	//�簢��
	static class Ch4_Rectangle extends Ch4_Shape{
		protected double width = 5.0, height = 5.0;
		
		//����Ʈ ������
		public Ch4_Rectangle() {
			
		}
		
		//����, ���� �Է� ������
		public Ch4_Rectangle(double width, double height) {
			this.width = width;
			this.height = height;
		}
		
		//�ִ� �Է� ������
		public Ch4_Rectangle(double x, double y, double width, double height) {
			this.x = x;
			this.y = y;
			this.width = width;
			this.height = height;
		}
		
		//���� ���
		@Override
		public double calcArea() {
			return width*height;
		}
		
		//���
		@Override
		public void print(int i) {
			System.out.println("��ȣ : " + i + ", ��ü ���� : �簢��, ��ǥ : (" + x + ", " + y + "),"
					+ "�ʺ� : " + width + ",���� : " + height);
		}
	}


	//�ﰢ��
	static class Ch4_Triangle extends Ch4_Shape{
		protected double width = 5.0, height = 5.0;
		
		//����Ʈ ������
		public Ch4_Triangle() {
			
		}
		
		//����, ���� �Է� ������
		public Ch4_Triangle(double width, double height) {
			this.width = width;
			this.height = height;
		}
		
		//�ִ� �Է� ������
		public Ch4_Triangle(double x, double y, double width, double height) {
			this.x = x;
			this.y = y;
			this.width = width;
			this.height = height;
		}
		
		//���� ���
		@Override
		public double calcArea() {
			return width*height/2;
		}
		
		//���
		@Override
		public void print(int i) {
			System.out.println("��ȣ : " + i + ", ��ü ���� : �ﰢ��, ��ǥ : (" + x + ", " + y + "),"
					+ "�ʺ� : " + width + ",���� : " + height);
		}
	}
	
	//���� ȭ��
		static void makeShape(ArrayList<Ch4_Shape> shape) {
			
			int check;
			
			while(true) {
				System.out.println("====================================================================");
				System.out.println("-���� ȭ��-");
				System.out.println("1. ����");
				System.out.println("2. �� ����");
				System.out.println("3. �簢�� ����");
				System.out.println("4. �ﰢ�� ����");
				System.out.println("5. �۾�ȭ��");
				System.out.println("====================================================================");
				System.out.print("���ϴ� �۾� ��ȣ�� �Է��ϼ��� : ");
				check = sc.nextInt();
				sc.nextLine();
				System.out.println("====================================================================");
				
				//����
				if(check == 1) {
					System.out.println("���� ���� �� �۾� ���α׷��� �����մϴ�.");
					break;
				}
				
				//�� ����
				else if (check == 2) {
					System.out.println("1. �⺻������ ����");
					System.out.println("2. ������ ���̸� �����Ͽ� ����");
					System.out.println("3. ��ǥ�� �����Ͽ� ����");
					System.out.println("4. ��� ���� ���� ����");
					System.out.println("====================================================================");
					System.out.print("���ϴ� �۾� ��ȣ�� �Է��ϼ���  : ");
					check = sc.nextInt();
					sc.nextLine();
					
					//����Ʈ ����
					if(check == 1) {
						shape.add(new Ch4_Circle());
						System.out.println("�� ��ü�� �����Ǿ����ϴ�.");
					}
					
					//������ ���� ����
					else if(check == 2) {
						System.out.print("�� ������ : ");
						double r = sc.nextDouble();
						sc.nextLine();
						shape.add(new Ch4_Circle(r));
						System.out.println("�� ��ü�� �����Ǿ����ϴ�.");
					}
					
					//��ǥ ���� ����
					else if(check == 3) {
						System.out.print("�� �߽��� x��ǥ : ");
						double x = sc.nextDouble();
						sc.nextLine();
						System.out.print("�� �߽��� y��ǥ : ");
						double y = sc.nextDouble();
						sc.nextLine();
						shape.add(new Ch4_Circle(x, y));
						System.out.println("�� ��ü�� �����Ǿ����ϴ�.");
					}
					
					//�ִ� �Է� ����
					else if(check == 4) {
						System.out.print("�� �߽��� x��ǥ : ");
						double x = sc.nextDouble();
						sc.nextLine();
						System.out.print("�� �߽��� y��ǥ : ");
						double y = sc.nextDouble();
						sc.nextLine();
						System.out.print("�� ������ : ");
						double r = sc.nextDouble();
						sc.nextLine();
						shape.add(new Ch4_Circle(x, y, r));
						System.out.println("�� ��ü�� �����Ǿ����ϴ�.");
					}
					
					else {
						System.out.println("�ٽ� �Է��ϼ���.");
					}
					
				}
				
				//�簢�� ����
				else if (check == 3) {
					System.out.println("1. �⺻������ ����");
					System.out.println("2. ����, ���̸� �����Ͽ� ����");
					System.out.println("3. ��� ���� ���� ����");
					System.out.println("====================================================================");
					System.out.print("���ϴ� �۾� ��ȣ�� �Է��ϼ���  : ");
					check = sc.nextInt();
					sc.nextLine();
					
					//����Ʈ ����
					if(check == 1) {
						shape.add(new Ch4_Rectangle());
						System.out.println("�簢�� ��ü�� �����Ǿ����ϴ�.");
					}
					
					//����, ���̸� �����Ͽ� ����
					else if(check == 2) {
						System.out.print("�簢���� ���� : ");
						double length = sc.nextDouble();
						sc.nextLine();
						System.out.print("�簢���� ���� : ");
						double height = sc.nextDouble();
						sc.nextLine();
						shape.add(new Ch4_Rectangle(length, height));
						System.out.println("�簢�� ��ü�� �����Ǿ����ϴ�.");
					}
					
					//�ִ� �Է� ����
					else if(check == 3) {
						System.out.print("�簢�� �������� x��ǥ : ");
						double x = sc.nextDouble();
						sc.nextLine();
						System.out.print("�簢�� �������� y��ǥ : ");
						double y = sc.nextDouble();
						sc.nextLine();
						System.out.print("�簢���� ���� : ");
						double length = sc.nextDouble();
						sc.nextLine();
						System.out.print("�簢���� ���� : ");
						double height = sc.nextDouble();
						sc.nextLine();
						shape.add(new Ch4_Rectangle(x, y, length, height));
						System.out.println("�簢�� ��ü�� �����Ǿ����ϴ�.");
					}
					
					else {
						System.out.println("��ȣ�� �ٽ� �Է��ϼ���");
						continue;
					}
					
				}
				
				
				//�ﰢ�� ����
				else if (check == 4) {
					System.out.println("1. �⺻������ ����");
					System.out.println("2. ����, ���̸� �����Ͽ� ����");
					System.out.println("3. ��� ���� ���� ����");
					System.out.println("====================================================================");
					System.out.print("���ϴ� �۾� ��ȣ�� �Է��ϼ���  : ");
					check = sc.nextInt();
					sc.nextLine();
					
					//����Ʈ ����
					if(check == 1) {
						shape.add(new Ch4_Triangle());
						System.out.println("�ﰢ�� ��ü�� �����Ǿ����ϴ�.");
					}
					
					//����, ���̸� �����Ͽ� ����
					else if(check == 2) {
						System.out.print("�ﰢ���� ���� : ");
						double length = sc.nextDouble();
						sc.nextLine();
						System.out.print("�ﰢ���� ���� : ");
						double height = sc.nextDouble();
						sc.nextLine();
						shape.add(new Ch4_Triangle(length, height));
						System.out.println("�ﰢ�� ��ü�� �����Ǿ����ϴ�.");
					}
					
					//�ִ� �Է� ����
					else if(check == 3) {
						System.out.print("�ﰢ�� �������� x��ǥ : ");
						double x = sc.nextDouble();
						sc.nextLine();
						System.out.print("�ﰢ�� �������� y��ǥ : ");
						double y = sc.nextDouble();
						sc.nextLine();
						System.out.print("�ﰢ���� ���� : ");
						double length = sc.nextDouble();
						sc.nextLine();
						System.out.print("�ﰢ���� ���� : ");
						double height = sc.nextDouble();
						sc.nextLine();
						shape.add(new Ch4_Triangle(x, y, length, height));
						System.out.println("�ﰢ�� ��ü�� �����Ǿ����ϴ�.");
					}
					
					else {
						System.out.println("��ȣ�� �ٽ� �Է��ϼ���");
						continue;
					}
					
				}
				
				//�۾� ȭ������ �̵�
				else if (check == 5) {
					System.out.println("�۾� ȭ������ �̵��մϴ�.");
					workShape(shape);
					break;
				}
				
				else
					System.out.println("�ٽ� �Է��ϼ���.");
			}
			
		}
		
		//�۾� ȭ��
		static void workShape(ArrayList<Ch4_Shape> shape) {
			while(true) {
				System.out.println("====================================================================");
				System.out.println("-�۾� ȭ��-");
				System.out.println("1. ����");
				System.out.println("2. ���� Ȯ��");
				System.out.println("3. ��ġ ����");
				System.out.println("4. ũ�� ���");
				System.out.println("5. ���� ȭ��");
				System.out.println("====================================================================");
				System.out.print("���ϴ� �۾� ��ȣ�� �Է��ϼ��� : ");
				int check = sc.nextInt();
				sc.nextLine();
				System.out.println("====================================================================");
				
				//����
				if (check == 1) {
					break;	
				}
				
				//���� Ȯ��
				else if (check == 2) {
					for (int i = 0; i < shape.size(); i++) 
						shape.get(i).print(i);
				}
				
				//��ġ ����
				else if (check == 3) {
					System.out.print("��ġ ������ ���ϴ� ��ü ��ȣ�� �Է��ϼ��� : ");
					int n = sc.nextInt();
					sc.nextLine();
					
					if (n < shape.size() && 0 <= n) {
						System.out.print("x��ǥ�� �Է��ϼ��� : ");
						int x = sc.nextInt();
						sc.nextLine();
						System.out.print("y��ǥ�� �Է��ϼ��� : ");
						int y = sc.nextInt();
						sc.nextLine();
						shape.get(n).x = x;
						shape.get(n).y = y;
						
						System.out.println("��ġ�� ����Ǿ����ϴ�.");
					}
					
					else {
						System.out.println("��ȣ�� �ٽ� �Է��ϼ���");
						continue;
					}
					
				}
				
				//ũ�� ���
				else if (check == 4) {
					System.out.print("ũ�� ����� ���ϴ� ��ü ��ȣ�� �Է��ϼ��� : ");
					int n = sc.nextInt();
					sc.nextLine();
					
					if (n < shape.size() && 0 <= n) {
						System.out.println("������ ���� : " + shape.get(n).calcArea());
					}
					
					else {
						System.out.println("��ȣ�� �ٽ� �Է��ϼ���");
						continue;
					}
				}
				
				//���� ȭ��
				else if (check == 5) {
					System.out.println("���� ȭ������ �̵��մϴ�.");
					makeShape(shape);
					break;
				}
				
				else
					System.out.println("�ٽ� �Է��ϼ���.");
			}
			
		}
	
	
	//��������
	public static void ch4_AccessControl() {
		//�� ��������� �ʵ带 �����غ��� �׽�Ʈ�϶�.
		Ch4_Access test = new Ch4_Access();
		
		System.out.println(test.pubstr);
		System.out.println("public���� ����� ��Ҵ� ��𼭵� ���ٰ����մϴ�.");
		System.out.println();
		System.out.println(test.ptdstr);
		System.out.println("protected�� ����� ��Ҵ� ����� �Ͽ��� ��� ���ٰ����մϴ�.");
		System.out.println();
		System.out.println(test.dftstr);
		System.out.println("default�� �����(�ٸ� ��������� ����) ��Ҵ� ���� ��Ű�� ���ּ� ���ٰ����մϴ�.");
		System.out.println();
		System.out.println(test.getPvtstr());
		System.out.println("private�� ����� ��Ҵ� �ܺο��� ������ �Ұ����մϴ�.");
		
	}
	
	//StringŬ���� �޼ҵ�
	public static void ch4_String() {
		//StringŬ������ ���� �޼ҵ���� �̿��Ͽ� ���ڿ��� �����ϴ� ���α׷��� �ۼ��϶�.
		
		ArrayList<String> list = new ArrayList<String>();
		int index, check, n;
		
		while(true) {
			System.out.println("====================================================================");
			System.out.println("1. ���α׷� ����");
			System.out.println("2. ���ڿ� �Է�");
			System.out.println("3. ���ڿ� ���� ���");
			System.out.println("4. ���� ����");
			System.out.println("5. ���ڿ� ����");
			System.out.println("6. ���ڿ� ��� ���");
			System.out.println("7. ���ڿ� ��");
			System.out.println("====================================================================");
			System.out.print("���ϴ� �۾��� ��ȣ�� �Է��ϼ��� : ");
			check = sc.nextInt();
			sc.nextLine();
			System.out.println("====================================================================");
			
			//���α׷� ����
			if(check == 1) {
				System.out.println("���ڿ� �۾� ���α׷��� �����մϴ�.");
				break;
			}
			
			//���ڿ� �Է�
			else if(check == 2) {
				System.out.print("���ڿ��� �Է��ϼ��� : ");
				list.add(sc.nextLine());
			}
			
			//���ڿ� ���� ���
			else if(check == 3) {
				System.out.print("���� ����� ���ϴ� ���ڿ� ��ȣ�� �Է��ϼ��� : ");
				index = sc.nextInt();
				sc.nextLine();
				
				if (0 <= index && index < list.size()) {
					System.out.println(list.get(index).length());
				}
				
				else {
					System.out.println("��ȣ�� �߸��Ǿ����ϴ�.");
				}
			}
			
			//���� ����
			else if(check == 4) {
				System.out.print("���� ������ ���ϴ� ���ڿ� ��ȣ�� �Է��ϼ��� : ");
				index = sc.nextInt();
				sc.nextLine();
				
				if(0 <= index && index < list.size()) {
					System.out.print("������ ���ϴ� ������ ��ȣ�� �Է��ϼ��� : ");
					n = sc.nextInt();
					sc.nextLine();
					
					if (0 <= n && n < list.get(index).length()) {
						System.out.println("������ ���ڴ� " + list.get(index).charAt(n) + "�Դϴ�.");
					}
					
					else {
						System.out.println("���ڿ� ������ ������ ������ϴ�.");
					}
					
				}
					
				else {
					System.out.println("��ȣ�� �߸��Ǿ����ϴ�.");
				}
			}
			
			//���ڿ� ����
			else if(check == 5) {
				System.out.print("������ ���ڿ� ��ȣ�� �Է��ϼ��� : ");
				index = sc.nextInt();
				sc.nextLine();
				
				if (0 <= index && index < list.size()) {
					System.out.print("������ ���ڿ��� �Է��ϼ��� : ");
					list.set(index, sc.nextLine());
				}
				
				else {
					System.out.println("��ȣ�� �߸��Ǿ����ϴ�.");
				}
			}
			
			//���ڿ� ��� ���
			else if(check == 6) {
				for (String s : list) {
					System.out.println(s);
				}
			}
			
			//���ڿ� ��
			else if(check == 7) {
				int index1, index2;
				System.out.print("���ڿ� ��ȣ�� �Է��ϼ��� : ");
				index1 = sc.nextInt();
				sc.nextLine();
				
				System.out.print("���� ���ڿ� ��ȣ�� �Է��ϼ��� : ");
				index2 = sc.nextInt();
				sc.nextLine();
				
				if(list.get(index1).equals(list.get(index2))) {
					System.out.println("�� ���ڿ��� �����մϴ�.");
				}
				
				else {
					System.out.println("�� ���ڿ��� �������� �ʽ��ϴ�.");
				}
			}
			
			//����
			else {
				System.out.println("���ڸ� ��Ȯ�� �Է��ϼ���.");
			}
		}
		
	}
	
}

//�������� �׽�Ʈ�� ���� Ŭ����
class Ch4_Access{
	public String pubstr = "public String�Դϴ�.";
	protected String ptdstr = "protected Stirng�Դϴ�.";
	String dftstr = "default String�Դϴ�.";
	private String pvtstr = "private String�Դϴ�";
	
	//pvtstr ������, ������
	public String getPvtstr() {			return pvtstr;		}
	public void setPvtstr(String pvtstr) {			this.pvtstr = pvtstr;		}
}


//ch5
class Ch5 implements Ch{

	//���� ���
	public static void ch5_StaticMember() {
		//�׷� Ŭ������ ����� ���� ������ �޼ҵ带 �̿��Ͽ� ������ ���� �����ϴ� ���α׷��� �ۼ��϶�.
		
		ArrayList<Ch5_Group> member = new ArrayList<Ch5.Ch5_Group>();
		int check;
		
		//�⺻ ���
		System.out.println("====================================================================");
		System.out.println("���� ���� ���� ���α׷�");
		
		//�۾� ȯ��
		while(true) {
			System.out.println("====================================================================");
			System.out.println("1. ���α׷� ����");
			System.out.println("2. �����ϱ�");
			System.out.println("3. �Ա��ϱ�");
			System.out.println("4. ����ϱ�");
			System.out.println("5. ���� �ܾ� Ȯ��");
			System.out.println("6. ��й�ȣ ����");
			System.out.println("7. ȸ�� ��� ����");
			System.out.println("====================================================================");
			System.out.print("���ϴ� �۾��� ��ȣ�� �Է��ϼ��� : ");
			check = sc.nextInt();
			sc.nextLine();
			System.out.println("====================================================================");
			
			//���α׷� ����
			if(check == 1) {
				System.out.println("���� ���� ���α׷��� �����մϴ�.");
				break;
			}
			
			//�����ϱ�
			else if(check == 2) {
				boolean hasName = false;
				
				System.out.print("�̸��� �Է��ϼ��� : ");
				String name = sc.nextLine();
				
				//ȸ�� Ȯ��
				for(Ch5_Group g : member) {
					if(g.name.equals(name)) {
						hasName = true;
						break;
						}
				}
				
				if(hasName) {
					System.out.println("�ش� �̸��� �̹� �����մϴ�.");
					break;
				}
				
				member.add(new Ch5_Group(name));
			}
			
			//�Ա��ϱ�
			else if(check == 3) {
				System.out.print("�Ա��� ���ϴ� �ݾ��� �Է��ϼ��� : ");
				long money = sc.nextLong();
				Ch5_Group.addBalance(money);
			}
			
			//����ϱ�
			else if(check == 4) {
				boolean hasName = false;
				
				System.out.print("�̸��� �Է��ϼ��� : ");
				String name = sc.nextLine();
				
				//ȸ�� Ȯ��
				for(Ch5_Group g : member) {
					if(g.name.equals(name)) {
						hasName = true;
						Ch5_Group mem = g;
						
						System.out.print("��й�ȣ�� �Է��ϼ��� : ");
						String password = sc.nextLine();
						
						//��й�ȣ üũ//
						if(mem.getPassword().equals(password)) {
							System.out.print("����� ���ϴ� �ݾ��� �Է��ϼ��� : ");
							long money = sc.nextLong();
							mem.subBalance(money);
						}
						
						else {
							System.out.println("��й�ȣ�� Ʋ�Ƚ��ϴ�.");
						}
						
						break;
					}
				}
				
				if(!hasName) {
					System.out.println("�ش� �̸��� �������� �ʽ��ϴ�.");
					break;
				}
				
			}
			
			//���� �ܾ� Ȯ��
			else if(check == 5) {
				System.out.println("�ܾ��� " + Ch5_Group.balance + "�� �Դϴ�.");
			}
			
			//��й�ȣ ����
			else if(check == 6) {
				boolean hasName = false;
				
				System.out.print("�̸��� �Է��ϼ��� : ");
				String name = sc.nextLine();
				
				//ȸ�� Ȯ��
				for(Ch5_Group g : member) {
					if(g.name.equals(name)) {
						hasName = true;
						Ch5_Group mem = g;
						
						System.out.print("��й�ȣ�� �Է��ϼ��� : ");
						String password = sc.nextLine();
						
						//��й�ȣ üũ//
						if(mem.getPassword().equals(password)) {
							System.out.print("������ ��й�ȣ �Է��ϼ��� : ");
							String newPassword = sc.nextLine();
							mem.setPassword(newPassword);
							System.out.println("��й�ȣ ������ �Ϸ�Ǿ����ϴ�.");
						
						}
						
						else {
							System.out.println("��й�ȣ�� Ʋ�Ƚ��ϴ�.");
						}
						
						break;
					}
				}
				
				if(!hasName) {
					System.out.println("�ش� �̸��� �������� �ʽ��ϴ�.");
					break;
				}
			}
			
			//ȸ�� ��� ����
			else if(check == 7) {
				for(Ch5_Group g : member) {
					System.out.println(g.name);
				}
			}
			
			else {
				System.out.println("�ٽ� �Է��ϼ���.");
			}
			
		}
			
	}
	
	//�׷� Ŭ����
	static class Ch5_Group{
		protected static long balance = 0;
		public String name;
		private String password = "password";
		
		//��й�ȣ ������, ������
		public String getPassword() {			return password;		}
		public void setPassword(String password) {			this.password = password;		}
		
		//������
		public Ch5_Group(String name) {
			this.name = name;
			System.out.println(name + "�� ������ �����մϴ�.");
			System.out.println("���� ��й�ȣ�� 'password'�Դϴ�.");
		}
		
		//�Ա�
		static void addBalance(long money) {
			if(balance >= 0) {
				balance += money;
				System.out.println(money + "�� �ԱݵǾ����ϴ�.");
				System.out.println("�ܾ��� " + balance + "�� �Դϴ�.");
			}
			
			else {
				System.out.println("����� ��� �׸��� �̿����ּ���.");
			}
		}
		
		//���
		void subBalance(long money) {
			if(balance >= 0) {
				if(balance < money) {
					System.out.println("��ݾ��� �ܾ׺��� �����ϴ�.");
				}
				
				else {
					balance -= money;
					System.out.println(money + "�� ��ݵǾ����ϴ�.");
					System.out.println("�ܾ��� " + balance + "�� �Դϴ�.");
				}
			}
			
			else {
				System.out.println("�Ա��� �Ա� �׸��� �̿����ּ���.");
			}
		}
	}
	
	//Ŭ���� �μ� ���� ���
	public static void ch5_CallByValue() {
		//Ch4.ch4_Constructor���� �����Ͽ���.
		//�ش� �޼ҵ带 �ҷ��´�.
		Ch4.ch4_Constructor();
	}
	
	//��ü �迭
	public static void ch5_ObjectArray() {
		//Ch6.ch6_Interface���� �ۼ��Ͽ���.
		//�ش� �޼ҵ带 �ҷ��´�.
		Ch6.ch6_Interface();
	}

	//���� Ŭ����
	public static void ch5_InnerClass() {
		//���� Ŭ������ �ۼ��ϰ� �ܺ�Ŭ���� ��ü�� �����Ͽ� ������� �׽�Ʈ�϶�.
		
		//�ܺ�Ŭ���� ��ü ����
		Ch5_OuterClass oc = new Ch5_OuterClass();
		
		System.out.println(oc.getS());
		System.out.println(oc.ic.getS());			
		//System.out.println(oc.pic.getS());		privateŬ�����̹Ƿ� �ܺ��ο��� ������ �Ұ����ϴ�.
		
	}
	
}

//Ch5.ch5_IneerClass�� Ŭ����
class Ch5_OuterClass {
	private String s = "OuterClass�� private String s�Դϴ�. �ܺο��� ���� �����մϴ�.";
	Ch5_PrivateInnerClass pic = new Ch5_PrivateInnerClass();
	Ch5_InnerClass ic = new Ch5_InnerClass();
	
	public String getS() {		return s;		}
	
	//Ch5_PrivateInnerClass
	private class Ch5_PrivateInnerClass{
		private String s = "Ch5_PrivateInnerClass�� private String s�Դϴ�. �ܺο����� ����, Ȯ�� �� �� �����ϴ�.";
		
		
		@SuppressWarnings("unused")			//������� ���� �޼ҵ���
		public String getS() {		return s;	}
	}
	
	//Ch5_InnerClass
	class Ch5_InnerClass{
		private String s = "Ch5_InnerClass�� private String s�Դϴ�. �ܺο����� ������ �� �����ϴ�.";
		
		public String getS() {		return s;	}
	}
	
	public Ch5_OuterClass() {
		System.out.println(ic.s);
		System.out.println(pic.s);
	}
	
}


//ch6
class Ch6 implements Ch{

	//���
	public static void ch6_Inheritance() {
		//Shape��ü�� ����ϴ� ���� Ŭ�������� �ۼ��϶�.
		//Ch4.ch4_Constructor���� �����Ͽ���.
		//�ش� �޼ҵ带 �ҷ��´�.
		Ch4.ch4_Constructor();
	}
	
	//protect ������
	public static void ch6_Protected() {
		//Ch4.ch4_AccessControl���� �ۼ��Ͽ���.
		//�ش� �޼ҵ带 �ҷ��´�.
		Ch4.ch4_AccessControl();
	}
	
	//�θ� Ŭ���� ȣ��
	public static void ch6_Super() {
		//Ch6.ch6_Interface���� �ۼ��Ͽ���.
		//�ش� �޼ҵ带 �ҷ��´�.
		Ch6.ch6_Interface();
	}
	
	//�޼ҵ� ������
	public static void ch6_MethodOverride() {
		//toString�޼ҵ带 �������϶�.
		//Ch4.ch4_Class�޼ҵ忡�� �ۼ��Ͽ���.
		//�ش� �޼ҵ带 �ҷ��´�.
		Ch4.ch4_Class();
	}
	
	//�߻�Ŭ����
	public static void ch6_AbstractClass() {
		//Ch4.ch4_Constructor���� �ۼ��ϰ� �����Ͽ���.
		//�ش� �޼ҵ带 �ҷ��´�.
		Ch4.ch4_Constructor();
	}
	
	//������
	public static void ch6_Polymorphism() {
		//Ch6.ch6_Interface���� �ۼ��Ͽ���.
		//�ش� �޼ҵ带 �ҷ��´�.
		Ch6.ch6_Interface();
	}
	
	//�������̽�
	public static void ch6_Interface() {
		//Pet �������̽��� �ۼ��ϰ� �����ϴ� �ֿϵ��� Ŭ�������� ����� �����ϴ� ���α׷��� �ۼ��϶�.
		
		ArrayList<Ch6_Animal> animals = new ArrayList<Ch6_Animal>();
		int check;
		
		//�⺻ ���
		System.out.println("====================================================================");
		System.out.println("���� ���� ���� ���� ���α׷�");
				
		//�۾� ȯ��
		while(true) {
			System.out.println("====================================================================");
			System.out.println("1. ���α׷� ����");
			System.out.println("2. ���� ���� �߰�");
			System.out.println("3. ���� ���� ����");
			System.out.println("4. ������ Ȯ��");
			System.out.println("5. ���� �� Ư�̻��� ����");
			System.out.println("====================================================================");
			System.out.print("���ϴ� �۾��� ��ȣ�� �Է��ϼ��� : ");
			check = sc.nextInt();
			sc.nextLine();
			System.out.println("====================================================================");
					
			//���α׷� ����
			if(check == 1) {
				System.out.println("���� ���� ���� ���� ���α׷��� �����մϴ�.");
				break;
			}
			
			//���� ���� �߰�
			else if(check == 2) {
				while(true) {
					System.out.println("1. �����");
					System.out.println("2. ��");
					System.out.println("3. �䳢");
					System.out.println("4. �ź�");
					System.out.println("5. �ܽ���");
					System.out.println("====================================================================");
					System.out.print("�Է��� ���ϴ� ������ ��ȣ�� �Է��ϼ��� : ");
					check = sc.nextInt();
					sc.nextLine();
					System.out.println("====================================================================");
					
					System.out.print("�̸��� �Է��ϼ��� : ");
					String name = sc.nextLine();
					System.out.print("���̸� �Է��ϼ��� : ");
					int age = sc.nextInt();
					sc.nextLine();
					System.out.print("������ �Է��ϼ���(����, ����) : ");
					String sex = sc.nextLine();
					System.out.print("�����Ը� �Է��Ͻÿ�(g) : ");
					double weight = sc.nextDouble();
					sc.nextLine();
					
					//�����
					if(check == 1) {
						animals.add(new Ch6_Cat(name, age, sex, weight));
						break;
					}
					
					//��
					else if(check == 2) {
						animals.add(new Ch6_Dog(name, age, sex, weight));
						break;
					}
					
					//�䳢
					else if(check == 3) {
						animals.add(new Ch6_Rabbit(name, age, sex, weight));
						break;
					}
					
					//�ź�
					else if(check == 4) {
						animals.add(new Ch6_Turtle(name, age, sex, weight));
						break;
					}
					
					//�ܽ���
					else if(check == 5) {
						animals.add(new Ch6_Hamster(name, age, sex, weight));
						break;
					}
					
					else {
						System.out.println("�ٽ� �Է��ϼ���.");
					}
				}
				
			}
			
			//���� ���� ����
			else if(check == 3) {
				boolean hasPet = false;
				
				System.out.print("���� ���Ÿ� ���ϴ� ������ ���� �Է��ϼ��� : ");
				String type = sc.nextLine();
				System.out.print("�̸��� �Է��ϼ��� : ");
				String name = sc.nextLine();
				
				//�ش� ������ �ִ��� �˻�
				for(int i = 0; i < animals.size(); i++) {
					if(animals.get(i).type().equals(type) && animals.get(i).name.equals(name)) {
						hasPet = true;
						animals.remove(i);
						System.out.println(name + "�� ������ �����Ǿ����ϴ�.");
						break;
					}
				}
				
				if(!hasPet) {
					System.out.println("�ش� �̸��� ������ �������� �ʽ��ϴ�.");
				}
				
			}
			
			//������ Ȯ��
			else if(check == 4) {
				for(Ch6_Animal a : animals) {
					a.profile();
				}
			}
			
			//���� �� Ư�̻��� ����
			else if(check == 5) {
				boolean hasPet = false;
				
				System.out.print("���� ������ ���ϴ� ������ ���� �Է��ϼ��� : ");
				String type = sc.nextLine();
				System.out.print("�̸��� �Է��ϼ��� : ");
				String name = sc.nextLine();
				
				//�ش� ������ �ִ��� �˻�
				for(int i = 0; i < animals.size(); i++) {
					if(animals.get(i).type().equals(type) && animals.get(i).name.equals(name)) {
						hasPet = true;
						
						//����
						while(true) {
							System.out.println("====================================================================");
							System.out.println("1. ���� ����");
							System.out.println("2. �̸� ����");
							System.out.println("3. ���� ����");
							System.out.println("4. ������ ����");
							System.out.println("5. Ư�� ���� ����");
							System.out.println("====================================================================");
							System.out.print("�Է��� ���ϴ� ������ ��ȣ�� �Է��ϼ��� : ");
							check = sc.nextInt();
							sc.nextLine();
							System.out.println("====================================================================");
							
							if(check == 1) {
								System.out.println("���� ������ ��Ĩ�ϴ�.");
								break;
							}
							
							//�̸� ����
							else if(check == 2) {
								System.out.print("������ �̸��� �Է��ϼ��� : ");
								String newName = sc.nextLine();
								animals.get(i).name = newName;
							}
							
							//���� ����
							else if(check == 3) {
								System.out.print("������ ������ �Է��ϼ��� : ");
								int newAge = sc.nextInt();
								sc.nextLine();
								animals.get(i).age = newAge;
							}
							
							//������ ����
							else if(check == 4) {
								System.out.print("������ �������� �Է��ϼ���(g) : ");
								double newWeight = sc.nextDouble();
								sc.nextLine();
								animals.get(i).weight = newWeight;
							}
							
							//Ư�̻��� ����
							else if(check == 5) {
								System.out.print("Ư�̻����� ���� �Է��ϼ��� : ");
								String newRemark = sc.nextLine();
								animals.get(i).remark = newRemark;
							}
							
							else {
								System.out.println("�ٽ� �Է��ϼ���.");
							}
							
						}
						
						break;
					}
				}
				
				if(!hasPet) {
					System.out.println("�ش� �̸��� ������ �������� �ʽ��ϴ�.");
				}
			}
			
			else {
				System.out.println("�ٽ� �Է��ϼ���.");
			}
			
		}		
		
	}
	
}

//Ch6_Interface���� �� ���� �������̽�
interface Ch6_Pet{
		
	//���� �� ���
	String type();
	
	//������
	void profile();
	
}

//Ch6_Interface���� �� ����
class Ch6_Animal implements Ch6_Pet{
	//�⺻ �ʵ�
	protected String name, sex, remark = "����";
	protected int age;
	protected double weight;
	
	//������
	public Ch6_Animal(String name, int age, String sex, double weight) {
		this.name = name;
		this.age = age;
		this.sex = sex;
		this.weight = weight;
		System.out.println(name + "�� ���� �Է��� �Ϸ�Ǿ����ϴ�.");
	}

	@Override
	public String type() {
		return "�ֿϵ���";
	}

	@Override
	public void profile() {
		System.out.println("���� : " + type());
		System.out.println("�̸� : " + name);
		System.out.println("���� : " + age);
		System.out.println("���� : " + sex);
		System.out.println("���� : " + weight + "g");
		System.out.println("Ư�̻��� : " + remark);
		System.out.println();
	}
}

//�����
class Ch6_Cat extends Ch6_Animal{
	
	//������
	public Ch6_Cat(String name, int age, String sex, double weight) {
		super(name, age, sex, weight);
	}

	//���� �� ���
	@Override
	public String type() {
		return "�����";
	}

}

//��
class Ch6_Dog extends Ch6_Animal implements Ch6_Pet{
	
	//������
	public Ch6_Dog(String name, int age, String sex, double weight) {
		super(name, age, sex, weight);
	}

	//���� �� ���
	@Override
	public String type() {
		return "��";
	}
	
}

//�䳢
class Ch6_Rabbit extends Ch6_Animal implements Ch6_Pet{
	
	//������
	public Ch6_Rabbit(String name, int age, String sex, double weight) {
		super(name, age, sex, weight);
	}

	//���� �� ���
	@Override
	public String type() {
		return "�䳢";
	}

}

//�ź�
class Ch6_Turtle extends Ch6_Animal implements Ch6_Pet{
	
	//������
	public Ch6_Turtle(String name, int age, String sex, double weight) {
		super(name, age, sex, weight);
	}

	//���� �� ���
	@Override
	public String type() {
		return "�ź�";
	}

}

//�ܽ���
class Ch6_Hamster extends Ch6_Animal implements Ch6_Pet{
	
	//������
	public Ch6_Hamster(String name, int age, String sex, double weight) {
		super(name, age, sex, weight);
	}

	//���� �� ���
	@Override
	public String type() {
		return "�ܽ���";
	}

}
	

//���� Ŭ����
public class TermProject {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		while (true) {
			System.out.println("====================================================================");
			System.out.println("1. ����");
			System.out.println("2. 2��");
			System.out.println("3. 3��");
			System.out.println("4. 4��");
			System.out.println("5. 5��");
			System.out.println("6. 6��");
			System.out.println("====================================================================");
			System.out.print("���ϴ� �۾��� ��ȣ�� �Է��ϼ��� : ");
			int check = sc.nextInt();
			sc.nextLine();
			
			if (check == 1) {
				break;
			}
			
			//ch2
			else if (check == 2) {
				while (true) {
					System.out.println("====================================================================");
					System.out.println("1. ���� ȭ��");
					System.out.println("2. ���� �ڷ���");
					System.out.println("3. ���ڿ�");
					System.out.println("4. ����ȯ");
					System.out.println("5. �Է¹ޱ�");
					System.out.println("6. ������");
					System.out.println("====================================================================");
					System.out.print("���ϴ� �۾��� ��ȣ�� �Է��ϼ��� : ");
					check = sc.nextInt();
					sc.nextLine();
					
					//���� ȭ��
					if (check == 1) {
						break;
					}
					
					//���� �ڷ���
					else if (check == 2) {
						Ch2.ch2_PrimitiveDataType();
					}
				
					//���ڿ�
					else if (check == 3) {
						Ch2.ch2_String();
					}
				
					//����ȯ
					else if (check == 4) {
						Ch2.ch2_TypeConversion();
					}
				
					//�Է�(��ĳ��)
					else if (check == 5) {
						Ch2.ch2_Scanner();
					}
				
					//������
					else if (check == 6) {
						Ch2.ch2_Operator();
					}
					
					else {
						System.out.println("���ڸ� ��Ȯ�� �Է��ϼ���.");
					}
				}
			}
			
			//ch3
			else if (check == 3) {
				while (true) {
					System.out.println("====================================================================");
					System.out.println("1. ���� ȭ��");
					System.out.println("2. if-else");
					System.out.println("3. switch");
					System.out.println("4. while");
					System.out.println("5. do-while");
					System.out.println("6. for");
					System.out.println("7. �迭");
					System.out.println("8. for-each");
					System.out.println("9. ������ �迭");
					System.out.println("10. ArrayList");
					System.out.println("====================================================================");
					System.out.print("���ϴ� �۾��� ��ȣ�� �Է��ϼ��� : ");
					check = sc.nextInt();
					sc.nextLine();
					
					//���� ȭ��
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
					
					//�迭
					else if (check == 7) {
						Ch3.ch3_Array();
					}
					
					//for each
					else if (check == 8) {
						Ch3.ch3_ForEach();
					}
					
					//�������迭
					else if (check == 9) {
						Ch3.ch3_MultiDimensionArray();
					}
					
					//ArrayList
					else if (check == 10) {
						Ch3.ch3_ArrayList();
					}
					
					else {
						System.out.println("���ڸ� ��Ȯ�� �Է��ϼ���.");
					}
				}
			}
			
			//ch4
			else if (check == 4) {
				while (true) {
					System.out.println("====================================================================");
					System.out.println("1. ���� ȭ��");
					System.out.println("2. Ŭ����");
					System.out.println("3. ������");
					System.out.println("4. ��������");
					System.out.println("5. StringŬ������ ��ǥ �޼ҵ�");
					System.out.println("====================================================================");
					System.out.print("���ϴ� �۾��� ��ȣ�� �Է��ϼ��� : ");
					check = sc.nextInt();
					sc.nextLine();
					
					if (check == 1) {
						break;
					}
					
					//Ŭ����
					else if (check == 2) {
						Ch4.ch4_Class();
					}
					
					//������
					else if (check == 3) {
						Ch4.ch4_Constructor();
					}
				
					//��������
					else if (check == 4) {
						Ch4.ch4_AccessControl();
					}
				
					//StringŬ���� �޼ҵ�
					else if (check == 5) {
						Ch4.ch4_String();
					}
					
					else {
						System.out.println("���ڸ� ��Ȯ�� �Է��ϼ���.");
					}
				}
			}
			
			//ch5
			else if (check ==5) {
				while (true) {
					System.out.println("====================================================================");
					System.out.println("1. ���� ȭ��");
					System.out.println("2. ���� ���");
					System.out.println("3. Ŭ���� �μ� ���� ���");
					System.out.println("4. ��ü �迭");
					System.out.println("5. ���� Ŭ����");
					System.out.println("====================================================================");
					System.out.print("���ϴ� �۾��� ��ȣ�� �Է��ϼ��� : ");
					check = sc.nextInt();
					sc.nextLine();
					
					if (check == 1) {
						break;
					}
					
					//���� ���
					else if (check == 2) {
						Ch5.ch5_StaticMember();
					}
				
					//Ŭ���� �μ� ���� ���
					else if (check == 3) {
						Ch5.ch5_CallByValue();
					}
				
					//��ü �迭
					else if (check == 4) {
						Ch5.ch5_ObjectArray();
					}
				
					//���� Ŭ����
					else if (check == 5) {
						Ch5.ch5_InnerClass();
					}
					
					else {
						System.out.println("���ڸ� ��Ȯ�� �Է��ϼ���.");
					}
					
				}
				
			}
		
			//ch6
			else if (check == 6) {
				while (true) {
					System.out.println("====================================================================");
					System.out.println("1. ���� ȭ��");
					System.out.println("2. ���");
					System.out.println("3. protected ������");
					System.out.println("4. ���� Ŭ���� ȣ��");
					System.out.println("5. �޼ҵ� ������");
					System.out.println("6. �߻�Ŭ����");
					System.out.println("7. ������");
					System.out.println("8. �������̽�");
					System.out.println("====================================================================");
					System.out.print("���ϴ� �۾��� ��ȣ�� �Է��ϼ��� : ");
					check = sc.nextInt();
					sc.nextLine();
					
					if (check == 1) {
						break;
					}
					
					//���
					else if (check == 2) {
						Ch6.ch6_Inheritance();
					}
					
					//protect ������
					else if (check == 3) {
						Ch6.ch6_Protected();
					}
					
					//���� Ŭ���� ȣ��
					else if (check == 4) {
						Ch6.ch6_Super();
					}
					
					//�޼ҵ� ������
					else if (check == 5) {
						Ch6.ch6_MethodOverride();
					}
					
					//�߻�Ŭ����
					else if (check == 6) {
						Ch6.ch6_AbstractClass();
					}
					
					//������
					else if (check == 7) {
						Ch6.ch6_Polymorphism();
					}
					
					//�������̽�
					else if (check == 8) {
						Ch6.ch6_Interface();
					}
					
					else {
						System.out.println("���ڸ� ��Ȯ�� �Է��ϼ���.");
					}
					
				}
				
			}
			
			else {
				System.out.println("���ڸ� ��Ȯ�� �Է��ϼ���.");
			}
		}
		
		sc.close();
		
	}
	
}
