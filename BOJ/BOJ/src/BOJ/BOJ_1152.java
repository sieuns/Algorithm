package BOJ;
import java.util.Scanner;
import java.util.StringTokenizer;

public class BOJ_1152 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		String s = scan.nextLine();
		
		StringTokenizer st = new StringTokenizer(s," ");
		System.out.println(st.countTokens());
	}
}
