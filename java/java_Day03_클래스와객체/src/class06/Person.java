package class06;

// 클래스 생성: class 키워드 이용
// class 클래스이름 {}
class Person {
	// 데이터
	// 멤버 변수
	String name;
	int age;
	String hobby;
	
	// 매개변수가 없는 메서드
	void info() {
		System.out.println("이름은 "+name+"이고, 나이는 "+age+"세입니다.");
		System.out.println("취미는 "+hobby+"입니다.");
	}
	
	// 매개변수가 있는 메서드
	void study(int time) {
		// int time = (호출할 때 넘겨준 값);
		System.out.println(time +"시간 동안 공부합니다.");
	}
	
	// 메서드 오버로딩
	// - 이름이 같으면서 매개변수가 다른 메서드를 정의.
	// - 파라미터의 타입, 개수, 순서가 달라야 한다.
	
	void study(long time) {
		System.out.println(time +"시간 동안 공부합니다.");
	}
	
	void study(double time) {
		System.out.println(time +"시간 동안 공부합니다.");
	}
	
	void study(String time) {
		System.out.println(time +"시간 동안 공부합니다.");
	}
	
	// - 순서가 다른 것: 오버로딩 가능.
	void study(int time, String subject) {
		System.out.println(subject+"를"+time +"시간 동안 공부합니다.");
	}
	
	void study(String subject, int time) {
		System.out.println(subject+"를"+time +"시간 동안 공부합니다.");
	}
	
	// 변수 이름만 다른 것 : 안됨
	// 빨간줄이 뜨면 안된다!
//	void study(String subject) {
//		
//	}
}














