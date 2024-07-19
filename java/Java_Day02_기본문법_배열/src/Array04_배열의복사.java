import java.util.Arrays;

public class Array04_배열의복사 {

	public static void main(String[] args) {
		int [] nums = {1,4,6,1,4};
		// 복사할 때 기본 자료형이면 값 자체를 복사
		// 참조 자료형이면 주소값을 복사
		
		
		// 반복문을 통한 복사
		// 1. 먼저 빈 배열 만들기
		int [] tmp = new int [nums.length*2];
		for(int i = 0; i<nums.length; i++) {	// 반복문을 순회하면서
			tmp[i] = nums[i];					// 각 원소의 값 복사하여 옮기기
		}
		System.out.println(Arrays.toString(tmp));	// [1, 4, 6, 1, 4, 0, 0, 0, 0, 0]
		// nums 복사하고 남은 칸은 기본값으로 초기화
		// 여기서는 int형이므로 0으로 초기화
		
		
		// 2. 배열 복사 메서드 활용 - 반복문보다 조금 더 빠르긴 하나 유의미한 차이는 아님
		// 2-1. Arrays.copyOf(원본 배열, 새로운 배열의 크기)
		int[]tmp2 = Arrays.copyOf(nums, nums.length*2);
		System.out.println(Arrays.toString(tmp2));	// [1, 4, 6, 1, 4, 0, 0, 0, 0, 0]
		
		// 2-2. Arrays.copyOfRange(원본배열, 시작점, 새로운 배열의 끝 인덱스)
		// copyOf와 달리 시작점 변경 가능
		int[]tmp3 = Arrays.copyOfRange(nums, 1, nums.length*2);
		System.out.println(Arrays.toString(tmp3));	// [4, 6, 1, 4, 0, 0, 0, 0, 0]
		
		// 2-3. System.arraycopy(원본배열, 원본배열의 시작점, 복사배열, 복사배열의 시작점, 복사할 길이(개수))
		int[]tmp4 = new int[nums.length*2];
		System.arraycopy(nums, 0, tmp4, 0, nums.length);
		System.out.println(Arrays.toString(tmp4));	// [1, 4, 6, 1, 4, 0, 0, 0, 0, 0]

	}

}
