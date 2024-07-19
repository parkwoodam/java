
public class Start_02_Variable {

	public static void main(String[] args) {
		
		// int
		int number = 0;		// 변수
		final int STUDENT_NUMBER = 21;	// 상수

		number = 3;
		// STUDENT_NUMBER = 20;			// 상수의 값을 변경하려 하면 오류 발생
		
		// 변수명 -> a, b, x, y등으로 설정하는 것은 지양
		// 유지보수 어려움
		
		// 주석 사용 권장
		// 1. 한 줄 주석
		long number2 = 1;	// 이 두 줄 슬러쉬 뒷 부분은 컴파일 과정에 들어가지 않음
		// ctrl + / 혹은 ctrl + 7
		
		// 2. 여러 줄 주석
		// ctrl + shift + /
		// /* 주석 내용 */
		
		// 3. document 주석
		// /** 주석문 -> 주로 메서드의 설명 등에 사용 **/
		/**
		 * 주석문
		 */
		
		test();
		
		// 변수명, 메소드명 등 선언 방식
		// 1. CamelCase - 처음엔 소문자, 단어 바뀔 때마다 대문자
		int studentNumber;
		
		// 2.  snake_case - 전부 소문자, _로 단어 구분
		int student_number;
		
		// 3. PacalCase - 단어의 첫 글자 모두 대문자(클래스명에서 주로 사용)
		int StudentNumber; 
		
		// 4. kebab-case - 자바에서는 사용 불가, DB와 연결할 때 등 사용
		// int student-number;
		
		
		// String -> 기본 타입이 아닌 레퍼런스 타입, 문자열 저장 변수
		// 객체 -> 레퍼런스 타입
		// 레퍼런스 타입: 참조 데이터타입 - 데이터가 실제 저장되는 공간은 따로 있고, 그 주소값만 저장
		// Student st1 = new Student();
		// Student st2 = new Student();
		
		// System.out.println(st1 == st2);
		
		// String
		// char형 배열 -> 데이터를 저장
		// + 문자열을 처리하기 위한 다양한 메서드 포함
		// 불멸성 ->
		String studentName = "abc";
		studentName = "zbc";
		// String Constant pool
		// JVM 메모리를 효율적으로 사용하기 위해 저장
		// 기존의 abc를 그대로 가져와 사용
		String studentName2 = "abc";
		// zbc를 할당하지 않은 채로 studentName과 studentName2 비교했을 때 동일하다고 뜸
		
		// String은 속도가 느려지는 경우가 있음
		// StringBuffer, StringBuilder 사용하면  String Constant pool 활용하지 않기 때문에 속도 빨라짐
	}
	
	/**
	 * test 주석문
	 */
	public static void test() {
		System.out.println("test");
	}

}

