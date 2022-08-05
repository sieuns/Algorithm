package BOJ;
import java.util.Arrays;
import java.util.Scanner;

public class BOJ_1085 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int x = scan.nextInt();
		int y = scan.nextInt();
		int w = scan.nextInt();
		int h = scan.nextInt();
		
		int wx = w - x;
		int hy = h - y;
		
		int[] arr = new int[4];
		arr[0] = x;
		arr[1] = y;
		arr[2] = wx;
		arr[3] = hy;
		
		Arrays.sort(arr);
		System.out.print(arr[0]);

	}

}
