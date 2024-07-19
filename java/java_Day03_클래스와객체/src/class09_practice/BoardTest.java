package class09_practice;

public class BoardTest {

	public static void main(String[] args) {
		User user1 = new User();
		user1.userSeq = 0;
		user1.userId = "ssafy";
		user1.password = "1234";
		user1.userName = "김싸피";
		user1.nickName = "김싸피";
		user1.email = "ssafy@ssafy.com";
		
		User user2 = new User();
		user2.userSeq = 1;
		user2.userId = "hong";
		user2.password = "123";
		user2.userName = "홍싸피";
		user2.nickName = "ssafy.hong";
		user2.email = "hong@ssafy.com";
		
		User user3 = new User();
		user3.userSeq = 2;
		user3.userId = "samsic";
		user3.password = "samsic";
		user3.userName = "김삼식";
		user3.nickName = "삼식이";
		user3.email = "kim@ssafy.com";
		
		User user4 = new User();
		user4.userSeq = 3;
		user4.userId = "happy";
		user4.password = "happy";
		user4.userName = "이싸피";
		user4.nickName = "해피바이러스";
		user4.email = "lee@ssafy.com";
		
		Article art1 = new Article();
		art1.articleId = 0;
		art1.title = "공지사항";
		art1.content = "게시글 내용";
		art1.userSeq = 0;
		art1.viewCnt = 0;
		
		Article art2 = new Article();
		art2.articleId = 1;
		art2.title = "코딩테스트란";
		art2.content = "게시글 내용";
		art2.userSeq = 1;
		art2.viewCnt = 0;
		
		Article art3 = new Article();
		art3.articleId = 2;
		art3.title = "취뽀는 나에게";
		art3.content = "게시글 내용";
		art3.userSeq = 2;
		art3.viewCnt = 0;
		
		Article art4 = new Article();
		art4.articleId = 3;
		art4.title = "완전정복";
		art4.content = "게시글 내용";
		art4.userSeq = 3;
		art4.viewCnt = 0;
		
		Comment comt1 = new Comment();
		comt1.commentId = 0;
		comt1.articled = 1;
		comt1.userSeq = 5;
		comt1.content = "잘 보았습니다.";
		
		Comment comt2 = new Comment();
		comt2.commentId = 1;
		comt2.articled = 1;
		comt2.userSeq = 4;
		comt2.content = "좋은 글 입니다~~";
		
		
		System.out.println("User 출력");
		System.out.println("----------------------------------");
		System.out.println(user1.toString());
		System.out.println(user2.toString());
		System.out.println(user3.toString());
		System.out.println(user4.toString());
		
		System.out.println("게시글 출력");
		System.out.println("----------------------------------");
		System.out.println(art1.toString());
		System.out.println(art2.toString());
		System.out.println(art3.toString());
		System.out.println(art4.toString());
		
		System.out.println("게시글 댓글 출력");
		System.out.println("----------------------------------");
		System.out.println(comt1.toString());
		System.out.println(comt2.toString());
		

	}

}
