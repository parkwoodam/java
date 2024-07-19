package 게시판객체생성실습;


import java.util.Date;

/**
 * 댓글 정보를 나타내는 클래스
 */
public class Comment {
	int commentId;
	int articleId;
	int userSeq;
	String content;
	Date regDate;
	
	public Comment(int commentId, int articleId, int userSeq, String content, Date regDate) {
		this.commentId = commentId;
		this.articleId = articleId;
		this.userSeq = userSeq;
		this.content = content;
		this.regDate = regDate;
	}

	@Override
	public String toString() {
		return "Comment [commentId=" + commentId + ", articleId=" + articleId + ", userSeq=" + userSeq + ", content="
				+ content + ", regDate=" + regDate + "]";
	}
	
	
	
}