import java.util.Scanner;

class 홀수만_더하기_2072 {

	public static void main(String args[]) throws Exception {
		Scanner sc = new Scanner(System.in);
		int T;
		int num;
		T = sc.nextInt();
		for (int test_case = 1; test_case <= T; test_case++) {
			int sum = 0;
			for (int i = 0; i < 10; i++) {
				num = sc.nextInt();
				if (num % 2 == 1) {
					sum += num;
				}

			}
			System.out.println("#" + test_case + " " + sum);
		}
	}
}