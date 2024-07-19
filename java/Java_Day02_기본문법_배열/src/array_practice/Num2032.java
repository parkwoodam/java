package array_practice;

import java.util.Scanner;

public class Num2032 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();

		int[][] ground = new int[n][n];
		
		for (int i = 0; i < ground.length; i++) {
			String tmp = sc.next();
			String[] tmp2 = tmp.split("");
			for(int j = 0; j < ground.length; j++) {
				int tmp3 = Integer.parseInt(tmp2[j]);
				ground[i][j] = tmp3;
			}
		}
		
//		for (int i = 0; i < ground.length; i++) {
//			for (int j = 0; j < ground[i].length; j++) {
//				System.out.print(ground[i][j]);
//			}
//			System.out.println();
//		}

		int max = 0;
		for (int i = 0; i < ground.length; i++) {
			for (int j = 0; j < ground[i].length; j++) {
				int sum = 0;
				if ( ((i+1)<=(n-1)) && ((j+1)<=(n-1)) && ((i-1)>=0) && ((j-1)>=0) ) {
					sum += ground[i][j] + ground[i-1][j] + ground[i+1][j] + ground[i][j-1] + ground[i][j+1];
				}
				max = Math.max(sum, max);
			}
		}
		
		System.out.println(max);
		
		
	}

}
