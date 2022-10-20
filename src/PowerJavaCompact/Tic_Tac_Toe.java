package PowerJavaCompact;

import java.util.Scanner;

public class Tic_Tac_Toe {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		char[][] board = new char[3][3];
		int x, y;
		
		//�������� �����
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++)
				board[i][j] = ' ';
		}
		
		//������ ����� �����Ų��
		do {
			//�������� �׸���
			for (int i = 0; i < 3; i++) {
				System.out.println("  " + board[i][0] + "|  " + board[i][1] + "|  " + board[i][2]);
				if (i != 2)
					System.out.println("---|---|---");
			}
			
			//��ǥ�� �Է¹ް� �˻��Ѵ�
			System.out.print("���� ���� ��ǥ�� �Է��Ͻÿ�: ");
			x = sc.nextInt();
			y = sc.nextInt();
			
			if(board[x][y] != ' ') {
				System.out.println("�߸��� ��ġ�Դϴ�. ");
				continue;
			}
			else
				board[x][y] = 'O';
			
			//��ǻ�Ͱ� ���� ��ġ�� �����Ѵ�
			int i = 0, j = 0;
			for (i = 0; i < 3; i++) {
				for (j = 0; j < 3; j++) 
					if (board[i][j] == ' ')
						break;
				if(j == 3)
					j--;
				if (board[i][j] == ' ')
					break;
			}
			
			if (i < 3 && j < 3)
				board[i][j] = 'X';
		}while(true);
		
	}

}
