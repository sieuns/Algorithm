package BOJ;
import java.util.Scanner;

public class BOJ_2675 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int count = scan.nextInt();
		for(int i=0;i<count;i++) {
			
			int R = scan.nextInt();
			String S = scan.next();
			
			for(int j=0;j<S.length();j++) {
				for(int k=0;k<R;k++) {
					System.out.print(S.charAt(j));
				}
			}
			System.out.println();
		}
		
	}
}
