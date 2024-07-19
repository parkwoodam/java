package day1_과제;

import java.util.Scanner;

public class DayCount {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("월과 일을 입력하세요.");
		int month = sc.nextInt();
		int day = sc.nextInt();
		int cnt = 0;
		int i;

		for (i = 1; i < month; i++) {
			switch (i) {
			case 1:
			case 3:
			case 5:
			case 7:
			case 8:
			case 10:
			case 12:
				cnt += 31;
				break;
			case 2:
				cnt += 28;
				break;
			case 4:
			case 6:
			case 9:
			case 11:
				cnt += 30;
				break;
			}
		}
		System.out.printf("%d월 %d일은 %d번째 날입니다.", month, day, cnt + day);
	}
}
