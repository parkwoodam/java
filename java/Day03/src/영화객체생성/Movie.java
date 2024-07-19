package 영화객체생성;

public class Movie {
	int id;
	String title;
	String director;
	String genre;
	int runningTime;

	Movie() {

	}

	Movie(int id, String title, String director, String genre, int runningTime) {
		this.id = id;
		this.title = title;
		this.director = director;
		this.genre = genre;
		this.runningTime = runningTime;

	}

	void showprint() {
		System.out.println("이 영화의 아이디는 " + id + " 입니다.");
		System.out.println("이 영화 제목은 " + title + " 입니다.");
		System.out.println("이 영화의 제작자는 " + director + " 입니다.");
		System.out.println("이 영화의 장르는 " + genre + "입니다.");
		System.out.println("이 영화의 러닝타임은 " + runningTime + "분 입니다.");

	}
}
