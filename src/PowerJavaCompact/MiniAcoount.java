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
			//�⺻ȭ�� ���
			System.out.println("==========================================");
			System.out.println("1. Sign Up");
			System.out.println("2. Login");
			System.out.println("3. Print All Users");
			System.out.println("4. Exit");
			System.out.println("==========================================");
			System.out.print("��ȣ�� �Է��Ͻÿ� : ");
			doingNumber = sc.nextInt();
			sc.nextLine();
			
			//��������
			if (doingNumber == 1) {
				String id, pw;
				System.out.print("Id : ");
				id = sc.nextLine();
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
				for (int i = 0 ; i < user.size(); i++) {
					if(userId.equals(user.get(i).userId)) {
						if(password.equals(user.get(i).password)) {
							logInCheck = true;
							System.out.println(user.get(i).userId + "�� �α��� �Ǿ����ϴ�.");
						}
						else
							System.out.println("��й�ȣ�� Ʋ�Ƚ��ϴ�.");
					}
					else
						System.out.println("�ش� ���̵�� �������� �ʽ��ϴ�.");
				}
			}
			
			//��� ���� ���
			else if(doingNumber == 3) {
				for (int i = 0; i < user.size(); i++)
					System.out.println("{" + user.get(i).userId + ", " + user.get(i).password + "}");
				}
			
			//����
			else if(doingNumber == 4) {
				logInCheck = false;
				break;
			}
			
			else
				System.out.println("�ٽ� �Է��Ͻÿ�");
			
		}	
		sc.close();
	}
}
