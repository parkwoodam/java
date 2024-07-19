import java.util.Scanner;

public class AppleTree {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[][] arr = new int[n][n];

		int max = 0;

		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				arr[i][j] = sc.nextInt();

			}
		}

		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				int sum = arr[i][j];
				if (j != n - 1)
					sum += arr[i][j + 1];
				if (j != 0)
					sum += arr[i][j - 1];
				if (i != 0)
					sum += arr[i - 1][j];
				if (i != n - 1)
					sum += arr[i + 1][j];
				max = Math.max(max, sum);
			}
		}
		System.out.println(max);
	}
}
