package PowerJavaCompact;

import java.util.ArrayList;
import java.util.Scanner;

class User{
	String userId, password;
	static int count = 0;
	
	User (String userId, String password){
		this.userId = userId;
		this.password = password;
		count++;
	}
}
public class MiniAcoount {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ArrayList<User> user = new ArrayList<User>();
		boolean logInCheck = false;
		
		int doingNumber = 0;
		while (doingNumber !=4) {
			//기본화면 출력
			System.out.println("==========================================");
			System.out.println("1. Sign Up");
			System.out.println("2. Login");
			System.out.println("3. Print All Users");
			System.out.println("4. Exit");
			System.out.println("==========================================");
			System.out.print("번호를 입력하시오 : ");
			doingNumber = sc.nextInt();
			sc.nextLine();
			
			//계정생성
			if (doingNumber == 1) {
				String id, pw;
				System.out.print("Id : ");
				id = sc.nextLine();
				System.out.print("Password : ");
				pw = sc.nextLine();
				user.add(new User(id, pw));
			}
			
			//로그인
			else if (doingNumber == 2) {
				System.out.print("Id : ");
				String userId = sc.nextLine();
				System.out.print("Password : ");
				String password = sc.nextLine();
				for (int i = 0 ; i < user.size(); i++) {
					if(userId.equals(user.get(i).userId)) {
						if(password.equals(user.get(i).password)) {
							logInCheck = true;
							System.out.println(user.get(i).userId + "님 로그인 되었습니다.");
						}
						else
							System.out.println("비밀번호가 틀렸습니다.");
					}
					else
						System.out.println("해당 아이디는 존재하지 않습니다.");
				}
			}
			
			//모든 유저 출력
			else if(doingNumber == 3) {
				for (int i = 0; i < user.size(); i++)
					System.out.println("{" + user.get(i).userId + ", " + user.get(i).password + "}");
				}
			
			//종료
			else if(doingNumber == 4) {
				logInCheck = false;
				break;
			}
			
			else
				System.out.println("다시 입력하시오");
			
		}	
		sc.close();
	}
}
