
public class Start_02_변수 {
	public static void main(String[] args) {
		//int형 변수선언
		int number = 0;
		number = 2;
		
		//상수
		final int STUDENT_NUMBER = 0;
		//값이 한 번 할당되면 변경불가
		//STUDENT_NUMBER = 3;
		
		//변수명 -> a,b,x,y;
		//유지보수 어려움
		//주석 ctrl+/(7)
		//여러줄 주석 ctrl+shift+/
		//document 주석
		test();
		
		
		//1. camelCase
		int studentNumber;
		
		
		
		//String -> 문자형
		//객체 -> 레퍼런스타입 => 주소값만 저장
		Student st1 = new Student();
		Student st2 = new Student();
		
		System.out.println(st1 == st2); //false
		
		//String
		//char형 배열->데이터를 저장
		//+문자열을 처리하기 위한 다양한 메서드들
		
		//불명성
		String studentName1 = "abc";
		//studentName1 = "zbc";
		
		//String Constant pool
		//JVM 메모리를 효율적으로 사용하기 위해 저장
		String studentName2 = "abc";
		
		System.out.println(studentName1 == studentName2); //true
		
		//String 속도가 느려지는 경우 있음
		//StringBuffer, StringBuilder
	}
	public static class Student {
		
	}

	/**
	 * 주석문
	 */
	public static void test() {
		System.out.println("123");
	}
}

