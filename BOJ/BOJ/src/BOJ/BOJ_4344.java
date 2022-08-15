package BOJ;
import java.util.Scanner;

public class BOJ_4344 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int C = scan.nextInt();
		
		
		for(int i=0;i<C;i++) {
			int N = 0;
			N = scan.nextInt();
			int[] arr = new int [N];
			int sum=0, avr = 0;
			double count = 0;
		
		for(int j=0;j<N;j++) {
			arr[j] = scan.nextInt();
			sum += arr[j];
			
		}
		avr = sum/N;
		for(int j=0;j<N;j++) {
			if(arr[j] > avr)
				count++;
		}
		System.out.printf("%.3f%%\n", (count/N)*100);
		}
	}
}
