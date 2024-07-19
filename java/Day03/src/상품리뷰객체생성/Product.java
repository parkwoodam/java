package 상품리뷰객체생성;

public class Product {
	int price;
	String Pcode;
	String pName;
	String brand;
	int quantity;
	String desc;

	Product(String Pcode, String pName, int price, int quantity, String brand, String desc) {
		this.Pcode = Pcode;
		this.pName = pName;
		this.price = price;
		this.quantity = quantity;
		this.brand = brand;
		this.desc = desc;

	}

	public String toString() {
		return "Poduct [Pcode=" + Pcode + ", pName=" + pName + ", price=" + price + ", quantity=" + quantity
				+ ", brand=" + brand + ", desc=" + desc + "]";
	}
}
