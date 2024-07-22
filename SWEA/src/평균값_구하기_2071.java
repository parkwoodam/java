import java.util.Scanner;

public class 평균값_구하기_2071 {
	public static void main(String args[]) throws Exception {
		Scanner sc = new Scanner(System.in);
		int T;
		double num;
		T = sc.nextInt();

		for (int test_case = 1; test_case <= T; test_case++) {
			double sum = 0;
			for (int i = 0; i < 10; i++) {
				num = sc.nextDouble();
				sum += num;
			}
			System.out.println("#" + test_case + " " + Math.round(sum / 10));
		}
	}
}