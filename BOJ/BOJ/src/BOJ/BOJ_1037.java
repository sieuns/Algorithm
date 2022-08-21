package BOJ;
import java.util.Arrays;
import java.util.Scanner;

public class BOJ_1037 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int count = scan.nextInt();
		int[] arr = new int[count];
		
		for(int i=0;i<count;i++) {
			arr[i] = scan.nextInt();
		}
		
		Arrays.sort(arr);
		int max = arr[count-1];
		int min = arr[0];
		System.out.println(max*min);
	}

}
