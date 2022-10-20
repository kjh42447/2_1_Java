//사용자의 아이디와 패스워드를 저장하는 User클래스를 정의하고 값을 입력받아 User객체에 저장하라.
package ch05_Example;

import java.util.*;

class User{
	String userId;
	private String password;
	static int count = 0;
		
	public String getPassword() {		return password;	}
	public void setPassword(String password) {		this.password = password;	}

	User (String userId, String password){
		this.userId = userId;
		this.setPassword(password);
		count++;
	}
}

public class MiniProject1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ArrayList<User> user = new ArrayList<User>();
		ArrayList<String> userList = new ArrayList<String>();
		boolean logInCheck = false;
		int doingNumber = 0;
		while (true) {
			//기본화면 출력
			System.out.println("==========================================");
			System.out.println("1. Sign Up");
			System.out.println("2. Login");
			System.out.println("3. Print All Users");
			System.out.println("4. Logout");
			System.out.println("5. Exit");
			System.out.println("==========================================");
			System.out.print("번호를 입력하시오 : ");
			doingNumber = sc.nextInt();
			sc.nextLine();
			
			//계정생성
			if (doingNumber == 1) {
				String id, pw;
				System.out.print("Id : ");
				id = sc.nextLine();
				userList.add(id);
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
				if(userList.contains(userId)) {
					for (int i = 0 ; i < user.size(); i++) {
						if(userId.equals(user.get(i).userId)) {
							if(password.equals(user.get(i).getPassword())) {
								logInCheck = true;
								System.out.println(user.get(i).userId + "님 로그인 되었습니다.");
							}
						else
							System.out.println("비밀번호가 틀렸습니다.");
						}
					}
				}
				
				else
					System.out.println("해당 아이디는 존재하지 않습니다.");
			}
			
			//모든 유저 출력
			else if(doingNumber == 3) {
				if(logInCheck == true)
					for (String u : userList)
						System.out.println(u);
				else
					System.out.println("로그인 후 이용할 수 있습니다.");
				}
			
			//로그아웃
			else if(doingNumber == 4) {
				logInCheck = false;
				System.out.println("로그아웃 되었습니다.");
			}
			else if(doingNumber == 5) {
				logInCheck = false;
				break;
			}
			
			//종료
			else
				System.out.println("다시 입력하시오");
		}
			
			sc.close();
	}
	
}
