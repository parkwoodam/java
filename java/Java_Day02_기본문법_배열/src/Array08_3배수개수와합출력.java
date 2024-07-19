import java.util.Arrays;

public class Array08_3배수개수와합출력 {

	public static void main(String[] args) {
		int[][] grid = {
				{2, 3, 1, 4, 7},
				{8, 13, 3, 33, 1},
				{7, 4, 5, 80, 12},
				{17, 9, 11, 5, 4},
				{4, 5, 91, 27, 7}
		};
		
		int sum = 0;	// 합 저장 변수
		int count = 0;	// 개수 저장 변수
		
		out: for(int r = 0; r < grid.length; r++) {
			// 여기서 grid.length는 2차원 배열의 길이(가지고 있는 1차원 배열의 개수)
			for(int c = 0; c < grid[r].length; c++) {
				// 여기서 grid[r].length는 1차원 배열의 길이
				
//				if(grid[r][c] % 3 == 0) {	// 3의 배수면 뭔가 하겠다 <=> 3의 배수가 아니면 건너뛰겠다
//					sum += grid[r][c];
//					count++;
//				}
				
				// 3의 배수가 아닌 경우를 조건
				if(grid[r][c] % 3 != 0) {	
					
					// continue: 해당 반복문 안에서 continue 밑의 내용을 수행하지 않고
					// 바로 다음 반복으로 넘어감
					System.out.println(r + ", " + c);
					
					// continue: (r,c) = (2,2) => (2,3)
					// continue: (2,2) => (3,0)
					continue out;
					
					// break
					// 해당 반복을 종료
					
					
				}
				sum += grid[r][c];
				count++;
			}
		}
		System.out.println(sum);	// 87
		System.out.println(count);	// 6

	}

}
