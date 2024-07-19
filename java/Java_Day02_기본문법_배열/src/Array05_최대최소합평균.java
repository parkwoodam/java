
public class Array05_최대최소합평균 {

	public static void main(String[] args) {
		int[] nums = { 53, 211, 11, 66, 84, 132, 12 };

		// 모두 하나의 for문에서 구하기
		int max = nums[0];
		int min = nums[0];
		int sum = nums[0];
		for (int i = 1; i < nums.length; i++) {
			// 최대
			if (max < nums[i]) {
				max = nums[i];
			}
			// 최소
			if (min > nums[i]) {
				min = nums[i];
			}
			// 합
			sum += nums[i];
		}
		System.out.println(max);
		System.out.println(min);
		System.out.println(sum);
		// 평균
		double avg = (double) sum / nums.length; 
		System.out.printf("%.2f\n", avg);

	}

}
