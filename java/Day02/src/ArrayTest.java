import java.util.Scanner;

public class ArrayTest {
	public static void main(String[] args) {
		int[] arr = { 10, 9, 8, 7, 6, 5, 4, 3, 2, 1 };
		for (int i = 0; i < arr.length; i++)
			System.out.print(arr[i]);

		Scanner sc = new Scanner(System.in);
		int index = sc.nextInt();
		String[] arr2 = new String[index];

		for (int j = 0; j < index; j++) {
			String food = sc.next();
			arr2[j] = food;
		}
		for (int k = 0; k < index; k++)
			System.out.println(arr2[k]);

	}
}
