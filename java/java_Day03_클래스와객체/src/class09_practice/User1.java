package class09_practice;

public class User1 {
	String id;
	String password;
	String name;
	String email;
	int age;
	
	// 기본 생성자
	public User1() {}
	
	// 멤버 변수 초기화를 위해 인자를 받는 생성자
	public User1(String id, String password, String name, String email, int age) {
		this.id = id;
		this.password = password;
		this.name = name;
		this.email = email;
		this.age = age;
	}
}
