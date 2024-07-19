package class09_practice;

public class Review1 {
	int reviewId;
	int resId;
	String writer;
	String content;
	
	Review1(){
		
	}
	
	Review1(int reviewId, int resId, String writer, String content){
		this.reviewId = reviewId;
		this.resId = resId;
		this.writer = writer;
		this.content = content;
	}
	
	@Override
	public String toString() {
		return "Review [reviewId=" + Integer.toString(this.reviewId) + ", resId=" + Integer.toString(this.resId) + ", writer=" + this.writer + ", content=" + this.content + "]";
	}
}
