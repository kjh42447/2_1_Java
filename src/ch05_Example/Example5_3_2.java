//å ��ü 2���� �Է¹޾� �� ���� ������ ���� å ��ü�� ��ȯ�ϴ� �޼ҵ� comparePage�� �ۼ��϶�.
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
		System.out.println("�� �β��� å�� �������� " + thickBook.page + "�������̴�.");
	}
}
