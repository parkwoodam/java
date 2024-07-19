import java.util.Scanner;

public class Start_04_연산자 {
	public static void main(String[] args) {
		//증감 연산자
		int number = 1;
		System.out.println(++number); // 더한다음에 출력 
		System.out.println(number++); // 출력한 다음에 출력
		System.out.println(number); // 최종 출력
		
		//나눗셈
		System.out.println(10/3);
		//몫 3 
		
		//modulo 연산자
		System.out.println(10%3);
		//나머지 값 1
		
		//bit shift 연산자 
		System.out.println(1 << 1); // 1 -> 10
		System.out.println(2 << 1); // 10 -> 100
		System.out.println(3 << 1); // 11 -> 110
		System.out.println(4 << 1); // 100 -> 1000
		System.out.println(3 >> 1); // 11 -> 01
		System.out.println(6 >> 1); // 110 -> 11
		
		//비교연산
		int a = 5;
		int b = 5;
		System.out.println(a == b);
		System.out.println(a != b);
		
		//AND -> &&
		//true and true -> true
		//true and false -> false
		//false and true -> false
		//false and false -> false
		
		//OR -> 파이프 연산자
		//true and true -> true
		//true and false -> true
		//false and true -> true
		//false and false -> false
		
		//단축연산 ( 앞의 불린형을 확인하고 뒤에껀 확인해봤자인 것들 확인 x)
		//false and true -> false
		//true and false -> true
		
		
		Scanner sc = new Scanner(System.in);
		
		final double PI = 3.14;
		double inputR = sc.nextDouble();
		
		//원 넓이  = 반지름x반지름x3.14
		double result = (inputR * inputR) * PI;
		
		System.out.println(result);
	}

}
