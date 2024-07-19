import java.util.Scanner;

public class SpiderWeb {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				int[][] arr = new int[n][n];
				int number = sc.nextInt();
				arr[i][j] = number;
				
			}
			
		}
		int[] arr1 = {0,0,0,0,-1,-1,1,1,1,2,1,2,-1,-2,-1,-2};
		int[] arr2 = {1,1,-1,-1,0,0,0,0,1,2,-1,-2,1,2,-1,-2}; 
		
		
	}

}