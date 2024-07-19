package day1_과제;

/**
 * 모래시계 모양의 숫자 출력하는 클래스
 */
public class DigitTest2 {

	public static void main(String[] args) {
		int number = 1;
		int i;
		int k;
		int j;
		for (i = 5; i >= 1; i -= 2) {
			for (k = 0; k < (5 - i) / 2; k++) {
				System.out.print("   ");
			}
			for (j = 1; j <= i; j++) {
				System.out.print("  " + number++);
			}
			System.out.println();
		}
		for (i = 3; i <= 5; i += 2) {
			for (k = 0; k < (5 - i) / 2; k++) {
				System.out.print("   ");
			}
			for (j = 1; j <= i; j++) {
				System.out.print(" " + number++);
			}
			System.out.println();
		}
	}
}