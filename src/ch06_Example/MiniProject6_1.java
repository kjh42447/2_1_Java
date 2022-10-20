//텍스트 게임
package ch06_Example;

import java.util.Scanner;

abstract class Sprite1{
	int x = 3, y = 3;
	
	abstract void move(char c);
}

class Main1 extends Sprite1{
	
	void move(char c) {
		if (c == 'h')	--x;
		else if (c == 'j')	--y;
		else if (c == 'k')	++y;
		else if (c == 'l')	++x;
	}
}

class Monster1 extends Sprite1{
	public Monster1() {
		x = y = 7;
	}
	
	void move(char c) {
		x += (Math.random()-0.5)>0?1:-1;
		y += (Math.random()-0.5)>0?1:-1;
	}	
}

class Gold1 extends Sprite1{
	
	public Gold1() {
		x = 3;
		y = 7;
	}
	void move(char c)	{}
}
public class MiniProject6_1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Main1 main = new Main1();
		Monster1 monster = new Monster1();
		Gold1 gold = new Gold1();
		
		while(true) {
			System.out.println("####################");
			for(int i = 1; i < 10; i++) {
				System.out.print("#");
				for (int j = 1; j < 19; j++) {
					if (main.x == j && main.y == i)
						System.out.print("@");
					else if (monster.x == j && monster.y == i)
						System.out.print("M");
					else if (gold.x == j && gold.y == i)
						System.out.print("G");
					else
						System.out.print(" ");
				}
				System.out.println("#");
			}
			System.out.println("####################");
			System.out.print("왼쪽(h), 위쪽(j), 아래쪽(k), 오른쪽(l) : ");
			char c = sc.nextLine().charAt(0);
			
			main.move(c);
			monster.move(c);
			
			if(main.x == gold.x && main.y == gold.y) {
				System.out.println("승리");
				break;
			}
			
			else if(main.x == monster.x && main.y == monster.y) {
				System.out.println("패배");
				break;
			}
			
		}
		
		sc.close();
	}
}
