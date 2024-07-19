package array_practice;

import java.util.Scanner;

public class Num2030 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		int [][] area = new int [n][n];
		
		for(int i = 0; i < area.length; i++) {
			for (int j = 0; j < area.length; j++) {
				area[i][j] = sc.nextInt();
			}
		}
		
		int max = 0;
		int row = 0;
		int col = 0;
		
		for(int i = 0; i < area.length; i++) {
			for (int j = 0; j < area[i].length; j++) {
				
				int count = 0;
				
				// 가로 순회
				for(int c = 0; c < area.length-1; c++) {
					if((area[i][c]==1)&&(area[i][c+1]==1)) 
						break;
					else 
						count++;
				}
				
				// 세로 순회
				for(int r = 0; r < area.length-1; r++) {
					if((area[r][j]==1)&&(area[r+1][j]==1)) 
						break;
					else 
						count++;
				}
				
				// 대각선 순회
				for (int k = 0; k < area.length-1; k++) {
					if((area[k][k]==1)&&(area[k+1][k+1]==1)) 
						break;
					else 
						count++;
				}
				if(max<count) {
					max = count;
					row = i;
					col = j;
				}
				
			}
		}
		
		System.out.println(max-2);	// 가로 세로 대각선 3번 순회하니까 자기 자신이 3번 들어가서 -2
		System.out.println(row + "," + col);
		
		
		
	}

}
