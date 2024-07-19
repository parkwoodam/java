
public class Start_06_Loop {
	public static void main(String[] args) {
		
		int[] intArray = {1,2,3,4,5};
		
		int number = 1;
		
		while(number < 5) {
			System.out.println(number++);
		}
		
		do {
			System.out.println(number);
		} while(number > 5) ;
		
		
		// 1~10까지 출력
		for (int i = 1; i <= 10; i++) {
			System.out.println(i);
		}
		
		// 1~10 중 짝수만 출력
		for (int i = 0; i <= 10; i++) {
			if((i%2)==0) {
				System.out.println(i);
			}
		}
		
		// 구구단 5단까지 출력
		System.out.println("***구구단***");
		for (int i = 2; i <= 5; i++) {
			System.out.println("<" + i + "단>");
			for(int j = 1; j <= 9; j++) {
				System.out.println(i + "x" + j + "=" + (i*j));
			}
			System.out.println();
		}
	}
}
