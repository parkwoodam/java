package modifier07_object_array;

public class StudentManager {
	// student의 배열을 가지고 있는 객체
	// => 1개의 객체만 생성하면 됨 -> 싱글턴으로 만든다
	
	Student[] arr = new Student[100]; //null로 초기화된 빈 배열 생성
	int size = 0; //실제 들어있는 개수
	

	public static StudentManager instance = new StudentManager();

	private StudentManager() {} //기본생성자 만들기
	
	public static StudentManager getInstance() { 
		return instance;
	}
	public void addStudent(Student st) {
		if (size < 100) {
		arr[size] = st;
		size++;
		} else {
			System.out.println("더 이상의 학생을 추가할 수 없습니다.");
		}
	}
}
