package modifier06_singleton;

// 점수를 관리하는 객체
// 점수는 1개만 있음
// => 객체도 1개만 만든다
public class ScoreManager {
	private int score;

	// 2. 인스턴스는 한개만 만들어서 가지고 있자
	private static ScoreManager manager = new ScoreManager(); //자바는 순차적으로 재생된는 구조가 아님 -> 가능
	
	// 싱글턴으로 만들어보자
	// 1.오로지 하나만 생성되도록  => 외부에서 생성자를 호출할 수 없도록 막아야함 
	//  - 생성자를 private으로 만든다
	private ScoreManager() {}
	
	// 3. 인스턴스를 외부에서 가져다 쓸 수 있도록 public으로 getter 추가
	// 4. 객체 생성 없이 클래스 이름으로 바로 접근할 수 있도록 static 추가
	public static ScoreManager getInstance() {
		return manager;
	}
}
