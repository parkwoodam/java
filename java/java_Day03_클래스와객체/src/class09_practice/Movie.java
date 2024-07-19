package class09_practice;

public class Movie {
	int id;
	String title;
	String director;
	String genre;
	int runningTime;
	
	// 기본생성자
	Movie(){
		
	}
	
	// 파라미터 생성자
	Movie(int id, String title, String director, String genre, int runnintTime){
		this.id = id;
		this.title = title;
		this.director = director;
		this.genre = genre;
		this.runningTime = runningTime;
	}

}
