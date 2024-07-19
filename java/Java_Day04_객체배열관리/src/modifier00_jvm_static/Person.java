package modifier00_jvm_static;

public class Person {

	// static 변수
	// - 클래스에 이미 들어있는 변수
	// - 인스턴스 생성과 무관, 이전에 이미 있음
	// - 설계도가 메서드영역에 로딩되는 시점에 이미 생성됨
	// - 설계도에 들어있는 것이므로, 이 설계도로 만드는 모든 인스턴스에 공유됨
	// - 클래스이름.static변수 : 클래스 이름으로 바로 접근 가능
	static int pCount = 100;

	// 아래의 변수들은?
	// - 인스턴스 변수 , 멤버 변수
	// - non-static
	// - 실제 인스턴스가 생성이 될 때, 힙 영역에 만들어진다
	// - 객체 생성 후에 해당 객체의 이름으로만 접근가능
	// - this : 각각의 인스턴스가 자기 자신을 가리키는 참조
	String name;
	int age;
	String hobby;

	// static 초기화 블록 사용
	static {
		pCount = 1000;
	}
	// static 메서드 (설계도)
	public static void main(String[] args) {
//		name = "Kim"; // static에서는 non-static접근불가
	}

	// non-static
	public void info() {
		pCount = 300; // non-static에서는 static 접근 가능!
	}

}
