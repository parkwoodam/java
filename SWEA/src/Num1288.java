import java.util.HashSet;
import java.util.Scanner;

public class Num1288 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		
		for(int t=1; t<=T; t++) {
			int n = sc.nextInt();
			
			int count = 1;
			int sum = 0;
			
			HashSet<Integer> nums = new HashSet<Integer>();
			while(nums.size()<10) {
				
				nums.add(n);
				n = count*n;
				System.out.println("n = " + n);
				sum += n;
				
				count++;
			}
			
			System.out.println("#" + t + " " + sum);
		}

	}

}
