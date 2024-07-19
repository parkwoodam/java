package class09_practice;

public class User {
	int userSeq;
	String userId;
	String password;
	String userName;
	String nickName;
	String email;
	
	User(){
		
	}
	
	User(int userSeq, String userId, String password, String userName, String nickName, String email){
		this.userSeq = userSeq;
		this.userId = userId;
		this.password = password;
		this.userName = userName;
		this.nickName = nickName;
		this.email = email;
	}
	
	@Override
	public String toString() {
		return "Article [userSeq=" + Integer.toString(this.userSeq) + ", userId=" + this.userId + ", password=" + this.password + ", userName=" + this.userName + ", nickName=" + this.nickName + ", email=" + this.email + "]";
	}

}
