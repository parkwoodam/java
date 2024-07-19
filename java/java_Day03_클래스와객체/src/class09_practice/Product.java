package class09_practice;

public class Product {
	String pCode;
	String pName;
	int price;
	int quantity;
	String brand;
	String desc;
	
	Product(){
		
	}
	
	Product(String pCode, String pName, int price, int quantity, String brand, String desc ){
		this.pCode = pCode;
		this.pName = pName;
		this.price = price;
		this.quantity = quantity;
		this.brand = brand;
		this.desc = desc;
	}
	
	@Override
	public String toString() {
		return "price=" + Integer.toString(this.price) + ", quantity=" + Integer.toString(this.quantity);
	}
}
