import java.util.Arrays;

public class Array03_배열의순회 {
	public static void main(String[] args) {
		int[] nums = { 23, 7, 20, 11, 6 }; // nums.length = 5

		// index를 활용할 일이 있다면
		for (int i = 0; i < nums.length; i++) {
			System.out.println(nums[i]);
			nums[i] *= 2;
		}

		// for-each문 - read only
		for (int num : nums) {
			System.out.println(num);
		}

		System.out.println(Arrays.toString(nums)); // 배열의 요소를 [값1,값2,...] 형태로 출력
	}
}
