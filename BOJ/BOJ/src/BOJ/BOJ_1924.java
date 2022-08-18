package BOJ;
import java.util.Scanner;

public class BOJ_1924 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int M = scan.nextInt();
		int D = scan.nextInt();
		
		int[] months = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
		String[] days = {"SUN", "MON", "TUE", "WED", "THU", "FRI", "SAT"};
		
		int n =0;
		for(int i=0;i<M-1;i++) {
			n += months[i];
		}
		n += D;
		System.out.println(days[n%7]);
	}
}
