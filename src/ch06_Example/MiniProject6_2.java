//�ؽ�Ʈ ���� ����
package ch06_Example;

import java.util.Scanner;

abstract class Sprite2{
	protected int x = 3, y = 3;
	protected char icon;
	
	abstract void move(char c);
}

//�÷��̾�
class Main2 extends Sprite2{
	
	public Main2() {
		icon = '@';
	}
	void move(char c) {
		if (c == 'h' && x > 1)	--x;
		else if (c == 'j' && y < 9)	++y;
		else if (c == 'k' && y > 1)	--y;
		else if (c == 'l' && x < 18)	++x;
	}
}

//����
class Monster2 extends Sprite2{
	public Monster2() {
		x = y = 7;
		icon = 'M';
	}
	
	void move(char c) {
		if(((Math.random()-0.5))>0) {
			if (x > 1)	--x;
		}
		else {
			if (x < 18)	++x;
		}
		
		if(((Math.random()-0.5)>0)) {
			if (y > 1)	--y;
		}
		else {
			if(y < 9)	++y;
		}
	}	
}

//���
class Gold2 extends Sprite2{
	
	public Gold2() {
		x = 3;
		y = 7;
		icon = 'G';
	}
	void move(char c)	{}
}

public class MiniProject6_2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Main2 main = new Main2();
		Monster2 monster = new Monster2();
		Gold2 gold = new Gold2();
		
		//ȭ�� ǥ�� �� �Է�
		while(true) {
			System.out.println("####################");
			for(int i = 1; i < 10; i++) {
				System.out.print("#");
				for (int j = 1; j < 19; j++) {
					if (main.x == j && main.y == i)
						System.out.print(main.icon);
					else if (monster.x == j && monster.y == i)
						System.out.print(monster.icon);
					else if (gold.x == j && gold.y == i)
						System.out.print(gold.icon);
					else
						System.out.print(" ");
				}
				System.out.println("#");
			}
			System.out.println("####################");
			System.out.print("����(h), �Ʒ���(j), ����(k), ������(l) : ");
			char c = sc.nextLine().charAt(0);
			
			//������
			if(c == 'h' || c == 'j' || c == 'k' || c == 'l') {
				main.move(c);
				monster.move(c);
			}
			else {
				System.out.println("�ٽ� �Է��Ͻÿ�");
				continue;
			}
			
			//����
			if(main.x == gold.x && main.y == gold.y) {
				System.out.println("�¸�");
				break;
			}
			else if(main.x == monster.x && main.y == monster.y) {
				System.out.println("�й�");
				break;
			}
			
		}
		
		sc.close();
	}
}
