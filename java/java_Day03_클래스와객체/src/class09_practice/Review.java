package class09_practice;

public class Review {
	int reviewId;
	String pCode;
	String writer;
	String content;
	
	Review(){
		
	}
	
	Review(int reviewId, String pCode, String writer, String content){
		this.reviewId = reviewId;
		this.pCode = pCode;
		this.writer = writer;
		this.content = content;
	}
	
	@Override
	public String toString() {
		return Integer.toString(this.reviewId);
	}
	

	

}
