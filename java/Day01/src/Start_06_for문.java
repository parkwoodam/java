
public class Start_06_for문 {
	public static void main(String[] args) {
		for (int i = 1; i <= 10; i++) { 
			System.out.println(i);
		}
		 
		
		// index = 0
		int[] inArray = {1,2,3,4,5};
		
		//for문 안에서 값 할당해도 변화 x 
		for (int i : inArray) {
			i = 999;
		}
	
		for (int i : inArray) {
			System.out.println(i);
		}
		
//		//무한루프
//		int number = 1;
//		while (number < 5) {
//			System.out.println(number);
//		}
		
		
		//무한루프 (증감식 추가)
		int numberk= 1;
		while (numberk< 5) {
			System.out.println(numberk++);
		}
		
		//do while (do실행후 while문이 참이면 다시 do)- 조건에 맞지 않아도 do문 일단 실행
		int number = 1;
		do {
			System.out.println(number++);
		} while (number < 5); {
			System.out.println("end");
		}
		
		//1. 1부터10까지 숫자 출력
		System.out.println("1번 예제");
		int number1 = 1;
		while (number1 <= 10) {
			System.out.println(number1++);
		}
		
		//2. 1부터 10까지 중에 짝수만을 출력
		System.out.println("2번 예제");
		int[] Array = {1,2,3,4,5,6,7,8,9,10};
		for (int i : Array) {
			if (i %2 == 0) {
				System.out.println(i);
			}
		}
		
		//3. 구구단을 5단까지 출력
		System.out.println("3번 예제");
//		for (int j=2; j<=5; j++) {
//			System.out.print(j +"단 ");
//			for (int i=1; i<10; i++) {
//				System.out.print(String.format("%s ",i * j));
//			}
//			System.out.println();
//		}
		
		int j = 1;
		for (int i=2; i<=5; i++) {
			while (j < 10) {
				System.out.print(String.format("%s ",i * j));
				j++;
			}
			j = 1;
			System.out.println();
		}
			
	}
	
}
