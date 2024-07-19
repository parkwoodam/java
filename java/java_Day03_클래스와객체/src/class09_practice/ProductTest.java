package class09_practice;

public class ProductTest {

	public static void main(String[] args) {
		Product product1 = new Product();
		product1.pCode = "R00001";
		product1.pName = "S냉장고";
		product1.price = 1000000;
		product1.quantity = 20;
		product1.brand = "삼성";
		product1.desc = "삼성에서 출시한 스마트냉장고입니다.";
		
		Product product2 = new Product();
		product2.pCode = "P00001";
		product2.pName = "우주폰S";
		product2.price = 500000;
		product2.quantity = 100;
		product2.brand = "삼성";
		product2.desc = "삼성에서 출시한 우주폰S입니다.";
		
		Review review = new Review();
		review.reviewId = 1;
		review.pCode = "P00001";
		review.writer = "yang";
		review.content = "성능이 아주 좋습니당~!";
		
		System.out.println("**********************제품목록**********************");
		System.out.printf("Product [pCode=%s, pName=%s, %s, brand=%s, desc=%s]\n", product1.pCode, product1.pName, product1.toString(), product1.brand, product1.desc);
		System.out.printf("Product [pCode=%s, pName=%s, %s, brand=%s, desc=%s]\n", product2.pCode, product2.pName, product2.toString(), product2.brand, product2.desc);

		
		System.out.println("**********************리뷰내용**********************");
		System.out.printf("Review [reviewId=%s, pCode=%s, writer=%s, content=%s]\n", review.toString(), review.pCode, review.writer, review.content);
	}

}
