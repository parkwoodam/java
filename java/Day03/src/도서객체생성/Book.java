package 도서객체생성;

/**
 * 도서 정보를 나타내는 클래스
 */
public class Book {
	String isbn;
	String title;
	String author;
	String publisher;
	int price;
	String desc;

	public Book(String isbn, String title, String author, String publisher, int price, String desc) {
		this.isbn = isbn;
		this.title = title;
		this.author = author;
		this.publisher = publisher;
		this.price = price;
		this.desc = desc;
	}

	public String toString() {
		System.out.print(isbn + "\t  |");
		System.out.print(title + "\t  |");
		System.out.print(author + "\t    |");
		System.out.print(publisher + "\t    |");
		System.out.print(price + "\t|");
		System.out.print(desc);
		return "";
	}
}
