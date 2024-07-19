package 영화객체생성;

public class MovieTest {

	public static void main(String[] args) {
		Movie movie1 = new Movie();

		movie1.showprint();

		Movie movie2 = new Movie(1, "사랑과 전쟁", "박우담", "로맨스", 120);
		movie2.showprint();
	}

}
