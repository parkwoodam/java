package 게시판객체생성실습;

import java.util.Date;

/**
 * 게시글 정보를 나타내는 클래스
 */
public class Article {
	int articleId;
	String title;
	String content;
	int userSeq;
	int viewCnt;
	Date regDate;
	
	public Article(int articleId, String title, String content, int userSeq, int viewCnt, Date regDate) {
		this.articleId = articleId;
		this.title = title;
		this.content = content;
		this.userSeq = userSeq;
		this.viewCnt = viewCnt;
		this.regDate = regDate;
	}

	@Override
	public String toString() {
		return "Article [articleId=" + articleId + ", title=" + title + ", content=" + content + ", userSeq=" + userSeq
				+ ", viewCnt=" + viewCnt + ", regDate=" + regDate + "]";
	}
	
	
}
