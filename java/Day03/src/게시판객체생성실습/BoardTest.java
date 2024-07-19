package 게시판객체생성실습;

import java.util.Date;

public class BoardTest {
	public static void main(String[] args) {
		User user0 = new User(0,"ssafy","1234","김싸피","김싸피","ssafy@ssafy.com");
		User user1 = new User(1,"hong","123","홍싸피","ssafy.hong","hong@ssafy.com");
		User user2 = new User(2,"samsic","samsic","김삼식","삼식이","kim@ssafy.com");
		User user3 = new User(3,"happy","happy","이싸피","해피바이러스","lee@ssafy.com");
		
		System.out.println("User 출력");
		System.out.println("------------------------------------");
		System.out.println(user0.toString());
		System.out.println(user1.toString());
		System.out.println(user2.toString());
		System.out.println(user3.toString());
		
		Article art0 = new Article(0,"공지사항","게시글 내용",0,0,new Date(System.currentTimeMillis()));
		Article art1 = new Article(1,"코딩테스트란","게시글 내용",1,0,new Date(System.currentTimeMillis()));
		Article art2 = new Article(2,"취뽀는 나에게","게시글 내용",2,0,new Date(System.currentTimeMillis()));
		Article art3 = new Article(3,"완전정복","게시글 내용",3,0,new Date(System.currentTimeMillis()));
		
		System.out.println("게시글");
		System.out.println("------------------------------------");
		System.out.println(art0.toString());
		System.out.println(art1.toString());
		System.out.println(art2.toString());
		System.out.println(art3.toString());
		
		Comment com0 = new Comment(0,1,5,"잘 보았습니다.",new Date(System.currentTimeMillis()));
		Comment com1 = new Comment(1,1,4,"좋은 글 입니다~~",new Date(System.currentTimeMillis()));
		
		System.out.println("게시글 댓글 출력");
		System.out.println("------------------------------------");
		System.out.println(com0.toString());
		System.out.println(com1.toString());
	}
}
