package 게시판객체생성실습;

public class User {

	int userSeq;
	String useId;
	String password;
	String userName;
	String nickName;
	String email;
	public User(int userSeq, String useId, String password, String userName, String nickName, String email) {
		this.userSeq = userSeq;
		this.useId = useId;
		this.password = password;
		this.userName = userName;
		this.nickName = nickName;
		this.email = email;
	}
	
	@Override
	public String toString() {
		return "User [userSeq=" + userSeq + ", useId=" + useId + ", password=" + password + ", userName=" + userName
				+ ", nickName=" + nickName + ", email=" + email + "]";
	}
	
	
}
