package day1_과제;

import java.util.Scanner;

public class EvenSum {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("숫자 입력 >>");
		int number = sc.nextInt();
		int ans = 0;

		for (int i = 2; i <= number; i++) {
			if (i % 2 == 0) {
				ans += i;
			}
		}
		System.out.printf("1부터 %d까지 수 중 짝수의 합 = %d", number, ans);

	}

}
