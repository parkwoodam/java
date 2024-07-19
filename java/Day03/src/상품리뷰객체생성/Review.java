package 상품리뷰객체생성;

public class Review {
	int reviewId;
	String Pcode;
	String writer;
	String content;

	Review(int reviewId, String Pcode, String writer, String content) {
		this.reviewId = reviewId;
		this.Pcode = Pcode;
		this.writer = writer;
		this.content = content;

	}

	public String toString() {
		return "Review [reviewId=" + reviewId + ", Pcode= " + Pcode + ", writer=" + writer + ", content=" + content
				+ "]";
	}
}
