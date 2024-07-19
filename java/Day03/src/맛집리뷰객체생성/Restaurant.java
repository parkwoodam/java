package 맛집리뷰객체생성;

public class Restaurant {
	int resId;
	String name;
	String address;
	String signatureMenu;
	int rate;
	
	Restaurant(int resId, String name, String address, String signatureMenu, int rate) {
		this.resId = resId;
		this.name = name;
		this.address = address;
		this.signatureMenu = signatureMenu;
		this.rate = rate;

	}
	
	public String toString() {
		return "Restaurant [resId=" + resId +", name=" + name + ", address=" + address +", signatureMenu=" + signatureMenu +", rate=" + rate + "]";
	}
}
