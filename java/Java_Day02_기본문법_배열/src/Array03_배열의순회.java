import java.util.Arrays;

public class Array03_배열의순회 {

	public static void main(String[] args) {
		int[] nums = {23, 7, 20, 11, 6};
		// 배열 생성하는 순간 인덱스가 0~4까지 순차적으로 부여됨
		// nums.length() = 5
		
		// for문으로 배열 순회
		for(int i = 0; i<nums.length; i++) {
			System.out.println(nums[i]);
		}
		
		// for문으로 배열 순회
		// read only -> num의 값을 바꾸거나 하지 못함
		for(int num : nums) {
			System.out.println(num);
		}
		
		// Arrays 활용
		System.out.println(Arrays.toString(nums));

	}

}
