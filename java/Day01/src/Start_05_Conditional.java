import java.util.Scanner;

public class Start_05_Conditional {
	public static void main(String[] args) {
		// ctrl + alt + 아래키 => 복사
		// alt + 방향키 => 코드 이동
		// ctrl + d => 한 줄 지우기
		// ctrl + shift + f => 들여쓰기 맞춰줌
		
//		System.out.println("첫번째");
//		
//		// 조건문 내의 코드가 한 줄일 경우 괄호 안 써도 됨
//		if (false) {
//			System.out.println("두번째");
//		}
//
//		System.out.println("세번째");
//		System.out.println("네번째");
		
//		// Scanner를 사용하여 입력받은 수가 짝수일때만 출력되는 프로그램 작성
//		// ctrl + space		=> 자동 import
//		Scanner sc = new Scanner(System.in);
//		
//		int inputNum = sc.nextInt();
//		if((inputNum%2)==0)
//			System.out.println(inputNum);
		
		
//		// 입력받은 수가 짝수이면 짝수 출력, 홀수이면 홀수 출력
//		Scanner sc = new Scanner(System.in);
//		
//		int number = sc.nextInt();
//		
//		if((number%2)==0) {
//			System.out.println("짝수");
//		} else {
//			System.out.println("홀수");
//		}
		
		
		// 등급 매기기
		// 80 이상은 A, 60 이상은 B, 그 외는 C
		Scanner sc = new Scanner(System.in);
		
		int number = sc.nextInt();
		
//		// if문
//		if(number > 80) {
//			System.out.println("A");
//		} else if(number > 60) {
//			System.out.println("B");
//		} else {
//			System.out.println("C");
//		}

		// switch
		switch(number) {
		case 80:
			System.out.println("80점입니다.");
			break;
		case 60:
			System.out.println("60점입니다.");
			break;
		default:
			System.out.println("잘못된 점수입니다.");
			break;
		}
		
	}
}
