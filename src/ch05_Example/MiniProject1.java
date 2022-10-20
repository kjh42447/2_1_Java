//������� ���̵�� �н����带 �����ϴ� UserŬ������ �����ϰ� ���� �Է¹޾� User��ü�� �����϶�.
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
			//�⺻ȭ�� ���
			System.out.println("==========================================");
			System.out.println("1. Sign Up");
			System.out.println("2. Login");
			System.out.println("3. Print All Users");
			System.out.println("4. Logout");
			System.out.println("5. Exit");
			System.out.println("==========================================");
			System.out.print("��ȣ�� �Է��Ͻÿ� : ");
			doingNumber = sc.nextInt();
			sc.nextLine();
			
			//��������
			if (doingNumber == 1) {
				String id, pw;
				System.out.print("Id : ");
				id = sc.nextLine();
				userList.add(id);
				System.out.print("Password : ");
				pw = sc.nextLine();
				user.add(new User(id, pw));
			}
			
			//�α���
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
								System.out.println(user.get(i).userId + "�� �α��� �Ǿ����ϴ�.");
							}
						else
							System.out.println("��й�ȣ�� Ʋ�Ƚ��ϴ�.");
						}
					}
				}
				
				else
					System.out.println("�ش� ���̵�� �������� �ʽ��ϴ�.");
			}
			
			//��� ���� ���
			else if(doingNumber == 3) {
				if(logInCheck == true)
					for (String u : userList)
						System.out.println(u);
				else
					System.out.println("�α��� �� �̿��� �� �ֽ��ϴ�.");
				}
			
			//�α׾ƿ�
			else if(doingNumber == 4) {
				logInCheck = false;
				System.out.println("�α׾ƿ� �Ǿ����ϴ�.");
			}
			else if(doingNumber == 5) {
				logInCheck = false;
				break;
			}
			
			//����
			else
				System.out.println("�ٽ� �Է��Ͻÿ�");
		}
			
			sc.close();
	}
	
}
