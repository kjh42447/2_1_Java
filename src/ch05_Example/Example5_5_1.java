//��ȭ�� ��Ÿ���� Movie Ŭ������ �����Ѵ�. ����ڷκ��� ��ȭ�� ����� �帣�� �Է¹޾� Movie��ü �迭�� �����ϰ� �ٽ� ����ϴ� ���α׷��� �ۼ��Ѵ�.
package ch05_Example;

import java.util.Scanner;

class Movie{
	String title, genre;
	public Movie(String title, String genre) {
		this.title = title;
		this.genre = genre;
	}
}
public class Example5_5_1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		Movie[] list = new Movie[2];
		
		for(int i = 0; i < list.length; i++) {
			System.out.print("��ȭ���� : ");
			String title = sc.nextLine();
			System.out.print("��ȭ�帣 : ");
			String genre = sc.nextLine();
			list[i] = new Movie(title, genre);
		}
		for(int i = 0; i < list.length; i++) {
			System.out.print("{ " + list[i].title + ", " + list[i].genre + " }");
		}
		
		sc.close();
	}
}
