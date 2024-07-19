package 상품리뷰객체생성;


/**
 * 맛집 객체를 생성하고 정보를 출력하는 클래스
 */
public class ProductTest {
	public static void main(String[] args) {
		Product pro1 = new Product("R00001", "S냉장고", 1000000, 20, "삼성", "삼성에서 출시한 스마트냉장고입니다.");
		Product pro2 = new Product("P00001", "우주폰S", 500000, 100, "삼성", "삼성에서 출시한 우주폰S입니다.");
		System.out.println("**********************제품목록**********************");
		System.out.println(pro1.toString());
		System.out.println(pro2.toString());

		
		Review rev1 = new Review(1,"P00001", "yang","성능이 아주 좋습니당~!");
		System.out.println("**********************리뷰내용**********************");
		System.out.println(rev1.toString());

	}
}
