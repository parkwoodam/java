package day1_과제;

import java.util.Scanner;

/**
 * 가위,바위,보 게임을 하는 클래스
 */
public class GameTest {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("가위바위보 게임을 시작합니다.아래 보기 중 하나를 고르세요.\n");
		System.out.println("1. 5판 3승\n2. 3판 2승\n3. 1판 1승\n");

		System.out.print("번호를 입력하세요.");
		int number = sc.nextInt();
		
		int com_win = 0;
		int user_win = 0;
		int same = 0;
		int count ;
		int win = 0;
		
		if (number == 1) {
			count = 5;
			win = 3;
		}
		else if (number == 2) {
			count = 3;
			win = 2;
		}
		else count = 1;
		
		for (int i = 1; i <= count; i++) { 
			int random_num = (int) (Math.random() * 3) + 1;
			System.out.print("가위바위보 중 하나 입력:");
			String a = sc.next();
			if (random_num==1) {
				if (a.equals("가위")) {
					System.out.println("비겼습니다.");
					same += 1;
				}
				else if (a.equals("위")) {
					System.out.println("이겼습니다!!!");
					user_win += 1;
				}
				else {
					System.out.println("졌습니다!!!");
					com_win += 1;
				}
				
			}
			if (random_num==2) {
				if (a.equals("가위")) {
					System.out.println("졌습니다!!!");
					com_win += 1;
				}
				else if (a.equals("바위")) {
					System.out.println("비겼습니다.");
					same += 1;
				}
				else {
					System.out.println("이겼습니다!!!");
					user_win += 1;
				}
			}
			if (random_num==3) {
				if (a.equals("가위")) {
					System.out.println("이겼습니다!!!");
					user_win += 1;
				}
				else if (a.equals("바위")) {
					System.out.println("졌습니다!!!");
					com_win += 1;
				}
				else {
					System.out.println("비겼습니다.");
					same += 1;
				}
			}
			if (user_win == win || com_win == win) break;
			
		}
		if (com_win > user_win) System.out.println("### 컴퓨터 승!!!");
		else if (com_win < user_win) System.out.println("### 플레이어 승!!!");
		else System.out.println("### 비겼습니다..");
		
	}
}
