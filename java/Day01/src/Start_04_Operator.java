import java.util.Scanner;

public class Start_04_Operator {
	public static void main(String[] args) {
		// 증감연산자
		int number = 1;
		System.out.println(++number);	// 2
		
		number = 1;
		System.out.println(number++);	// 1
		System.out.println(number);		// 2
		
		// 나눗셈 - 몫을 정수형태로
		System.out.println(10/3);		// 3
		
		// modulo
		System.out.println(10%3);		// 1
		
		// bit shift
		System.out.println(1 << 1);		// 2
		System.out.println(2 << 1);		// 4
		System.out.println(3 << 1);		// 6
		System.out.println(4 << 1);		// 8
		
		// 비교연산자
		int a = 5;
		int b = 5;
		System.out.println(a == b);		// true
		System.out.println(a != b);		// false
		
		// AND -> &&
		// 두 값이 모두 true일 때만 true, 둘 중 하나라도 false면 false
		// 첫 번째 값이 false이면 두 번째 값 연산 x
		
		// OR -> 파이프 연산자	||
		// 둘 중 하나만 true면 true, 둘 다 false일 때만 false
		// 첫 번째 값이 true이면 두 번째 값 연산 x
		
		/**
		 * 반지름 입력 받아 원의 넓이 구하는 연산
		 * 원지름 = 반지름^2 * 파이
		 */
		Scanner sc = new Scanner(System.in);
		
		final double PI = 3.14;
		double inputR = sc.nextDouble();
		
		double result = (inputR * inputR) * PI;
		
		System.out.println(result);
		// System.out -> 콘솔 혹은 윈도우창 등 외부 요소에 코드 결과값 등 출력
		// System.in -> 키보드 등으로부터 입력받아오는 역할
		
	}
}
