package class09_practice;

public class Book {
	
	String isbn;
	String title;
	String author;
	String publisher;
	int price;
	String desc;
	
	// 기본 생성자
	Book(){
		
	}
	
	// 파라미터 생성자
	Book(String isbn, String title, String author, String publisher, int price, String desc){
		this.isbn = isbn;
		this.title = title;
		this.author = author;
		this.publisher = publisher;
		this.price = price;
		this.desc = desc;
	}
	
	@Override
	public String toString() {
		return Integer.toString(this.price);
	}
	

}
