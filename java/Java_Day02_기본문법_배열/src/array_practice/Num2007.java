package array_practice;

import java.util.Arrays;
import java.util.Scanner;

public class Num2007 {

	public static void main(String[] args) {
		// n개의 스위치	- 0:off, 1:on
		// 유저에게 m개 입력 -> 해당 입력값의 배수 자리 스위치 상태 반전(0이면 1로, 1이면 0으로)
		// 모든 입력이 끝난 후 스위치 상태 출력
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		
		int[] arrSwitch = new int[n];
		
		for(int i = 0; i < m; i++) {
			
			int num = sc.nextInt();
			
			for(int j = 0; j<arrSwitch.length; j++) {
				if((j+1)%num == 0) {
					if(arrSwitch[j] == 1) {
						arrSwitch[j] = 0;
					} else {
						arrSwitch[j] = 1;
					}
				}
			}
			
		}
		System.out.println(Arrays.toString(arrSwitch));

	}

}
