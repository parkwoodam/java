package array_practice;

import java.util.Scanner;

public class Num2025 {

	public static void main(String[] args) {
		int[] arr = {1, 2, 3};
		for(int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]);
		}
		System.out.println();
		
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		String[] food = new String[num];
		
		for(int i = 0; i<food.length; i++) {
			food[i] = sc.next();
		}
		for(int i = 0; i<food.length; i++) {
			System.out.println(food[i]);
		}
		
		
		
	}

}
