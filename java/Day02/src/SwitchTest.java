import java.util.Scanner;

public class SwitchTest {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();

		int[] arr = new int[n];
		for (int i = 0; i < m; i++) {
			int num = sc.nextInt();
			for (int j = num - 1; j < n; j += num) {
				arr[j] = arr[j] == 0 ? 1 : 0;
				
			}
		}
		for  (int k = 0; k < arr.length; k++)
			System.out.print(arr[k] + " ");
	}
}