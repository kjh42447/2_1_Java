//����ڿ��� ȭ���� ũ��, ��ư�� ������ �Է¹޾� �������� ����ϴ� ���α׷��� �ۼ��϶�.
package ch08_example;

import java.util.*;
import java.awt.*;
import javax.swing.*;

public class MakeComponent2 extends JFrame{

	public MakeComponent2(int x, int y, int num) {
		Toolkit kit = Toolkit.getDefaultToolkit();
		setSize(x, y);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		//��ġ ����
		Dimension screensize = kit.getScreenSize();
		setLocation(screensize.width/2, screensize.height/2);
		
		//��ư ����
		setLayout(new FlowLayout());
		for(int i = 0; i < num; i++) {
			JButton button = new JButton("��ư" + (i+1));
			add(button);
		}
		
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int x = 0, y = 0, num = 0;
		
		//�Է�
		while(true) {
			try {
				System.out.print("ȭ���� ���̸� �Է��ϼ��� : ");
				x = sc.nextInt();
				sc.nextLine();
				break;
			}
			catch(InputMismatchException e) {
				System.out.println("���̴� ������ �Է����ּ���.");
				sc = new Scanner(System.in);
			}
		}
		
		while(true) {
			try {
				System.out.print("ȭ���� ���̸� �Է��ϼ��� : ");
				y = sc.nextInt();
				sc.nextLine();
				break;
			}
			catch(InputMismatchException e) {
				System.out.println("���̴� ������ �Է����ּ���.");
				sc = new Scanner(System.in);
			}
		}
		
		while(true) {
			try {
				System.out.print("��ư�� ������ �Է��ϼ��� : ");
				num = sc.nextInt();
				sc.nextLine();
				break;
			}
			catch(InputMismatchException e) {
				System.out.println("��ư�� ������ ������ �Է����ּ���.");
				sc = new Scanner(System.in);
			}
		}
		
		//��ư ����
		MakeComponent2 mc = new MakeComponent2(x, y , num);
		
		sc.close();
	}

}
