package BOJ;
import java.util.Scanner;

public class BOJ_1193 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int X = scan.nextInt();
		
		int line = 0,count = 0;
		while(count<X) {
			line++;
			count=line*(line+1)/2;
		}
		if(line % 2 != 0) {
			int top = 1+(count-X);
			int botton = line - (count-X);
			System.out.println(top+"/"+botton);
		}else {
			int top = line - (count - X);
			int botton = 1 + (count - X);
			System.out.println(top+"/"+botton);
		}
	}
}
