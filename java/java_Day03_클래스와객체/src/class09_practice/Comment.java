package class09_practice;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Comment {
	int commentId;
	int articled;
	int userSeq;
	String content;
	Date regDate;
	
	Comment(){
		
	}
	
	Comment(int commentId, int articled, int userSeq, String content){
		this.commentId = commentId;
		this.articled = articled;
		this.userSeq = userSeq;
		this.content = content;
	}
	
	@Override
	public String toString() {
		SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd 'at' HH:mm:ss");
		Date date = new Date(System.currentTimeMillis());
		
		return "Comment [commentId=" + Integer.toString(this.commentId) + ", articled=" + Integer.toString(this.articled) + ", userSeq=" + this.userSeq + ", content=" + this.content + ", regDate=" + formatter.format(date) + "]";
	}

}
