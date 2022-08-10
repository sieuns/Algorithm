package BOJ;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;

public class BOJ_3052 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int[] arr = new int[10];
		
		for(int i=0;i<10;i++) {
			arr[i] = scan.nextInt() % 42;
		}
		
		HashSet<Integer> hashset = new HashSet<Integer>();
		for(int i=0;i<10;i++)
			hashset.add(arr[i]);
		
		System.out.println(hashset.size());
	}
}
