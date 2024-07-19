import java.util.Arrays;

public class Array07_2차원배열선언및생성 {

	public static void main(String[] args) {
		int[][] arr1;	// 선언만 한 것. 이 형태를 권장
		
		int [][] arr2 = new int [3][4];	// 3행 4열인 배열
		
		// 다차원 배열을 출력할 때는
		// Arrays.deepToString()
		System.out.println(Arrays.deepToString(arr2));	// [[0, 0, 0, 0], [0, 0, 0, 0], [0, 0, 0, 0]]

		// 2차원 배열을 생성할 때는 2차원 배열의 길이만 지정하면 됨
		// 2차원 배열: 1차원 배열의 참조값을 요소로 갖는 배열
		int[][] arr3 = new int[3][];
		// 초기값은 null -> 요소가 참조값이므로 참조값의 기본형은 null
		System.out.println(Arrays.toString(arr3));		// [null, null, null]
		
		// 2차원 배열 각 요소에 들어있는 1차원 배열의 길이는 달라질 수 있음 
		arr3[0] = new int[10];
		arr3[1] = new int[4];
		arr3[2] = new int[9];
		System.out.println(Arrays.deepToString(arr3)); 	// [[0, 0, 0, 0, 0, 0, 0, 0, 0, 0], [0, 0, 0, 0], [0, 0, 0, 0, 0, 0, 0, 0, 0]]

	}

}
