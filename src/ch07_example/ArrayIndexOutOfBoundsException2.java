//사용자에게 배열 범위를 입력받아 배열을 만들고 값을 입출력하는 프로그램을 작성하라.
package ch07_example;

import java.util.*;

public class ArrayIndexOutOfBoundsException2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String[] array;
		int i, range;
		boolean exit = false;
		
		//배열 생성
		while(true) {
			try {
				System.out.print("문자열 배열의 범위를 입력하세요 : ");
				range = sc.nextInt();
				sc.nextLine();
				array = new String[range];
				break;
			}
			
			catch(InputMismatchException e) {
				System.out.println("자연수를 입력하세요.");
				System.out.println("프로그램은 계속 진행됩니다.");
				sc = new Scanner(System.in);
			}
			
			catch(NegativeArraySizeException e) {
				System.out.println("자연수를 입력하세요.");
				System.out.println("프로그램은 계속 진행됩니다.");
				sc = new Scanner(System.in);
			}
		}
		
		//입출력
		while(!exit) {
			System.out.println("입력을 원하면 '입력', 출력을 원하면 '출력', 종료를 원하면 '종료'를 입력하세요.");
			String check = sc.nextLine();
			
			switch(check) {
			//입력
			case "입력": 
				while(true) {
					try {
						System.out.print("입력을 원하는 배열의 번호를 입력하세요 : ");
						i = sc.nextInt();
						sc.nextLine();
						
						try {
							array[i] = null;
							System.out.print("문자열을 입력하세요 : ");
							array[i] = sc.nextLine();
							break;
						}
						catch(ArrayIndexOutOfBoundsException e) {
							System.out.println("인덱스 " + i + "는 사용할 수 없습니다.");
							sc = new Scanner(System.in);
						}
					}
					catch(InputMismatchException e) {
						System.out.println("정수를 입력하세요.");
						System.out.println("프로그램은 계속 진행됩니다.");
						sc = new Scanner(System.in);
					}
				}
				break;
			
			//출력
			case "출력":
				while(true) {
					try {
						System.out.print("출력을 원하는 배열의 번호를 입력하세요 : ");
						i = sc.nextInt();
						sc.nextLine();
						
						try {
							System.out.println(array[i]);
							break;
						}
						catch(ArrayIndexOutOfBoundsException e) {
							System.out.println("인덱스 " + i + "는 사용할 수 없습니다.");
							sc = new Scanner(System.in);
						}
					}
					catch(InputMismatchException e) {
						System.out.println("정수를 입력하세요.");
						System.out.println("프로그램은 계속 진행됩니다.");
						sc = new Scanner(System.in);
					}
				}
				break;
				
			//종료
			case "종료":
				exit = true;
				break;
			
			//예외
			default:
				System.out.println("명령을 다시 입력하세요.");
				break;
				
			}
		}
		
		sc.close();
	}

}
