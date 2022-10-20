//입력받은 문자열을 연산하는 프로그램을 작성하라.
package ch07_example;

import java.util.*;

public class StringFoundation2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ArrayList<String> list = new ArrayList<String>();
		int check, index, n;
		
		
		while (true) {
			System.out.println("====================================================================");
			System.out.println("1. 문자열 입력");
			System.out.println("2. 문자열 길이 출력");
			System.out.println("3. 문자 추출");
			System.out.println("4. 문자열 변경");
			System.out.println("5. 문자열 목록 출력");
			System.out.println("6. 프로그램 종료");
			System.out.println("====================================================================");
			System.out.print("원하는 작업의 번호를 입력하세요 : ");
			check = sc.nextInt();
			sc.nextLine();
			System.out.println("====================================================================");
			
			//문자열 입력
			if (check == 1) {
				System.out.print("문자열을 입력하세요 : ");
				list.add(sc.nextLine());
			}
			
			//문자열 길이 출력
			else if (check == 2) {
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
			else if (check == 3) {
				System.out.print("문자 추출을 원하는 문자열 번호를 입력하세요 : ");
				index = sc.nextInt();
				sc.nextLine();
				
				if (0 <= index && index < list.size()) {
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
			else if (check == 4) {
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
			else if (check == 5) {
				for (String s : list) {
					System.out.println(s);
				}
			}
			
			//프로그램 종료
			else if (check == 6) {
				break;
			}
			
			//예외
			else {
				System.out.println("숫자를 정확히 입력하세요.");
			}
		}
		
		sc.close();
	}

}
