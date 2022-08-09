package BOJ;
import java.util.Scanner;

public class BOJ_8958 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int num = scan.nextInt();
		String[] arr = new String[num];
		
		//개행 제거
		scan.nextLine();
		
		for(int i=0;i<arr.length;i++) {
			arr[i] = scan.nextLine();
		}
		
		for(int i=0;i<arr.length;i++) {
			int count = 0, sum =0;
			for(int j=0;j<arr[i].length();j++) {
				if(arr[i].charAt(j) == 'O') {
					count++;
				}
				else {
					count=0;
				}
				sum += count;
			}System.out.println(sum);
		}
	}
}
