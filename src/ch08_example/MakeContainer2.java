//��ġ�� �����޾� 2���� �����̳ʸ� �����϶�.
package ch08_example;

import javax.swing.*;
import java.util.*;

public class MakeContainer2 extends JFrame{

	public MakeContainer2(int x, int y) {
		setSize(500, 400);
		setVisible(true);
		setLocation(x, y);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ArrayList<MakeContainer2> list = new ArrayList<MakeContainer2>();
		
		for(int i = 0; i < 2; i++) {
			int x = 0, y = 0;
			
			//��ǥ �Է¹ޱ�
			while(true) {
				try {
					System.out.print((i+1) + "��° ȭ���� x��ǥ�� �Է��ϼ��� : ");
					x = sc.nextInt();
					sc.nextLine();
					break;
				}
				catch(InputMismatchException e) {
					System.out.println("��ǥ ���� ������ ȭ�� �ȼ� ���� ������ ���������մϴ�.");
					sc = new Scanner(System.in);
				}
			}
			
			while(true) {
				try {
					System.out.print((i+1) + "��° ȭ���� y��ǥ�� �Է��ϼ��� : ");
					y = sc.nextInt();
					sc.nextLine();
					break;
				}
				catch(InputMismatchException e) {
					System.out.println("��ǥ ���� ������ ȭ�� �ȼ� ���� ������ �������� �մϴ�.");
					sc = new Scanner(System.in);
				}
				
			}
			
			//ȭ�� ǥ���ϱ�
			list.add(new MakeContainer2(x, y));
			list.get(i).setTitle((i+1) + "��° ȭ��");
			
		}
		
		
		sc.close();
	}

}
