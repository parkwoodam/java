package array_practice;

import java.util.Scanner;

public class Num2008 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		
		for(int t = 1; t<=T; t++) {
			// n 입력 받기
			int n = sc.nextInt();
			
			// 빈 배열 생성
			char[][] area = new char [n][n];
			// 배열에 값 넣기
			for(int r = 0; r<area.length; r++) {
				for(int c = 0; c<area[r].length; c++) {
					area[r][c] = sc.next().charAt(0);
				}
			}
			
			// 값 저장할 배열 생성
			// G -> 0
			// G와 인접한 B -> 2
			// 그 외의 B -> 가로 세로 줄 B의 합
			
			
			// 배열 순회
			for(int r = 0; r<area.length; r++) {
				for(int c = 0; c<area[r].length; c++) {
					
					// G이면 그 위치는 0, 그 인접 전부 2로 설정
					if(area[r][c]=='G') {
						if(((r-1)>=0)&&((c-1)>=0)&&((r+1)<area.length)&&((c+1)<area[r].length)) {
							
							if(area[r+1][c-1] == 'B')
								area[r+1][c-1] = '2';
							if(area[r+1][c] == 'B')
								area[r+1][c] = '2';
							if(area[r+1][c+1] == 'B')
								area[r+1][c+1] = '2';
							
							if(area[r][c+1] == 'B')
								area[r][c+1] = '2';
							if(area[r][c-1] == 'B')
								area[r][c-1] = '2';
							
							if(area[r-1][c-1] == 'B')
								area[r-1][c-1] = '2';
							if(area[r-1][c] == 'B')
								area[r-1][c] = '2';
							if(area[r-1][c+1] == 'B')
								area[r-1][c+1] = '2';
							
						}
						if(r==0) {
							if(c==0) {
								if(area[r+1][c] == 'B')
									area[r+1][c] = '2';
								if(area[r+1][c+1] == 'B')
									area[r+1][c+1] = '2';
								if(area[r][c+1] == 'B')
									area[r][c+1] = '2';
								
							} else if(c==area[r].length-1) {
								if(area[r+1][c-1] == 'B')
									area[r+1][c-1] = '2';
								if(area[r+1][c] == 'B')
									area[r+1][c] = '2';
								if(area[r][c-1] == 'B')
									area[r][c-1] = '2';
								
							} else {
								if(area[r+1][c-1] == 'B')
									area[r+1][c-1] = '2';
								if(area[r+1][c] == 'B')
									area[r+1][c] = '2';
								if(area[r+1][c+1] == 'B')
									area[r+1][c+1] = '2';
								
								if(area[r][c+1] == 'B')
									area[r][c+1] = '2';
								if(area[r][c-1] == 'B')
									area[r][c-1] = '2';
							}
							
						}
						if(r==area.length-1) {
							if(c==0) {
								if(area[r-1][c] == 'B')
									area[r-1][c] = '2';
								if(area[r-1][c+1] == 'B')
									area[r-1][c+1] = '2';
								if(area[r][c+1] == 'B')
									area[r][c+1] = '2';
								
							} else if(c==area[r].length-1) {
								if(area[r-1][c-1] == 'B')
									area[r-1][c-1] = '2';
								if(area[r-1][c] == 'B')
									area[r-1][c] = '2';
								if(area[r][c-1] == 'B')
									area[r][c-1] = '2';
							} else {
								if(area[r][c+1] == 'B')
									area[r][c+1] = '2';
								if(area[r][c-1] == 'B')
									area[r][c-1] = '2';
								
								if(area[r-1][c-1] == 'B')
									area[r-1][c-1] = '2';
								if(area[r-1][c] == 'B')
									area[r-1][c] = '2';
								if(area[r-1][c+1] == 'B')
									area[r-1][c+1] = '2';
							}
						}
						if((c==0)&&(r>0)&&(r<area.length-1)) {
							if(area[r+1][c] == 'B')
								area[r+1][c] = '2';
							if(area[r+1][c+1] == 'B')
								area[r+1][c+1] = '2';
							
							if(area[r][c+1] == 'B')
								area[r][c+1] = '2';
							if(area[r-1][c] == 'B')
								area[r-1][c] = '2';
							if(area[r-1][c+1] == 'B')
								area[r-1][c+1] = '2';
						}
						if((c==area[r].length-1)&&(r>0)&&(r<area.length-1)) {
							if(area[r+1][c-1] == 'B')
								area[r+1][c-1] = '2';
							if(area[r+1][c] == 'B')
								area[r+1][c] = '2';
							if(area[r][c-1] == 'B')
								area[r][c-1] = '2';
							
							if(area[r-1][c-1] == 'B')
								area[r-1][c-1] = '2';
							if(area[r-1][c] == 'B')
								area[r-1][c] = '2';
						}
						
						
					} 
					
					
				}
			}
			
			
			
//			System.out.println("G 인근을 2로 바꿨을 때");
//			for(int i = 0; i < area.length; i++) {
//				for (int j = 0; j < area.length; j++) {
//					System.out.print(area[i][j]);
//				}
//				System.out.println();
//			}

			// 최대값 저장 변수 선언
			int max = 0;
			
			for(int i = 0; i < area.length; i++) {
				for (int j = 0; j < area[i].length; j++) {
					
					int count = 0;
					if((area[i][j] == 'B')) {
						for(int r = 0; r < area.length; r++) {
							if((area[r][j]=='B')||(area[r][j]=='2'))
								count++;
						}
						for(int c = 0; c < area[i].length; c++) {
							if((area[i][c]=='B')||(area[i][c]=='2'))
								count++;
						}
						max = Math.max(max, count-1);
						
					}
						
				}
				
			}
			
			System.out.println("\n#" + t + " " + max);
		}

	}

}
