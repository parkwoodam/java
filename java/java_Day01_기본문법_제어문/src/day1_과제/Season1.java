package day1_과제;

import java.util.Scanner;

public class Season1 {

	public static void main(String[] args) {

		for (int i = 0; i <= 2; i++) {
			Scanner sc = new Scanner(System.in);
			System.out.print("월 입력>>");
			int a = sc.nextInt();
			
			if (a >= 3 && a <= 5) {
				System.out.println(a + "월은 봄입니다.");
			} else if (a >= 6 && a <= 8) {
				System.out.println(a + "월은 여름입니다.");
			} else if (a >= 9 && a <= 11) {
				System.out.println(a + "월은 가을입니다.");
			} else {
				System.out.println(a + "월은 겨울입니다.");
			}
		}
	}

}
