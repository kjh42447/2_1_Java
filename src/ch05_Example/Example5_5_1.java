//영화를 나타내는 Movie 클래스를 정의한다. 사용자로부터 영화의 제목과 장르를 입력받아 Movie객체 배열에 저장하고 다시 출력하는 프로그램을 작성한다.
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
			System.out.print("영화제목 : ");
			String title = sc.nextLine();
			System.out.print("영화장르 : ");
			String genre = sc.nextLine();
			list[i] = new Movie(title, genre);
		}
		for(int i = 0; i < list.length; i++) {
			System.out.print("{ " + list[i].title + ", " + list[i].genre + " }");
		}
		
		sc.close();
	}
}
