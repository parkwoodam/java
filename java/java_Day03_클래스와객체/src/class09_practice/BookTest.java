package class09_practice;

public class BookTest {

	public static void main(String[] args) {
		// 객체 생성
		Book book1 = new Book();
		
		book1.isbn = "21424";
		book1.title = "Java Pro";
		book1.author = "김하나";
		book1.publisher = "jaen.kr";
		book1.price = 15000;
		book1.desc = "Java 기본 문법";
		
		// toString() 메서드 실행
		book1.toString();
		
		// 2번째 책
		Book book2 = new Book();
		
		book2.isbn = "35355";
		book2.title = "분석설계";
		book2.author = "소나무";
		book2.publisher = "jaen.kr";
		book2.price = 30000;
		book2.desc = "SW 모델링";
		
		// toString() 메서드 실행
		book2.toString();
				
		System.out.println("**********************도서목록**********************");
		System.out.println(book1.isbn + "\t| " + book1.title + "\t| " + book1.author  + "\t| " + book1.publisher + "\t| " + book1.toString() + "\t| " + book1.desc);
		System.out.println(book2.isbn + "\t| " + book2.title + "\t\t| " + book2.author  + "\t| " + book2.publisher + "\t| " + book2.toString() + "\t| " + book2.desc);
	}

}
