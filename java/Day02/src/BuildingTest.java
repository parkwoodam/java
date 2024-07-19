import java.util.Scanner;

public class BuildingTest {

	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		int testCase = sc.nextInt();

		for (int i = 1; i <= testCase; i++) {
			int max = 2;
			int n = sc.nextInt();
			String[][] city = new String[n][n];
			for (int r = 0; r < n; r++) {
				for (int c = 0; c < n; c++) {
					city[r][c] = sc.next();
				}
			}
			for (int r = 0; r < n; r++) {
				out : for (int c = 0; c < n; c++) {
					int sum = -1;
					for (int k = -1; k <= 1; k++) {
						for (int p = -1; p <= 1; p++) {
							if (r + k < 0 || c + p < 0 || r + k >= n || c + p >= n)
								continue;
							else if (city[r + k][c + p].equals("G"))
								continue out;
						}
					}
					for (int a = 0; a < n; a++) {
						if (city[a][c].equals("B"))
							sum++;
						if (city[r][a].equals("B"))
							sum++;
					}
					max = Math.max(max, sum);
				}
			}
			System.out.println("#" + i + " " + max);
		}
	}
}
