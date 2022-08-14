package BOJ;
import java.util.Scanner;

public class BOJ_1110 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int num = scan.nextInt();
		int temp = num;
		int count =0;
		
		while(true) {
			num = ((num%10) * 10) + (((num/10) + (num%10)) % 10);
			count++;
			
			if(temp == num)
				break;
		}
		System.out.println(count);
	}
}
