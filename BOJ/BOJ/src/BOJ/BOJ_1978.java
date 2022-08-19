package BOJ;
import java.util.Scanner;

public class BOJ_1978 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int N = scan.nextInt();
		int[] num = new int[N];
		int count = 0;
		
		for(int i=0;i<N;i++) {
			num[i] = scan.nextInt();
			if(num[i] % 2 != num[i] || num[i] % 3 != num[i])
				count++;
		}
		System.out.println(count);
	}
}
