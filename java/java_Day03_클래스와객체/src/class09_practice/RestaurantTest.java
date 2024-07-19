package class09_practice;

public class RestaurantTest {

	public static void main(String[] args) {
		Restaurant res1 = new Restaurant();
		res1.resId = 101;
		res1.name = "을밀대";
		res1.address = "서울";
		res1.signatureMenu = "냉면";
		res1.rate = 4;
		
		Restaurant res2 = new Restaurant();
		res2.resId = 401;
		res2.name = "도마29";
		res2.address = "대구";
		res2.signatureMenu = "연어초밥";
		res2.rate = 3;
		
		Review1 rev1 = new Review1();
		rev1.reviewId = 1;
		rev1.resId = 101;
		rev1.writer = "김싸피";
		rev1.content = "너무 맛있네요.";
		
		Review1 rev2 = new Review1();
		rev2.reviewId = 2;
		rev2.resId = 401;
		rev2.writer = "나싸피";
		rev2.content = "연어초밥은 여기가 최고!";
		
		System.out.println("**********************맛집목록**********************");
		System.out.println(res1.toString());
		System.out.println(res2.toString());
		
		System.out.println("**********************리뷰목록**********************");
		System.out.println(rev1.toString());
		System.out.println(rev2.toString());

	}

}
