package array_practice;

import java.util.Arrays;
import java.util.Scanner;

public class Num2028 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		int[] price = new int[n];
		
		for(int i = 0; i < n; i++) {
			price[i] = sc.nextInt();
		}
		
		int[] level = new int [n];
		
		
		for(int i = 0; i < n; i++) {

			int tmp = price[i];
			
			for(int j = 0; j < n; j++) {
				if (tmp < price[j]) {
					level[i] += 1;
				}
			}
		}
		
		
		for(int i=0; i<level.length; i++)
			System.out.print(level[i]+1 + " ");
	}

}
