package BOJ;
import java.util.Scanner;

public class BOJ_1157 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int[] arr = new int[26];
		int max = 0;
		char ch = '?';
		String s = scan.next().toUpperCase();
		
	
		for(int i=0;i<s.length();i++) {
			int num = s.charAt(i) - 'A';
			arr[num]++;
		}
		
		for(int i=0;i<arr.length;i++) {
			if(arr[i]>max) {
				max = arr[i];
				ch = (char)(i+'A');
			}
			else if(arr[i] == max) {
				ch = '?';
			}
		}
		System.out.println(ch);	
	}
}
