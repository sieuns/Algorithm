package BOJ;
import java.util.Scanner;

public class BOJ_2577 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int A = scan.nextInt();
		int B = scan.nextInt();
		int C = scan.nextInt();
		
		int result = A * B * C;
		int[] counts = new int [10];		
	
		while(result > 0) {
			counts[result%10]++;
			result /= 10;
		}
		for(int i=0;i<10;i++) {
			System.out.println(counts[i]);
		}
	}
}
