package 맛집리뷰객체생성;

public class Review {
	int reviewId;
	int resId;
	String writer;
	String content;

	Review(int reviewId, int resId, String writer, String content) {
		this.reviewId = reviewId;
		this.resId = resId;
		this.writer = writer;
		this.content = content;

	}

	public String toString() {
		return "Review [reviewId=" + reviewId + ", resId= " + resId + ", writer=" + writer + ", content=" + content
				+ "]";
	}
}
