package day1_과제;

/**
 * 직각삼각형 모양의 숫자 출력하는 클래스
 */
public class DigitTest1 {

	public static void main(String[] args) {

		int number = 1;
		for (int i = 5; i >= 1; i--) {
			for (int k = 0; k < 5 - i; k++) {
				System.out.print("   ");
			}
			for (int j = 1; j <= i; j++) {
				if (number >= 10) {
					System.out.print(" " + number++);
				} else System.out.print("  " + number++);
			}
			System.out.println();
		}
	}

}
