import java.util.Scanner;

import javax.print.attribute.standard.PrinterLocation;

public class Start_05_조건문 {
	public static void main(String[] args) {
		System.out.println("첫번째");
		if (false)
		System.out.println("두번째"); //한줄만 출력하려면 중괄호 생략 가능
		System.out.println("세번째");
		
		//컨트롤+알트+아래키 = 복사
		//알트+방향키 = 줄이동
		//컨트롤+d = 한줄 지우기
		//컨트롤+쉬프트+f = 줄맞춤
		
		//Scanner를 사용하여 입력받은 수가 짝수일때만 출력되는 프로그램 작성
		
		Scanner sc = new Scanner(System.in);
		
		int inputint = sc.nextInt();
//		if (inputint %2 == 0) {
//			System.out.println(inputint + "은 짝수입니다.");
//		} else {
//			System.out.println(inputint + "은 홀수입니다.");
//		}
//		
//		//80이상일 경우 A
//		//60이상일 경우 B
//		//그 밖의 경우 C
//		if (inputint >=80) {
//			System.out.println("A");
//		} else if (inputint >=60) {
//			System.out.println("B");
//		} else {
//			System.out.println("C");
//		}
//		
		
		//switch
		switch(inputint) {
		case 80 :
			System.out.println( "80점 입니다.");
			break;
		case 60 :
			System.out.println( "60점 입니다.");
			break;
		default :
			System.out.println( "그 밖의 점수입니다.");
			break;
			
		}
	}

}
