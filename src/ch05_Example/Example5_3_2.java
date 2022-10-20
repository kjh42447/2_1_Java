//책 객체 2개를 입력받아 더 많은 페이지 수의 책 객체를 반환하는 메소드 comparePage를 작성하라.
package ch05_Example;

class Book{
	int page;
	String name;
	
	Book(String name, int page){
		this.name = name;
		this.page = page;
	}
	
	static Book comparePage(Book b1, Book b2) {		return b1.page > b2.page ? b1 : b2;		}
}
public class Example5_3_2 {
	public static void main(String[] args) {
		Book b1 = new Book("English", 300);
		Book b2 = new Book("Math", 500);
		
		Book thickBook = Book.comparePage(b1, b2);
		System.out.println("더 두꺼운 책의 페이지는 " + thickBook.page + "페이지이다.");
	}
}
