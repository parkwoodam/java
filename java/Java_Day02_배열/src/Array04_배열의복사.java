import java.util.Arrays;

public class Array04_배열의복사 {
	public static void main(String[] args) {
		int[] nums = { 1, 4, 6, 1, 4 };
		// 반복문을 통한 복사
		// 1. 먼저 빈 배열 만들기
		int[] tmp = new int[nums.length * 2];
		for (int i = 0; i < nums.length; i++) { // 반복문을 순회하면서,
			tmp[i] = nums[i]; // 각 원소의 값 옮기기
		}
		System.out.println(Arrays.toString(tmp));

		// Arrays.copyOf(원본 배열, 새로운 배열의 크기);
		int[] tmp2 = Arrays.copyOf(nums, nums.length * 2);
		System.out.println(Arrays.toString(tmp2));
		
		//Arrays.copyOfRange(원본 배열, 시작점,새로운 배열의 끝 인덱스);
		int[] tmp3 = Arrays.copyOfRange(nums,3,nums.length*2);
		System.out.println(Arrays.toString(tmp3));
		
		//System.arraycopy(원본 배열, 원본 배열의 시작점, 복사 배열, 복사 배열의 시작점, 복사할 길이(갯수));
		int[] tmp4 = new int[nums.length*2];
		System.arraycopy(nums, 2, tmp4, 1, nums.length-2); // 숫자 바꿔가며 실습해보기!!!
		System.out.println(Arrays.toString(tmp4));
		
	}
}
