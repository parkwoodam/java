package class09_practice;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Article {
	int articleId;
	String title;
	String content;
	int userSeq;
	int viewCnt;
	Date regDate;
	
	Article(){
		
	}
	
	Article(int articleId, String title, String content, int userSeq, int viewCnt){
		this.articleId = articleId;
		this.title = title;
		this.content = content;
		this.userSeq = userSeq;
		this.viewCnt = viewCnt;
	}
	
	@Override
	public String toString() {
		SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd 'at' HH:mm:ss");
		Date date = new Date(System.currentTimeMillis());
		
		return "Article [articleId=" + Integer.toString(this.articleId) + ", title=" + this.title + ", content=" + this.content + ", userSeq=" + Integer.toString(this.userSeq) + ", viewCnt=" + Integer.toString(this.viewCnt) +", regDate=" + formatter.format(date) + "]";
	}

}
