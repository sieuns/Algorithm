package BOJ;
import java.util.Scanner;
public class BOJ_2884 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int H = scan.nextInt();
		int M = scan.nextInt();
		
		if(M < 45) {
			M+=60;
			H--;
			if(H < 0) H =23;
		}
		int m = M-45;
		System.out.println(H + " " + m);

	}

}
