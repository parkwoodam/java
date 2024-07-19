package class09_practice;

public class Restaurant {
	int resId;
	String name;
	String address;
	String signatureMenu;
	int rate;
	
	Restaurant(){
		
	}
	
	Restaurant(int resId, String name, String address, String signatureMenu, int rate){
		this.resId = resId;
		this.name = name;
		this.address = address;
		this.signatureMenu = signatureMenu;
		this.rate = rate;
	}
	
	@Override
	public String toString() {
		return "Restaurant [resId=" + Integer.toString(this.resId) + ", name=" + this.name + ", address=" + this.address + ", signatureMenu=" + this.signatureMenu + ", rate=" + Integer.toString(this.rate)+ "]";
	}

}
