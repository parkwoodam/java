
public class Start_03_TypeCasting {
	
	public static void main(String[] args) {
		// 묵시적 형변환
		int number = 0;
		long number2 = number;
		
		// 명시적 형변환
		int number3;
		number3 = (int)number2;
		
		// 부동소숫점 연산이 값의 표현범위가 더 넓기 때문에 비트수가 작지만 별도 예약어 없이 문제없이 형변환 가능
		float number4 = 1f;
		number4 = number2;
		
		System.out.println(0.1+0.2);
		
		// 위의 연산을 실행하면0.30000000000000004처럼 원하는 값이 안 나옴 
		// 부동소숫점 연산 불안전
		// 소숫점을 절삭하여 연산 권장
		System.out.println(((0.1 * 10) + (0.2 * 10))/10);
	}

}
