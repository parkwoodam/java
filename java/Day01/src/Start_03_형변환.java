
public class Start_03_형변환 {
	public static void main(String[] args) {
		int number = 10;
		
		//묵시적 형변환
		long number2 = number;
		
		//명시적 형변환
		int number3 = (int)number2;
		
		float number4 = 1f;
		//부동소숫점 연산이 값의 표현범위가 더 넓음
		number4 = number2;
		
		System.out.println(0.1+0.2);
		
		//소수점을 절삭하여 연산
		System.out.println(((0.1*10) + (0.2*10))/10);
		
	}
}
