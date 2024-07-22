import java.util.Scanner;
import java.io.FileInputStream;

public class 큰놈_작은놈_같은놈_2070 {
	public static void main(String args[]) throws Exception {
		Scanner sc = new Scanner(System.in);
		int T;
		int num1;
		int num2;
		T = sc.nextInt();

		for (int test_case = 1; test_case <= T; test_case++) {
			num1 = sc.nextInt();
			num2 = sc.nextInt();
			if (num1 > num2)
				System.out.println("#" + test_case + " >");
			else if (num1 < num2)
				System.out.println("#" + test_case + " <");
			else
				System.out.println("#" + test_case + " =");

		}
	}
}